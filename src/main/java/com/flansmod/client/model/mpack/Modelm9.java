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
/*      */ public class Modelm9
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modelm9()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ǚ'];
/*   22 */     this.ammoModel = new ModelRendererTurbo[5];
/*   23 */     this.slideModel = new ModelRendererTurbo['º'];
/*      */     
/*   25 */     initgunModel_1();
/*   26 */     initammoModel_1();
/*   27 */     initslideModel_1();
/*      */     
/*      */ 
/*   30 */     translateAll(0.0F, -42.0F, 0.0F);
/*   31 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.15F, 0.0F);
/*      */     
/*      */ 
/*   34 */     this.gunSlideDistance = 1.4F;
/*   35 */     this.animationType = EnumAnimationType.CUSTOM;
/*      */     
/*      */ 
/*   38 */     this.tiltGun = 4.0F;
/*   39 */     this.rotateGunVertical = 12.0F;
/*   40 */     this.translateGun = new Vector3f(0.15F, 0.25F, 0.0F);
/*      */     
/*   42 */     this.rotateClipVertical = 13.0F;
/*   43 */     this.translateClip = new Vector3f(0.0F, -16.0F, 0.0F);
/*      */     
/*      */ 
/*   46 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   51 */     this.gunModel[0] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/*   52 */     this.gunModel[1] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
/*   53 */     this.gunModel[2] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[3] = new ModelRendererTurbo(this, 617, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[4] = new ModelRendererTurbo(this, 889, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[5] = new ModelRendererTurbo(this, 793, 9, this.textureX, this.textureY);
/*   57 */     this.gunModel[6] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*   58 */     this.gunModel[7] = new ModelRendererTurbo(this, 993, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[8] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/*   60 */     this.gunModel[9] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/*   61 */     this.gunModel[10] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*   62 */     this.gunModel[11] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/*   63 */     this.gunModel[12] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/*   64 */     this.gunModel[13] = new ModelRendererTurbo(this, 449, 17, this.textureX, this.textureY);
/*   65 */     this.gunModel[14] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/*   66 */     this.gunModel[15] = new ModelRendererTurbo(this, 985, 25, this.textureX, this.textureY);
/*   67 */     this.gunModel[16] = new ModelRendererTurbo(this, 985, 33, this.textureX, this.textureY);
/*   68 */     this.gunModel[17] = new ModelRendererTurbo(this, 273, 41, this.textureX, this.textureY);
/*   69 */     this.gunModel[18] = new ModelRendererTurbo(this, 873, 57, this.textureX, this.textureY);
/*   70 */     this.gunModel[19] = new ModelRendererTurbo(this, 369, 25, this.textureX, this.textureY);
/*   71 */     this.gunModel[20] = new ModelRendererTurbo(this, 505, 33, this.textureX, this.textureY);
/*   72 */     this.gunModel[21] = new ModelRendererTurbo(this, 985, 41, this.textureX, this.textureY);
/*   73 */     this.gunModel[22] = new ModelRendererTurbo(this, 225, 49, this.textureX, this.textureY);
/*   74 */     this.gunModel[23] = new ModelRendererTurbo(this, 545, 33, this.textureX, this.textureY);
/*   75 */     this.gunModel[24] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/*   76 */     this.gunModel[25] = new ModelRendererTurbo(this, 745, 17, this.textureX, this.textureY);
/*   77 */     this.gunModel[26] = new ModelRendererTurbo(this, 825, 25, this.textureX, this.textureY);
/*   78 */     this.gunModel[27] = new ModelRendererTurbo(this, 865, 25, this.textureX, this.textureY);
/*   79 */     this.gunModel[28] = new ModelRendererTurbo(this, 905, 25, this.textureX, this.textureY);
/*   80 */     this.gunModel[29] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
/*   81 */     this.gunModel[30] = new ModelRendererTurbo(this, 65, 33, this.textureX, this.textureY);
/*   82 */     this.gunModel[31] = new ModelRendererTurbo(this, 105, 33, this.textureX, this.textureY);
/*   83 */     this.gunModel[32] = new ModelRendererTurbo(this, 145, 33, this.textureX, this.textureY);
/*   84 */     this.gunModel[33] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/*   85 */     this.gunModel[34] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*   86 */     this.gunModel[35] = new ModelRendererTurbo(this, 409, 33, this.textureX, this.textureY);
/*   87 */     this.gunModel[36] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/*   88 */     this.gunModel[37] = new ModelRendererTurbo(this, 929, 57, this.textureX, this.textureY);
/*   89 */     this.gunModel[38] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/*   90 */     this.gunModel[39] = new ModelRendererTurbo(this, 497, 33, this.textureX, this.textureY);
/*   91 */     this.gunModel[40] = new ModelRendererTurbo(this, 313, 73, this.textureX, this.textureY);
/*   92 */     this.gunModel[41] = new ModelRendererTurbo(this, 977, 57, this.textureX, this.textureY);
/*   93 */     this.gunModel[42] = new ModelRendererTurbo(this, 241, 73, this.textureX, this.textureY);
/*   94 */     this.gunModel[43] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/*   95 */     this.gunModel[44] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/*   96 */     this.gunModel[45] = new ModelRendererTurbo(this, 625, 73, this.textureX, this.textureY);
/*   97 */     this.gunModel[46] = new ModelRendererTurbo(this, 665, 73, this.textureX, this.textureY);
/*   98 */     this.gunModel[47] = new ModelRendererTurbo(this, 705, 73, this.textureX, this.textureY);
/*   99 */     this.gunModel[48] = new ModelRendererTurbo(this, 785, 73, this.textureX, this.textureY);
/*  100 */     this.gunModel[49] = new ModelRendererTurbo(this, 825, 73, this.textureX, this.textureY);
/*  101 */     this.gunModel[50] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  102 */     this.gunModel[51] = new ModelRendererTurbo(this, 41, 81, this.textureX, this.textureY);
/*  103 */     this.gunModel[52] = new ModelRendererTurbo(this, 625, 25, this.textureX, this.textureY);
/*  104 */     this.gunModel[53] = new ModelRendererTurbo(this, 665, 25, this.textureX, this.textureY);
/*  105 */     this.gunModel[54] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/*  106 */     this.gunModel[55] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/*  107 */     this.gunModel[56] = new ModelRendererTurbo(this, 721, 17, this.textureX, this.textureY);
/*  108 */     this.gunModel[57] = new ModelRendererTurbo(this, 561, 25, this.textureX, this.textureY);
/*  109 */     this.gunModel[58] = new ModelRendererTurbo(this, 601, 25, this.textureX, this.textureY);
/*  110 */     this.gunModel[59] = new ModelRendererTurbo(this, 785, 25, this.textureX, this.textureY);
/*  111 */     this.gunModel[60] = new ModelRendererTurbo(this, 801, 25, this.textureX, this.textureY);
/*  112 */     this.gunModel[61] = new ModelRendererTurbo(this, 865, 73, this.textureX, this.textureY);
/*  113 */     this.gunModel[62] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/*  114 */     this.gunModel[63] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
/*  115 */     this.gunModel[64] = new ModelRendererTurbo(this, 377, 81, this.textureX, this.textureY);
/*  116 */     this.gunModel[65] = new ModelRendererTurbo(this, 729, 81, this.textureX, this.textureY);
/*  117 */     this.gunModel[66] = new ModelRendererTurbo(this, 873, 81, this.textureX, this.textureY);
/*  118 */     this.gunModel[67] = new ModelRendererTurbo(this, 913, 81, this.textureX, this.textureY);
/*  119 */     this.gunModel[68] = new ModelRendererTurbo(this, 969, 81, this.textureX, this.textureY);
/*  120 */     this.gunModel[69] = new ModelRendererTurbo(this, 145, 89, this.textureX, this.textureY);
/*  121 */     this.gunModel[70] = new ModelRendererTurbo(this, 209, 89, this.textureX, this.textureY);
/*  122 */     this.gunModel[71] = new ModelRendererTurbo(this, 609, 89, this.textureX, this.textureY);
/*  123 */     this.gunModel[72] = new ModelRendererTurbo(this, 353, 89, this.textureX, this.textureY);
/*  124 */     this.gunModel[73] = new ModelRendererTurbo(this, 657, 89, this.textureX, this.textureY);
/*  125 */     this.gunModel[74] = new ModelRendererTurbo(this, 753, 89, this.textureX, this.textureY);
/*  126 */     this.gunModel[75] = new ModelRendererTurbo(this, 937, 89, this.textureX, this.textureY);
/*  127 */     this.gunModel[76] = new ModelRendererTurbo(this, 521, 81, this.textureX, this.textureY);
/*  128 */     this.gunModel[77] = new ModelRendererTurbo(this, 473, 73, this.textureX, this.textureY);
/*  129 */     this.gunModel[78] = new ModelRendererTurbo(this, 241, 97, this.textureX, this.textureY);
/*  130 */     this.gunModel[79] = new ModelRendererTurbo(this, 785, 49, this.textureX, this.textureY);
/*  131 */     this.gunModel[80] = new ModelRendererTurbo(this, 625, 33, this.textureX, this.textureY);
/*  132 */     this.gunModel[81] = new ModelRendererTurbo(this, 665, 33, this.textureX, this.textureY);
/*  133 */     this.gunModel[82] = new ModelRendererTurbo(this, 705, 33, this.textureX, this.textureY);
/*  134 */     this.gunModel[83] = new ModelRendererTurbo(this, 921, 25, this.textureX, this.textureY);
/*  135 */     this.gunModel[84] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  136 */     this.gunModel[85] = new ModelRendererTurbo(this, 265, 97, this.textureX, this.textureY);
/*  137 */     this.gunModel[86] = new ModelRendererTurbo(this, 1009, 41, this.textureX, this.textureY);
/*  138 */     this.gunModel[87] = new ModelRendererTurbo(this, 289, 49, this.textureX, this.textureY);
/*  139 */     this.gunModel[88] = new ModelRendererTurbo(this, 1009, 57, this.textureX, this.textureY);
/*  140 */     this.gunModel[89] = new ModelRendererTurbo(this, 881, 25, this.textureX, this.textureY);
/*  141 */     this.gunModel[90] = new ModelRendererTurbo(this, 745, 17, this.textureX, this.textureY);
/*  142 */     this.gunModel[91] = new ModelRendererTurbo(this, 825, 25, this.textureX, this.textureY);
/*  143 */     this.gunModel[92] = new ModelRendererTurbo(this, 865, 25, this.textureX, this.textureY);
/*  144 */     this.gunModel[93] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*  145 */     this.gunModel[94] = new ModelRendererTurbo(this, 905, 25, this.textureX, this.textureY);
/*  146 */     this.gunModel[95] = new ModelRendererTurbo(this, 945, 25, this.textureX, this.textureY);
/*  147 */     this.gunModel[96] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/*  148 */     this.gunModel[97] = new ModelRendererTurbo(this, 721, 25, this.textureX, this.textureY);
/*  149 */     this.gunModel[98] = new ModelRendererTurbo(this, 193, 57, this.textureX, this.textureY);
/*  150 */     this.gunModel[99] = new ModelRendererTurbo(this, 409, 65, this.textureX, this.textureY);
/*  151 */     this.gunModel[100] = new ModelRendererTurbo(this, 353, 73, this.textureX, this.textureY);
/*  152 */     this.gunModel[101] = new ModelRendererTurbo(this, 161, 33, this.textureX, this.textureY);
/*  153 */     this.gunModel[102] = new ModelRendererTurbo(this, 473, 73, this.textureX, this.textureY);
/*  154 */     this.gunModel[103] = new ModelRendererTurbo(this, 521, 73, this.textureX, this.textureY);
/*  155 */     this.gunModel[104] = new ModelRendererTurbo(this, 537, 73, this.textureX, this.textureY);
/*  156 */     this.gunModel[105] = new ModelRendererTurbo(this, 201, 33, this.textureX, this.textureY);
/*  157 */     this.gunModel[106] = new ModelRendererTurbo(this, 561, 73, this.textureX, this.textureY);
/*  158 */     this.gunModel[107] = new ModelRendererTurbo(this, 577, 73, this.textureX, this.textureY);
/*  159 */     this.gunModel[108] = new ModelRendererTurbo(this, 609, 73, this.textureX, this.textureY);
/*  160 */     this.gunModel[109] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*  161 */     this.gunModel[110] = new ModelRendererTurbo(this, 625, 73, this.textureX, this.textureY);
/*  162 */     this.gunModel[111] = new ModelRendererTurbo(this, 657, 73, this.textureX, this.textureY);
/*  163 */     this.gunModel[112] = new ModelRendererTurbo(this, 697, 73, this.textureX, this.textureY);
/*  164 */     this.gunModel[113] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/*  165 */     this.gunModel[114] = new ModelRendererTurbo(this, 809, 73, this.textureX, this.textureY);
/*  166 */     this.gunModel[115] = new ModelRendererTurbo(this, 825, 73, this.textureX, this.textureY);
/*  167 */     this.gunModel[116] = new ModelRendererTurbo(this, 849, 73, this.textureX, this.textureY);
/*  168 */     this.gunModel[117] = new ModelRendererTurbo(this, 385, 33, this.textureX, this.textureY);
/*  169 */     this.gunModel[118] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/*  170 */     this.gunModel[119] = new ModelRendererTurbo(this, 25, 81, this.textureX, this.textureY);
/*  171 */     this.gunModel[120] = new ModelRendererTurbo(this, 41, 81, this.textureX, this.textureY);
/*  172 */     this.gunModel[121] = new ModelRendererTurbo(this, 801, 33, this.textureX, this.textureY);
/*  173 */     this.gunModel[122] = new ModelRendererTurbo(this, 65, 81, this.textureX, this.textureY);
/*  174 */     this.gunModel[123] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/*  175 */     this.gunModel[124] = new ModelRendererTurbo(this, 105, 81, this.textureX, this.textureY);
/*  176 */     this.gunModel[125] = new ModelRendererTurbo(this, 945, 57, this.textureX, this.textureY);
/*  177 */     this.gunModel[126] = new ModelRendererTurbo(this, 305, 97, this.textureX, this.textureY);
/*  178 */     this.gunModel[127] = new ModelRendererTurbo(this, 409, 97, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 97, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 897, 81, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 97, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 553, 97, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 681, 97, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 777, 97, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 833, 97, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 105, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 105, 105, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 105, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 105, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 721, 105, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 553, 73, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 633, 97, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 993, 81, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 865, 105, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 753, 41, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 833, 49, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 873, 49, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 913, 49, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 953, 49, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 57, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 57, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 57, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 153, 57, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/*  206 */     this.gunModel[''] = new ModelRendererTurbo(this, 377, 57, this.textureX, this.textureY);
/*  207 */     this.gunModel[''] = new ModelRendererTurbo(this, 785, 73, this.textureX, this.textureY);
/*  208 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
/*  209 */     this.gunModel[''] = new ModelRendererTurbo(this, 145, 81, this.textureX, this.textureY);
/*  210 */     this.gunModel[''] = new ModelRendererTurbo(this, 161, 81, this.textureX, this.textureY);
/*  211 */     this.gunModel[' '] = new ModelRendererTurbo(this, 409, 81, this.textureX, this.textureY);
/*  212 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 817, 81, this.textureX, this.textureY);
/*  213 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 873, 81, this.textureX, this.textureY);
/*  214 */     this.gunModel['£'] = new ModelRendererTurbo(this, 897, 81, this.textureX, this.textureY);
/*  215 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 937, 81, this.textureX, this.textureY);
/*  216 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 1009, 81, this.textureX, this.textureY);
/*  217 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 753, 81, this.textureX, this.textureY);
/*  218 */     this.gunModel['§'] = new ModelRendererTurbo(this, 897, 105, this.textureX, this.textureY);
/*  219 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 961, 105, this.textureX, this.textureY);
/*  220 */     this.gunModel['©'] = new ModelRendererTurbo(this, 137, 113, this.textureX, this.textureY);
/*  221 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 177, 113, this.textureX, this.textureY);
/*  222 */     this.gunModel['«'] = new ModelRendererTurbo(this, 201, 121, this.textureX, this.textureY);
/*  223 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 353, 113, this.textureX, this.textureY);
/*  224 */     this.gunModel['­'] = new ModelRendererTurbo(this, 593, 113, this.textureX, this.textureY);
/*  225 */     this.gunModel['®'] = new ModelRendererTurbo(this, 497, 113, this.textureX, this.textureY);
/*  226 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 657, 113, this.textureX, this.textureY);
/*  227 */     this.gunModel['°'] = new ModelRendererTurbo(this, 449, 97, this.textureX, this.textureY);
/*  228 */     this.gunModel['±'] = new ModelRendererTurbo(this, 809, 97, this.textureX, this.textureY);
/*  229 */     this.gunModel['²'] = new ModelRendererTurbo(this, 265, 121, this.textureX, this.textureY);
/*  230 */     this.gunModel['³'] = new ModelRendererTurbo(this, 529, 121, this.textureX, this.textureY);
/*  231 */     this.gunModel['´'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  232 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 81, 129, this.textureX, this.textureY);
/*  233 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 745, 113, this.textureX, this.textureY);
/*  234 */     this.gunModel['·'] = new ModelRendererTurbo(this, 921, 113, this.textureX, this.textureY);
/*  235 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 985, 113, this.textureX, this.textureY);
/*  236 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 409, 121, this.textureX, this.textureY);
/*  237 */     this.gunModel['º'] = new ModelRendererTurbo(this, 617, 121, this.textureX, this.textureY);
/*  238 */     this.gunModel['»'] = new ModelRendererTurbo(this, 681, 121, this.textureX, this.textureY);
/*  239 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 321, 129, this.textureX, this.textureY);
/*  240 */     this.gunModel['½'] = new ModelRendererTurbo(this, 33, 105, this.textureX, this.textureY);
/*  241 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 377, 129, this.textureX, this.textureY);
/*  242 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 473, 121, this.textureX, this.textureY);
/*  243 */     this.gunModel['À'] = new ModelRendererTurbo(this, 705, 129, this.textureX, this.textureY);
/*  244 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 769, 129, this.textureX, this.textureY);
/*  245 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 241, 129, this.textureX, this.textureY);
/*  246 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 833, 129, this.textureX, this.textureY);
/*  247 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 961, 129, this.textureX, this.textureY);
/*  248 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 137, 137, this.textureX, this.textureY);
/*  249 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 409, 145, this.textureX, this.textureY);
/*  250 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 497, 145, this.textureX, this.textureY);
/*  251 */     this.gunModel['È'] = new ModelRendererTurbo(this, 585, 145, this.textureX, this.textureY);
/*  252 */     this.gunModel['É'] = new ModelRendererTurbo(this, 57, 137, this.textureX, this.textureY);
/*  253 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 353, 137, this.textureX, this.textureY);
/*  254 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 857, 145, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 273, 145, this.textureX, this.textureY);
/*  256 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 657, 137, this.textureX, this.textureY);
/*  257 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 681, 145, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/*  259 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 89, 153, this.textureX, this.textureY);
/*  260 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 201, 153, this.textureX, this.textureY);
/*  261 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 705, 153, this.textureX, this.textureY);
/*  262 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 25, 153, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 233, 153, this.textureX, this.textureY);
/*  264 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 305, 153, this.textureX, this.textureY);
/*  265 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 377, 153, this.textureX, this.textureY);
/*  266 */     this.gunModel['×'] = new ModelRendererTurbo(this, 785, 153, this.textureX, this.textureY);
/*  267 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 113, 169, this.textureX, this.textureY);
/*  268 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 945, 161, this.textureX, this.textureY);
/*  269 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 569, 169, this.textureX, this.textureY);
/*  270 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 649, 169, this.textureX, this.textureY);
/*  271 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 817, 161, this.textureX, this.textureY);
/*  272 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 57, 169, this.textureX, this.textureY);
/*  273 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 265, 169, this.textureX, this.textureY);
/*  274 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 849, 169, this.textureX, this.textureY);
/*  275 */     this.gunModel['à'] = new ModelRendererTurbo(this, 905, 169, this.textureX, this.textureY);
/*  276 */     this.gunModel['á'] = new ModelRendererTurbo(this, 353, 161, this.textureX, this.textureY);
/*  277 */     this.gunModel['â'] = new ModelRendererTurbo(this, 1, 177, this.textureX, this.textureY);
/*  278 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 89, 177, this.textureX, this.textureY);
/*  279 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 185, 177, this.textureX, this.textureY);
/*  280 */     this.gunModel['å'] = new ModelRendererTurbo(this, 233, 177, this.textureX, this.textureY);
/*  281 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 305, 177, this.textureX, this.textureY);
/*  282 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 377, 177, this.textureX, this.textureY);
/*  283 */     this.gunModel['è'] = new ModelRendererTurbo(this, 625, 169, this.textureX, this.textureY);
/*  284 */     this.gunModel['é'] = new ModelRendererTurbo(this, 417, 177, this.textureX, this.textureY);
/*  285 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 441, 177, this.textureX, this.textureY);
/*  286 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 497, 177, this.textureX, this.textureY);
/*  287 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 545, 177, this.textureX, this.textureY);
/*  288 */     this.gunModel['í'] = new ModelRendererTurbo(this, 769, 177, this.textureX, this.textureY);
/*  289 */     this.gunModel['î'] = new ModelRendererTurbo(this, 25, 185, this.textureX, this.textureY);
/*  290 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 209, 185, this.textureX, this.textureY);
/*  291 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 329, 185, this.textureX, this.textureY);
/*  292 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 705, 185, this.textureX, this.textureY);
/*  293 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 793, 185, this.textureX, this.textureY);
/*  294 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 193, 89, this.textureX, this.textureY);
/*  295 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 209, 89, this.textureX, this.textureY);
/*  296 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 233, 89, this.textureX, this.textureY);
/*  297 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 657, 89, this.textureX, this.textureY);
/*  298 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 681, 89, this.textureX, this.textureY);
/*  299 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 289, 97, this.textureX, this.textureY);
/*  300 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 377, 89, this.textureX, this.textureY);
/*  301 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 33, 89, this.textureX, this.textureY);
/*  302 */     this.gunModel['û'] = new ModelRendererTurbo(this, 777, 89, this.textureX, this.textureY);
/*  303 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 113, 193, this.textureX, this.textureY);
/*  304 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 441, 89, this.textureX, this.textureY);
/*  305 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 73, 89, this.textureX, this.textureY);
/*  306 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 473, 97, this.textureX, this.textureY);
/*  307 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 641, 89, this.textureX, this.textureY);
/*  308 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 505, 97, this.textureX, this.textureY);
/*  309 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 321, 89, this.textureX, this.textureY);
/*  310 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 153, 193, this.textureX, this.textureY);
/*  311 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 265, 193, this.textureX, this.textureY);
/*  312 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 441, 193, this.textureX, this.textureY);
/*  313 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 633, 193, this.textureX, this.textureY);
/*  314 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 889, 169, this.textureX, this.textureY);
/*  315 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 841, 193, this.textureX, this.textureY);
/*  316 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 481, 145, this.textureX, this.textureY);
/*  317 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 881, 193, this.textureX, this.textureY);
/*  318 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 921, 193, this.textureX, this.textureY);
/*  319 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 569, 145, this.textureX, this.textureY);
/*  320 */     this.gunModel['č'] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/*  321 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 697, 89, this.textureX, this.textureY);
/*  322 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 329, 97, this.textureX, this.textureY);
/*  323 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  324 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 769, 153, this.textureX, this.textureY);
/*  325 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 521, 177, this.textureX, this.textureY);
/*  326 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 729, 185, this.textureX, this.textureY);
/*  327 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 961, 89, this.textureX, this.textureY);
/*  328 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 401, 177, this.textureX, this.textureY);
/*  329 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 817, 185, this.textureX, this.textureY);
/*  330 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 961, 193, this.textureX, this.textureY);
/*  331 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 57, 201, this.textureX, this.textureY);
/*  332 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 305, 201, this.textureX, this.textureY);
/*  333 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 345, 97, this.textureX, this.textureY);
/*  334 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 361, 201, this.textureX, this.textureY);
/*  335 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/*  336 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 1001, 97, this.textureX, this.textureY);
/*  337 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 593, 105, this.textureX, this.textureY);
/*  338 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 921, 105, this.textureX, this.textureY);
/*  339 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 753, 89, this.textureX, this.textureY);
/*  340 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 897, 105, this.textureX, this.textureY);
/*  341 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 857, 129, this.textureX, this.textureY);
/*  342 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 985, 105, this.textureX, this.textureY);
/*  343 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 201, 113, this.textureX, this.textureY);
/*  344 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 401, 201, this.textureX, this.textureY);
/*  345 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 569, 201, this.textureX, this.textureY);
/*  346 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 169, 201, this.textureX, this.textureY);
/*  347 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 673, 193, this.textureX, this.textureY);
/*  348 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 433, 113, this.textureX, this.textureY);
/*  349 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 705, 121, this.textureX, this.textureY);
/*  350 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  351 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 57, 129, this.textureX, this.textureY);
/*  352 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 497, 121, this.textureX, this.textureY);
/*  353 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 81, 129, this.textureX, this.textureY);
/*  354 */     this.gunModel['į'] = new ModelRendererTurbo(this, 585, 121, this.textureX, this.textureY);
/*  355 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 41, 113, this.textureX, this.textureY);
/*  356 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 265, 129, this.textureX, this.textureY);
/*  357 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 529, 17, this.textureX, this.textureY);
/*  358 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 769, 17, this.textureX, this.textureY);
/*  359 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 849, 25, this.textureX, this.textureY);
/*  360 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 969, 25, this.textureX, this.textureY);
/*  361 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 769, 65, this.textureX, this.textureY);
/*  362 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 497, 73, this.textureX, this.textureY);
/*  363 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 673, 73, this.textureX, this.textureY);
/*  364 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 649, 25, this.textureX, this.textureY);
/*  365 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 689, 25, this.textureX, this.textureY);
/*  366 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
/*  367 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
/*  368 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 65, 33, this.textureX, this.textureY);
/*  369 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*  370 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 105, 33, this.textureX, this.textureY);
/*  371 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 713, 73, this.textureX, this.textureY);
/*  372 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 921, 81, this.textureX, this.textureY);
/*  373 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 1017, 89, this.textureX, this.textureY);
/*  374 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 273, 97, this.textureX, this.textureY);
/*  375 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 873, 105, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 769, 113, this.textureX, this.textureY);
/*  377 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 857, 121, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 129, 33, this.textureX, this.textureY);
/*  379 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 145, 33, this.textureX, this.textureY);
/*  380 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/*  381 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  382 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 409, 33, this.textureX, this.textureY);
/*  383 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/*  384 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 497, 33, this.textureX, this.textureY);
/*  385 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  386 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 185, 113, this.textureX, this.textureY);
/*  387 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 665, 121, this.textureX, this.textureY);
/*  388 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 681, 121, this.textureX, this.textureY);
/*  389 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 689, 121, this.textureX, this.textureY);
/*  390 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 1009, 121, this.textureX, this.textureY);
/*  391 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 1017, 121, this.textureX, this.textureY);
/*  392 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 513, 33, this.textureX, this.textureY);
/*  393 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
/*  394 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 209, 41, this.textureX, this.textureY);
/*  395 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 353, 41, this.textureX, this.textureY);
/*  396 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 793, 41, this.textureX, this.textureY);
/*  397 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/*  398 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 273, 49, this.textureX, this.textureY);
/*  399 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 249, 129, this.textureX, this.textureY);
/*  400 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 321, 129, this.textureX, this.textureY);
/*  401 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 329, 129, this.textureX, this.textureY);
/*  402 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 409, 129, this.textureX, this.textureY);
/*  403 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 417, 129, this.textureX, this.textureY);
/*  404 */     this.gunModel['š'] = new ModelRendererTurbo(this, 537, 129, this.textureX, this.textureY);
/*  405 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 585, 129, this.textureX, this.textureY);
/*  406 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/*  407 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 321, 25, this.textureX, this.textureY);
/*  408 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 601, 57, this.textureX, this.textureY);
/*  409 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 377, 25, this.textureX, this.textureY);
/*  410 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 697, 57, this.textureX, this.textureY);
/*  411 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 417, 25, this.textureX, this.textureY);
/*  412 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 929, 57, this.textureX, this.textureY);
/*  413 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/*  414 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 977, 57, this.textureX, this.textureY);
/*  415 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/*  416 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 993, 57, this.textureX, this.textureY);
/*  417 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 1017, 25, this.textureX, this.textureY);
/*  418 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/*  419 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 1017, 33, this.textureX, this.textureY);
/*  420 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 489, 209, this.textureX, this.textureY);
/*  421 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 705, 209, this.textureX, this.textureY);
/*  422 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 745, 193, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 281, 201, this.textureX, this.textureY);
/*  424 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 377, 201, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 857, 201, this.textureX, this.textureY);
/*  426 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 73, 209, this.textureX, this.textureY);
/*  427 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 113, 217, this.textureX, this.textureY);
/*  428 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 209, 217, this.textureX, this.textureY);
/*  429 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 937, 201, this.textureX, this.textureY);
/*  430 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 417, 209, this.textureX, this.textureY);
/*  431 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 521, 209, this.textureX, this.textureY);
/*  432 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 649, 209, this.textureX, this.textureY);
/*  433 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 769, 209, this.textureX, this.textureY);
/*  434 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 113, 153, this.textureX, this.textureY);
/*  435 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 545, 209, this.textureX, this.textureY);
/*  436 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 985, 209, this.textureX, this.textureY);
/*  437 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 25, 217, this.textureX, this.textureY);
/*  438 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 329, 217, this.textureX, this.textureY);
/*  439 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 625, 217, this.textureX, this.textureY);
/*  440 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 681, 217, this.textureX, this.textureY);
/*  441 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 305, 145, this.textureX, this.textureY);
/*  442 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 481, 145, this.textureX, this.textureY);
/*  443 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 745, 217, this.textureX, this.textureY);
/*  444 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 569, 145, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
/*  446 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 265, 41, this.textureX, this.textureY);
/*  447 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 217, 145, this.textureX, this.textureY);
/*  448 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 1001, 153, this.textureX, this.textureY);
/*  449 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 793, 217, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 889, 217, this.textureX, this.textureY);
/*  451 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 145, 217, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 257, 217, this.textureX, this.textureY);
/*  453 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 25, 153, this.textureX, this.textureY);
/*  454 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 681, 145, this.textureX, this.textureY);
/*  455 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/*  456 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 553, 41, this.textureX, this.textureY);
/*  457 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 233, 153, this.textureX, this.textureY);
/*  458 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 265, 153, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 9, 137, this.textureX, this.textureY);
/*  460 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 65, 137, this.textureX, this.textureY);
/*  461 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 609, 137, this.textureX, this.textureY);
/*  462 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 505, 145, this.textureX, this.textureY);
/*  463 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 593, 145, this.textureX, this.textureY);
/*  464 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 409, 153, this.textureX, this.textureY);
/*  465 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 705, 153, this.textureX, this.textureY);
/*  466 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 505, 153, this.textureX, this.textureY);
/*  467 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 1001, 169, this.textureX, this.textureY);
/*  468 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 769, 153, this.textureX, this.textureY);
/*  469 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 593, 153, this.textureX, this.textureY);
/*  470 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 969, 105, this.textureX, this.textureY);
/*  471 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 817, 153, this.textureX, this.textureY);
/*  472 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 753, 113, this.textureX, this.textureY);
/*  473 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 25, 177, this.textureX, this.textureY);
/*  474 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/*  475 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 593, 41, this.textureX, this.textureY);
/*  476 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 457, 73, this.textureX, this.textureY);
/*  477 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 993, 49, this.textureX, this.textureY);
/*  478 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 209, 177, this.textureX, this.textureY);
/*  479 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 793, 153, this.textureX, this.textureY);
/*  480 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 497, 137, this.textureX, this.textureY);
/*  481 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 233, 145, this.textureX, this.textureY);
/*  482 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 729, 73, this.textureX, this.textureY);
/*  483 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 233, 57, this.textureX, this.textureY);
/*  484 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 65, 129, this.textureX, this.textureY);
/*  485 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 353, 161, this.textureX, this.textureY);
/*  486 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 921, 225, this.textureX, this.textureY);
/*  487 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 65, 233, this.textureX, this.textureY);
/*  488 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 961, 233, this.textureX, this.textureY);
/*  489 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 113, 249, this.textureX, this.textureY);
/*  490 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 377, 161, this.textureX, this.textureY);
/*  491 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 313, 145, this.textureX, this.textureY);
/*  492 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 265, 145, this.textureX, this.textureY);
/*  493 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 545, 81, this.textureX, this.textureY);
/*  494 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 201, 89, this.textureX, this.textureY);
/*  495 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 585, 81, this.textureX, this.textureY);
/*  496 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 249, 113, this.textureX, this.textureY);
/*  497 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 833, 81, this.textureX, this.textureY);
/*  498 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 881, 57, this.textureX, this.textureY);
/*  499 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 393, 65, this.textureX, this.textureY);
/*  500 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 689, 89, this.textureX, this.textureY);
/*  501 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 217, 113, this.textureX, this.textureY);
/*  502 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 969, 113, this.textureX, this.textureY);
/*  503 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 505, 121, this.textureX, this.textureY);
/*  504 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 713, 121, this.textureX, this.textureY);
/*  505 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 9, 129, this.textureX, this.textureY);
/*  506 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 273, 129, this.textureX, this.textureY);
/*  507 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 257, 177, this.textureX, this.textureY);
/*  508 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 721, 97, this.textureX, this.textureY);
/*  509 */     this.gunModel['Ǌ'] = new ModelRendererTurbo(this, 737, 129, this.textureX, this.textureY);
/*  510 */     this.gunModel['ǋ'] = new ModelRendererTurbo(this, 913, 129, this.textureX, this.textureY);
/*  511 */     this.gunModel['ǌ'] = new ModelRendererTurbo(this, 817, 161, this.textureX, this.textureY);
/*  512 */     this.gunModel['Ǎ'] = new ModelRendererTurbo(this, 857, 81, this.textureX, this.textureY);
/*  513 */     this.gunModel['ǎ'] = new ModelRendererTurbo(this, 417, 153, this.textureX, this.textureY);
/*  514 */     this.gunModel['Ǐ'] = new ModelRendererTurbo(this, 649, 169, this.textureX, this.textureY);
/*  515 */     this.gunModel['ǐ'] = new ModelRendererTurbo(this, 113, 153, this.textureX, this.textureY);
/*  516 */     this.gunModel['Ǒ'] = new ModelRendererTurbo(this, 33, 161, this.textureX, this.textureY);
/*  517 */     this.gunModel['ǒ'] = new ModelRendererTurbo(this, 881, 65, this.textureX, this.textureY);
/*  518 */     this.gunModel['Ǔ'] = new ModelRendererTurbo(this, 225, 73, this.textureX, this.textureY);
/*  519 */     this.gunModel['ǔ'] = new ModelRendererTurbo(this, 473, 137, this.textureX, this.textureY);
/*  520 */     this.gunModel['Ǖ'] = new ModelRendererTurbo(this, 529, 137, this.textureX, this.textureY);
/*  521 */     this.gunModel['ǖ'] = new ModelRendererTurbo(this, 593, 137, this.textureX, this.textureY);
/*  522 */     this.gunModel['Ǘ'] = new ModelRendererTurbo(this, 993, 81, this.textureX, this.textureY);
/*  523 */     this.gunModel['ǘ'] = new ModelRendererTurbo(this, 9, 89, this.textureX, this.textureY);
/*  524 */     this.gunModel['Ǚ'] = new ModelRendererTurbo(this, 49, 89, this.textureX, this.textureY);
/*      */     
/*  526 */     this.gunModel[0].addShapeBox(20.0F, -18.0F, -5.0F, 46, 1, 5, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/*  527 */     this.gunModel[0].setRotationPoint(12.0F, -39.0F, -1.0F);
/*      */     
/*  529 */     this.gunModel[1].addShapeBox(20.0F, -18.0F, -5.0F, 92, 3, 9, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  530 */     this.gunModel[1].setRotationPoint(-16.0F, -42.0F, 0.0F);
/*      */     
/*  532 */     this.gunModel[2].addShapeBox(20.0F, -18.0F, -5.0F, 92, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  533 */     this.gunModel[2].setRotationPoint(-16.0F, -39.0F, 0.0F);
/*      */     
/*  535 */     this.gunModel[3].addShapeBox(20.0F, -18.0F, -5.0F, 92, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  536 */     this.gunModel[3].setRotationPoint(-16.0F, -36.0F, 0.0F);
/*      */     
/*  538 */     this.gunModel[4].addBox(20.0F, -18.0F, -5.0F, 40, 5, 11, 0.0F);
/*  539 */     this.gunModel[4].setRotationPoint(20.0F, -27.0F, -1.0F);
/*      */     
/*  541 */     this.gunModel[5].addShapeBox(20.0F, -18.0F, -5.0F, 40, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  542 */     this.gunModel[5].setRotationPoint(20.0F, -22.0F, -1.0F);
/*      */     
/*  544 */     this.gunModel[6].addShapeBox(20.0F, -18.0F, -5.0F, 40, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  545 */     this.gunModel[6].setRotationPoint(20.0F, -20.0F, 0.0F);
/*      */     
/*  547 */     this.gunModel[7].addShapeBox(20.0F, -18.0F, -5.0F, 3, 5, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/*  548 */     this.gunModel[7].setRotationPoint(14.0F, -27.0F, -1.0F);
/*      */     
/*  550 */     this.gunModel[8].addShapeBox(20.0F, -18.0F, -5.0F, 17, 9, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  551 */     this.gunModel[8].setRotationPoint(-3.0F, -27.0F, -1.0F);
/*      */     
/*  553 */     this.gunModel[9].addShapeBox(20.0F, -18.0F, -5.0F, 3, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 4.0F, 0.0F);
/*  554 */     this.gunModel[9].setRotationPoint(17.0F, -27.0F, -1.0F);
/*      */     
/*  556 */     this.gunModel[10].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 11, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 2.0F, -1.0F);
/*  557 */     this.gunModel[10].setRotationPoint(17.0F, -22.0F, -1.0F);
/*      */     
/*  559 */     this.gunModel[11].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 9, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -3.0F);
/*  560 */     this.gunModel[11].setRotationPoint(17.0F, -20.0F, 0.0F);
/*      */     
/*  562 */     this.gunModel[12].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 11, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, -0.83F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 2.0F, -0.83F);
/*  563 */     this.gunModel[12].setRotationPoint(14.0F, -20.0F, -1.0F);
/*      */     
/*  565 */     this.gunModel[13].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 9, 0.0F, 0.0F, -1.0F, 0.18F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.18F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, -3.0F, 0.0F, -0.5F, 0.0F);
/*  566 */     this.gunModel[13].setRotationPoint(14.0F, -17.0F, 0.0F);
/*      */     
/*  568 */     this.gunModel[14].addShapeBox(20.0F, -18.0F, -5.0F, 16, 2, 11, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F);
/*  569 */     this.gunModel[14].setRotationPoint(-2.0F, -18.0F, -1.0F);
/*      */     
/*  571 */     this.gunModel[15].addShapeBox(20.0F, -18.0F, -5.0F, 14, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  572 */     this.gunModel[15].setRotationPoint(57.15F, -24.0F, 3.0F);
/*      */     
/*  574 */     this.gunModel[16].addShapeBox(20.0F, -18.0F, -5.0F, 14, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  575 */     this.gunModel[16].setRotationPoint(57.15F, -25.0F, 3.0F);
/*      */     
/*  577 */     this.gunModel[17].addShapeBox(20.0F, -18.0F, -5.0F, 14, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  578 */     this.gunModel[17].setRotationPoint(57.15F, -26.0F, 3.0F);
/*      */     
/*  580 */     this.gunModel[18].addShapeBox(20.0F, -18.0F, -5.0F, 20, 7, 13, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  581 */     this.gunModel[18].setRotationPoint(-24.0F, -27.0F, -1.0F);
/*      */     
/*  583 */     this.gunModel[19].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  584 */     this.gunModel[19].setRotationPoint(-4.0F, -27.0F, -1.0F);
/*      */     
/*  586 */     this.gunModel[20].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  587 */     this.gunModel[20].setRotationPoint(-5.0F, -20.0F, -1.0F);
/*      */     
/*  589 */     this.gunModel[21].addShapeBox(20.0F, -18.0F, -5.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  590 */     this.gunModel[21].setRotationPoint(-12.0F, -20.0F, -1.0F);
/*      */     
/*  592 */     this.gunModel[22].addShapeBox(20.0F, -18.0F, -5.0F, 4, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/*  593 */     this.gunModel[22].setRotationPoint(-12.0F, -18.0F, -1.0F);
/*      */     
/*  595 */     this.gunModel[23].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/*  596 */     this.gunModel[23].setRotationPoint(-5.0F, -18.0F, -1.0F);
/*      */     
/*  598 */     this.gunModel[24].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -2.0F);
/*  599 */     this.gunModel[24].setRotationPoint(-4.0F, -18.0F, -1.0F);
/*      */     
/*  601 */     this.gunModel[25].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 12, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -1.1F, 0.0F, -0.5F, -1.1F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F);
/*  602 */     this.gunModel[25].setRotationPoint(-8.0F, -17.0F, 0.0F);
/*      */     
/*  604 */     this.gunModel[26].addShapeBox(20.0F, -18.0F, -5.0F, 3, 4, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  605 */     this.gunModel[26].setRotationPoint(-8.0F, -20.5F, 0.5F);
/*      */     
/*  607 */     this.gunModel[27].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 9, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  608 */     this.gunModel[27].setRotationPoint(-8.0F, -19.5F, 2.5F);
/*      */     
/*  610 */     this.gunModel[28].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  611 */     this.gunModel[28].setRotationPoint(-6.0F, -20.0F, 1.0F);
/*      */     
/*  613 */     this.gunModel[29].addShapeBox(20.0F, -18.0F, -5.0F, 7, 2, 7, 0.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  614 */     this.gunModel[29].setRotationPoint(8.0F, -15.5F, 1.0F);
/*      */     
/*  616 */     this.gunModel[30].addShapeBox(20.0F, -18.0F, -5.0F, 6, 1, 7, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  617 */     this.gunModel[30].setRotationPoint(8.0F, -13.5F, 1.0F);
/*      */     
/*  619 */     this.gunModel[31].addShapeBox(20.0F, -18.0F, -5.0F, 5, 2, 7, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  620 */     this.gunModel[31].setRotationPoint(9.0F, -12.5F, 1.0F);
/*      */     
/*  622 */     this.gunModel[32].addShapeBox(20.0F, -18.0F, -5.0F, 4, 2, 7, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  623 */     this.gunModel[32].setRotationPoint(10.0F, -10.5F, 1.0F);
/*      */     
/*  625 */     this.gunModel[33].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 7, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  626 */     this.gunModel[33].setRotationPoint(10.0F, -8.5F, 1.0F);
/*      */     
/*  628 */     this.gunModel[34].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 7, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  629 */     this.gunModel[34].setRotationPoint(10.0F, -5.5F, 1.0F);
/*      */     
/*  631 */     this.gunModel[35].addShapeBox(20.0F, -18.0F, -5.0F, 5, 3, 7, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, 0.5F, -2.25F, 0.0F, 0.5F, -2.25F, 0.0F, -0.75F, 0.25F, 0.0F);
/*  632 */     this.gunModel[35].setRotationPoint(7.75F, -0.5F, 1.0F);
/*      */     
/*  634 */     this.gunModel[36].addShapeBox(20.0F, -18.0F, -5.0F, 5, 2, 7, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  635 */     this.gunModel[36].setRotationPoint(-18.0F, 2.5F, 1.0F);
/*      */     
/*  637 */     this.gunModel[37].addShapeBox(20.0F, -18.0F, -5.0F, 4, 2, 7, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.75F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 1.75F, 0.0F);
/*  638 */     this.gunModel[37].setRotationPoint(5.0F, 0.5F, 1.0F);
/*      */     
/*  640 */     this.gunModel[38].addShapeBox(20.0F, -18.0F, -5.0F, 5, 2, 7, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  641 */     this.gunModel[38].setRotationPoint(9.0F, -2.5F, 1.0F);
/*      */     
/*  643 */     this.gunModel[39].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 7, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F);
/*  644 */     this.gunModel[39].setRotationPoint(-13.0F, 4.5F, 1.0F);
/*      */     
/*  646 */     this.gunModel[40].addShapeBox(20.0F, -18.0F, -5.0F, 7, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  647 */     this.gunModel[40].setRotationPoint(-10.0F, 4.0F, 1.0F);
/*      */     
/*  649 */     this.gunModel[41].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 7, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  650 */     this.gunModel[41].setRotationPoint(-3.0F, 4.5F, 1.0F);
/*      */     
/*  652 */     this.gunModel[42].addShapeBox(20.0F, -18.0F, -5.0F, 5, 2, 7, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 1.0F, 0.0F);
/*  653 */     this.gunModel[42].setRotationPoint(0.0F, 2.5F, 1.0F);
/*      */     
/*  655 */     this.gunModel[43].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 7, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.5F, 0.5F, 0.0F);
/*  656 */     this.gunModel[43].setRotationPoint(-20.0F, -0.5F, 1.0F);
/*      */     
/*  658 */     this.gunModel[44].addShapeBox(20.0F, -18.0F, -5.0F, 7, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  659 */     this.gunModel[44].setRotationPoint(8.0F, -16.5F, 1.0F);
/*      */     
/*  661 */     this.gunModel[45].addShapeBox(20.0F, -18.0F, -5.0F, 6, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/*  662 */     this.gunModel[45].setRotationPoint(-18.0F, -20.0F, -1.0F);
/*      */     
/*  664 */     this.gunModel[46].addShapeBox(20.0F, -18.0F, -5.0F, 6, 2, 13, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -2.0F, 0.0F, 2.5F, -2.0F);
/*  665 */     this.gunModel[46].setRotationPoint(-18.0F, -18.0F, -1.0F);
/*      */     
/*  667 */     this.gunModel[47].addShapeBox(20.0F, -18.0F, -5.0F, 3, 4, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F);
/*  668 */     this.gunModel[47].setRotationPoint(-21.0F, -20.0F, -1.0F);
/*      */     
/*  670 */     this.gunModel[48].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 15, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.5F, -2.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.5F, -2.0F, 0.0F, 3.5F, -2.0F);
/*  671 */     this.gunModel[48].setRotationPoint(-21.0F, -16.0F, -3.0F);
/*      */     
/*  673 */     this.gunModel[49].addShapeBox(20.0F, -18.0F, -5.0F, 3, 5, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  674 */     this.gunModel[49].setRotationPoint(-24.0F, -10.5F, -3.0F);
/*      */     
/*  676 */     this.gunModel[50].addShapeBox(20.0F, -18.0F, -5.0F, 3, 3, 15, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F);
/*  677 */     this.gunModel[50].setRotationPoint(-24.0F, -13.0F, -3.0F);
/*      */     
/*  679 */     this.gunModel[51].addShapeBox(20.0F, -18.0F, -5.0F, 3, 3, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.85F, -0.5F, 0.0F, 1.0F, -0.5F, -2.0F, 1.0F, -0.5F, -2.0F, -0.85F, -0.5F, 0.0F);
/*  680 */     this.gunModel[51].setRotationPoint(-24.0F, -5.5F, -3.0F);
/*      */     
/*  682 */     this.gunModel[52].addShapeBox(20.0F, -18.0F, -5.0F, 7, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  683 */     this.gunModel[52].setRotationPoint(-11.0F, -16.0F, 2.5F);
/*      */     
/*  685 */     this.gunModel[53].addShapeBox(20.0F, -18.0F, -5.0F, 7, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F);
/*  686 */     this.gunModel[53].setRotationPoint(-11.0F, -14.0F, 2.5F);
/*      */     
/*  688 */     this.gunModel[54].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/*  689 */     this.gunModel[54].setRotationPoint(-9.0F, -12.25F, 2.5F);
/*      */     
/*  691 */     this.gunModel[55].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  692 */     this.gunModel[55].setRotationPoint(-9.0F, -8.75F, 2.5F);
/*      */     
/*  694 */     this.gunModel[56].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  695 */     this.gunModel[56].setRotationPoint(-8.0F, -7.75F, 2.5F);
/*      */     
/*  697 */     this.gunModel[57].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  698 */     this.gunModel[57].setRotationPoint(-7.0F, -5.75F, 2.5F);
/*      */     
/*  700 */     this.gunModel[58].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  701 */     this.gunModel[58].setRotationPoint(-5.75F, -3.75F, 2.5F);
/*      */     
/*  703 */     this.gunModel[59].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/*  704 */     this.gunModel[59].setRotationPoint(-4.5F, -2.75F, 2.5F);
/*      */     
/*  706 */     this.gunModel[60].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 4, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 2.25F, -1.0F, 0.0F, 2.25F, -1.0F, 0.0F, -4.0F, 0.0F, 0.0F);
/*  707 */     this.gunModel[60].setRotationPoint(-3.5F, -1.75F, 2.5F);
/*      */     
/*  709 */     this.gunModel[61].addShapeBox(20.0F, -18.0F, -5.0F, 2, 31, 1, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 8.0F, 0.0F, 2.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 2.0F);
/*  710 */     this.gunModel[61].setRotationPoint(-31.5F, 5.0F, -3.0F);
/*      */     
/*  712 */     this.gunModel[62].addShapeBox(20.0F, -18.0F, -5.0F, 2, 17, 15, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 0.0F, 2.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 2.0F);
/*  713 */     this.gunModel[62].setRotationPoint(-25.5F, -20.0F, -3.0F);
/*      */     
/*  715 */     this.gunModel[63].addShapeBox(20.0F, -18.0F, -5.0F, 5, 7, 13, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F);
/*  716 */     this.gunModel[63].setRotationPoint(-25.5F, -20.0F, -1.0F);
/*      */     
/*  718 */     this.gunModel[64].addShapeBox(20.0F, -18.0F, -5.0F, 5, 2, 15, 0.0F, -0.35F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.35F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/*  719 */     this.gunModel[64].setRotationPoint(-25.5F, -12.5F, -3.0F);
/*      */     
/*  721 */     this.gunModel[65].addShapeBox(20.0F, -18.0F, -5.0F, 3, 5, 15, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/*  722 */     this.gunModel[65].setRotationPoint(-27.0F, -10.5F, -3.0F);
/*      */     
/*  724 */     this.gunModel[66].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 15, 0.0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.85F, 0.5F, 0.0F, 0.85F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
/*  725 */     this.gunModel[66].setRotationPoint(-27.0F, -5.5F, -3.0F);
/*      */     
/*  727 */     this.gunModel[67].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 15, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
/*  728 */     this.gunModel[67].setRotationPoint(-25.5F, -22.0F, -3.0F);
/*      */     
/*  730 */     this.gunModel[68].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 15, 0.0F, 2.0F, 0.0F, 0.75F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.75F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
/*  731 */     this.gunModel[68].setRotationPoint(-25.5F, -24.0F, -3.0F);
/*      */     
/*  733 */     this.gunModel[69].addShapeBox(20.0F, -18.0F, -5.0F, 16, 2, 15, 0.0F, 0.0F, 0.0F, 0.75F, -2.0F, 0.0F, 0.75F, -2.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
/*  734 */     this.gunModel[69].setRotationPoint(-41.5F, -24.0F, -3.0F);
/*      */     
/*  736 */     this.gunModel[70].addShapeBox(20.0F, -18.0F, -5.0F, 2, 5, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
/*  737 */     this.gunModel[70].setRotationPoint(-25.5F, -27.0F, -1.0F);
/*      */     
/*  739 */     this.gunModel[71].addShapeBox(20.0F, -18.0F, -5.0F, 7, 3, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  740 */     this.gunModel[71].setRotationPoint(-32.5F, -27.0F, -1.0F);
/*      */     
/*  742 */     this.gunModel[72].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 15, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
/*  743 */     this.gunModel[72].setRotationPoint(-31.5F, -1.0F, -3.0F);
/*      */     
/*  745 */     this.gunModel[73].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 15, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
/*  746 */     this.gunModel[73].setRotationPoint(-33.5F, 1.0F, -3.0F);
/*      */     
/*  748 */     this.gunModel[74].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 15, 0.0F, 2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
/*  749 */     this.gunModel[74].setRotationPoint(-31.5F, 3.0F, -3.0F);
/*      */     
/*  751 */     this.gunModel[75].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 15, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, 2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
/*  752 */     this.gunModel[75].setRotationPoint(-29.5F, -3.0F, -3.0F);
/*      */     
/*  754 */     this.gunModel[76].addShapeBox(20.0F, -18.0F, -5.0F, 2, 31, 10, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 8.0F, 0.0F, 2.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 8.0F, 0.0F, 2.0F);
/*  755 */     this.gunModel[76].setRotationPoint(-31.5F, 5.0F, 2.0F);
/*      */     
/*  757 */     this.gunModel[77].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F);
/*  758 */     this.gunModel[77].setRotationPoint(-8.0F, -18.0F, -1.0F);
/*      */     
/*  760 */     this.gunModel[78].addShapeBox(20.0F, -18.0F, -5.0F, 8, 3, 10, 0.0F, -1.05F, 0.5F, 0.0F, -0.5F, 0.5F, -1.0F, -0.5F, 0.5F, 0.0F, -1.05F, 0.5F, 0.0F, -0.35F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -3.5F, -0.5F, 0.0F, -0.35F, -0.5F, 0.0F);
/*  761 */     this.gunModel[78].setRotationPoint(-25.5F, -15.5F, -3.0F);
/*      */     
/*  763 */     this.gunModel[79].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  764 */     this.gunModel[79].setRotationPoint(-8.0F, -20.0F, -1.0F);
/*      */     
/*  766 */     this.gunModel[80].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  767 */     this.gunModel[80].setRotationPoint(-8.0F, -20.0F, 1.0F);
/*      */     
/*  769 */     this.gunModel[81].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  770 */     this.gunModel[81].setRotationPoint(-8.0F, -17.5F, 2.5F);
/*      */     
/*  772 */     this.gunModel[82].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  773 */     this.gunModel[82].setRotationPoint(-8.0F, -18.5F, 2.5F);
/*      */     
/*  775 */     this.gunModel[83].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 3, 0.0F, 1.85F, 0.0F, 0.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, 3.6F, 0.0F, 0.0F, -2.35F, 0.0F, -3.0F, -2.35F, 0.0F, 0.0F, 3.6F, 0.0F, 0.0F);
/*  776 */     this.gunModel[83].setRotationPoint(-29.5F, 12.0F, -3.0F);
/*      */     
/*  778 */     this.gunModel[84].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 3, 0.0F, 1.6F, 0.0F, 0.0F, -0.35F, 0.0F, -3.0F, -0.35F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F, -1.6F, 0.0F, -3.0F, -1.6F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  779 */     this.gunModel[84].setRotationPoint(-31.5F, 19.0F, -3.0F);
/*      */     
/*  781 */     this.gunModel[85].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 15, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 2.0F, 0.0F, 0.0F, 3.85F, 0.0F, 0.0F, -2.25F, 0.0F, -3.0F, -2.25F, 0.0F, -3.0F, 3.85F, 0.0F, 0.0F);
/*  782 */     this.gunModel[85].setRotationPoint(-27.5F, 5.0F, -3.0F);
/*      */     
/*  784 */     this.gunModel[86].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 3, 0.0F, 1.85F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -3.0F, 1.85F, 0.0F, 0.0F, 3.6F, 0.0F, 0.0F, -2.35F, 0.0F, 0.0F, -2.35F, 0.0F, -3.0F, 3.6F, 0.0F, 0.0F);
/*  785 */     this.gunModel[86].setRotationPoint(-29.5F, 12.0F, 9.0F);
/*      */     
/*  787 */     this.gunModel[87].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 3, 0.0F, 1.6F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, -3.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F, -1.6F, 0.0F, 0.0F, -1.6F, 0.0F, -3.0F, 3.4F, 0.0F, 0.0F);
/*  788 */     this.gunModel[87].setRotationPoint(-31.5F, 19.0F, 9.0F);
/*      */     
/*  790 */     this.gunModel[88].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 3, 0.0F, 1.6F, 0.0F, 0.0F, 0.2F, 0.0F, -3.0F, 0.2F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 0.1F, 0.0F, -3.0F, 0.1F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F);
/*  791 */     this.gunModel[88].setRotationPoint(-33.3F, 26.0F, -3.0F);
/*      */     
/*  793 */     this.gunModel[89].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 3, 0.0F, 0.4F, 0.0F, 0.0F, 0.1F, 0.0F, -3.0F, 0.1F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.2F, 0.0F, -1.15F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
/*  794 */     this.gunModel[89].setRotationPoint(-34.3F, 33.0F, -3.0F);
/*      */     
/*  796 */     this.gunModel[90].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.85F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, 3.6F, 0.0F, -0.5F, -2.35F, 0.0F, -0.5F, -2.35F, 0.0F, 0.0F, 3.6F, 0.0F, 0.0F);
/*  797 */     this.gunModel[90].setRotationPoint(-29.5F, 12.0F, 6.75F);
/*      */     
/*  799 */     this.gunModel[91].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, -1.6F, 0.0F, -0.5F, -1.6F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  800 */     this.gunModel[91].setRotationPoint(-31.5F, 19.0F, 6.75F);
/*      */     
/*  802 */     this.gunModel[92].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  803 */     this.gunModel[92].setRotationPoint(-33.3F, 26.0F, 6.75F);
/*      */     
/*  805 */     this.gunModel[93].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 1, 0.0F, 2.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 2.4F, 0.0F, 0.0F, 3.2F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F);
/*  806 */     this.gunModel[93].setRotationPoint(-34.3F, 33.0F, 6.75F);
/*      */     
/*  808 */     this.gunModel[94].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.85F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, 3.6F, 0.0F, -0.5F, -2.35F, 0.0F, -0.5F, -2.35F, 0.0F, 0.0F, 3.6F, 0.0F, 0.0F);
/*  809 */     this.gunModel[94].setRotationPoint(-29.5F, 12.0F, 5.75F);
/*      */     
/*  811 */     this.gunModel[95].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, -1.6F, 0.0F, -0.5F, -1.6F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  812 */     this.gunModel[95].setRotationPoint(-31.5F, 19.0F, 5.75F);
/*      */     
/*  814 */     this.gunModel[96].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  815 */     this.gunModel[96].setRotationPoint(-33.3F, 26.0F, 5.75F);
/*      */     
/*  817 */     this.gunModel[97].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 1, 0.0F, 2.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 2.4F, 0.0F, 0.0F, 3.2F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F);
/*  818 */     this.gunModel[97].setRotationPoint(-34.3F, 33.0F, 5.75F);
/*      */     
/*  820 */     this.gunModel[98].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.85F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, 3.6F, 0.0F, -0.5F, -2.35F, 0.0F, -0.5F, -2.35F, 0.0F, 0.0F, 3.6F, 0.0F, 0.0F);
/*  821 */     this.gunModel[98].setRotationPoint(-29.5F, 12.0F, 4.75F);
/*      */     
/*  823 */     this.gunModel[99].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, -1.6F, 0.0F, -0.5F, -1.6F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  824 */     this.gunModel[99].setRotationPoint(-31.5F, 19.0F, 4.75F);
/*      */     
/*  826 */     this.gunModel[100].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  827 */     this.gunModel[100].setRotationPoint(-33.3F, 26.0F, 4.75F);
/*      */     
/*  829 */     this.gunModel[101].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 1, 0.0F, 2.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 2.4F, 0.0F, 0.0F, 3.2F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F);
/*  830 */     this.gunModel[101].setRotationPoint(-34.3F, 33.0F, 4.75F);
/*      */     
/*  832 */     this.gunModel[102].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.85F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, 3.6F, 0.0F, -0.5F, -2.35F, 0.0F, -0.5F, -2.35F, 0.0F, 0.0F, 3.6F, 0.0F, 0.0F);
/*  833 */     this.gunModel[102].setRotationPoint(-29.5F, 12.0F, 3.75F);
/*      */     
/*  835 */     this.gunModel[103].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, -1.6F, 0.0F, -0.5F, -1.6F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  836 */     this.gunModel[103].setRotationPoint(-31.5F, 19.0F, 3.75F);
/*      */     
/*  838 */     this.gunModel[104].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  839 */     this.gunModel[104].setRotationPoint(-33.3F, 26.0F, 3.75F);
/*      */     
/*  841 */     this.gunModel[105].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 1, 0.0F, 2.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 2.4F, 0.0F, 0.0F, 3.2F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F);
/*  842 */     this.gunModel[105].setRotationPoint(-34.3F, 33.0F, 3.75F);
/*      */     
/*  844 */     this.gunModel[106].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.85F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, 3.6F, 0.0F, -0.5F, -2.35F, 0.0F, -0.5F, -2.35F, 0.0F, 0.0F, 3.6F, 0.0F, 0.0F);
/*  845 */     this.gunModel[106].setRotationPoint(-29.5F, 12.0F, 2.75F);
/*      */     
/*  847 */     this.gunModel[107].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, -1.6F, 0.0F, -0.5F, -1.6F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  848 */     this.gunModel[107].setRotationPoint(-31.5F, 19.0F, 2.75F);
/*      */     
/*  850 */     this.gunModel[108].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  851 */     this.gunModel[108].setRotationPoint(-33.3F, 26.0F, 2.75F);
/*      */     
/*  853 */     this.gunModel[109].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 1, 0.0F, 2.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 2.4F, 0.0F, 0.0F, 3.2F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F);
/*  854 */     this.gunModel[109].setRotationPoint(-34.3F, 33.0F, 2.75F);
/*      */     
/*  856 */     this.gunModel[110].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.85F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, 3.6F, 0.0F, -0.5F, -2.35F, 0.0F, -0.5F, -2.35F, 0.0F, 0.0F, 3.6F, 0.0F, 0.0F);
/*  857 */     this.gunModel[110].setRotationPoint(-29.5F, 12.0F, 1.75F);
/*      */     
/*  859 */     this.gunModel[111].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, -1.6F, 0.0F, -0.5F, -1.6F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  860 */     this.gunModel[111].setRotationPoint(-31.5F, 19.0F, 1.75F);
/*      */     
/*  862 */     this.gunModel[112].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  863 */     this.gunModel[112].setRotationPoint(-33.3F, 26.0F, 1.75F);
/*      */     
/*  865 */     this.gunModel[113].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 1, 0.0F, 2.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 2.4F, 0.0F, 0.0F, 3.2F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F);
/*  866 */     this.gunModel[113].setRotationPoint(-34.3F, 33.0F, 1.75F);
/*      */     
/*  868 */     this.gunModel[114].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.85F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, 3.6F, 0.0F, -0.5F, -2.35F, 0.0F, -0.5F, -2.35F, 0.0F, 0.0F, 3.6F, 0.0F, 0.0F);
/*  869 */     this.gunModel[114].setRotationPoint(-29.5F, 12.0F, 0.75F);
/*      */     
/*  871 */     this.gunModel[115].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, -1.6F, 0.0F, -0.5F, -1.6F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  872 */     this.gunModel[115].setRotationPoint(-31.5F, 19.0F, 0.75F);
/*      */     
/*  874 */     this.gunModel[116].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  875 */     this.gunModel[116].setRotationPoint(-33.3F, 26.0F, 0.75F);
/*      */     
/*  877 */     this.gunModel[117].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 1, 0.0F, 2.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 2.4F, 0.0F, 0.0F, 3.2F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F);
/*  878 */     this.gunModel[117].setRotationPoint(-34.3F, 33.0F, 0.75F);
/*      */     
/*  880 */     this.gunModel[118].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.85F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, 3.6F, 0.0F, -0.5F, -2.35F, 0.0F, -0.5F, -2.35F, 0.0F, 0.0F, 3.6F, 0.0F, 0.0F);
/*  881 */     this.gunModel[118].setRotationPoint(-29.5F, 12.0F, 7.75F);
/*      */     
/*  883 */     this.gunModel[119].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, -1.6F, 0.0F, -0.5F, -1.6F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  884 */     this.gunModel[119].setRotationPoint(-31.5F, 19.0F, 7.75F);
/*      */     
/*  886 */     this.gunModel[120].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  887 */     this.gunModel[120].setRotationPoint(-33.3F, 26.0F, 7.75F);
/*      */     
/*  889 */     this.gunModel[121].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 1, 0.0F, 2.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 2.4F, 0.0F, 0.0F, 3.2F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F);
/*  890 */     this.gunModel[121].setRotationPoint(-34.3F, 33.0F, 7.75F);
/*      */     
/*  892 */     this.gunModel[122].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.85F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, 3.6F, 0.0F, -0.5F, -2.35F, 0.0F, -0.5F, -2.35F, 0.0F, 0.0F, 3.6F, 0.0F, 0.0F);
/*  893 */     this.gunModel[122].setRotationPoint(-29.5F, 12.0F, -0.25F);
/*      */     
/*  895 */     this.gunModel[123].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, -1.6F, 0.0F, -0.5F, -1.6F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  896 */     this.gunModel[123].setRotationPoint(-31.5F, 19.0F, -0.25F);
/*      */     
/*  898 */     this.gunModel[124].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 1, 0.0F, 1.6F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, 0.0F, 1.6F, 0.0F, 0.0F, 3.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 3.4F, 0.0F, 0.0F);
/*  899 */     this.gunModel[124].setRotationPoint(-33.3F, 26.0F, -0.25F);
/*      */     
/*  901 */     this.gunModel[125].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 1, 0.0F, 2.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, 0.0F, 2.4F, 0.0F, 0.0F, 3.2F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 3.2F, 0.0F, 0.0F);
/*  902 */     this.gunModel[125].setRotationPoint(-34.3F, 33.0F, -0.25F);
/*      */     
/*  904 */     this.gunModel[126].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 10, 0.0F, 1.85F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 1.85F, 0.0F, -0.5F, 3.6F, 0.0F, -0.5F, -2.35F, 0.0F, -0.5F, -2.35F, 0.0F, -0.5F, 3.6F, 0.0F, -0.5F);
/*  905 */     this.gunModel[126].setRotationPoint(-29.95F, 12.0F, -0.5F);
/*      */     
/*  907 */     this.gunModel[127].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 10, 0.0F, 1.6F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, 1.6F, 0.0F, -0.5F, 3.4F, 0.0F, -0.5F, -1.6F, 0.0F, -0.5F, -1.6F, 0.0F, -0.5F, 3.4F, 0.0F, -0.5F);
/*  908 */     this.gunModel[127].setRotationPoint(-31.95F, 19.0F, -0.5F);
/*      */     
/*  910 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 10, 0.0F, 1.6F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 1.6F, 0.0F, -0.5F, 3.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 3.4F, 0.0F, -0.5F);
/*  911 */     this.gunModel[''].setRotationPoint(-33.75F, 26.0F, -0.5F);
/*      */     
/*  913 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 10, 0.0F, 2.4F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 2.4F, 0.0F, -0.5F, 3.2F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 3.2F, 0.0F, -0.5F);
/*  914 */     this.gunModel[''].setRotationPoint(-34.75F, 33.0F, -0.5F);
/*      */     
/*  916 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 5, 1, 15, 0.0F, 1.0F, 0.0F, 0.0F, 4.0F, 0.0F, -3.0F, 4.0F, 0.0F, -3.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  917 */     this.gunModel[''].setRotationPoint(-29.5F, 4.0F, -3.0F);
/*      */     
/*  919 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 10, 1, 15, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/*  920 */     this.gunModel[''].setRotationPoint(-30.5F, 3.0F, -3.0F);
/*      */     
/*  922 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 10, 2, 15, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 1.0F, 0.0F, 0.0F);
/*  923 */     this.gunModel[''].setRotationPoint(-30.5F, 1.0F, -3.0F);
/*      */     
/*  925 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 10, 2, 15, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 1.0F, 0.0F, 0.0F);
/*  926 */     this.gunModel[''].setRotationPoint(-30.5F, -1.0F, -3.0F);
/*      */     
/*  928 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 10, 2, 15, 0.0F, -2.5F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, -2.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, 0.0F);
/*  929 */     this.gunModel[''].setRotationPoint(-30.5F, -3.0F, -3.0F);
/*      */     
/*  931 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 15, 0.0F, 0.5F, -0.5F, 0.0F, 0.85F, -0.5F, 0.0F, 0.85F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 1.0F);
/*  932 */     this.gunModel[''].setRotationPoint(-27.0F, -3.5F, -3.0F);
/*      */     
/*  934 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 15, 0.0F, -0.85F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -0.85F, 0.0F, 0.0F, -1.0F, -0.5F, -2.0F, 1.0F, -0.5F, -3.0F, 1.0F, -0.5F, -3.0F, -1.0F, -0.5F, -2.0F);
/*  935 */     this.gunModel[''].setRotationPoint(-24.0F, -3.0F, -3.0F);
/*      */     
/*  937 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  938 */     this.gunModel[''].setRotationPoint(-29.0F, 0.5F, -3.0F);
/*      */     
/*  940 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 6, 2, 15, 0.0F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/*  941 */     this.gunModel[''].setRotationPoint(-29.0F, -1.5F, -3.0F);
/*      */     
/*  943 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 6, 2, 15, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.5F);
/*  944 */     this.gunModel[''].setRotationPoint(-29.0F, 2.5F, -3.0F);
/*      */     
/*  946 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 5, 1, 15, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 1.0F);
/*  947 */     this.gunModel[''].setRotationPoint(-28.0F, -2.5F, -3.0F);
/*      */     
/*  949 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 17, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
/*  950 */     this.gunModel[''].setRotationPoint(-29.0F, -2.5F, -4.0F);
/*      */     
/*  952 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 17, 0.0F, -1.0F, -0.5F, -0.5F, 0.5F, -0.5F, -1.0F, 0.5F, -0.5F, -1.0F, -1.0F, -0.5F, -0.5F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -1.0F);
/*  953 */     this.gunModel[''].setRotationPoint(-29.0F, -3.5F, -4.0F);
/*      */     
/*  955 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  956 */     this.gunModel[''].setRotationPoint(-21.0F, -2.5F, 1.0F);
/*      */     
/*  958 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 9, 3, 13, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F);
/*  959 */     this.gunModel[''].setRotationPoint(-41.5F, -27.0F, -2.0F);
/*      */     
/*  961 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 1.25F, -0.75F, -3.0F, 1.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  962 */     this.gunModel[''].setRotationPoint(-32.3F, 36.0F, -3.0F);
/*      */     
/*  964 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.25F, -0.75F, 0.0F, 1.25F, -0.75F, -3.0F, 0.0F, 0.0F, -2.0F);
/*  965 */     this.gunModel[''].setRotationPoint(-32.3F, 36.0F, 9.0F);
/*      */     
/*  967 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  968 */     this.gunModel[''].setRotationPoint(-32.3F, 36.0F, -0.75F);
/*      */     
/*  970 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  971 */     this.gunModel[''].setRotationPoint(-32.3F, 36.0F, 0.25F);
/*      */     
/*  973 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  974 */     this.gunModel[''].setRotationPoint(-32.3F, 36.0F, 1.25F);
/*      */     
/*  976 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  977 */     this.gunModel[''].setRotationPoint(-32.3F, 36.0F, 2.25F);
/*      */     
/*  979 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  980 */     this.gunModel[''].setRotationPoint(-32.3F, 36.0F, 3.25F);
/*      */     
/*  982 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  983 */     this.gunModel[''].setRotationPoint(-32.3F, 36.0F, 4.25F);
/*      */     
/*  985 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  986 */     this.gunModel[''].setRotationPoint(-32.3F, 36.0F, 5.25F);
/*      */     
/*  988 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  989 */     this.gunModel[''].setRotationPoint(-32.3F, 36.0F, 6.25F);
/*      */     
/*  991 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  992 */     this.gunModel[''].setRotationPoint(-32.3F, 36.0F, 7.25F);
/*      */     
/*  994 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  995 */     this.gunModel[''].setRotationPoint(-32.75F, 36.0F, 0.75F);
/*      */     
/*  997 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  998 */     this.gunModel[''].setRotationPoint(-32.75F, 36.0F, 1.75F);
/*      */     
/* 1000 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1001 */     this.gunModel[''].setRotationPoint(-32.75F, 36.0F, 2.75F);
/*      */     
/* 1003 */     this.gunModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1004 */     this.gunModel[''].setRotationPoint(-32.75F, 36.0F, 3.75F);
/*      */     
/* 1006 */     this.gunModel[' '].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1007 */     this.gunModel[' '].setRotationPoint(-32.75F, 36.0F, 4.75F);
/*      */     
/* 1009 */     this.gunModel['¡'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1010 */     this.gunModel['¡'].setRotationPoint(-32.75F, 36.0F, 5.75F);
/*      */     
/* 1012 */     this.gunModel['¢'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1013 */     this.gunModel['¢'].setRotationPoint(-32.75F, 36.0F, 6.75F);
/*      */     
/* 1015 */     this.gunModel['£'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1016 */     this.gunModel['£'].setRotationPoint(-32.75F, 36.0F, 7.75F);
/*      */     
/* 1018 */     this.gunModel['¤'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.25F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 1.25F, -0.75F, -1.25F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1019 */     this.gunModel['¤'].setRotationPoint(-32.75F, 36.0F, -1.25F);
/*      */     
/* 1021 */     this.gunModel['¥'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 1.25F, -0.75F, -1.0F, 1.25F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1022 */     this.gunModel['¥'].setRotationPoint(-32.75F, 36.0F, -0.25F);
/*      */     
/* 1024 */     this.gunModel['¦'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 3, 0.0F, 0.2F, 0.0F, -1.15F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -1.15F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
/* 1025 */     this.gunModel['¦'].setRotationPoint(-34.3F, 36.0F, -3.0F);
/*      */     
/* 1027 */     this.gunModel['§'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F);
/* 1028 */     this.gunModel['§'].setRotationPoint(-39.5F, 36.0F, -5.0F);
/*      */     
/* 1030 */     this.gunModel['¨'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1031 */     this.gunModel['¨'].setRotationPoint(-63.5F, 38.0F, -5.0F);
/*      */     
/* 1033 */     this.gunModel['©'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1034 */     this.gunModel['©'].setRotationPoint(-39.5F, 38.0F, -5.0F);
/*      */     
/* 1036 */     this.gunModel['ª'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1037 */     this.gunModel['ª'].setRotationPoint(-60.5F, 37.0F, -5.0F);
/*      */     
/* 1039 */     this.gunModel['«'].addShapeBox(20.0F, -18.0F, -5.0F, 12, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1040 */     this.gunModel['«'].setRotationPoint(-57.5F, 36.5F, -5.0F);
/*      */     
/* 1042 */     this.gunModel['¬'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 17, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.5F, 2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1043 */     this.gunModel['¬'].setRotationPoint(-45.5F, 37.0F, -5.0F);
/*      */     
/* 1045 */     this.gunModel['­'].addShapeBox(20.0F, -18.0F, -3.0F, 3, 2, 15, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, 2.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1046 */     this.gunModel['­'].setRotationPoint(-42.5F, 38.0F, -5.0F);
/*      */     
/* 1048 */     this.gunModel['®'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 17, 0.0F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.85F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1049 */     this.gunModel['®'].setRotationPoint(-64.5F, 38.0F, -5.0F);
/*      */     
/* 1051 */     this.gunModel['¯'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 17, 0.0F, -0.25F, 0.0F, -2.0F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, 0.85F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F);
/* 1052 */     this.gunModel['¯'].setRotationPoint(-65.5F, 38.0F, -5.0F);
/*      */     
/* 1054 */     this.gunModel['°'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 15, 19, 0.0F, 0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/* 1055 */     this.gunModel['°'].setRotationPoint(-28.0F, -18.0F, -5.0F);
/*      */     
/* 1057 */     this.gunModel['±'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 31, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.9F, -0.5F, 0.0F, -7.9F, -0.5F, 0.0F, -7.9F, -0.5F, 0.0F, 7.9F, -0.5F, 0.0F);
/* 1058 */     this.gunModel['±'].setRotationPoint(-34.0F, 5.0F, -5.0F);
/*      */     
/* 1060 */     this.gunModel['²'].addShapeBox(20.0F, -18.0F, -5.0F, 17, 2, 19, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1061 */     this.gunModel['²'].setRotationPoint(-49.0F, -1.0F, -5.0F);
/*      */     
/* 1063 */     this.gunModel['³'].addShapeBox(20.0F, -18.0F, -5.0F, 17, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 1064 */     this.gunModel['³'].setRotationPoint(-51.0F, 1.0F, -5.0F);
/*      */     
/* 1066 */     this.gunModel['´'].addShapeBox(20.0F, -18.0F, -5.0F, 18, 2, 19, 0.0F, 1.75F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F);
/* 1067 */     this.gunModel['´'].setRotationPoint(-50.0F, 3.0F, -5.0F);
/*      */     
/* 1069 */     this.gunModel['µ'].addShapeBox(20.0F, -18.0F, -5.0F, 17, 2, 19, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F);
/* 1070 */     this.gunModel['µ'].setRotationPoint(-47.0F, -3.0F, -5.0F);
/*      */     
/* 1072 */     this.gunModel['¶'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 15, 17, 0.0F, 0.6F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, 0.6F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/* 1073 */     this.gunModel['¶'].setRotationPoint(-26.0F, -18.0F, -4.0F);
/*      */     
/* 1075 */     this.gunModel['·'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 31, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 7.9F, -0.5F, 0.0F, -7.9F, -0.5F, 0.0F, -7.9F, -0.5F, 0.0F, 7.9F, -0.5F, 0.0F);
/* 1076 */     this.gunModel['·'].setRotationPoint(-32.0F, 5.0F, -4.0F);
/*      */     
/* 1078 */     this.gunModel['¸'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1079 */     this.gunModel['¸'].setRotationPoint(-32.0F, -1.0F, -4.0F);
/*      */     
/* 1081 */     this.gunModel['¹'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1082 */     this.gunModel['¹'].setRotationPoint(-34.0F, 1.0F, -4.0F);
/*      */     
/* 1084 */     this.gunModel['º'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 17, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1085 */     this.gunModel['º'].setRotationPoint(-32.0F, 3.0F, -4.0F);
/*      */     
/* 1087 */     this.gunModel['»'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1088 */     this.gunModel['»'].setRotationPoint(-30.0F, -3.0F, -4.0F);
/*      */     
/* 1090 */     this.gunModel['¼'].addShapeBox(20.0F, -18.0F, -5.0F, 5, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.05F, 0.0F, 0.0F, -1.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1091 */     this.gunModel['¼'].setRotationPoint(-33.0F, -18.0F, -5.0F);
/*      */     
/* 1093 */     this.gunModel['½'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1094 */     this.gunModel['½'].setRotationPoint(-40.0F, -18.0F, -5.0F);
/*      */     
/* 1096 */     this.gunModel['¾'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1097 */     this.gunModel['¾'].setRotationPoint(-38.0F, -16.0F, -5.0F);
/*      */     
/* 1099 */     this.gunModel['¿'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 19, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/* 1100 */     this.gunModel['¿'].setRotationPoint(-35.0F, -18.0F, -5.0F);
/*      */     
/* 1102 */     this.gunModel['À'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1103 */     this.gunModel['À'].setRotationPoint(-43.0F, -18.0F, -5.0F);
/*      */     
/* 1105 */     this.gunModel['Á'].addShapeBox(20.0F, -18.0F, -5.0F, 7, 2, 19, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F);
/* 1106 */     this.gunModel['Á'].setRotationPoint(-50.0F, -18.0F, -5.0F);
/*      */     
/* 1108 */     this.gunModel['Â'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 19, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1109 */     this.gunModel['Â'].setRotationPoint(-50.0F, -12.0F, -5.0F);
/*      */     
/* 1111 */     this.gunModel['Ã'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 5, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 1112 */     this.gunModel['Ã'].setRotationPoint(-50.0F, -8.0F, -5.0F);
/*      */     
/* 1114 */     this.gunModel['Ä'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 8, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/* 1115 */     this.gunModel['Ä'].setRotationPoint(-51.5F, -3.0F, -5.0F);
/*      */     
/* 1117 */     this.gunModel['Å'].addShapeBox(20.0F, -18.0F, -5.0F, 21, 8, 19, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -2.55F, 0.0F, 0.0F, -2.55F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/* 1118 */     this.gunModel['Å'].setRotationPoint(-54.5F, 5.0F, -5.0F);
/*      */     
/* 1120 */     this.gunModel['Æ'].addShapeBox(20.0F, -18.0F, -5.0F, 23, 5, 19, 0.0F, 0.0F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1121 */     this.gunModel['Æ'].setRotationPoint(-58.5F, 13.0F, -5.0F);
/*      */     
/* 1123 */     this.gunModel['Ç'].addShapeBox(20.0F, -18.0F, -5.0F, 23, 7, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.65F, 0.0F, 0.0F, -1.65F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1124 */     this.gunModel['Ç'].setRotationPoint(-60.5F, 18.0F, -5.0F);
/*      */     
/* 1126 */     this.gunModel['È'].addShapeBox(20.0F, -18.0F, -5.0F, 23, 4, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1127 */     this.gunModel['È'].setRotationPoint(-62.5F, 25.0F, -5.0F);
/*      */     
/* 1129 */     this.gunModel['É'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 6, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1130 */     this.gunModel['É'].setRotationPoint(-63.0F, 29.0F, -5.0F);
/*      */     
/* 1132 */     this.gunModel['Ê'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1133 */     this.gunModel['Ê'].setRotationPoint(-63.0F, 35.0F, -5.0F);
/*      */     
/* 1135 */     this.gunModel['Ë'].addShapeBox(20.0F, -18.0F, -5.0F, 19, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1136 */     this.gunModel['Ë'].setRotationPoint(-61.0F, 33.5F, -5.0F);
/*      */     
/* 1138 */     this.gunModel['Ì'].addShapeBox(20.0F, -18.0F, -5.0F, 7, 2, 17, 0.0F, -0.5F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1139 */     this.gunModel['Ì'].setRotationPoint(-33.0F, -20.0F, -4.0F);
/*      */     
/* 1141 */     this.gunModel['Í'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 17, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1142 */     this.gunModel['Í'].setRotationPoint(-43.0F, -19.0F, -4.0F);
/*      */     
/* 1144 */     this.gunModel['Î'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 17, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1145 */     this.gunModel['Î'].setRotationPoint(-38.0F, -17.0F, -4.0F);
/*      */     
/* 1147 */     this.gunModel['Ï'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 17, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/* 1148 */     this.gunModel['Ï'].setRotationPoint(-35.0F, -19.0F, -4.0F);
/*      */     
/* 1150 */     this.gunModel['Ð'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 17, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1151 */     this.gunModel['Ð'].setRotationPoint(-40.0F, -19.0F, -4.0F);
/*      */     
/* 1153 */     this.gunModel['Ñ'].addShapeBox(20.0F, -18.0F, -5.0F, 7, 1, 17, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -6.5F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F);
/* 1154 */     this.gunModel['Ñ'].setRotationPoint(-50.0F, -19.0F, -4.0F);
/*      */     
/* 1156 */     this.gunModel['Ò'].addShapeBox(20.0F, -18.0F, -5.0F, 20, 5, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1157 */     this.gunModel['Ò'].setRotationPoint(-61.0F, 29.0F, -5.0F);
/*      */     
/* 1159 */     this.gunModel['Ó'].addShapeBox(20.0F, -18.0F, -3.0F, 3, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1160 */     this.gunModel['Ó'].setRotationPoint(-63.5F, 36.0F, -7.0F);
/*      */     
/* 1162 */     this.gunModel['Ô'].addShapeBox(20.0F, -18.0F, -3.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1163 */     this.gunModel['Ô'].setRotationPoint(-60.5F, 36.0F, -7.0F);
/*      */     
/* 1165 */     this.gunModel['Õ'].addShapeBox(20.0F, -18.0F, -3.0F, 12, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1166 */     this.gunModel['Õ'].setRotationPoint(-57.5F, 36.0F, -7.0F);
/*      */     
/* 1168 */     this.gunModel['Ö'].addShapeBox(20.0F, -18.0F, -3.0F, 3, 1, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1169 */     this.gunModel['Ö'].setRotationPoint(-45.5F, 36.0F, -7.0F);
/*      */     
/* 1171 */     this.gunModel['×'].addShapeBox(20.0F, -18.0F, -3.0F, 3, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1172 */     this.gunModel['×'].setRotationPoint(-42.5F, 36.0F, -7.0F);
/*      */     
/* 1174 */     this.gunModel['Ø'].addShapeBox(20.0F, -18.0F, -5.0F, 25, 1, 17, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1175 */     this.gunModel['Ø'].setRotationPoint(-64.0F, 35.5F, -4.0F);
/*      */     
/* 1177 */     this.gunModel['Ù'].addShapeBox(20.0F, -18.0F, -5.0F, 18, 5, 19, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 1178 */     this.gunModel['Ù'].setRotationPoint(-48.0F, -8.0F, -5.0F);
/*      */     
/* 1180 */     this.gunModel['Ú'].addShapeBox(20.0F, -18.0F, -5.0F, 18, 6, 19, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1181 */     this.gunModel['Ú'].setRotationPoint(-48.0F, -14.0F, -5.0F);
/*      */     
/* 1183 */     this.gunModel['Û'].addShapeBox(20.0F, -18.0F, -5.0F, 18, 2, 19, 0.0F, -2.65F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.65F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1184 */     this.gunModel['Û'].setRotationPoint(-48.0F, -14.0F, -5.0F);
/*      */     
/* 1186 */     this.gunModel['Ü'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.35F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.35F, 0.0F, 0.0F);
/* 1187 */     this.gunModel['Ü'].setRotationPoint(-43.0F, -16.0F, -5.0F);
/*      */     
/* 1189 */     this.gunModel['Ý'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.95F, 0.0F, 0.0F, 0.95F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1190 */     this.gunModel['Ý'].setRotationPoint(-33.0F, -16.0F, -5.0F);
/*      */     
/* 1192 */     this.gunModel['Þ'].addShapeBox(20.0F, -18.0F, -5.0F, 6, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1193 */     this.gunModel['Þ'].setRotationPoint(-52.0F, 27.5F, -5.5F);
/*      */     
/* 1195 */     this.gunModel['ß'].addShapeBox(20.0F, -18.0F, -5.0F, 6, 2, 20, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1196 */     this.gunModel['ß'].setRotationPoint(-52.0F, 25.5F, -5.5F);
/*      */     
/* 1198 */     this.gunModel['à'].addShapeBox(20.0F, -18.0F, -5.0F, 6, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1199 */     this.gunModel['à'].setRotationPoint(-52.0F, 29.5F, -5.5F);
/*      */     
/* 1201 */     this.gunModel['á'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/* 1202 */     this.gunModel['á'].setRotationPoint(-50.5F, -8.0F, -4.0F);
/*      */     
/* 1204 */     this.gunModel['â'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F);
/* 1205 */     this.gunModel['â'].setRotationPoint(-52.0F, -3.0F, -4.0F);
/*      */     
/* 1207 */     this.gunModel['ã'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 8, 17, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -2.55F, 0.0F, 0.0F, -2.55F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F);
/* 1208 */     this.gunModel['ã'].setRotationPoint(-55.0F, 5.0F, -4.0F);
/*      */     
/* 1210 */     this.gunModel['ä'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 5, 17, 0.0F, 0.0F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, -0.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1211 */     this.gunModel['ä'].setRotationPoint(-59.0F, 13.0F, -4.0F);
/*      */     
/* 1213 */     this.gunModel['å'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.65F, 0.0F, 0.0F, -1.65F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1214 */     this.gunModel['å'].setRotationPoint(-61.0F, 18.0F, -4.0F);
/*      */     
/* 1216 */     this.gunModel['æ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 4, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1217 */     this.gunModel['æ'].setRotationPoint(-63.0F, 25.0F, -4.0F);
/*      */     
/* 1219 */     this.gunModel['ç'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 6, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1220 */     this.gunModel['ç'].setRotationPoint(-63.5F, 29.0F, -4.0F);
/*      */     
/* 1222 */     this.gunModel['è'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 17, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1223 */     this.gunModel['è'].setRotationPoint(-64.0F, 34.5F, -4.0F);
/*      */     
/* 1225 */     this.gunModel['é'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 17, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1226 */     this.gunModel['é'].setRotationPoint(-51.0F, -13.0F, -4.0F);
/*      */     
/* 1228 */     this.gunModel['ê'].addShapeBox(20.0F, -18.0F, -3.0F, 24, 2, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1229 */     this.gunModel['ê'].setRotationPoint(-63.5F, 38.0F, -4.0F);
/*      */     
/* 1231 */     this.gunModel['ë'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 19, 0.0F, -4.0F, 0.0F, -2.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1232 */     this.gunModel['ë'].setRotationPoint(-60.5F, 5.0F, -5.0F);
/*      */     
/* 1234 */     this.gunModel['ì'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 19, 0.0F, -2.5F, 0.0F, -2.0F, 3.5F, 0.0F, 0.0F, 3.5F, 0.0F, 0.0F, -2.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1235 */     this.gunModel['ì'].setRotationPoint(-56.5F, -3.0F, -5.0F);
/*      */     
/* 1237 */     this.gunModel['í'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 19, 0.0F, -0.75F, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.75F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F);
/* 1238 */     this.gunModel['í'].setRotationPoint(-53.5F, -8.0F, -5.0F);
/*      */     
/* 1240 */     this.gunModel['î'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 5, 19, 0.0F, 0.25F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, -2.0F, 0.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F);
/* 1241 */     this.gunModel['î'].setRotationPoint(-52.5F, -13.0F, -5.0F);
/*      */     
/* 1243 */     this.gunModel['ï'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 19, 0.0F, -4.0F, 0.0F, -2.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -4.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F);
/* 1244 */     this.gunModel['ï'].setRotationPoint(-64.5F, 13.0F, -5.0F);
/*      */     
/* 1246 */     this.gunModel['ð'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 19, 0.0F, -4.0F, 0.0F, -2.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -4.0F, 0.0F, -2.0F, -1.75F, 0.0F, -2.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -1.75F, 0.0F, -2.0F);
/* 1247 */     this.gunModel['ð'].setRotationPoint(-66.5F, 18.0F, -5.0F);
/*      */     
/* 1249 */     this.gunModel['ñ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 4, 19, 0.0F, -3.75F, 0.0F, -2.0F, 4.5F, 0.0F, 0.0F, 4.5F, 0.0F, 0.0F, -3.75F, 0.0F, -2.0F, -3.25F, 0.0F, -2.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.25F, 0.0F, -2.0F);
/* 1250 */     this.gunModel['ñ'].setRotationPoint(-68.5F, 25.0F, -5.0F);
/*      */     
/* 1252 */     this.gunModel['ò'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 9, 19, 0.0F, -0.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F, -0.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -2.0F);
/* 1253 */     this.gunModel['ò'].setRotationPoint(-65.5F, 29.0F, -5.0F);
/*      */     
/* 1255 */     this.gunModel['ó'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 4, 0.0F, -2.75F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.75F, 0.0F, -3.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F);
/* 1256 */     this.gunModel['ó'].setRotationPoint(-58.5F, -3.0F, 8.0F);
/*      */     
/* 1258 */     this.gunModel['ô'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 4, 0.0F, -3.75F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.75F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 1259 */     this.gunModel['ô'].setRotationPoint(-62.5F, 5.0F, 8.0F);
/*      */     
/* 1261 */     this.gunModel['õ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 4, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -3.0F, -1.75F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.75F, 0.0F, -3.0F);
/* 1262 */     this.gunModel['õ'].setRotationPoint(-66.5F, 13.0F, 8.0F);
/*      */     
/* 1264 */     this.gunModel['ö'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 4, 0.0F, -3.75F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.75F, 0.0F, -3.0F, -1.25F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.25F, 0.0F, -3.0F);
/* 1265 */     this.gunModel['ö'].setRotationPoint(-68.5F, 18.0F, 8.0F);
/*      */     
/* 1267 */     this.gunModel['÷'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 4, 4, 0.0F, -3.25F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, -3.25F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.0F, 0.0F, -3.0F);
/* 1268 */     this.gunModel['÷'].setRotationPoint(-70.5F, 25.0F, 8.0F);
/*      */     
/* 1270 */     this.gunModel['ø'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 7, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 1271 */     this.gunModel['ø'].setRotationPoint(-67.5F, 29.0F, 8.0F);
/*      */     
/* 1273 */     this.gunModel['ù'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -3.0F);
/* 1274 */     this.gunModel['ù'].setRotationPoint(-67.5F, 36.0F, 8.0F);
/*      */     
/* 1276 */     this.gunModel['ú'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 4, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F, -1.25F, 0.5F, 0.0F, 0.8F, 0.5F, 0.0F, 0.8F, 0.5F, 0.0F, -1.25F, 0.5F, -3.0F);
/* 1277 */     this.gunModel['ú'].setRotationPoint(-66.5F, 38.0F, 8.0F);
/*      */     
/* 1279 */     this.gunModel['û'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F);
/* 1280 */     this.gunModel['û'].setRotationPoint(-55.5F, -8.0F, 8.0F);
/*      */     
/* 1282 */     this.gunModel['ü'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 5, 15, 0.0F, 0.0F, -0.5F, -3.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -3.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 1283 */     this.gunModel['ü'].setRotationPoint(-55.0F, -13.0F, -3.0F);
/*      */     
/* 1285 */     this.gunModel['ý'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 3, 0.0F, -1.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F);
/* 1286 */     this.gunModel['ý'].setRotationPoint(-36.0F, 26.0F, -3.0F);
/*      */     
/* 1288 */     this.gunModel['þ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 3, 3, 0.0F, -0.3F, 0.0F, 0.0F, 1.3F, 0.0F, 0.0F, 1.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.15F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1289 */     this.gunModel['þ'].setRotationPoint(-37.0F, 33.0F, -3.0F);
/*      */     
/* 1291 */     this.gunModel['ÿ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 3, 0.0F, 1.6F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -3.0F, 1.6F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -3.0F, 1.4F, 0.0F, 0.0F);
/* 1292 */     this.gunModel['ÿ'].setRotationPoint(-33.3F, 26.0F, 9.0F);
/*      */     
/* 1294 */     this.gunModel['Ā'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 3, 0.0F, 0.4F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -3.0F, 0.4F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 0.2F, 0.0F, -1.15F);
/* 1295 */     this.gunModel['Ā'].setRotationPoint(-34.3F, 33.0F, 9.0F);
/*      */     
/* 1297 */     this.gunModel['ā'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 3, 0.0F, -1.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F);
/* 1298 */     this.gunModel['ā'].setRotationPoint(-36.0F, 26.0F, 9.0F);
/*      */     
/* 1300 */     this.gunModel['Ă'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 3, 3, 0.0F, -0.3F, 0.0F, 0.0F, 1.3F, 0.0F, 0.0F, 1.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, -1.15F, 0.5F, 0.0F, 0.0F);
/* 1301 */     this.gunModel['Ă'].setRotationPoint(-37.0F, 33.0F, 9.0F);
/*      */     
/* 1303 */     this.gunModel['ă'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 15, 0.0F, -2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1304 */     this.gunModel['ă'].setRotationPoint(-57.5F, -3.0F, -3.0F);
/*      */     
/* 1306 */     this.gunModel['Ą'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 15, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1307 */     this.gunModel['Ą'].setRotationPoint(-61.5F, 5.0F, -3.0F);
/*      */     
/* 1309 */     this.gunModel['ą'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 15, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1310 */     this.gunModel['ą'].setRotationPoint(-65.5F, 13.0F, -3.0F);
/*      */     
/* 1312 */     this.gunModel['Ć'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 15, 0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 1313 */     this.gunModel['Ć'].setRotationPoint(-67.5F, 18.0F, -3.0F);
/*      */     
/* 1315 */     this.gunModel['ć'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 4, 15, 0.0F, -3.75F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F);
/* 1316 */     this.gunModel['ć'].setRotationPoint(-69.5F, 25.0F, -3.0F);
/*      */     
/* 1318 */     this.gunModel['Ĉ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 7, 15, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1319 */     this.gunModel['Ĉ'].setRotationPoint(-66.5F, 29.0F, -3.0F);
/*      */     
/* 1321 */     this.gunModel['ĉ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 15, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1322 */     this.gunModel['ĉ'].setRotationPoint(-66.5F, 36.0F, -3.0F);
/*      */     
/* 1324 */     this.gunModel['Ċ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 15, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1325 */     this.gunModel['Ċ'].setRotationPoint(-54.5F, -8.0F, -3.0F);
/*      */     
/* 1327 */     this.gunModel['ċ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 5, 15, 0.0F, -0.25F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1328 */     this.gunModel['ċ'].setRotationPoint(-54.0F, -13.0F, -3.0F);
/*      */     
/* 1330 */     this.gunModel['Č'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 15, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -2.0F, 0.0F);
/* 1331 */     this.gunModel['Č'].setRotationPoint(-66.5F, 38.0F, -3.0F);
/*      */     
/* 1333 */     this.gunModel['č'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 3, 0.0F, 0.2F, 0.0F, 0.0F, 0.8F, 0.0F, -1.15F, 0.8F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.8F, 0.0F, -1.15F, 0.8F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
/* 1334 */     this.gunModel['č'].setRotationPoint(-37.3F, 36.0F, -3.0F);
/*      */     
/* 1336 */     this.gunModel['Ď'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 3, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.2F, 0.0F, -1.15F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.2F, 0.0F, -1.15F);
/* 1337 */     this.gunModel['Ď'].setRotationPoint(-34.3F, 36.0F, 9.0F);
/*      */     
/* 1339 */     this.gunModel['ď'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 3, 0.0F, 0.2F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, -1.15F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, -1.15F, 0.2F, 0.0F, 0.0F);
/* 1340 */     this.gunModel['ď'].setRotationPoint(-37.3F, 36.0F, 9.0F);
/*      */     
/* 1342 */     this.gunModel['Đ'].addShapeBox(20.0F, -18.0F, -5.0F, 5, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1343 */     this.gunModel['Đ'].setRotationPoint(-37.5F, 36.0F, 0.0F);
/*      */     
/* 1345 */     this.gunModel['đ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 3, 15, 0.0F, 2.5F, 0.0F, -3.0F, -3.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 2.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 1346 */     this.gunModel['đ'].setRotationPoint(-55.0F, -15.5F, -3.0F);
/*      */     
/* 1348 */     this.gunModel['Ē'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 15, 0.0F, 3.0F, 0.0F, -3.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 3.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 1349 */     this.gunModel['Ē'].setRotationPoint(-57.5F, -17.5F, -3.0F);
/*      */     
/* 1351 */     this.gunModel['ē'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 15, 0.0F, 3.0F, 0.0F, -3.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 3.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
/* 1352 */     this.gunModel['ē'].setRotationPoint(-60.5F, -18.5F, -3.0F);
/*      */     
/* 1354 */     this.gunModel['Ĕ'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1355 */     this.gunModel['Ĕ'].setRotationPoint(-67.5F, -21.5F, 7.0F);
/*      */     
/* 1357 */     this.gunModel['ĕ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 15, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -1.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, -4.0F);
/* 1358 */     this.gunModel['ĕ'].setRotationPoint(-68.0F, -19.5F, -3.0F);
/*      */     
/* 1360 */     this.gunModel['Ė'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 15, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
/* 1361 */     this.gunModel['Ė'].setRotationPoint(-64.0F, -19.5F, -3.0F);
/*      */     
/* 1363 */     this.gunModel['ė'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 15, 0.0F, 2.25F, -1.0F, 0.0F, -3.25F, -1.0F, 0.0F, -3.25F, -1.0F, 0.0F, 2.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1364 */     this.gunModel['ė'].setRotationPoint(-54.0F, -16.5F, -3.0F);
/*      */     
/* 1366 */     this.gunModel['Ę'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 3, 15, 0.0F, 2.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, -3.5F, -1.0F, 0.0F, 2.5F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1367 */     this.gunModel['Ę'].setRotationPoint(-56.5F, -18.5F, -3.0F);
/*      */     
/* 1369 */     this.gunModel['ę'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 15, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F);
/* 1370 */     this.gunModel['ę'].setRotationPoint(-67.5F, -19.5F, -3.0F);
/*      */     
/* 1372 */     this.gunModel['Ě'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1373 */     this.gunModel['Ě'].setRotationPoint(-67.5F, -20.5F, -3.0F);
/*      */     
/* 1375 */     this.gunModel['ě'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 15, 0.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F);
/* 1376 */     this.gunModel['ě'].setRotationPoint(-68.5F, -20.5F, -3.0F);
/*      */     
/* 1378 */     this.gunModel['Ĝ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 5, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F, -0.5F, -1.0F, -4.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F);
/* 1379 */     this.gunModel['Ĝ'].setRotationPoint(-68.5F, -21.5F, 7.0F);
/*      */     
/* 1381 */     this.gunModel['ĝ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1382 */     this.gunModel['ĝ'].setRotationPoint(-64.0F, -22.5F, 7.0F);
/*      */     
/* 1384 */     this.gunModel['Ğ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 5, 0.0F, -0.5F, 0.0F, -4.0F, -0.75F, 2.5F, -4.0F, -0.75F, 2.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -2.5F, -2.5F, -1.0F, -2.5F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1385 */     this.gunModel['Ğ'].setRotationPoint(-61.5F, -24.5F, -3.0F);
/*      */     
/* 1387 */     this.gunModel['ğ'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 5, 0.0F, -0.5F, 0.0F, -4.0F, 0.0F, 1.0F, -4.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1388 */     this.gunModel['ğ'].setRotationPoint(-67.5F, -21.5F, -3.0F);
/*      */     
/* 1390 */     this.gunModel['Ġ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 5, 0.0F, -0.5F, -1.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1391 */     this.gunModel['Ġ'].setRotationPoint(-68.5F, -21.5F, -3.0F);
/*      */     
/* 1393 */     this.gunModel['ġ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 5, 0.0F, -0.5F, 0.0F, -4.0F, 0.0F, 2.0F, -4.0F, 0.0F, 2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1394 */     this.gunModel['ġ'].setRotationPoint(-64.0F, -22.5F, -3.0F);
/*      */     
/* 1396 */     this.gunModel['Ģ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 3, 10, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1397 */     this.gunModel['Ģ'].setRotationPoint(-64.0F, -22.5F, -3.0F);
/*      */     
/* 1399 */     this.gunModel['ģ'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1400 */     this.gunModel['ģ'].setRotationPoint(-67.5F, -20.5F, 7.0F);
/*      */     
/* 1402 */     this.gunModel['Ĥ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 3, 5, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1403 */     this.gunModel['Ĥ'].setRotationPoint(-64.0F, -22.5F, 7.0F);
/*      */     
/* 1405 */     this.gunModel['ĥ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 15, 0.0F, 2.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1406 */     this.gunModel['ĥ'].setRotationPoint(-59.0F, -19.5F, -3.0F);
/*      */     
/* 1408 */     this.gunModel['Ħ'].addShapeBox(20.0F, -18.0F, -5.0F, 16, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1409 */     this.gunModel['Ħ'].setRotationPoint(-41.5F, -22.0F, -5.0F);
/*      */     
/* 1411 */     this.gunModel['ħ'].addShapeBox(20.0F, -18.0F, -5.0F, 7, 2, 19, 0.0F, 0.5F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1412 */     this.gunModel['ħ'].setRotationPoint(-32.5F, -20.0F, -5.0F);
/*      */     
/* 1414 */     this.gunModel['Ĩ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 19, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1415 */     this.gunModel['Ĩ'].setRotationPoint(-38.0F, -18.0F, -5.0F);
/*      */     
/* 1417 */     this.gunModel['ĩ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 4, 0.0F, -2.75F, 0.0F, -3.0F, 2.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1418 */     this.gunModel['ĩ'].setRotationPoint(-58.5F, -3.0F, -3.0F);
/*      */     
/* 1420 */     this.gunModel['Ī'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 4, 0.0F, -3.75F, 0.0F, -3.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1421 */     this.gunModel['Ī'].setRotationPoint(-62.5F, 5.0F, -3.0F);
/*      */     
/* 1423 */     this.gunModel['ī'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 4, 0.0F, -4.0F, 0.0F, -3.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -1.75F, 0.0F, -3.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F);
/* 1424 */     this.gunModel['ī'].setRotationPoint(-66.5F, 13.0F, -3.0F);
/*      */     
/* 1426 */     this.gunModel['Ĭ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 4, 0.0F, -3.75F, 0.0F, -3.0F, 4.0F, 0.0F, 0.0F, 4.0F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -1.25F, 0.0F, -3.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 1427 */     this.gunModel['Ĭ'].setRotationPoint(-68.5F, 18.0F, -3.0F);
/*      */     
/* 1429 */     this.gunModel['ĭ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 4, 4, 0.0F, -3.25F, 0.0F, -3.0F, 3.75F, 0.0F, 0.0F, 3.75F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, -3.0F, 0.0F, -3.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 1430 */     this.gunModel['ĭ'].setRotationPoint(-70.5F, 25.0F, -3.0F);
/*      */     
/* 1432 */     this.gunModel['Į'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 7, 4, 0.0F, 0.0F, 0.0F, -3.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1433 */     this.gunModel['Į'].setRotationPoint(-67.5F, 29.0F, -3.0F);
/*      */     
/* 1435 */     this.gunModel['į'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, -3.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -3.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1436 */     this.gunModel['į'].setRotationPoint(-67.5F, 36.0F, -3.0F);
/*      */     
/* 1438 */     this.gunModel['İ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 4, 0.0F, 0.25F, 0.0F, -3.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.5F, -3.0F, 0.8F, 0.5F, 0.0F, 0.8F, 0.5F, 0.0F, -1.25F, 0.5F, 0.0F);
/* 1439 */     this.gunModel['İ'].setRotationPoint(-66.5F, 38.0F, -3.0F);
/*      */     
/* 1441 */     this.gunModel['ı'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 4, 0.0F, -0.5F, 0.0F, -3.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1442 */     this.gunModel['ı'].setRotationPoint(-55.5F, -8.0F, -3.0F);
/*      */     
/* 1444 */     this.gunModel['Ĳ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 1, 0.0F, -2.75F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1445 */     this.gunModel['Ĳ'].setRotationPoint(-58.5F, -3.0F, 1.0F);
/*      */     
/* 1447 */     this.gunModel['ĳ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 1, 0.0F, -2.75F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1448 */     this.gunModel['ĳ'].setRotationPoint(-58.5F, -3.0F, 2.0F);
/*      */     
/* 1450 */     this.gunModel['Ĵ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 1, 0.0F, -2.75F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1451 */     this.gunModel['Ĵ'].setRotationPoint(-58.5F, -3.0F, 3.0F);
/*      */     
/* 1453 */     this.gunModel['ĵ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 1, 0.0F, -2.75F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1454 */     this.gunModel['ĵ'].setRotationPoint(-58.5F, -3.0F, 4.0F);
/*      */     
/* 1456 */     this.gunModel['Ķ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 1, 0.0F, -2.75F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1457 */     this.gunModel['Ķ'].setRotationPoint(-58.5F, -3.0F, 5.0F);
/*      */     
/* 1459 */     this.gunModel['ķ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 1, 0.0F, -2.75F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1460 */     this.gunModel['ķ'].setRotationPoint(-58.5F, -3.0F, 6.0F);
/*      */     
/* 1462 */     this.gunModel['ĸ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 1, 0.0F, -2.75F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, 2.5F, 0.0F, -0.25F, -2.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1463 */     this.gunModel['ĸ'].setRotationPoint(-58.5F, -3.0F, 7.0F);
/*      */     
/* 1465 */     this.gunModel['Ĺ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 1, 0.0F, -0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1466 */     this.gunModel['Ĺ'].setRotationPoint(-55.5F, -8.0F, 7.0F);
/*      */     
/* 1468 */     this.gunModel['ĺ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 1, 0.0F, -0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1469 */     this.gunModel['ĺ'].setRotationPoint(-55.5F, -8.0F, 6.0F);
/*      */     
/* 1471 */     this.gunModel['Ļ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 1, 0.0F, -0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1472 */     this.gunModel['Ļ'].setRotationPoint(-55.5F, -8.0F, 5.0F);
/*      */     
/* 1474 */     this.gunModel['ļ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 1, 0.0F, -0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1475 */     this.gunModel['ļ'].setRotationPoint(-55.5F, -8.0F, 4.0F);
/*      */     
/* 1477 */     this.gunModel['Ľ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 1, 0.0F, -0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1478 */     this.gunModel['Ľ'].setRotationPoint(-55.5F, -8.0F, 3.0F);
/*      */     
/* 1480 */     this.gunModel['ľ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 1, 0.0F, -0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1481 */     this.gunModel['ľ'].setRotationPoint(-55.5F, -8.0F, 2.0F);
/*      */     
/* 1483 */     this.gunModel['Ŀ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 1, 0.0F, -0.5F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1484 */     this.gunModel['Ŀ'].setRotationPoint(-55.5F, -8.0F, 1.0F);
/*      */     
/* 1486 */     this.gunModel['ŀ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 1, 0.0F, -3.75F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1487 */     this.gunModel['ŀ'].setRotationPoint(-62.5F, 5.0F, 7.0F);
/*      */     
/* 1489 */     this.gunModel['Ł'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 1, 0.0F, -3.75F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1490 */     this.gunModel['Ł'].setRotationPoint(-62.5F, 5.0F, 6.0F);
/*      */     
/* 1492 */     this.gunModel['ł'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 1, 0.0F, -3.75F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1493 */     this.gunModel['ł'].setRotationPoint(-62.5F, 5.0F, 5.0F);
/*      */     
/* 1495 */     this.gunModel['Ń'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 1, 0.0F, -3.75F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1496 */     this.gunModel['Ń'].setRotationPoint(-62.5F, 5.0F, 4.0F);
/*      */     
/* 1498 */     this.gunModel['ń'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 1, 0.0F, -3.75F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1499 */     this.gunModel['ń'].setRotationPoint(-62.5F, 5.0F, 3.0F);
/*      */     
/* 1501 */     this.gunModel['Ņ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 1, 0.0F, -3.75F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1502 */     this.gunModel['Ņ'].setRotationPoint(-62.5F, 5.0F, 2.0F);
/*      */     
/* 1504 */     this.gunModel['ņ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 8, 1, 0.0F, -3.75F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1505 */     this.gunModel['ņ'].setRotationPoint(-62.5F, 5.0F, 1.0F);
/*      */     
/* 1507 */     this.gunModel['Ň'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 1, 0.0F, -4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F);
/* 1508 */     this.gunModel['Ň'].setRotationPoint(-66.5F, 13.0F, 7.0F);
/*      */     
/* 1510 */     this.gunModel['ň'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 1, 0.0F, -4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F);
/* 1511 */     this.gunModel['ň'].setRotationPoint(-66.5F, 13.0F, 6.0F);
/*      */     
/* 1513 */     this.gunModel['ŉ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 1, 0.0F, -4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F);
/* 1514 */     this.gunModel['ŉ'].setRotationPoint(-66.5F, 13.0F, 5.0F);
/*      */     
/* 1516 */     this.gunModel['Ŋ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 1, 0.0F, -4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F);
/* 1517 */     this.gunModel['Ŋ'].setRotationPoint(-66.5F, 13.0F, 4.0F);
/*      */     
/* 1519 */     this.gunModel['ŋ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 1, 0.0F, -4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F);
/* 1520 */     this.gunModel['ŋ'].setRotationPoint(-66.5F, 13.0F, 3.0F);
/*      */     
/* 1522 */     this.gunModel['Ō'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 1, 0.0F, -4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F);
/* 1523 */     this.gunModel['Ō'].setRotationPoint(-66.5F, 13.0F, 2.0F);
/*      */     
/* 1525 */     this.gunModel['ō'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 1, 0.0F, -4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -4.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F);
/* 1526 */     this.gunModel['ō'].setRotationPoint(-66.5F, 13.0F, 1.0F);
/*      */     
/* 1528 */     this.gunModel['Ŏ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 1, 0.0F, -3.75F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F);
/* 1529 */     this.gunModel['Ŏ'].setRotationPoint(-68.5F, 18.0F, 6.0F);
/*      */     
/* 1531 */     this.gunModel['ŏ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 1, 0.0F, -3.75F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F);
/* 1532 */     this.gunModel['ŏ'].setRotationPoint(-68.5F, 18.0F, 5.0F);
/*      */     
/* 1534 */     this.gunModel['Ő'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 1, 0.0F, -3.75F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F);
/* 1535 */     this.gunModel['Ő'].setRotationPoint(-68.5F, 18.0F, 7.0F);
/*      */     
/* 1537 */     this.gunModel['ő'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 1, 0.0F, -3.75F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F);
/* 1538 */     this.gunModel['ő'].setRotationPoint(-68.5F, 18.0F, 4.0F);
/*      */     
/* 1540 */     this.gunModel['Œ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 1, 0.0F, -3.75F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F);
/* 1541 */     this.gunModel['Œ'].setRotationPoint(-68.5F, 18.0F, 3.0F);
/*      */     
/* 1543 */     this.gunModel['œ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 1, 0.0F, -3.75F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F);
/* 1544 */     this.gunModel['œ'].setRotationPoint(-68.5F, 18.0F, 2.0F);
/*      */     
/* 1546 */     this.gunModel['Ŕ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 1, 0.0F, -3.75F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, 4.0F, 0.0F, -0.25F, -3.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F);
/* 1547 */     this.gunModel['Ŕ'].setRotationPoint(-68.5F, 18.0F, 1.0F);
/*      */     
/* 1549 */     this.gunModel['ŕ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 4, 1, 0.0F, -3.25F, 0.0F, -0.25F, 3.75F, 0.0F, -0.25F, 3.75F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, 3.25F, 0.0F, -0.25F, 3.25F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F);
/* 1550 */     this.gunModel['ŕ'].setRotationPoint(-70.5F, 25.0F, 7.0F);
/*      */     
/* 1552 */     this.gunModel['Ŗ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 4, 1, 0.0F, -3.25F, 0.0F, -0.25F, 3.75F, 0.0F, -0.25F, 3.75F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, 3.25F, 0.0F, -0.25F, 3.25F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F);
/* 1553 */     this.gunModel['Ŗ'].setRotationPoint(-70.5F, 25.0F, 6.0F);
/*      */     
/* 1555 */     this.gunModel['ŗ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 4, 1, 0.0F, -3.25F, 0.0F, -0.25F, 3.75F, 0.0F, -0.25F, 3.75F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, 3.25F, 0.0F, -0.25F, 3.25F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F);
/* 1556 */     this.gunModel['ŗ'].setRotationPoint(-70.5F, 25.0F, 5.0F);
/*      */     
/* 1558 */     this.gunModel['Ř'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 4, 1, 0.0F, -3.25F, 0.0F, -0.25F, 3.75F, 0.0F, -0.25F, 3.75F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, 3.25F, 0.0F, -0.25F, 3.25F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F);
/* 1559 */     this.gunModel['Ř'].setRotationPoint(-70.5F, 25.0F, 4.0F);
/*      */     
/* 1561 */     this.gunModel['ř'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 4, 1, 0.0F, -3.25F, 0.0F, -0.25F, 3.75F, 0.0F, -0.25F, 3.75F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, 3.25F, 0.0F, -0.25F, 3.25F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F);
/* 1562 */     this.gunModel['ř'].setRotationPoint(-70.5F, 25.0F, 3.0F);
/*      */     
/* 1564 */     this.gunModel['Ś'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 4, 1, 0.0F, -3.25F, 0.0F, -0.25F, 3.75F, 0.0F, -0.25F, 3.75F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, 3.25F, 0.0F, -0.25F, 3.25F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F);
/* 1565 */     this.gunModel['Ś'].setRotationPoint(-70.5F, 25.0F, 2.0F);
/*      */     
/* 1567 */     this.gunModel['ś'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 4, 1, 0.0F, -3.25F, 0.0F, -0.25F, 3.75F, 0.0F, -0.25F, 3.75F, 0.0F, -0.25F, -3.25F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, 3.25F, 0.0F, -0.25F, 3.25F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F);
/* 1568 */     this.gunModel['ś'].setRotationPoint(-70.5F, 25.0F, 1.0F);
/*      */     
/* 1570 */     this.gunModel['Ŝ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 7, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1571 */     this.gunModel['Ŝ'].setRotationPoint(-67.5F, 29.0F, 7.0F);
/*      */     
/* 1573 */     this.gunModel['ŝ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 7, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1574 */     this.gunModel['ŝ'].setRotationPoint(-67.5F, 29.0F, 6.0F);
/*      */     
/* 1576 */     this.gunModel['Ş'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 7, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1577 */     this.gunModel['Ş'].setRotationPoint(-67.5F, 29.0F, 5.0F);
/*      */     
/* 1579 */     this.gunModel['ş'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 7, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1580 */     this.gunModel['ş'].setRotationPoint(-67.5F, 29.0F, 4.0F);
/*      */     
/* 1582 */     this.gunModel['Š'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 7, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1583 */     this.gunModel['Š'].setRotationPoint(-67.5F, 29.0F, 3.0F);
/*      */     
/* 1585 */     this.gunModel['š'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 7, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1586 */     this.gunModel['š'].setRotationPoint(-67.5F, 29.0F, 2.0F);
/*      */     
/* 1588 */     this.gunModel['Ţ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 7, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1589 */     this.gunModel['Ţ'].setRotationPoint(-67.5F, 29.0F, 1.0F);
/*      */     
/* 1591 */     this.gunModel['ţ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/* 1592 */     this.gunModel['ţ'].setRotationPoint(-67.5F, 36.0F, 7.0F);
/*      */     
/* 1594 */     this.gunModel['Ť'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, 0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -1.25F, 0.5F, -0.25F, 0.8F, 0.5F, -0.25F, 0.8F, 0.5F, -0.25F, -1.25F, 0.5F, -0.25F);
/* 1595 */     this.gunModel['Ť'].setRotationPoint(-66.5F, 38.0F, 7.0F);
/*      */     
/* 1597 */     this.gunModel['ť'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/* 1598 */     this.gunModel['ť'].setRotationPoint(-67.5F, 36.0F, 6.0F);
/*      */     
/* 1600 */     this.gunModel['Ŧ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, 0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -1.25F, 0.5F, -0.25F, 0.8F, 0.5F, -0.25F, 0.8F, 0.5F, -0.25F, -1.25F, 0.5F, -0.25F);
/* 1601 */     this.gunModel['Ŧ'].setRotationPoint(-66.5F, 38.0F, 6.0F);
/*      */     
/* 1603 */     this.gunModel['ŧ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/* 1604 */     this.gunModel['ŧ'].setRotationPoint(-67.5F, 36.0F, 5.0F);
/*      */     
/* 1606 */     this.gunModel['Ũ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, 0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -1.25F, 0.5F, -0.25F, 0.8F, 0.5F, -0.25F, 0.8F, 0.5F, -0.25F, -1.25F, 0.5F, -0.25F);
/* 1607 */     this.gunModel['Ũ'].setRotationPoint(-66.5F, 38.0F, 5.0F);
/*      */     
/* 1609 */     this.gunModel['ũ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/* 1610 */     this.gunModel['ũ'].setRotationPoint(-67.5F, 36.0F, 4.0F);
/*      */     
/* 1612 */     this.gunModel['Ū'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, 0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -1.25F, 0.5F, -0.25F, 0.8F, 0.5F, -0.25F, 0.8F, 0.5F, -0.25F, -1.25F, 0.5F, -0.25F);
/* 1613 */     this.gunModel['Ū'].setRotationPoint(-66.5F, 38.0F, 4.0F);
/*      */     
/* 1615 */     this.gunModel['ū'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/* 1616 */     this.gunModel['ū'].setRotationPoint(-67.5F, 36.0F, 3.0F);
/*      */     
/* 1618 */     this.gunModel['Ŭ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, 0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -1.25F, 0.5F, -0.25F, 0.8F, 0.5F, -0.25F, 0.8F, 0.5F, -0.25F, -1.25F, 0.5F, -0.25F);
/* 1619 */     this.gunModel['Ŭ'].setRotationPoint(-66.5F, 38.0F, 3.0F);
/*      */     
/* 1621 */     this.gunModel['ŭ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/* 1622 */     this.gunModel['ŭ'].setRotationPoint(-67.5F, 36.0F, 2.0F);
/*      */     
/* 1624 */     this.gunModel['Ů'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, 0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -1.25F, 0.5F, -0.25F, 0.8F, 0.5F, -0.25F, 0.8F, 0.5F, -0.25F, -1.25F, 0.5F, -0.25F);
/* 1625 */     this.gunModel['Ů'].setRotationPoint(-66.5F, 38.0F, 2.0F);
/*      */     
/* 1627 */     this.gunModel['ů'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F);
/* 1628 */     this.gunModel['ů'].setRotationPoint(-67.5F, 36.0F, 1.0F);
/*      */     
/* 1630 */     this.gunModel['Ű'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, 0.25F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -1.25F, 0.5F, -0.25F, 0.8F, 0.5F, -0.25F, 0.8F, 0.5F, -0.25F, -1.25F, 0.5F, -0.25F);
/* 1631 */     this.gunModel['Ű'].setRotationPoint(-66.5F, 38.0F, 1.0F);
/*      */     
/* 1633 */     this.gunModel['ű'].addShapeBox(20.0F, -18.0F, -5.0F, 9, 2, 15, 0.0F, 0.0F, -8.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -8.0F, 0.75F, 0.0F, 8.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 8.0F, 2.0F);
/* 1634 */     this.gunModel['ű'].setRotationPoint(-50.5F, -24.0F, -3.0F);
/*      */     
/* 1636 */     this.gunModel['Ų'].addShapeBox(20.0F, -18.0F, -5.0F, 9, 2, 15, 0.0F, 0.0F, -8.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -8.0F, 2.0F, 0.0F, 8.0F, 2.0F, 0.0F, 0.25F, 2.0F, 0.0F, 0.25F, 2.0F, 0.0F, 8.0F, 2.0F);
/* 1637 */     this.gunModel['Ų'].setRotationPoint(-50.5F, -22.0F, -3.0F);
/*      */     
/* 1639 */     this.gunModel['ų'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 19, 0.0F, -1.0F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, 0.45F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F);
/* 1640 */     this.gunModel['ų'].setRotationPoint(-42.5F, -20.5F, -5.0F);
/*      */     
/* 1642 */     this.gunModel['Ŵ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1643 */     this.gunModel['Ŵ'].setRotationPoint(-33.5F, -20.0F, -5.0F);
/*      */     
/* 1645 */     this.gunModel['ŵ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 19, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F);
/* 1646 */     this.gunModel['ŵ'].setRotationPoint(-42.0F, -20.0F, -5.0F);
/*      */     
/* 1648 */     this.gunModel['Ŷ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 19, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1649 */     this.gunModel['Ŷ'].setRotationPoint(-40.5F, -20.0F, -5.0F);
/*      */     
/* 1651 */     this.gunModel['ŷ'].addShapeBox(20.0F, -18.0F, -5.0F, 6, 2, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1652 */     this.gunModel['ŷ'].setRotationPoint(-39.5F, -20.0F, -5.0F);
/*      */     
/* 1654 */     this.gunModel['Ÿ'].addShapeBox(20.0F, -18.0F, -5.0F, 9, 1, 15, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 8.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 8.0F, 0.75F);
/* 1655 */     this.gunModel['Ÿ'].setRotationPoint(-50.5F, -25.0F, -3.0F);
/*      */     
/* 1657 */     this.gunModel['Ź'].addShapeBox(20.0F, -18.0F, -5.0F, 15, 3, 15, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1658 */     this.gunModel['Ź'].setRotationPoint(-56.5F, -27.0F, -3.0F);
/*      */     
/* 1660 */     this.gunModel['ź'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 19, 0.0F, 0.25F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, -2.0F, 0.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F);
/* 1661 */     this.gunModel['ź'].setRotationPoint(-52.5F, -14.5F, -5.0F);
/*      */     
/* 1663 */     this.gunModel['Ż'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 19, 0.0F, 1.0F, 0.0F, -2.0F, -0.75F, 0.0F, -1.25F, -0.75F, 0.0F, -1.25F, 1.0F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -2.0F);
/* 1664 */     this.gunModel['Ż'].setRotationPoint(-52.5F, -16.0F, -5.0F);
/*      */     
/* 1666 */     this.gunModel['ż'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 19, 0.0F, 2.5F, 0.0F, -2.0F, -2.25F, 0.0F, -1.25F, -2.25F, 0.0F, -1.25F, 2.5F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.25F, 0.0F, -2.0F);
/* 1667 */     this.gunModel['ż'].setRotationPoint(-53.25F, -18.0F, -5.0F);
/*      */     
/* 1669 */     this.gunModel['Ž'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 3, 19, 0.0F, 4.25F, 0.0F, -2.0F, -4.0F, 0.0F, -1.25F, -4.0F, 0.0F, -1.25F, 4.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.25F, 0.0F, -2.0F);
/* 1670 */     this.gunModel['Ž'].setRotationPoint(-55.5F, -21.0F, -5.0F);
/*      */     
/* 1672 */     this.gunModel['ž'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 3, 19, 0.0F, 0.25F, 0.0F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.25F, 0.0F, -2.0F);
/* 1673 */     this.gunModel['ž'].setRotationPoint(-59.5F, -24.0F, -5.0F);
/*      */     
/* 1675 */     this.gunModel['ſ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 3, 9, 0.0F, -0.75F, 0.0F, -5.75F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -0.75F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F, 1.0F, 0.0F, -1.25F, 1.0F, 0.0F, -2.0F, 0.25F, 0.0F, -2.0F);
/* 1676 */     this.gunModel['ſ'].setRotationPoint(-59.5F, -27.0F, -5.0F);
/*      */     
/* 1678 */     this.gunModel['ƀ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 15, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F);
/* 1679 */     this.gunModel['ƀ'].setRotationPoint(-54.0F, -14.5F, -3.0F);
/*      */     
/* 1681 */     this.gunModel['Ɓ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 15, 0.0F, 0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1682 */     this.gunModel['Ɓ'].setRotationPoint(-55.0F, -16.0F, -3.0F);
/*      */     
/* 1684 */     this.gunModel['Ƃ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 15, 0.0F, -0.05F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -0.05F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1685 */     this.gunModel['Ƃ'].setRotationPoint(-56.0F, -16.5F, -3.0F);
/*      */     
/* 1687 */     this.gunModel['ƃ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 15, 0.0F, 1.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, -1.05F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.05F, 0.0F, 0.0F);
/* 1688 */     this.gunModel['ƃ'].setRotationPoint(-57.0F, -18.0F, -3.0F);
/*      */     
/* 1690 */     this.gunModel['Ƅ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 15, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1691 */     this.gunModel['Ƅ'].setRotationPoint(-59.0F, -18.5F, -3.0F);
/*      */     
/* 1693 */     this.gunModel['ƅ'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 15, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1694 */     this.gunModel['ƅ'].setRotationPoint(-60.0F, -19.0F, -3.0F);
/*      */     
/* 1696 */     this.gunModel['Ɔ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1697 */     this.gunModel['Ɔ'].setRotationPoint(-61.0F, -23.5F, 7.0F);
/*      */     
/* 1699 */     this.gunModel['Ƈ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1700 */     this.gunModel['Ƈ'].setRotationPoint(-61.0F, -23.5F, -3.0F);
/*      */     
/* 1702 */     this.gunModel['ƈ'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 15, 0.0F, -0.25F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -3.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1703 */     this.gunModel['ƈ'].setRotationPoint(-60.0F, -21.0F, -3.0F);
/*      */     
/* 1705 */     this.gunModel['Ɖ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 3, 5, 0.0F, -0.5F, -0.5F, -2.5F, -0.1F, -0.5F, -2.5F, -0.1F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.7F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.7F, -0.5F, 0.0F);
/* 1706 */     this.gunModel['Ɖ'].setRotationPoint(-60.0F, -26.5F, -3.0F);
/*      */     
/* 1708 */     this.gunModel['Ɗ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 5, 0.0F, -0.3F, -0.5F, -0.5F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1709 */     this.gunModel['Ɗ'].setRotationPoint(-61.0F, -24.5F, -3.0F);
/*      */     
/* 1711 */     this.gunModel['Ƌ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 5, 0.0F, -0.3F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.3F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1712 */     this.gunModel['Ƌ'].setRotationPoint(-61.0F, -24.5F, 7.0F);
/*      */     
/* 1714 */     this.gunModel['ƌ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 2.5F, 0.0F, -0.75F, 2.5F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, 0.0F, -1.0F, -2.5F, 0.0F, -1.0F, -2.5F, -2.5F, -0.5F, 0.0F, 0.0F);
/* 1715 */     this.gunModel['ƌ'].setRotationPoint(-61.5F, -24.5F, 7.0F);
/*      */     
/* 1717 */     this.gunModel['ƍ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 3, 9, 0.0F, -0.75F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -0.75F, 0.0F, -5.75F, 0.25F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -1.25F, 0.25F, 0.0F, -2.0F);
/* 1718 */     this.gunModel['ƍ'].setRotationPoint(-59.5F, -27.0F, 5.0F);
/*      */     
/* 1720 */     this.gunModel['Ǝ'].addShapeBox(20.0F, -18.0F, -5.0F, 7, 3, 19, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.25F);
/* 1721 */     this.gunModel['Ǝ'].setRotationPoint(-57.5F, -24.0F, -5.0F);
/*      */     
/* 1723 */     this.gunModel['Ə'].addShapeBox(20.0F, -18.0F, -5.0F, 7, 3, 16, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.25F, -4.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, -4.0F, 0.0F, 0.25F);
/* 1724 */     this.gunModel['Ə'].setRotationPoint(-57.5F, -21.0F, -3.5F);
/*      */     
/* 1726 */     this.gunModel['Ɛ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 19, 0.0F, 2.25F, 0.0F, -1.25F, -1.25F, 0.0F, -1.3F, -1.25F, 0.0F, -1.3F, 2.25F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, -1.25F, 0.0F, -1.25F, -1.25F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F);
/* 1727 */     this.gunModel['Ɛ'].setRotationPoint(-51.25F, -18.0F, -5.0F);
/*      */     
/* 1729 */     this.gunModel['Ƒ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 19, 0.0F, 1.0F, 0.0F, -1.25F, -1.25F, 0.0F, -1.25F, -1.25F, 0.0F, -1.25F, 1.0F, 0.0F, -1.25F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
/* 1730 */     this.gunModel['Ƒ'].setRotationPoint(-50.25F, -16.0F, -5.0F);
/*      */     
/* 1732 */     this.gunModel['ƒ'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1733 */     this.gunModel['ƒ'].setRotationPoint(-67.5F, -20.5F, 2.0F);
/*      */     
/* 1735 */     this.gunModel['Ɠ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 3, 5, 0.0F, -0.5F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, -2.5F, -0.5F, -0.5F, -2.5F, 0.7F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.7F, -0.5F, -0.5F);
/* 1736 */     this.gunModel['Ɠ'].setRotationPoint(-60.0F, -26.5F, 7.0F);
/*      */     
/* 1738 */     this.gunModel['Ɣ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 1.5F, -0.1F, 0.0F, 1.5F, -0.1F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1739 */     this.gunModel['Ɣ'].setRotationPoint(-60.0F, -27.0F, 1.0F);
/*      */     
/* 1741 */     this.gunModel['ƕ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.25F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 1.5F, -0.5F, 0.0F, 1.5F);
/* 1742 */     this.gunModel['ƕ'].setRotationPoint(-60.0F, -27.0F, 7.0F);
/*      */     
/* 1744 */     this.gunModel['Ɩ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 3, 5, 0.0F, -0.5F, 1.0F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 1.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.25F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1745 */     this.gunModel['Ɩ'].setRotationPoint(-61.5F, -22.5F, 2.0F);
/*      */     
/* 1747 */     this.gunModel['Ɨ'].addShapeBox(20.0F, -18.0F, -5.0F, 5, 4, 4, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1748 */     this.gunModel['Ɨ'].setRotationPoint(-57.25F, -36.5F, 2.5F);
/*      */     
/* 1750 */     this.gunModel['Ƙ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1751 */     this.gunModel['Ƙ'].setRotationPoint(-58.25F, -39.5F, 2.5F);
/*      */     
/* 1753 */     this.gunModel['ƙ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
/* 1754 */     this.gunModel['ƙ'].setRotationPoint(-56.25F, -39.5F, 2.5F);
/*      */     
/* 1756 */     this.gunModel['ƚ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1757 */     this.gunModel['ƚ'].setRotationPoint(-58.25F, -37.5F, 2.5F);
/*      */     
/* 1759 */     this.gunModel['ƛ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1760 */     this.gunModel['ƛ'].setRotationPoint(-56.25F, -37.5F, 2.5F);
/*      */     
/* 1762 */     this.gunModel['Ɯ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 4, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F);
/* 1763 */     this.gunModel['Ɯ'].setRotationPoint(-59.75F, -40.5F, 2.5F);
/*      */     
/* 1765 */     this.gunModel['Ɲ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 4, 0.0F, 0.75F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.75F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1766 */     this.gunModel['Ɲ'].setRotationPoint(-59.75F, -37.5F, 2.5F);
/*      */     
/* 1768 */     this.gunModel['ƞ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 4, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 1769 */     this.gunModel['ƞ'].setRotationPoint(-60.75F, -39.0F, 2.5F);
/*      */     
/* 1771 */     this.gunModel['Ɵ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/* 1772 */     this.gunModel['Ɵ'].setRotationPoint(-50.25F, -40.5F, 2.5F);
/*      */     
/* 1774 */     this.gunModel['Ơ'].addShapeBox(20.0F, -18.0F, -5.0F, 7, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1775 */     this.gunModel['Ơ'].setRotationPoint(-55.25F, -39.5F, 2.5F);
/*      */     
/* 1777 */     this.gunModel['ơ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1778 */     this.gunModel['ơ'].setRotationPoint(-58.25F, -40.5F, 2.5F);
/*      */     
/* 1780 */     this.gunModel['Ƣ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 4, 0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/* 1781 */     this.gunModel['Ƣ'].setRotationPoint(-54.75F, -32.5F, 2.5F);
/*      */     
/* 1783 */     this.gunModel['ƣ'].addShapeBox(20.0F, -18.0F, -3.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1784 */     this.gunModel['ƣ'].setRotationPoint(-64.5F, 39.5F, 1.0F);
/*      */     
/* 1786 */     this.gunModel['Ƥ'].addShapeBox(20.0F, -18.0F, -3.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1787 */     this.gunModel['Ƥ'].setRotationPoint(-64.5F, 41.5F, 1.0F);
/*      */     
/* 1789 */     this.gunModel['ƥ'].addShapeBox(20.0F, -18.0F, -3.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1790 */     this.gunModel['ƥ'].setRotationPoint(-61.5F, 39.5F, 1.0F);
/*      */     
/* 1792 */     this.gunModel['Ʀ'].addShapeBox(20.0F, -18.0F, -5.0F, 13, 5, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1793 */     this.gunModel['Ʀ'].setRotationPoint(-20.0F, -26.5F, 12.0F);
/*      */     
/* 1795 */     this.gunModel['Ƨ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 5, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1796 */     this.gunModel['Ƨ'].setRotationPoint(-7.0F, -26.5F, 12.0F);
/*      */     
/* 1798 */     this.gunModel['ƨ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 3, 1, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, 0.25F, -0.5F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -0.75F, -0.5F, -0.5F, -0.75F);
/* 1799 */     this.gunModel['ƨ'].setRotationPoint(-5.5F, -23.5F, 12.0F);
/*      */     
/* 1801 */     this.gunModel['Ʃ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.25F, 0.0F, -1.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, -0.75F, 0.0F, -1.5F, -0.75F);
/* 1802 */     this.gunModel['Ʃ'].setRotationPoint(-7.0F, -22.5F, 12.0F);
/*      */     
/* 1804 */     this.gunModel['ƪ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, -0.75F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, -0.75F, 0.0F, 0.0F, 0.25F);
/* 1805 */     this.gunModel['ƪ'].setRotationPoint(-5.0F, -25.5F, 12.0F);
/*      */     
/* 1807 */     this.gunModel['ƫ'].addShapeBox(20.0F, -18.0F, -5.0F, 13, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1808 */     this.gunModel['ƫ'].setRotationPoint(-20.0F, -22.0F, 12.0F);
/*      */     
/* 1810 */     this.gunModel['Ƭ'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 4, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1811 */     this.gunModel['Ƭ'].setRotationPoint(-24.0F, -25.0F, 12.0F);
/*      */     
/* 1813 */     this.gunModel['ƭ'].addShapeBox(20.0F, -18.0F, -5.0F, 13, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1814 */     this.gunModel['ƭ'].setRotationPoint(-31.0F, -27.0F, 12.0F);
/*      */     
/* 1816 */     this.gunModel['Ʈ'].addShapeBox(20.0F, -18.0F, -5.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F);
/* 1817 */     this.gunModel['Ʈ'].setRotationPoint(-31.0F, -26.0F, 12.0F);
/*      */     
/* 1819 */     this.gunModel['Ư'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.25F, -2.0F, 0.5F, 0.25F);
/* 1820 */     this.gunModel['Ư'].setRotationPoint(-23.0F, -24.5F, 12.0F);
/*      */     
/* 1822 */     this.gunModel['ư'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -2.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.25F, -2.0F, 0.5F, 0.25F);
/* 1823 */     this.gunModel['ư'].setRotationPoint(-22.0F, -23.0F, 12.0F);
/*      */     
/* 1825 */     this.gunModel['Ʊ'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 2, 0.0F, 0.5F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1826 */     this.gunModel['Ʊ'].setRotationPoint(-30.5F, -25.5F, 13.25F);
/*      */     
/* 1828 */     this.gunModel['Ʋ'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1829 */     this.gunModel['Ʋ'].setRotationPoint(-30.5F, -26.25F, 13.25F);
/*      */     
/* 1831 */     this.gunModel['Ƴ'].addShapeBox(20.0F, -18.0F, -5.0F, 6, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1832 */     this.gunModel['Ƴ'].setRotationPoint(-39.5F, -21.0F, -5.5F);
/*      */     
/* 1834 */     this.gunModel['ƴ'].addShapeBox(20.0F, -18.0F, -5.0F, 6, 2, 20, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1835 */     this.gunModel['ƴ'].setRotationPoint(-39.5F, -23.0F, -5.5F);
/*      */     
/* 1837 */     this.gunModel['Ƶ'].addShapeBox(20.0F, -18.0F, -5.0F, 6, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1838 */     this.gunModel['Ƶ'].setRotationPoint(-39.5F, -19.0F, -5.5F);
/*      */     
/* 1840 */     this.gunModel['ƶ'].addShapeBox(20.0F, -18.0F, -5.0F, 116, 1, 9, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1841 */     this.gunModel['ƶ'].setRotationPoint(-56.0F, -28.0F, 0.0F);
/*      */     
/* 1843 */     this.gunModel['Ʒ'].addShapeBox(20.0F, -18.0F, -5.0F, 7, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1844 */     this.gunModel['Ʒ'].setRotationPoint(3.0F, -25.5F, 10.0F);
/*      */     
/* 1846 */     this.gunModel['Ƹ'].addShapeBox(20.0F, -18.0F, -5.0F, 12, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1847 */     this.gunModel['Ƹ'].setRotationPoint(-2.0F, -26.5F, 10.0F);
/*      */     
/* 1849 */     this.gunModel['ƹ'].addShapeBox(20.0F, -18.0F, -5.0F, 11, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F);
/* 1850 */     this.gunModel['ƹ'].setRotationPoint(-1.0F, -27.5F, 10.0F);
/*      */     
/* 1852 */     this.gunModel['ƺ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F);
/* 1853 */     this.gunModel['ƺ'].setRotationPoint(3.0F, -21.5F, 10.0F);
/*      */     
/* 1855 */     this.gunModel['ƻ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F);
/* 1856 */     this.gunModel['ƻ'].setRotationPoint(4.5F, -19.5F, 10.0F);
/*      */     
/* 1858 */     this.gunModel['Ƽ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1859 */     this.gunModel['Ƽ'].setRotationPoint(5.5F, -21.5F, 10.0F);
/*      */     
/* 1861 */     this.gunModel['ƽ'].addShapeBox(20.0F, -18.0F, -5.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1862 */     this.gunModel['ƽ'].setRotationPoint(-2.0F, -25.5F, 10.0F);
/*      */     
/* 1864 */     this.gunModel['ƾ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1865 */     this.gunModel['ƾ'].setRotationPoint(7.5F, -21.5F, 10.0F);
/*      */     
/* 1867 */     this.gunModel['ƿ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1868 */     this.gunModel['ƿ'].setRotationPoint(7.5F, -20.5F, 10.0F);
/*      */     
/* 1870 */     this.gunModel['ǀ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1871 */     this.gunModel['ǀ'].setRotationPoint(9.5F, -21.5F, 10.0F);
/*      */     
/* 1873 */     this.gunModel['ǁ'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 1, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1874 */     this.gunModel['ǁ'].setRotationPoint(-0.5F, -25.5F, 11.5F);
/*      */     
/* 1876 */     this.gunModel['ǂ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1877 */     this.gunModel['ǂ'].setRotationPoint(7.5F, -20.5F, 10.0F);
/*      */     
/* 1879 */     this.gunModel['ǃ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1880 */     this.gunModel['ǃ'].setRotationPoint(7.5F, -19.5F, 10.0F);
/*      */     
/* 1882 */     this.gunModel['Ǆ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1883 */     this.gunModel['Ǆ'].setRotationPoint(7.5F, -21.5F, 10.0F);
/*      */     
/* 1885 */     this.gunModel['ǅ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1886 */     this.gunModel['ǅ'].setRotationPoint(7.5F, -20.5F, 11.0F);
/*      */     
/* 1888 */     this.gunModel['ǆ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1889 */     this.gunModel['ǆ'].setRotationPoint(7.5F, -19.5F, 11.0F);
/*      */     
/* 1891 */     this.gunModel['Ǉ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1892 */     this.gunModel['Ǉ'].setRotationPoint(7.5F, -21.5F, 11.0F);
/*      */     
/* 1894 */     this.gunModel['ǈ'].addShapeBox(20.0F, -18.0F, -5.0F, 9, 6, 1, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1895 */     this.gunModel['ǈ'].setRotationPoint(-15.0F, -27.0F, -2.0F);
/*      */     
/* 1897 */     this.gunModel['ǉ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 6, 1, 0.0F, 0.0F, -0.5F, -0.25F, -0.5F, -2.0F, -0.5F, -0.5F, -2.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -2.0F, -0.5F, -0.5F, -2.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1898 */     this.gunModel['ǉ'].setRotationPoint(-6.0F, -27.0F, -2.0F);
/*      */     
/* 1900 */     this.gunModel['Ǌ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 9, 1, 0.0F, 0.0F, -3.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -3.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -0.25F, 0.25F);
/* 1901 */     this.gunModel['Ǌ'].setRotationPoint(-17.0F, -27.0F, -2.0F);
/*      */     
/* 1903 */     this.gunModel['ǋ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 7, 1, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 1904 */     this.gunModel['ǋ'].setRotationPoint(-18.0F, -24.5F, -2.0F);
/*      */     
/* 1906 */     this.gunModel['ǌ'].addShapeBox(20.0F, -18.0F, -5.0F, 7, 7, 1, 0.0F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -1.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/* 1907 */     this.gunModel['ǌ'].setRotationPoint(-25.0F, -24.5F, -2.0F);
/*      */     
/* 1909 */     this.gunModel['Ǎ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 1, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1910 */     this.gunModel['Ǎ'].setRotationPoint(-15.0F, -21.5F, -2.0F);
/*      */     
/* 1912 */     this.gunModel['ǎ'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1913 */     this.gunModel['ǎ'].setRotationPoint(1.0F, -21.0F, -1.75F);
/*      */     
/* 1915 */     this.gunModel['Ǐ'].addShapeBox(20.0F, -18.0F, -5.0F, 7, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1916 */     this.gunModel['Ǐ'].setRotationPoint(-32.5F, -27.0F, -3.0F);
/*      */     
/* 1918 */     this.gunModel['ǐ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1919 */     this.gunModel['ǐ'].setRotationPoint(-25.5F, -27.0F, -3.0F);
/*      */     
/* 1921 */     this.gunModel['Ǒ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1922 */     this.gunModel['Ǒ'].setRotationPoint(-23.5F, -27.0F, -3.0F);
/*      */     
/* 1924 */     this.gunModel['ǒ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1925 */     this.gunModel['ǒ'].setRotationPoint(5.0F, -21.0F, -1.75F);
/*      */     
/* 1927 */     this.gunModel['Ǔ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1928 */     this.gunModel['Ǔ'].setRotationPoint(0.0F, -21.0F, -1.75F);
/*      */     
/* 1930 */     this.gunModel['ǔ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1931 */     this.gunModel['ǔ'].setRotationPoint(-2.5F, -24.5F, -1.25F);
/*      */     
/* 1933 */     this.gunModel['Ǖ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1934 */     this.gunModel['Ǖ'].setRotationPoint(-2.5F, -23.5F, -1.25F);
/*      */     
/* 1936 */     this.gunModel['ǖ'].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1937 */     this.gunModel['ǖ'].setRotationPoint(-2.5F, -25.5F, -1.25F);
/*      */     
/* 1939 */     this.gunModel['Ǘ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1940 */     this.gunModel['Ǘ'].setRotationPoint(-40.0F, -36.0F, 10.0F);
/*      */     
/* 1942 */     this.gunModel['ǘ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 1943 */     this.gunModel['ǘ'].setRotationPoint(-40.0F, -35.5F, 10.0F);
/*      */     
/* 1945 */     this.gunModel['Ǚ'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 1, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1946 */     this.gunModel['Ǚ'].setRotationPoint(-40.0F, -36.5F, 10.0F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 1951 */     this.ammoModel[0] = new ModelRendererTurbo(this, 353, 225, this.textureX, this.textureY);
/* 1952 */     this.ammoModel[1] = new ModelRendererTurbo(this, 289, 225, this.textureX, this.textureY);
/* 1953 */     this.ammoModel[2] = new ModelRendererTurbo(this, 49, 225, this.textureX, this.textureY);
/* 1954 */     this.ammoModel[3] = new ModelRendererTurbo(this, 833, 217, this.textureX, this.textureY);
/* 1955 */     this.ammoModel[4] = new ModelRendererTurbo(this, 425, 233, this.textureX, this.textureY);
/*      */     
/* 1957 */     this.ammoModel[0].addShapeBox(20.0F, -18.0F, -3.0F, 20, 5, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/* 1958 */     this.ammoModel[0].setRotationPoint(-60.5F, 40.0F, -5.0F);
/*      */     
/* 1960 */     this.ammoModel[1].addShapeBox(20.0F, -18.0F, -3.0F, 9, 5, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1961 */     this.ammoModel[1].setRotationPoint(-40.5F, 40.0F, -5.0F);
/*      */     
/* 1963 */     this.ammoModel[2].addShapeBox(20.0F, -18.0F, -3.0F, 2, 5, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/* 1964 */     this.ammoModel[2].setRotationPoint(-31.5F, 40.0F, -5.0F);
/*      */     
/* 1966 */     this.ammoModel[3].addShapeBox(20.0F, -18.0F, -3.0F, 1, 5, 11, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
/* 1967 */     this.ammoModel[3].setRotationPoint(-29.5F, 40.0F, -3.0F);
/*      */     
/* 1969 */     this.ammoModel[4].addShapeBox(20.0F, -18.0F, -3.0F, 23, 50, 11, 0.0F, -9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1970 */     this.ammoModel[4].setRotationPoint(-57.5F, -11.0F, -3.0F);
/*      */   }
/*      */   
/*      */   private void initslideModel_1()
/*      */   {
/* 1975 */     this.slideModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 1976 */     this.slideModel[1] = new ModelRendererTurbo(this, 793, 1, this.textureX, this.textureY);
/* 1977 */     this.slideModel[2] = new ModelRendererTurbo(this, 521, 17, this.textureX, this.textureY);
/* 1978 */     this.slideModel[3] = new ModelRendererTurbo(this, 561, 17, this.textureX, this.textureY);
/* 1979 */     this.slideModel[4] = new ModelRendererTurbo(this, 601, 17, this.textureX, this.textureY);
/* 1980 */     this.slideModel[5] = new ModelRendererTurbo(this, 641, 17, this.textureX, this.textureY);
/* 1981 */     this.slideModel[6] = new ModelRendererTurbo(this, 681, 17, this.textureX, this.textureY);
/* 1982 */     this.slideModel[7] = new ModelRendererTurbo(this, 721, 17, this.textureX, this.textureY);
/* 1983 */     this.slideModel[8] = new ModelRendererTurbo(this, 761, 17, this.textureX, this.textureY);
/* 1984 */     this.slideModel[9] = new ModelRendererTurbo(this, 801, 25, this.textureX, this.textureY);
/* 1985 */     this.slideModel[10] = new ModelRendererTurbo(this, 841, 25, this.textureX, this.textureY);
/* 1986 */     this.slideModel[11] = new ModelRendererTurbo(this, 881, 25, this.textureX, this.textureY);
/* 1987 */     this.slideModel[12] = new ModelRendererTurbo(this, 921, 25, this.textureX, this.textureY);
/* 1988 */     this.slideModel[13] = new ModelRendererTurbo(this, 961, 25, this.textureX, this.textureY);
/* 1989 */     this.slideModel[14] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/* 1990 */     this.slideModel[15] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/* 1991 */     this.slideModel[16] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/* 1992 */     this.slideModel[17] = new ModelRendererTurbo(this, 121, 33, this.textureX, this.textureY);
/* 1993 */     this.slideModel[18] = new ModelRendererTurbo(this, 161, 33, this.textureX, this.textureY);
/* 1994 */     this.slideModel[19] = new ModelRendererTurbo(this, 201, 33, this.textureX, this.textureY);
/* 1995 */     this.slideModel[20] = new ModelRendererTurbo(this, 305, 33, this.textureX, this.textureY);
/* 1996 */     this.slideModel[21] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/* 1997 */     this.slideModel[22] = new ModelRendererTurbo(this, 385, 33, this.textureX, this.textureY);
/* 1998 */     this.slideModel[23] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/* 1999 */     this.slideModel[24] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
/* 2000 */     this.slideModel[25] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
/* 2001 */     this.slideModel[26] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/* 2002 */     this.slideModel[27] = new ModelRendererTurbo(this, 545, 17, this.textureX, this.textureY);
/* 2003 */     this.slideModel[28] = new ModelRendererTurbo(this, 585, 17, this.textureX, this.textureY);
/* 2004 */     this.slideModel[29] = new ModelRendererTurbo(this, 625, 17, this.textureX, this.textureY);
/* 2005 */     this.slideModel[30] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
/* 2006 */     this.slideModel[31] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/* 2007 */     this.slideModel[32] = new ModelRendererTurbo(this, 465, 17, this.textureX, this.textureY);
/* 2008 */     this.slideModel[33] = new ModelRendererTurbo(this, 665, 17, this.textureX, this.textureY);
/* 2009 */     this.slideModel[34] = new ModelRendererTurbo(this, 705, 17, this.textureX, this.textureY);
/* 2010 */     this.slideModel[35] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/* 2011 */     this.slideModel[36] = new ModelRendererTurbo(this, 593, 49, this.textureX, this.textureY);
/* 2012 */     this.slideModel[37] = new ModelRendererTurbo(this, 689, 49, this.textureX, this.textureY);
/* 2013 */     this.slideModel[38] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/* 2014 */     this.slideModel[39] = new ModelRendererTurbo(this, 513, 57, this.textureX, this.textureY);
/* 2015 */     this.slideModel[40] = new ModelRendererTurbo(this, 609, 57, this.textureX, this.textureY);
/* 2016 */     this.slideModel[41] = new ModelRendererTurbo(this, 705, 57, this.textureX, this.textureY);
/* 2017 */     this.slideModel[42] = new ModelRendererTurbo(this, 785, 57, this.textureX, this.textureY);
/* 2018 */     this.slideModel[43] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/* 2019 */     this.slideModel[44] = new ModelRendererTurbo(this, 513, 65, this.textureX, this.textureY);
/* 2020 */     this.slideModel[45] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/* 2021 */     this.slideModel[46] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
/* 2022 */     this.slideModel[47] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
/* 2023 */     this.slideModel[48] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/* 2024 */     this.slideModel[49] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 2025 */     this.slideModel[50] = new ModelRendererTurbo(this, 705, 17, this.textureX, this.textureY);
/* 2026 */     this.slideModel[51] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/* 2027 */     this.slideModel[52] = new ModelRendererTurbo(this, 609, 1, this.textureX, this.textureY);
/* 2028 */     this.slideModel[53] = new ModelRendererTurbo(this, 985, 1, this.textureX, this.textureY);
/* 2029 */     this.slideModel[54] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/* 2030 */     this.slideModel[55] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/* 2031 */     this.slideModel[56] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
/* 2032 */     this.slideModel[57] = new ModelRendererTurbo(this, 945, 57, this.textureX, this.textureY);
/* 2033 */     this.slideModel[58] = new ModelRendererTurbo(this, 985, 57, this.textureX, this.textureY);
/* 2034 */     this.slideModel[59] = new ModelRendererTurbo(this, 729, 65, this.textureX, this.textureY);
/* 2035 */     this.slideModel[60] = new ModelRendererTurbo(this, 385, 65, this.textureX, this.textureY);
/* 2036 */     this.slideModel[61] = new ModelRendererTurbo(this, 177, 73, this.textureX, this.textureY);
/* 2037 */     this.slideModel[62] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
/* 2038 */     this.slideModel[63] = new ModelRendererTurbo(this, 761, 65, this.textureX, this.textureY);
/* 2039 */     this.slideModel[64] = new ModelRendererTurbo(this, 257, 73, this.textureX, this.textureY);
/* 2040 */     this.slideModel[65] = new ModelRendererTurbo(this, 289, 73, this.textureX, this.textureY);
/* 2041 */     this.slideModel[66] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/* 2042 */     this.slideModel[67] = new ModelRendererTurbo(this, 409, 73, this.textureX, this.textureY);
/* 2043 */     this.slideModel[68] = new ModelRendererTurbo(this, 353, 73, this.textureX, this.textureY);
/* 2044 */     this.slideModel[69] = new ModelRendererTurbo(this, 585, 33, this.textureX, this.textureY);
/* 2045 */     this.slideModel[70] = new ModelRendererTurbo(this, 945, 25, this.textureX, this.textureY);
/* 2046 */     this.slideModel[71] = new ModelRendererTurbo(this, 449, 73, this.textureX, this.textureY);
/* 2047 */     this.slideModel[72] = new ModelRendererTurbo(this, 489, 73, this.textureX, this.textureY);
/* 2048 */     this.slideModel[73] = new ModelRendererTurbo(this, 537, 73, this.textureX, this.textureY);
/* 2049 */     this.slideModel[74] = new ModelRendererTurbo(this, 577, 73, this.textureX, this.textureY);
/* 2050 */     this.slideModel[75] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/* 2051 */     this.slideModel[76] = new ModelRendererTurbo(this, 545, 25, this.textureX, this.textureY);
/* 2052 */     this.slideModel[77] = new ModelRendererTurbo(this, 585, 25, this.textureX, this.textureY);
/* 2053 */     this.slideModel[78] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/* 2054 */     this.slideModel[79] = new ModelRendererTurbo(this, 657, 193, this.textureX, this.textureY);
/* 2055 */     this.slideModel[80] = new ModelRendererTurbo(this, 985, 193, this.textureX, this.textureY);
/* 2056 */     this.slideModel[81] = new ModelRendererTurbo(this, 137, 113, this.textureX, this.textureY);
/* 2057 */     this.slideModel[82] = new ModelRendererTurbo(this, 873, 89, this.textureX, this.textureY);
/* 2058 */     this.slideModel[83] = new ModelRendererTurbo(this, 377, 73, this.textureX, this.textureY);
/* 2059 */     this.slideModel[84] = new ModelRendererTurbo(this, 937, 89, this.textureX, this.textureY);
/* 2060 */     this.slideModel[85] = new ModelRendererTurbo(this, 177, 81, this.textureX, this.textureY);
/* 2061 */     this.slideModel[86] = new ModelRendererTurbo(this, 225, 113, this.textureX, this.textureY);
/* 2062 */     this.slideModel[87] = new ModelRendererTurbo(this, 353, 113, this.textureX, this.textureY);
/* 2063 */     this.slideModel[88] = new ModelRendererTurbo(this, 241, 97, this.textureX, this.textureY);
/* 2064 */     this.slideModel[89] = new ModelRendererTurbo(this, 617, 81, this.textureX, this.textureY);
/* 2065 */     this.slideModel[90] = new ModelRendererTurbo(this, 305, 97, this.textureX, this.textureY);
/* 2066 */     this.slideModel[91] = new ModelRendererTurbo(this, 665, 81, this.textureX, this.textureY);
/* 2067 */     this.slideModel[92] = new ModelRendererTurbo(this, 113, 89, this.textureX, this.textureY);
/* 2068 */     this.slideModel[93] = new ModelRendererTurbo(this, 593, 97, this.textureX, this.textureY);
/* 2069 */     this.slideModel[94] = new ModelRendererTurbo(this, 1001, 105, this.textureX, this.textureY);
/* 2070 */     this.slideModel[95] = new ModelRendererTurbo(this, 705, 81, this.textureX, this.textureY);
/* 2071 */     this.slideModel[96] = new ModelRendererTurbo(this, 681, 49, this.textureX, this.textureY);
/* 2072 */     this.slideModel[97] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/* 2073 */     this.slideModel[98] = new ModelRendererTurbo(this, 777, 49, this.textureX, this.textureY);
/* 2074 */     this.slideModel[99] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/* 2075 */     this.slideModel[100] = new ModelRendererTurbo(this, 729, 81, this.textureX, this.textureY);
/* 2076 */     this.slideModel[101] = new ModelRendererTurbo(this, 145, 89, this.textureX, this.textureY);
/* 2077 */     this.slideModel[102] = new ModelRendererTurbo(this, 241, 89, this.textureX, this.textureY);
/* 2078 */     this.slideModel[103] = new ModelRendererTurbo(this, 553, 97, this.textureX, this.textureY);
/* 2079 */     this.slideModel[104] = new ModelRendererTurbo(this, 617, 113, this.textureX, this.textureY);
/* 2080 */     this.slideModel[105] = new ModelRendererTurbo(this, 433, 97, this.textureX, this.textureY);
/* 2081 */     this.slideModel[106] = new ModelRendererTurbo(this, 817, 97, this.textureX, this.textureY);
/* 2082 */     this.slideModel[107] = new ModelRendererTurbo(this, 833, 97, this.textureX, this.textureY);
/* 2083 */     this.slideModel[108] = new ModelRendererTurbo(this, 961, 97, this.textureX, this.textureY);
/* 2084 */     this.slideModel[109] = new ModelRendererTurbo(this, 945, 113, this.textureX, this.textureY);
/* 2085 */     this.slideModel[110] = new ModelRendererTurbo(this, 249, 121, this.textureX, this.textureY);
/* 2086 */     this.slideModel[111] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/* 2087 */     this.slideModel[112] = new ModelRendererTurbo(this, 41, 105, this.textureX, this.textureY);
/* 2088 */     this.slideModel[113] = new ModelRendererTurbo(this, 57, 105, this.textureX, this.textureY);
/* 2089 */     this.slideModel[114] = new ModelRendererTurbo(this, 137, 105, this.textureX, this.textureY);
/* 2090 */     this.slideModel[115] = new ModelRendererTurbo(this, 641, 121, this.textureX, this.textureY);
/* 2091 */     this.slideModel[116] = new ModelRendererTurbo(this, 433, 129, this.textureX, this.textureY);
/* 2092 */     this.slideModel[117] = new ModelRendererTurbo(this, 889, 129, this.textureX, this.textureY);
/* 2093 */     this.slideModel[118] = new ModelRendererTurbo(this, 553, 105, this.textureX, this.textureY);
/* 2094 */     this.slideModel[119] = new ModelRendererTurbo(this, 921, 113, this.textureX, this.textureY);
/* 2095 */     this.slideModel[120] = new ModelRendererTurbo(this, 985, 113, this.textureX, this.textureY);
/* 2096 */     this.slideModel[121] = new ModelRendererTurbo(this, 721, 105, this.textureX, this.textureY);
/* 2097 */     this.slideModel[122] = new ModelRendererTurbo(this, 833, 105, this.textureX, this.textureY);
/* 2098 */     this.slideModel[123] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/* 2099 */     this.slideModel[124] = new ModelRendererTurbo(this, 57, 113, this.textureX, this.textureY);
/* 2100 */     this.slideModel[125] = new ModelRendererTurbo(this, 377, 113, this.textureX, this.textureY);
/* 2101 */     this.slideModel[126] = new ModelRendererTurbo(this, 897, 113, this.textureX, this.textureY);
/* 2102 */     this.slideModel[127] = new ModelRendererTurbo(this, 1009, 113, this.textureX, this.textureY);
/* 2103 */     this.slideModel[''] = new ModelRendererTurbo(this, 265, 121, this.textureX, this.textureY);
/* 2104 */     this.slideModel[''] = new ModelRendererTurbo(this, 769, 121, this.textureX, this.textureY);
/* 2105 */     this.slideModel[''] = new ModelRendererTurbo(this, 89, 121, this.textureX, this.textureY);
/* 2106 */     this.slideModel[''] = new ModelRendererTurbo(this, 985, 9, this.textureX, this.textureY);
/* 2107 */     this.slideModel[''] = new ModelRendererTurbo(this, 785, 17, this.textureX, this.textureY);
/* 2108 */     this.slideModel[''] = new ModelRendererTurbo(this, 305, 25, this.textureX, this.textureY);
/* 2109 */     this.slideModel[''] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/* 2110 */     this.slideModel[''] = new ModelRendererTurbo(this, 385, 73, this.textureX, this.textureY);
/* 2111 */     this.slideModel[''] = new ModelRendererTurbo(this, 377, 81, this.textureX, this.textureY);
/* 2112 */     this.slideModel[''] = new ModelRendererTurbo(this, 337, 97, this.textureX, this.textureY);
/* 2113 */     this.slideModel[''] = new ModelRendererTurbo(this, 641, 97, this.textureX, this.textureY);
/* 2114 */     this.slideModel[''] = new ModelRendererTurbo(this, 817, 105, this.textureX, this.textureY);
/* 2115 */     this.slideModel[''] = new ModelRendererTurbo(this, 857, 105, this.textureX, this.textureY);
/* 2116 */     this.slideModel[''] = new ModelRendererTurbo(this, 793, 1, this.textureX, this.textureY);
/* 2117 */     this.slideModel[''] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/* 2118 */     this.slideModel[''] = new ModelRendererTurbo(this, 889, 9, this.textureX, this.textureY);
/* 2119 */     this.slideModel[''] = new ModelRendererTurbo(this, 1017, 9, this.textureX, this.textureY);
/* 2120 */     this.slideModel[''] = new ModelRendererTurbo(this, 961, 129, this.textureX, this.textureY);
/* 2121 */     this.slideModel[''] = new ModelRendererTurbo(this, 793, 121, this.textureX, this.textureY);
/* 2122 */     this.slideModel[''] = new ModelRendererTurbo(this, 137, 137, this.textureX, this.textureY);
/* 2123 */     this.slideModel[''] = new ModelRendererTurbo(this, 241, 73, this.textureX, this.textureY);
/* 2124 */     this.slideModel[''] = new ModelRendererTurbo(this, 617, 121, this.textureX, this.textureY);
/* 2125 */     this.slideModel[''] = new ModelRendererTurbo(this, 881, 129, this.textureX, this.textureY);
/* 2126 */     this.slideModel[''] = new ModelRendererTurbo(this, 353, 137, this.textureX, this.textureY);
/* 2127 */     this.slideModel[''] = new ModelRendererTurbo(this, 657, 137, this.textureX, this.textureY);
/* 2128 */     this.slideModel[''] = new ModelRendererTurbo(this, 377, 137, this.textureX, this.textureY);
/* 2129 */     this.slideModel[''] = new ModelRendererTurbo(this, 1009, 137, this.textureX, this.textureY);
/* 2130 */     this.slideModel[''] = new ModelRendererTurbo(this, 457, 137, this.textureX, this.textureY);
/* 2131 */     this.slideModel[''] = new ModelRendererTurbo(this, 1, 153, this.textureX, this.textureY);
/* 2132 */     this.slideModel[''] = new ModelRendererTurbo(this, 985, 137, this.textureX, this.textureY);
/* 2133 */     this.slideModel[''] = new ModelRendererTurbo(this, 201, 145, this.textureX, this.textureY);
/* 2134 */     this.slideModel[''] = new ModelRendererTurbo(this, 465, 201, this.textureX, this.textureY);
/* 2135 */     this.slideModel[' '] = new ModelRendererTurbo(this, 1, 209, this.textureX, this.textureY);
/* 2136 */     this.slideModel['¡'] = new ModelRendererTurbo(this, 137, 193, this.textureX, this.textureY);
/* 2137 */     this.slideModel['¢'] = new ModelRendererTurbo(this, 129, 41, this.textureX, this.textureY);
/* 2138 */     this.slideModel['£'] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/* 2139 */     this.slideModel['¤'] = new ModelRendererTurbo(this, 313, 73, this.textureX, this.textureY);
/* 2140 */     this.slideModel['¥'] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/* 2141 */     this.slideModel['¦'] = new ModelRendererTurbo(this, 25, 161, this.textureX, this.textureY);
/* 2142 */     this.slideModel['§'] = new ModelRendererTurbo(this, 169, 225, this.textureX, this.textureY);
/* 2143 */     this.slideModel['¨'] = new ModelRendererTurbo(this, 497, 241, this.textureX, this.textureY);
/* 2144 */     this.slideModel['©'] = new ModelRendererTurbo(this, 721, 241, this.textureX, this.textureY);
/* 2145 */     this.slideModel['ª'] = new ModelRendererTurbo(this, 417, 73, this.textureX, this.textureY);
/* 2146 */     this.slideModel['«'] = new ModelRendererTurbo(this, 89, 89, this.textureX, this.textureY);
/* 2147 */     this.slideModel['¬'] = new ModelRendererTurbo(this, 665, 89, this.textureX, this.textureY);
/* 2148 */     this.slideModel['­'] = new ModelRendererTurbo(this, 881, 89, this.textureX, this.textureY);
/* 2149 */     this.slideModel['®'] = new ModelRendererTurbo(this, 849, 169, this.textureX, this.textureY);
/* 2150 */     this.slideModel['¯'] = new ModelRendererTurbo(this, 945, 169, this.textureX, this.textureY);
/* 2151 */     this.slideModel['°'] = new ModelRendererTurbo(this, 57, 177, this.textureX, this.textureY);
/* 2152 */     this.slideModel['±'] = new ModelRendererTurbo(this, 689, 145, this.textureX, this.textureY);
/* 2153 */     this.slideModel['²'] = new ModelRendererTurbo(this, 281, 153, this.textureX, this.textureY);
/* 2154 */     this.slideModel['³'] = new ModelRendererTurbo(this, 737, 89, this.textureX, this.textureY);
/* 2155 */     this.slideModel['´'] = new ModelRendererTurbo(this, 769, 161, this.textureX, this.textureY);
/* 2156 */     this.slideModel['µ'] = new ModelRendererTurbo(this, 977, 89, this.textureX, this.textureY);
/* 2157 */     this.slideModel['¶'] = new ModelRendererTurbo(this, 793, 161, this.textureX, this.textureY);
/* 2158 */     this.slideModel['·'] = new ModelRendererTurbo(this, 185, 169, this.textureX, this.textureY);
/* 2159 */     this.slideModel['¸'] = new ModelRendererTurbo(this, 625, 169, this.textureX, this.textureY);
/* 2160 */     this.slideModel['¹'] = new ModelRendererTurbo(this, 889, 169, this.textureX, this.textureY);
/*      */     
/* 2162 */     this.slideModel[0].addShapeBox(20.0F, -18.0F, -5.0F, 65, 9, 15, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 3.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 3.25F, -0.25F, 0.0F);
/* 2163 */     this.slideModel[0].setRotationPoint(-7.0F, -36.0F, -3.0F);
/*      */     
/* 2165 */     this.slideModel[1].addShapeBox(20.0F, -18.0F, -5.0F, 46, 1, 5, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 2.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 2.0F, 0.0F, 0.75F);
/* 2166 */     this.slideModel[1].setRotationPoint(12.0F, -39.0F, 5.0F);
/*      */     
/* 2168 */     this.slideModel[2].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2169 */     this.slideModel[2].setRotationPoint(-12.0F, -36.0F, -3.0F);
/*      */     
/* 2171 */     this.slideModel[3].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2172 */     this.slideModel[3].setRotationPoint(-13.25F, -36.0F, -3.0F);
/*      */     
/* 2174 */     this.slideModel[4].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2175 */     this.slideModel[4].setRotationPoint(-14.5F, -36.0F, -3.0F);
/*      */     
/* 2177 */     this.slideModel[5].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2178 */     this.slideModel[5].setRotationPoint(-15.75F, -36.0F, -3.0F);
/*      */     
/* 2180 */     this.slideModel[6].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2181 */     this.slideModel[6].setRotationPoint(-17.0F, -36.0F, -3.0F);
/*      */     
/* 2183 */     this.slideModel[7].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2184 */     this.slideModel[7].setRotationPoint(-18.25F, -36.0F, -3.0F);
/*      */     
/* 2186 */     this.slideModel[8].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2187 */     this.slideModel[8].setRotationPoint(-19.5F, -36.0F, -3.0F);
/*      */     
/* 2189 */     this.slideModel[9].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2190 */     this.slideModel[9].setRotationPoint(-20.75F, -36.0F, -3.0F);
/*      */     
/* 2192 */     this.slideModel[10].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2193 */     this.slideModel[10].setRotationPoint(-22.0F, -36.0F, -3.0F);
/*      */     
/* 2195 */     this.slideModel[11].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2196 */     this.slideModel[11].setRotationPoint(-23.25F, -36.0F, -3.0F);
/*      */     
/* 2198 */     this.slideModel[12].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2199 */     this.slideModel[12].setRotationPoint(-24.5F, -36.0F, -3.0F);
/*      */     
/* 2201 */     this.slideModel[13].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2202 */     this.slideModel[13].setRotationPoint(-25.75F, -36.0F, -3.0F);
/*      */     
/* 2204 */     this.slideModel[14].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2205 */     this.slideModel[14].setRotationPoint(-27.0F, -36.0F, -3.0F);
/*      */     
/* 2207 */     this.slideModel[15].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2208 */     this.slideModel[15].setRotationPoint(-28.25F, -36.0F, -3.0F);
/*      */     
/* 2210 */     this.slideModel[16].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2211 */     this.slideModel[16].setRotationPoint(-29.5F, -36.0F, -3.0F);
/*      */     
/* 2213 */     this.slideModel[17].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2214 */     this.slideModel[17].setRotationPoint(-30.75F, -36.0F, -3.0F);
/*      */     
/* 2216 */     this.slideModel[18].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2217 */     this.slideModel[18].setRotationPoint(-32.0F, -36.0F, -3.0F);
/*      */     
/* 2219 */     this.slideModel[19].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2220 */     this.slideModel[19].setRotationPoint(-33.25F, -36.0F, -3.0F);
/*      */     
/* 2222 */     this.slideModel[20].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2223 */     this.slideModel[20].setRotationPoint(-34.5F, -36.0F, -3.0F);
/*      */     
/* 2225 */     this.slideModel[21].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2226 */     this.slideModel[21].setRotationPoint(-35.75F, -36.0F, -3.0F);
/*      */     
/* 2228 */     this.slideModel[22].addShapeBox(20.0F, -18.0F, -5.0F, 1, 9, 15, 0.0F, -1.0F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F);
/* 2229 */     this.slideModel[22].setRotationPoint(-37.25F, -36.0F, -3.0F);
/*      */     
/* 2231 */     this.slideModel[23].addShapeBox(20.0F, -18.0F, -5.0F, 26, 9, 13, 0.0F, -3.5F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, 3.25F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2232 */     this.slideModel[23].setRotationPoint(-36.5F, -36.0F, -2.0F);
/*      */     
/* 2234 */     this.slideModel[24].addShapeBox(20.0F, -18.0F, -5.0F, 11, 4, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2235 */     this.slideModel[24].setRotationPoint(60.0F, -27.0F, 0.0F);
/*      */     
/* 2237 */     this.slideModel[25].addShapeBox(20.0F, -18.0F, -5.0F, 11, 2, 9, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 2238 */     this.slideModel[25].setRotationPoint(60.0F, -22.0F, 0.0F);
/*      */     
/* 2240 */     this.slideModel[26].addShapeBox(20.0F, -18.0F, -5.0F, 11, 1, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
/* 2241 */     this.slideModel[26].setRotationPoint(60.0F, -20.0F, 2.0F);
/*      */     
/* 2243 */     this.slideModel[27].addShapeBox(20.0F, -18.0F, -5.0F, 11, 4, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 2244 */     this.slideModel[27].setRotationPoint(60.0F, -27.0F, 6.0F);
/*      */     
/* 2246 */     this.slideModel[28].addShapeBox(20.0F, -18.0F, -5.0F, 11, 1, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2247 */     this.slideModel[28].setRotationPoint(60.0F, -27.0F, 3.0F);
/*      */     
/* 2249 */     this.slideModel[29].addShapeBox(20.0F, -18.0F, -5.0F, 11, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2250 */     this.slideModel[29].setRotationPoint(60.0F, -23.0F, 3.0F);
/*      */     
/* 2252 */     this.slideModel[30].addShapeBox(20.0F, -18.0F, -5.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2253 */     this.slideModel[30].setRotationPoint(60.0F, -26.0F, 5.0F);
/*      */     
/* 2255 */     this.slideModel[31].addShapeBox(20.0F, -18.0F, -5.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2256 */     this.slideModel[31].setRotationPoint(60.0F, -26.0F, 3.0F);
/*      */     
/* 2258 */     this.slideModel[32].addShapeBox(20.0F, -18.0F, -5.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2259 */     this.slideModel[32].setRotationPoint(60.0F, -24.0F, 5.0F);
/*      */     
/* 2261 */     this.slideModel[33].addShapeBox(20.0F, -18.0F, -5.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2262 */     this.slideModel[33].setRotationPoint(60.0F, -24.0F, 3.0F);
/*      */     
/* 2264 */     this.slideModel[34].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 13, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2265 */     this.slideModel[34].setRotationPoint(-6.0F, -40.0F, -2.0F);
/*      */     
/* 2267 */     this.slideModel[35].addShapeBox(20.0F, -18.0F, -5.0F, 40, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2268 */     this.slideModel[35].setRotationPoint(-46.0F, -40.0F, 8.0F);
/*      */     
/* 2270 */     this.slideModel[36].addShapeBox(20.0F, -18.0F, -5.0F, 41, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2271 */     this.slideModel[36].setRotationPoint(-46.0F, -41.0F, 7.0F);
/*      */     
/* 2273 */     this.slideModel[37].addShapeBox(20.0F, -18.0F, -5.0F, 41, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2274 */     this.slideModel[37].setRotationPoint(-46.0F, -42.0F, 6.0F);
/*      */     
/* 2276 */     this.slideModel[38].addShapeBox(20.0F, -18.0F, -5.0F, 41, 1, 7, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 2277 */     this.slideModel[38].setRotationPoint(-46.0F, -43.0F, 1.0F);
/*      */     
/* 2279 */     this.slideModel[39].addShapeBox(20.0F, -18.0F, -5.0F, 41, 1, 4, 0.0F, 0.0F, 0.0F, -1.25F, -0.5F, 0.0F, -1.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2280 */     this.slideModel[39].setRotationPoint(-46.0F, -42.0F, -1.0F);
/*      */     
/* 2282 */     this.slideModel[40].addShapeBox(20.0F, -18.0F, -5.0F, 41, 1, 4, 0.0F, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2283 */     this.slideModel[40].setRotationPoint(-46.0F, -41.0F, -2.0F);
/*      */     
/* 2285 */     this.slideModel[41].addShapeBox(20.0F, -18.0F, -5.0F, 40, 1, 3, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2286 */     this.slideModel[41].setRotationPoint(-46.0F, -40.0F, -2.0F);
/*      */     
/* 2288 */     this.slideModel[42].addShapeBox(20.0F, -18.0F, -5.0F, 41, 1, 7, 0.0F, 0.0F, -0.25F, -2.25F, -0.5F, -0.25F, -2.25F, -0.5F, -0.25F, -2.25F, 0.0F, -0.25F, -2.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2289 */     this.slideModel[42].setRotationPoint(-46.0F, -44.0F, 1.0F);
/*      */     
/* 2291 */     this.slideModel[43].addShapeBox(20.0F, -18.0F, -5.0F, 94, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2292 */     this.slideModel[43].setRotationPoint(-36.0F, -37.0F, 9.0F);
/*      */     
/* 2294 */     this.slideModel[44].addShapeBox(20.0F, -18.0F, -5.0F, 109, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2295 */     this.slideModel[44].setRotationPoint(-51.25F, -37.0F, -3.0F);
/*      */     
/* 2297 */     this.slideModel[45].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F);
/* 2298 */     this.slideModel[45].setRotationPoint(-36.0F, -39.0F, 9.0F);
/*      */     
/* 2300 */     this.slideModel[46].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 2, 0.0F, 0.75F, 0.0F, -0.75F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F, 0.25F, 0.5F, 1.0F, 0.25F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F);
/* 2301 */     this.slideModel[46].setRotationPoint(-50.25F, -38.0F, -2.0F);
/*      */     
/* 2303 */     this.slideModel[47].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, -1.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 2304 */     this.slideModel[47].setRotationPoint(-50.25F, -39.0F, -1.0F);
/*      */     
/* 2306 */     this.slideModel[48].addShapeBox(20.0F, -18.0F, -5.0F, 93, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F);
/* 2307 */     this.slideModel[48].setRotationPoint(-35.0F, -38.0F, 9.0F);
/*      */     
/* 2309 */     this.slideModel[49].addShapeBox(20.0F, -18.0F, -5.0F, 93, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F);
/* 2310 */     this.slideModel[49].setRotationPoint(-35.0F, -39.0F, 9.0F);
/*      */     
/* 2312 */     this.slideModel[50].addShapeBox(20.0F, -18.0F, -5.0F, 2, 9, 2, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2313 */     this.slideModel[50].setRotationPoint(-38.25F, -36.0F, 10.0F);
/*      */     
/* 2315 */     this.slideModel[51].addShapeBox(20.0F, -18.0F, -5.0F, 2, 4, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2316 */     this.slideModel[51].setRotationPoint(-40.25F, -31.0F, 10.0F);
/*      */     
/* 2318 */     this.slideModel[52].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 2, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2319 */     this.slideModel[52].setRotationPoint(-45.25F, -29.0F, 10.0F);
/*      */     
/* 2321 */     this.slideModel[53].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2322 */     this.slideModel[53].setRotationPoint(-42.25F, -29.0F, 10.0F);
/*      */     
/* 2324 */     this.slideModel[54].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2325 */     this.slideModel[54].setRotationPoint(-43.25F, -29.0F, 10.0F);
/*      */     
/* 2327 */     this.slideModel[55].addShapeBox(20.0F, -18.0F, -5.0F, 3, 4, 2, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2328 */     this.slideModel[55].setRotationPoint(-48.25F, -31.0F, 10.0F);
/*      */     
/* 2330 */     this.slideModel[56].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 2, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2331 */     this.slideModel[56].setRotationPoint(-51.25F, -34.0F, 10.0F);
/*      */     
/* 2333 */     this.slideModel[57].addShapeBox(20.0F, -18.0F, -5.0F, 6, 12, 12, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F);
/* 2334 */     this.slideModel[57].setRotationPoint(65.0F, -39.0F, -1.5F);
/*      */     
/* 2336 */     this.slideModel[58].addShapeBox(20.0F, -18.0F, -5.0F, 4, 7, 15, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, -1.5F, 0.0F, 2.5F, -1.5F, 0.0F, 2.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, 0.0F);
/* 2337 */     this.slideModel[58].setRotationPoint(58.0F, -34.0F, -3.0F);
/*      */     
/* 2339 */     this.slideModel[59].addShapeBox(20.0F, -18.0F, -5.0F, 12, 2, 11, 0.0F, -1.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -1.5F, 0.0F, -3.0F, -0.75F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, -0.75F, 0.0F, -1.25F);
/* 2340 */     this.slideModel[59].setRotationPoint(59.0F, -44.0F, -1.0F);
/*      */     
/* 2342 */     this.slideModel[60].addShapeBox(20.0F, -18.0F, -5.0F, 3, 2, 13, 0.0F, -1.5F, -0.5F, -2.25F, 2.75F, -0.5F, -2.25F, 2.75F, -0.5F, -2.25F, -1.5F, -0.5F, -2.25F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 2343 */     this.slideModel[60].setRotationPoint(58.25F, -42.5F, -2.0F);
/*      */     
/* 2345 */     this.slideModel[61].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 13, 0.0F, -1.5F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, 1.25F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2346 */     this.slideModel[61].setRotationPoint(56.75F, -40.5F, -2.0F);
/*      */     
/* 2348 */     this.slideModel[62].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 13, 0.0F, -1.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/* 2349 */     this.slideModel[62].setRotationPoint(55.25F, -39.5F, -2.0F);
/*      */     
/* 2351 */     this.slideModel[63].addShapeBox(20.0F, -18.0F, -5.0F, 4, 3, 15, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, 0.0F);
/* 2352 */     this.slideModel[63].setRotationPoint(58.0F, -39.0F, -3.0F);
/*      */     
/* 2354 */     this.slideModel[64].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 12, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 2.5F, -0.5F, 0.0F, 2.5F, -0.5F, 0.0F, 2.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F);
/* 2355 */     this.slideModel[64].setRotationPoint(62.0F, -34.0F, -1.5F);
/*      */     
/* 2357 */     this.slideModel[65].addShapeBox(20.0F, -18.0F, -5.0F, 3, 3, 13, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -0.5F);
/* 2358 */     this.slideModel[65].setRotationPoint(62.0F, -39.0F, -2.0F);
/*      */     
/* 2360 */     this.slideModel[66].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 15, 0.0F, -0.75F, 0.0F, -1.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, -0.75F, 0.0F, -1.5F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.25F);
/* 2361 */     this.slideModel[66].setRotationPoint(58.0F, -39.5F, -3.0F);
/*      */     
/* 2363 */     this.slideModel[67].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 15, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.25F, 0.0F, -1.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 1.25F, 0.0F, -1.5F);
/* 2364 */     this.slideModel[67].setRotationPoint(60.0F, -40.5F, -3.0F);
/*      */     
/* 2366 */     this.slideModel[68].addShapeBox(20.0F, -18.0F, -5.0F, 6, 1, 11, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 2367 */     this.slideModel[68].setRotationPoint(65.0F, -39.5F, -1.0F);
/*      */     
/* 2369 */     this.slideModel[69].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 13, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.0F, -1.4F, 0.0F, -1.0F, -1.4F, 0.0F, -1.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 2370 */     this.slideModel[69].setRotationPoint(61.0F, -42.0F, -2.0F);
/*      */     
/* 2372 */     this.slideModel[70].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F);
/* 2373 */     this.slideModel[70].setRotationPoint(62.0F, -39.5F, -1.0F);
/*      */     
/* 2375 */     this.slideModel[71].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 15, 0.0F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -1.75F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 1.0F, 0.0F, -1.75F);
/* 2376 */     this.slideModel[71].setRotationPoint(63.0F, -40.5F, -3.0F);
/*      */     
/* 2378 */     this.slideModel[72].addShapeBox(20.0F, -18.0F, -5.0F, 5, 1, 15, 0.0F, 1.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 1.0F, 0.0F, -2.5F, 1.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, -2.25F, 1.0F, 0.0F, -2.25F);
/* 2379 */     this.slideModel[72].setRotationPoint(66.0F, -40.5F, -3.0F);
/*      */     
/* 2381 */     this.slideModel[73].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 15, 0.0F, 1.0F, -0.5F, -2.4F, 0.0F, 0.5F, -3.25F, 0.0F, 0.5F, -3.25F, 1.0F, -0.5F, -2.4F, 1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.35F, 0.0F, 0.0F, -2.35F, 1.0F, 0.0F, -2.0F);
/* 2382 */     this.slideModel[73].setRotationPoint(63.0F, -41.5F, -3.0F);
/*      */     
/* 2384 */     this.slideModel[74].addShapeBox(20.0F, -18.0F, -5.0F, 7, 1, 15, 0.0F, 0.0F, 0.5F, -3.25F, 0.0F, 0.5F, -3.25F, 0.0F, 0.5F, -3.25F, 0.0F, 0.5F, -3.25F, 0.0F, 0.0F, -2.35F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.35F);
/* 2385 */     this.slideModel[74].setRotationPoint(64.0F, -41.5F, -3.0F);
/*      */     
/* 2387 */     this.slideModel[75].addShapeBox(20.0F, -18.0F, -5.0F, 7, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2388 */     this.slideModel[75].setRotationPoint(62.0F, -45.0F, 3.5F);
/*      */     
/* 2390 */     this.slideModel[76].addShapeBox(20.0F, -18.0F, -5.0F, 7, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2391 */     this.slideModel[76].setRotationPoint(62.0F, -46.0F, 3.5F);
/*      */     
/* 2393 */     this.slideModel[77].addShapeBox(20.0F, -18.0F, -5.0F, 7, 1, 2, 0.0F, -2.0F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, -4.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 2394 */     this.slideModel[77].setRotationPoint(62.0F, -47.0F, 3.5F);
/*      */     
/* 2396 */     this.slideModel[78].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2397 */     this.slideModel[78].setRotationPoint(62.5F, -46.25F, 4.0F);
/*      */     
/* 2399 */     this.slideModel[79].addShapeBox(20.0F, -18.0F, -5.0F, 13, 11, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2400 */     this.slideModel[79].setRotationPoint(-49.0F, -39.0F, 8.0F);
/*      */     
/* 2402 */     this.slideModel[80].addShapeBox(20.0F, -18.0F, -5.0F, 13, 11, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2403 */     this.slideModel[80].setRotationPoint(-49.0F, -39.0F, -1.75F);
/*      */     
/* 2405 */     this.slideModel[81].addShapeBox(20.0F, -18.0F, -5.0F, 5, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2406 */     this.slideModel[81].setRotationPoint(-47.5F, -41.0F, 9.25F);
/*      */     
/* 2408 */     this.slideModel[82].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2409 */     this.slideModel[82].setRotationPoint(-43.5F, -41.0F, 9.25F);
/*      */     
/* 2411 */     this.slideModel[83].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2412 */     this.slideModel[83].setRotationPoint(-42.5F, -40.0F, 9.25F);
/*      */     
/* 2414 */     this.slideModel[84].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 3, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2415 */     this.slideModel[84].setRotationPoint(-48.5F, -41.0F, 9.25F);
/*      */     
/* 2417 */     this.slideModel[85].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2418 */     this.slideModel[85].setRotationPoint(-49.5F, -40.0F, 9.25F);
/*      */     
/* 2420 */     this.slideModel[86].addShapeBox(20.0F, -18.0F, -5.0F, 9, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2421 */     this.slideModel[86].setRotationPoint(-49.5F, -39.0F, 9.25F);
/*      */     
/* 2423 */     this.slideModel[87].addShapeBox(20.0F, -18.0F, -5.0F, 5, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2424 */     this.slideModel[87].setRotationPoint(-47.5F, -35.0F, 9.25F);
/*      */     
/* 2426 */     this.slideModel[88].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2427 */     this.slideModel[88].setRotationPoint(-43.5F, -35.0F, 9.25F);
/*      */     
/* 2429 */     this.slideModel[89].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 2430 */     this.slideModel[89].setRotationPoint(-42.5F, -35.0F, 9.25F);
/*      */     
/* 2432 */     this.slideModel[90].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 2433 */     this.slideModel[90].setRotationPoint(-48.5F, -35.0F, 9.25F);
/*      */     
/* 2435 */     this.slideModel[91].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, -1.0F, -0.25F);
/* 2436 */     this.slideModel[91].setRotationPoint(-49.5F, -35.0F, 9.25F);
/*      */     
/* 2438 */     this.slideModel[92].addShapeBox(20.0F, -18.0F, -5.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2439 */     this.slideModel[92].setRotationPoint(-44.5F, -37.5F, 11.25F);
/*      */     
/* 2441 */     this.slideModel[93].addShapeBox(20.0F, -18.0F, -5.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2442 */     this.slideModel[93].setRotationPoint(-44.5F, -38.5F, 11.25F);
/*      */     
/* 2444 */     this.slideModel[94].addShapeBox(20.0F, -18.0F, -5.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2445 */     this.slideModel[94].setRotationPoint(-44.5F, -35.5F, 11.25F);
/*      */     
/* 2447 */     this.slideModel[95].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2448 */     this.slideModel[95].setRotationPoint(-38.5F, -37.5F, 11.25F);
/*      */     
/* 2450 */     this.slideModel[96].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, -1.25F, 0.0F, 0.0F, -0.75F);
/* 2451 */     this.slideModel[96].setRotationPoint(-37.5F, -35.5F, 11.25F);
/*      */     
/* 2453 */     this.slideModel[97].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2454 */     this.slideModel[97].setRotationPoint(-38.5F, -35.5F, 11.25F);
/*      */     
/* 2456 */     this.slideModel[98].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, -1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F);
/* 2457 */     this.slideModel[98].setRotationPoint(-37.5F, -38.5F, 11.25F);
/*      */     
/* 2459 */     this.slideModel[99].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2460 */     this.slideModel[99].setRotationPoint(-38.5F, -38.5F, 11.25F);
/*      */     
/* 2462 */     this.slideModel[100].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.25F);
/* 2463 */     this.slideModel[100].setRotationPoint(-37.5F, -37.5F, 11.25F);
/*      */     
/* 2465 */     this.slideModel[101].addShapeBox(20.0F, -18.0F, -5.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F);
/* 2466 */     this.slideModel[101].setRotationPoint(-47.5F, -37.5F, 11.25F);
/*      */     
/* 2468 */     this.slideModel[102].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -3.0F, 0.0F, -0.75F);
/* 2469 */     this.slideModel[102].setRotationPoint(-47.5F, -35.5F, 11.25F);
/*      */     
/* 2471 */     this.slideModel[103].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 2, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -3.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F);
/* 2472 */     this.slideModel[103].setRotationPoint(-47.5F, -38.5F, 11.25F);
/*      */     
/* 2474 */     this.slideModel[104].addShapeBox(20.0F, -18.0F, -5.0F, 5, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2475 */     this.slideModel[104].setRotationPoint(-47.5F, -41.0F, -3.25F);
/*      */     
/* 2477 */     this.slideModel[105].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2478 */     this.slideModel[105].setRotationPoint(-43.5F, -41.0F, -3.25F);
/*      */     
/* 2480 */     this.slideModel[106].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 4, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2481 */     this.slideModel[106].setRotationPoint(-42.5F, -40.0F, -3.25F);
/*      */     
/* 2483 */     this.slideModel[107].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 4, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2484 */     this.slideModel[107].setRotationPoint(-48.5F, -41.0F, -3.25F);
/*      */     
/* 2486 */     this.slideModel[108].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2487 */     this.slideModel[108].setRotationPoint(-49.5F, -40.0F, -3.25F);
/*      */     
/* 2489 */     this.slideModel[109].addShapeBox(20.0F, -18.0F, -5.0F, 9, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2490 */     this.slideModel[109].setRotationPoint(-49.5F, -39.0F, -3.25F);
/*      */     
/* 2492 */     this.slideModel[110].addShapeBox(20.0F, -18.0F, -5.0F, 5, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2493 */     this.slideModel[110].setRotationPoint(-47.5F, -35.0F, -3.25F);
/*      */     
/* 2495 */     this.slideModel[111].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2496 */     this.slideModel[111].setRotationPoint(-43.5F, -35.0F, -3.25F);
/*      */     
/* 2498 */     this.slideModel[112].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.25F, -0.25F);
/* 2499 */     this.slideModel[112].setRotationPoint(-42.5F, -35.0F, -3.25F);
/*      */     
/* 2501 */     this.slideModel[113].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 2502 */     this.slideModel[113].setRotationPoint(-48.5F, -35.0F, -3.25F);
/*      */     
/* 2504 */     this.slideModel[114].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, -1.0F, -0.25F);
/* 2505 */     this.slideModel[114].setRotationPoint(-49.5F, -35.0F, -3.25F);
/*      */     
/* 2507 */     this.slideModel[115].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 7, 0.0F, 0.0F, -1.25F, -2.25F, 0.0F, -0.25F, -2.25F, 0.0F, -0.25F, -2.25F, 0.0F, -1.25F, -2.25F, 0.0F, 1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -0.25F);
/* 2508 */     this.slideModel[115].setRotationPoint(-49.0F, -44.0F, 1.0F);
/*      */     
/* 2510 */     this.slideModel[116].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 7, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 1.0F, 1.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 1.0F, 1.25F);
/* 2511 */     this.slideModel[116].setRotationPoint(-49.0F, -43.0F, 1.0F);
/*      */     
/* 2513 */     this.slideModel[117].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 10, 0.0F, -3.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.25F, -3.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2514 */     this.slideModel[117].setRotationPoint(-49.0F, -42.0F, 0.0F);
/*      */     
/* 2516 */     this.slideModel[118].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F);
/* 2517 */     this.slideModel[118].setRotationPoint(-49.0F, -40.0F, 8.0F);
/*      */     
/* 2519 */     this.slideModel[119].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2520 */     this.slideModel[119].setRotationPoint(-49.0F, -41.0F, 7.0F);
/*      */     
/* 2522 */     this.slideModel[120].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, -1.75F, -0.5F, 0.0F, -1.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2523 */     this.slideModel[120].setRotationPoint(-49.0F, -41.0F, -2.0F);
/*      */     
/* 2525 */     this.slideModel[121].addShapeBox(20.0F, -18.0F, -5.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2526 */     this.slideModel[121].setRotationPoint(-49.0F, -40.0F, -2.0F);
/*      */     
/* 2528 */     this.slideModel[122].addShapeBox(20.0F, -18.0F, -5.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.75F);
/* 2529 */     this.slideModel[122].setRotationPoint(-44.5F, -45.0F, 1.0F);
/*      */     
/* 2531 */     this.slideModel[123].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F);
/* 2532 */     this.slideModel[123].setRotationPoint(-44.0F, -46.0F, 1.0F);
/*      */     
/* 2534 */     this.slideModel[124].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 2, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2535 */     this.slideModel[124].setRotationPoint(-44.0F, -47.0F, 1.0F);
/*      */     
/* 2537 */     this.slideModel[125].addShapeBox(20.0F, -18.0F, -5.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F);
/* 2538 */     this.slideModel[125].setRotationPoint(-44.5F, -45.0F, 6.5F);
/*      */     
/* 2540 */     this.slideModel[126].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F);
/* 2541 */     this.slideModel[126].setRotationPoint(-44.0F, -46.0F, 6.5F);
/*      */     
/* 2543 */     this.slideModel[127].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 2, 0.0F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.25F, -1.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 2544 */     this.slideModel[127].setRotationPoint(-44.0F, -47.0F, 6.5F);
/*      */     
/* 2546 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 2547 */     this.slideModel[''].setRotationPoint(-45.0F, -43.5F, 6.5F);
/*      */     
/* 2549 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 5, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F);
/* 2550 */     this.slideModel[''].setRotationPoint(-45.0F, -43.5F, 1.0F);
/*      */     
/* 2552 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 5, 1, 5, 0.0F, 0.3F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.25F, 0.3F, 0.0F, -0.25F, 0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F);
/* 2553 */     this.slideModel[''].setRotationPoint(-44.5F, -44.0F, 2.25F);
/*      */     
/* 2555 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 5, 1, 1, 0.0F, 0.0F, -0.5F, -0.25F, -0.6F, -0.5F, -0.25F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F);
/* 2556 */     this.slideModel[''].setRotationPoint(-44.5F, -45.0F, 5.5F);
/*      */     
/* 2558 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, 0.3F, 0.0F, -0.25F);
/* 2559 */     this.slideModel[''].setRotationPoint(-44.5F, -45.0F, 2.75F);
/*      */     
/* 2561 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.3F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.3F, 0.0F, -0.25F);
/* 2562 */     this.slideModel[''].setRotationPoint(-44.5F, -45.0F, 2.0F);
/*      */     
/* 2564 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, -0.6F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.3F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.3F, 0.0F, -0.25F);
/* 2565 */     this.slideModel[''].setRotationPoint(-44.5F, -45.0F, 6.25F);
/*      */     
/* 2567 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 5, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F);
/* 2568 */     this.slideModel[''].setRotationPoint(-44.5F, -45.0F, 4.75F);
/*      */     
/* 2570 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 5, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F);
/* 2571 */     this.slideModel[''].setRotationPoint(-44.5F, -45.0F, 3.5F);
/*      */     
/* 2573 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 5, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.3F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, 0.3F, 0.0F, -0.75F);
/* 2574 */     this.slideModel[''].setRotationPoint(-44.5F, -45.0F, 4.5F);
/*      */     
/* 2576 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 2, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 2577 */     this.slideModel[''].setRotationPoint(-43.25F, -46.0F, 2.0F);
/*      */     
/* 2579 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 2, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 2580 */     this.slideModel[''].setRotationPoint(-43.25F, -46.0F, 5.75F);
/*      */     
/* 2582 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 3, 0.0F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F);
/* 2583 */     this.slideModel[''].setRotationPoint(-43.25F, -45.0F, 3.25F);
/*      */     
/* 2585 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2586 */     this.slideModel[''].setRotationPoint(-43.15F, -46.25F, 2.5F);
/*      */     
/* 2588 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 2589 */     this.slideModel[''].setRotationPoint(-43.15F, -46.25F, 5.75F);
/*      */     
/* 2591 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F);
/* 2592 */     this.slideModel[''].setRotationPoint(-43.25F, -46.0F, 5.0F);
/*      */     
/* 2594 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F);
/* 2595 */     this.slideModel[''].setRotationPoint(-43.25F, -46.0F, 3.25F);
/*      */     
/* 2597 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 5, 0.0F, -3.0F, 0.0F, -4.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.25F, -4.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2598 */     this.slideModel[''].setRotationPoint(-59.25F, -34.0F, -3.0F);
/*      */     
/* 2600 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 3, 4, 3, 0.0F, -3.25F, 0.0F, -2.0F, 2.25F, 0.0F, 0.25F, 2.25F, 0.0F, 0.0F, -3.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.75F, 0.0F, 2.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2601 */     this.slideModel[''].setRotationPoint(-56.25F, -38.0F, -1.0F);
/*      */     
/* 2603 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 7, 0.0F, 0.0F, -2.25F, -2.25F, 0.0F, -0.25F, -2.25F, 0.0F, -0.25F, -2.25F, 0.0F, -2.25F, -2.25F, 0.0F, 2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 2.0F, -0.25F);
/* 2604 */     this.slideModel[''].setRotationPoint(-51.0F, -43.0F, 1.0F);
/*      */     
/* 2606 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 1, 0.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.25F, 0.0F, -2.0F, -1.25F, 0.0F, 2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 2.0F, 0.25F);
/* 2607 */     this.slideModel[''].setRotationPoint(-51.0F, -42.0F, 8.0F);
/*      */     
/* 2609 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 4, 0.0F, 0.0F, -2.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/* 2610 */     this.slideModel[''].setRotationPoint(-51.0F, -41.0F, -2.0F);
/*      */     
/* 2612 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 4, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, -2.0F, -1.75F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 2.0F, -0.75F);
/* 2613 */     this.slideModel[''].setRotationPoint(-51.0F, -41.0F, 7.0F);
/*      */     
/* 2615 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 4, 0.0F, 0.0F, -2.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2616 */     this.slideModel[''].setRotationPoint(-51.0F, -40.0F, -3.0F);
/*      */     
/* 2618 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 9, 3, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2619 */     this.slideModel[''].setRotationPoint(-51.0F, -38.0F, -2.0F);
/*      */     
/* 2621 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 4, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, -2.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.75F);
/* 2622 */     this.slideModel[''].setRotationPoint(-51.0F, -40.0F, 8.0F);
/*      */     
/* 2624 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.75F);
/* 2625 */     this.slideModel[''].setRotationPoint(-51.0F, -38.0F, 8.0F);
/*      */     
/* 2627 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 3, 4, 3, 0.0F, -3.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.25F, -3.25F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F);
/* 2628 */     this.slideModel[''].setRotationPoint(-56.25F, -38.0F, 7.0F);
/*      */     
/* 2630 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 5, 0.0F, -3.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -3.0F, 0.0F, -4.0F, 0.0F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.25F, -4.0F);
/* 2631 */     this.slideModel[''].setRotationPoint(-59.25F, -34.0F, 7.0F);
/*      */     
/* 2633 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 4, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2634 */     this.slideModel[''].setRotationPoint(-53.0F, -39.0F, -2.0F);
/*      */     
/* 2636 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 4, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -3.0F);
/* 2637 */     this.slideModel[''].setRotationPoint(-53.0F, -39.0F, 7.0F);
/*      */     
/* 2639 */     this.slideModel[''].addShapeBox(20.0F, -18.0F, -5.0F, 3, 7, 15, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 2.75F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 2.75F, -0.25F, 0.0F);
/* 2640 */     this.slideModel[''].setRotationPoint(-54.25F, -34.0F, -3.0F);
/*      */     
/* 2642 */     this.slideModel[' '].addShapeBox(20.0F, -18.0F, -5.0F, 3, 3, 15, 0.0F, -2.13F, 0.0F, -1.13F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.13F, 0.0F, -1.13F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 2643 */     this.slideModel[' '].setRotationPoint(-54.25F, -36.5F, -3.0F);
/*      */     
/* 2645 */     this.slideModel['¡'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 2, 11, 0.0F, -1.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, -1.25F, 0.0F, -0.75F, -0.13F, -0.5F, -0.13F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, -0.13F, -0.5F, -0.13F);
/* 2646 */     this.slideModel['¡'].setRotationPoint(-52.25F, -38.0F, 0.0F);
/*      */     
/* 2648 */     this.slideModel['¢'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 3, 2, 0.0F, 0.0F, -2.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -2.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2649 */     this.slideModel['¢'].setRotationPoint(-52.0F, -38.0F, 9.0F);
/*      */     
/* 2651 */     this.slideModel['£'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 1, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
/* 2652 */     this.slideModel['£'].setRotationPoint(-51.0F, -42.0F, 1.0F);
/*      */     
/* 2654 */     this.slideModel['¤'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 1, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 1.0F, 0.0F, -3.0F, 1.0F, 0.0F, 2.0F, -1.0F, 0.0F, 1.0F, 0.25F, 0.0F, 1.0F, 1.0F, 0.0F, 2.0F, 1.0F);
/* 2655 */     this.slideModel['¤'].setRotationPoint(-53.0F, -41.0F, 0.0F);
/*      */     
/* 2657 */     this.slideModel['¥'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 1, 0.0F, 0.0F, -3.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, -1.0F, -1.25F, 0.0F, -3.0F, -1.0F, 0.0F, 2.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.25F, 0.0F, 2.0F, -1.0F);
/* 2658 */     this.slideModel['¥'].setRotationPoint(-53.0F, -41.0F, 8.0F);
/*      */     
/* 2660 */     this.slideModel['¦'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 3, 5, 0.0F, -1.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -0.13F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.13F, -0.5F, 0.0F);
/* 2661 */     this.slideModel['¦'].setRotationPoint(-51.5F, -40.0F, 2.0F);
/*      */     
/* 2663 */     this.slideModel['§'].addShapeBox(20.0F, -18.0F, -5.0F, 15, 7, 2, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 2664 */     this.slideModel['§'].setRotationPoint(-51.25F, -34.0F, -3.0F);
/*      */     
/* 2666 */     this.slideModel['¨'].addShapeBox(20.0F, -18.0F, -5.0F, 106, 1, 2, 0.0F, 0.75F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F, 0.25F, 0.5F, 1.0F, 0.25F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F);
/* 2667 */     this.slideModel['¨'].setRotationPoint(-48.25F, -38.0F, -2.0F);
/*      */     
/* 2669 */     this.slideModel['©'].addShapeBox(20.0F, -18.0F, -5.0F, 106, 1, 1, 0.0F, -0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 1.25F, 0.25F, 0.0F, 1.25F, 0.25F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F);
/* 2670 */     this.slideModel['©'].setRotationPoint(-48.25F, -39.0F, -1.0F);
/*      */     
/* 2672 */     this.slideModel['ª'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 2, 0.0F, -0.25F, 0.0F, -0.8F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.85F, 0.5F, -0.1F, -1.0F, 0.5F, 1.0F, -1.0F, 0.5F, 0.0F, 0.85F, 0.5F, 0.0F);
/* 2673 */     this.slideModel['ª'].setRotationPoint(-51.25F, -38.0F, -2.0F);
/*      */     
/* 2675 */     this.slideModel['«'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2676 */     this.slideModel['«'].setRotationPoint(-44.0F, -31.0F, 10.0F);
/*      */     
/* 2678 */     this.slideModel['¬'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 2679 */     this.slideModel['¬'].setRotationPoint(-44.0F, -30.5F, 10.0F);
/*      */     
/* 2681 */     this.slideModel['­'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 1, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2682 */     this.slideModel['­'].setRotationPoint(-44.0F, -31.5F, 10.0F);
/*      */     
/* 2684 */     this.slideModel['®'].addShapeBox(20.0F, -18.0F, -5.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2685 */     this.slideModel['®'].setRotationPoint(-44.5F, -36.5F, -4.5F);
/*      */     
/* 2687 */     this.slideModel['¯'].addShapeBox(20.0F, -18.0F, -5.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2688 */     this.slideModel['¯'].setRotationPoint(-44.5F, -37.5F, -4.5F);
/*      */     
/* 2690 */     this.slideModel['°'].addShapeBox(20.0F, -18.0F, -5.0F, 7, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2691 */     this.slideModel['°'].setRotationPoint(-44.5F, -34.5F, -4.5F);
/*      */     
/* 2693 */     this.slideModel['±'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2694 */     this.slideModel['±'].setRotationPoint(-38.5F, -36.5F, -4.5F);
/*      */     
/* 2696 */     this.slideModel['²'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -1.0F, -1.0F, -1.25F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2697 */     this.slideModel['²'].setRotationPoint(-37.5F, -34.5F, -4.5F);
/*      */     
/* 2699 */     this.slideModel['³'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2700 */     this.slideModel['³'].setRotationPoint(-38.5F, -34.5F, -4.5F);
/*      */     
/* 2702 */     this.slideModel['´'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, -1.0F, -1.0F, -1.25F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2703 */     this.slideModel['´'].setRotationPoint(-37.5F, -37.5F, -4.5F);
/*      */     
/* 2705 */     this.slideModel['µ'].addShapeBox(20.0F, -18.0F, -5.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2706 */     this.slideModel['µ'].setRotationPoint(-38.5F, -37.5F, -4.5F);
/*      */     
/* 2708 */     this.slideModel['¶'].addShapeBox(20.0F, -18.0F, -5.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -1.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2709 */     this.slideModel['¶'].setRotationPoint(-37.5F, -36.5F, -4.5F);
/*      */     
/* 2711 */     this.slideModel['·'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, -1.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2712 */     this.slideModel['·'].setRotationPoint(-47.5F, -36.5F, -4.5F);
/*      */     
/* 2714 */     this.slideModel['¸'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, -1.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
/* 2715 */     this.slideModel['¸'].setRotationPoint(-47.5F, -34.5F, -4.5F);
/*      */     
/* 2717 */     this.slideModel['¹'].addShapeBox(20.0F, -18.0F, -5.0F, 4, 1, 2, 0.0F, -3.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2718 */     this.slideModel['¹'].setRotationPoint(-47.5F, -37.5F, -4.5F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelm9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */