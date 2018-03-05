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
/*      */ public class Modelqcw
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 1024;
/*   17 */   int textureY = 1024;
/*      */   
/*      */   public Modelqcw()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['ƽ'];
/*   22 */     this.defaultBarrelModel = new ModelRendererTurbo[10];
/*   23 */     this.ammoModel = new ModelRendererTurbo[23];
/*   24 */     this.slideModel = new ModelRendererTurbo[18];
/*      */     
/*   26 */     initgunModel_1();
/*   27 */     initdefaultBarrelModel_1();
/*   28 */     initammoModel_1();
/*   29 */     initslideModel_1();
/*      */     
/*   31 */     translateAll(0.0F, -3.0F, 0.0F);
/*   32 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.05F, 0.0F);
/*      */     
/*   34 */     this.gunSlideDistance = 1.15F;
/*   35 */     this.animationType = EnumAnimationType.CUSTOM;
/*      */     
/*      */ 
/*   38 */     this.tiltGun = 30.0F;
/*   39 */     this.rotateGunVertical = 10.0F;
/*   40 */     this.rotateGunHorizontal = 0.0F;
/*   41 */     this.translateGun = new Vector3f(0.5F, 0.0F, 0.0F);
/*      */     
/*   43 */     this.rotateClipVertical = 10.0F;
/*   44 */     this.translateClip = new Vector3f(-8.0F, -8.0F, 0.0F);
/*      */     
/*      */ 
/*   47 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   52 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   53 */     this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[3] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   56 */     this.gunModel[4] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
/*   57 */     this.gunModel[5] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   58 */     this.gunModel[6] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[7] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[8] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*   61 */     this.gunModel[9] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
/*   62 */     this.gunModel[10] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
/*   63 */     this.gunModel[11] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
/*   64 */     this.gunModel[12] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*   65 */     this.gunModel[13] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/*   66 */     this.gunModel[14] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
/*   67 */     this.gunModel[15] = new ModelRendererTurbo(this, 377, 1, this.textureX, this.textureY);
/*   68 */     this.gunModel[16] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
/*   69 */     this.gunModel[17] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
/*   70 */     this.gunModel[18] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
/*   71 */     this.gunModel[19] = new ModelRendererTurbo(this, 521, 1, this.textureX, this.textureY);
/*   72 */     this.gunModel[20] = new ModelRendererTurbo(this, 561, 1, this.textureX, this.textureY);
/*   73 */     this.gunModel[21] = new ModelRendererTurbo(this, 601, 1, this.textureX, this.textureY);
/*   74 */     this.gunModel[22] = new ModelRendererTurbo(this, 641, 1, this.textureX, this.textureY);
/*   75 */     this.gunModel[23] = new ModelRendererTurbo(this, 681, 1, this.textureX, this.textureY);
/*   76 */     this.gunModel[24] = new ModelRendererTurbo(this, 721, 1, this.textureX, this.textureY);
/*   77 */     this.gunModel[25] = new ModelRendererTurbo(this, 761, 1, this.textureX, this.textureY);
/*   78 */     this.gunModel[26] = new ModelRendererTurbo(this, 801, 1, this.textureX, this.textureY);
/*   79 */     this.gunModel[27] = new ModelRendererTurbo(this, 825, 1, this.textureX, this.textureY);
/*   80 */     this.gunModel[28] = new ModelRendererTurbo(this, 865, 1, this.textureX, this.textureY);
/*   81 */     this.gunModel[29] = new ModelRendererTurbo(this, 905, 1, this.textureX, this.textureY);
/*   82 */     this.gunModel[30] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/*   83 */     this.gunModel[31] = new ModelRendererTurbo(this, 985, 1, this.textureX, this.textureY);
/*   84 */     this.gunModel[32] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   85 */     this.gunModel[33] = new ModelRendererTurbo(this, 969, 9, this.textureX, this.textureY);
/*   86 */     this.gunModel[34] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*   87 */     this.gunModel[35] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
/*   88 */     this.gunModel[36] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/*   89 */     this.gunModel[37] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*   90 */     this.gunModel[38] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/*   91 */     this.gunModel[39] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*   92 */     this.gunModel[40] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/*   93 */     this.gunModel[41] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*   94 */     this.gunModel[42] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*   95 */     this.gunModel[43] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*   96 */     this.gunModel[44] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*   97 */     this.gunModel[45] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*   98 */     this.gunModel[46] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*   99 */     this.gunModel[47] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/*  100 */     this.gunModel[48] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/*  101 */     this.gunModel[49] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*  102 */     this.gunModel[50] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/*  103 */     this.gunModel[51] = new ModelRendererTurbo(this, 657, 17, this.textureX, this.textureY);
/*  104 */     this.gunModel[52] = new ModelRendererTurbo(this, 809, 17, this.textureX, this.textureY);
/*  105 */     this.gunModel[53] = new ModelRendererTurbo(this, 513, 25, this.textureX, this.textureY);
/*  106 */     this.gunModel[54] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
/*  107 */     this.gunModel[55] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
/*  108 */     this.gunModel[56] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*  109 */     this.gunModel[57] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*  110 */     this.gunModel[58] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
/*  111 */     this.gunModel[59] = new ModelRendererTurbo(this, 673, 25, this.textureX, this.textureY);
/*  112 */     this.gunModel[60] = new ModelRendererTurbo(this, 825, 25, this.textureX, this.textureY);
/*  113 */     this.gunModel[61] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/*  114 */     this.gunModel[62] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  115 */     this.gunModel[63] = new ModelRendererTurbo(this, 985, 17, this.textureX, this.textureY);
/*  116 */     this.gunModel[64] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
/*  117 */     this.gunModel[65] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/*  118 */     this.gunModel[66] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  119 */     this.gunModel[67] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*  120 */     this.gunModel[68] = new ModelRendererTurbo(this, 545, 1, this.textureX, this.textureY);
/*  121 */     this.gunModel[69] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  122 */     this.gunModel[70] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  123 */     this.gunModel[71] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
/*  124 */     this.gunModel[72] = new ModelRendererTurbo(this, 129, 33, this.textureX, this.textureY);
/*  125 */     this.gunModel[73] = new ModelRendererTurbo(this, 849, 1, this.textureX, this.textureY);
/*  126 */     this.gunModel[74] = new ModelRendererTurbo(this, 961, 25, this.textureX, this.textureY);
/*  127 */     this.gunModel[75] = new ModelRendererTurbo(this, 889, 1, this.textureX, this.textureY);
/*  128 */     this.gunModel[76] = new ModelRendererTurbo(this, 305, 33, this.textureX, this.textureY);
/*  129 */     this.gunModel[77] = new ModelRendererTurbo(this, 929, 1, this.textureX, this.textureY);
/*  130 */     this.gunModel[78] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/*  131 */     this.gunModel[79] = new ModelRendererTurbo(this, 809, 25, this.textureX, this.textureY);
/*  132 */     this.gunModel[80] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/*  133 */     this.gunModel[81] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/*  134 */     this.gunModel[82] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/*  135 */     this.gunModel[83] = new ModelRendererTurbo(this, 465, 33, this.textureX, this.textureY);
/*  136 */     this.gunModel[84] = new ModelRendererTurbo(this, 673, 33, this.textureX, this.textureY);
/*  137 */     this.gunModel[85] = new ModelRendererTurbo(this, 705, 33, this.textureX, this.textureY);
/*  138 */     this.gunModel[86] = new ModelRendererTurbo(this, 737, 33, this.textureX, this.textureY);
/*  139 */     this.gunModel[87] = new ModelRendererTurbo(this, 769, 33, this.textureX, this.textureY);
/*  140 */     this.gunModel[88] = new ModelRendererTurbo(this, 825, 33, this.textureX, this.textureY);
/*  141 */     this.gunModel[89] = new ModelRendererTurbo(this, 857, 33, this.textureX, this.textureY);
/*  142 */     this.gunModel[90] = new ModelRendererTurbo(this, 417, 33, this.textureX, this.textureY);
/*  143 */     this.gunModel[91] = new ModelRendererTurbo(this, 585, 1, this.textureX, this.textureY);
/*  144 */     this.gunModel[92] = new ModelRendererTurbo(this, 889, 33, this.textureX, this.textureY);
/*  145 */     this.gunModel[93] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*  146 */     this.gunModel[94] = new ModelRendererTurbo(this, 929, 33, this.textureX, this.textureY);
/*  147 */     this.gunModel[95] = new ModelRendererTurbo(this, 985, 33, this.textureX, this.textureY);
/*  148 */     this.gunModel[96] = new ModelRendererTurbo(this, 113, 41, this.textureX, this.textureY);
/*  149 */     this.gunModel[97] = new ModelRendererTurbo(this, 193, 41, this.textureX, this.textureY);
/*  150 */     this.gunModel[98] = new ModelRendererTurbo(this, 913, 33, this.textureX, this.textureY);
/*  151 */     this.gunModel[99] = new ModelRendererTurbo(this, 225, 41, this.textureX, this.textureY);
/*  152 */     this.gunModel[100] = new ModelRendererTurbo(this, 257, 41, this.textureX, this.textureY);
/*  153 */     this.gunModel[101] = new ModelRendererTurbo(this, 513, 41, this.textureX, this.textureY);
/*  154 */     this.gunModel[102] = new ModelRendererTurbo(this, 289, 41, this.textureX, this.textureY);
/*  155 */     this.gunModel[103] = new ModelRendererTurbo(this, 545, 41, this.textureX, this.textureY);
/*  156 */     this.gunModel[104] = new ModelRendererTurbo(this, 577, 41, this.textureX, this.textureY);
/*  157 */     this.gunModel[105] = new ModelRendererTurbo(this, 617, 41, this.textureX, this.textureY);
/*  158 */     this.gunModel[106] = new ModelRendererTurbo(this, 785, 41, this.textureX, this.textureY);
/*  159 */     this.gunModel[107] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  160 */     this.gunModel[108] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/*  161 */     this.gunModel[109] = new ModelRendererTurbo(this, 137, 49, this.textureX, this.textureY);
/*  162 */     this.gunModel[110] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/*  163 */     this.gunModel[111] = new ModelRendererTurbo(this, 489, 49, this.textureX, this.textureY);
/*  164 */     this.gunModel[112] = new ModelRendererTurbo(this, 641, 49, this.textureX, this.textureY);
/*  165 */     this.gunModel[113] = new ModelRendererTurbo(this, 313, 57, this.textureX, this.textureY);
/*  166 */     this.gunModel[114] = new ModelRendererTurbo(this, 953, 49, this.textureX, this.textureY);
/*  167 */     this.gunModel[115] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/*  168 */     this.gunModel[116] = new ModelRendererTurbo(this, 393, 57, this.textureX, this.textureY);
/*  169 */     this.gunModel[117] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/*  170 */     this.gunModel[118] = new ModelRendererTurbo(this, 465, 57, this.textureX, this.textureY);
/*  171 */     this.gunModel[119] = new ModelRendererTurbo(this, 241, 41, this.textureX, this.textureY);
/*  172 */     this.gunModel[120] = new ModelRendererTurbo(this, 601, 41, this.textureX, this.textureY);
/*  173 */     this.gunModel[121] = new ModelRendererTurbo(this, 625, 1, this.textureX, this.textureY);
/*  174 */     this.gunModel[122] = new ModelRendererTurbo(this, 513, 57, this.textureX, this.textureY);
/*  175 */     this.gunModel[123] = new ModelRendererTurbo(this, 665, 57, this.textureX, this.textureY);
/*  176 */     this.gunModel[124] = new ModelRendererTurbo(this, 705, 57, this.textureX, this.textureY);
/*  177 */     this.gunModel[125] = new ModelRendererTurbo(this, 745, 57, this.textureX, this.textureY);
/*  178 */     this.gunModel[126] = new ModelRendererTurbo(this, 601, 57, this.textureX, this.textureY);
/*  179 */     this.gunModel[127] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 881, 33, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 65, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 977, 57, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 289, 65, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 673, 1, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 713, 1, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 753, 1, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 793, 1, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 865, 73, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 817, 1, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/*  204 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 25, this.textureX, this.textureY);
/*  205 */     this.gunModel[''] = new ModelRendererTurbo(this, 137, 81, this.textureX, this.textureY);
/*  206 */     this.gunModel[''] = new ModelRendererTurbo(this, 729, 33, this.textureX, this.textureY);
/*  207 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 25, this.textureX, this.textureY);
/*  208 */     this.gunModel[''] = new ModelRendererTurbo(this, 761, 33, this.textureX, this.textureY);
/*  209 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 17, this.textureX, this.textureY);
/*  210 */     this.gunModel[''] = new ModelRendererTurbo(this, 369, 33, this.textureX, this.textureY);
/*  211 */     this.gunModel[''] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
/*  212 */     this.gunModel[' '] = new ModelRendererTurbo(this, 793, 33, this.textureX, this.textureY);
/*  213 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 217, 81, this.textureX, this.textureY);
/*  214 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 641, 41, this.textureX, this.textureY);
/*  215 */     this.gunModel['£'] = new ModelRendererTurbo(this, 849, 33, this.textureX, this.textureY);
/*  216 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 953, 33, this.textureX, this.textureY);
/*  217 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/*  218 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 217, 41, this.textureX, this.textureY);
/*  219 */     this.gunModel['§'] = new ModelRendererTurbo(this, 825, 33, this.textureX, this.textureY);
/*  220 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 913, 33, this.textureX, this.textureY);
/*  221 */     this.gunModel['©'] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/*  222 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 537, 41, this.textureX, this.textureY);
/*  223 */     this.gunModel['«'] = new ModelRendererTurbo(this, 569, 41, this.textureX, this.textureY);
/*  224 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 25, 49, this.textureX, this.textureY);
/*  225 */     this.gunModel['­'] = new ModelRendererTurbo(this, 1009, 33, this.textureX, this.textureY);
/*  226 */     this.gunModel['®'] = new ModelRendererTurbo(this, 985, 33, this.textureX, this.textureY);
/*  227 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 665, 41, this.textureX, this.textureY);
/*  228 */     this.gunModel['°'] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/*  229 */     this.gunModel['±'] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*  230 */     this.gunModel['²'] = new ModelRendererTurbo(this, 257, 41, this.textureX, this.textureY);
/*  231 */     this.gunModel['³'] = new ModelRendererTurbo(this, 729, 41, this.textureX, this.textureY);
/*  232 */     this.gunModel['´'] = new ModelRendererTurbo(this, 761, 41, this.textureX, this.textureY);
/*  233 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 297, 81, this.textureX, this.textureY);
/*  234 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/*  235 */     this.gunModel['·'] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/*  236 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 849, 41, this.textureX, this.textureY);
/*  237 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 689, 57, this.textureX, this.textureY);
/*  238 */     this.gunModel['º'] = new ModelRendererTurbo(this, 633, 65, this.textureX, this.textureY);
/*  239 */     this.gunModel['»'] = new ModelRendererTurbo(this, 929, 73, this.textureX, this.textureY);
/*  240 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 729, 57, this.textureX, this.textureY);
/*  241 */     this.gunModel['½'] = new ModelRendererTurbo(this, 361, 81, this.textureX, this.textureY);
/*  242 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 585, 81, this.textureX, this.textureY);
/*  243 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 657, 81, this.textureX, this.textureY);
/*  244 */     this.gunModel['À'] = new ModelRendererTurbo(this, 417, 81, this.textureX, this.textureY);
/*  245 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 721, 81, this.textureX, this.textureY);
/*  246 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 793, 81, this.textureX, this.textureY);
/*  247 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 881, 81, this.textureX, this.textureY);
/*  248 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 633, 97, this.textureX, this.textureY);
/*  249 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 793, 97, this.textureX, this.textureY);
/*  250 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 689, 65, this.textureX, this.textureY);
/*  251 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 977, 89, this.textureX, this.textureY);
/*  252 */     this.gunModel['È'] = new ModelRendererTurbo(this, 17, 97, this.textureX, this.textureY);
/*  253 */     this.gunModel['É'] = new ModelRendererTurbo(this, 49, 97, this.textureX, this.textureY);
/*  254 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 337, 97, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 833, 97, this.textureX, this.textureY);
/*  256 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 881, 97, this.textureX, this.textureY);
/*  257 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 561, 97, this.textureX, this.textureY);
/*  258 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 889, 97, this.textureX, this.textureY);
/*  259 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 65, 105, this.textureX, this.textureY);
/*  260 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 585, 65, this.textureX, this.textureY);
/*  261 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 361, 105, this.textureX, this.textureY);
/*  262 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 385, 105, this.textureX, this.textureY);
/*  263 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 105, 105, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/*  265 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 545, 65, this.textureX, this.textureY);
/*  266 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 433, 105, this.textureX, this.textureY);
/*  267 */     this.gunModel['×'] = new ModelRendererTurbo(this, 505, 105, this.textureX, this.textureY);
/*  268 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 593, 105, this.textureX, this.textureY);
/*  269 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 921, 105, this.textureX, this.textureY);
/*  270 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 961, 105, this.textureX, this.textureY);
/*  271 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  272 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 41, 113, this.textureX, this.textureY);
/*  273 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 153, 97, this.textureX, this.textureY);
/*  274 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 129, 113, this.textureX, this.textureY);
/*  275 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 177, 113, this.textureX, this.textureY);
/*  276 */     this.gunModel['à'] = new ModelRendererTurbo(this, 985, 105, this.textureX, this.textureY);
/*  277 */     this.gunModel['á'] = new ModelRendererTurbo(this, 777, 105, this.textureX, this.textureY);
/*  278 */     this.gunModel['â'] = new ModelRendererTurbo(this, 225, 113, this.textureX, this.textureY);
/*  279 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 25, 113, this.textureX, this.textureY);
/*  280 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 249, 113, this.textureX, this.textureY);
/*  281 */     this.gunModel['å'] = new ModelRendererTurbo(this, 265, 113, this.textureX, this.textureY);
/*  282 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 777, 81, this.textureX, this.textureY);
/*  283 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 489, 105, this.textureX, this.textureY);
/*  284 */     this.gunModel['è'] = new ModelRendererTurbo(this, 945, 105, this.textureX, this.textureY);
/*  285 */     this.gunModel['é'] = new ModelRendererTurbo(this, 289, 113, this.textureX, this.textureY);
/*  286 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 305, 113, this.textureX, this.textureY);
/*  287 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 329, 113, this.textureX, this.textureY);
/*  288 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 185, 97, this.textureX, this.textureY);
/*  289 */     this.gunModel['í'] = new ModelRendererTurbo(this, 217, 97, this.textureX, this.textureY);
/*  290 */     this.gunModel['î'] = new ModelRendererTurbo(this, 633, 113, this.textureX, this.textureY);
/*  291 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 937, 33, this.textureX, this.textureY);
/*  292 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*  293 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 673, 113, this.textureX, this.textureY);
/*  294 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/*  295 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 881, 17, this.textureX, this.textureY);
/*  296 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/*  297 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 921, 17, this.textureX, this.textureY);
/*  298 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 801, 113, this.textureX, this.textureY);
/*  299 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 961, 17, this.textureX, this.textureY);
/*  300 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 1017, 17, this.textureX, this.textureY);
/*  301 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 785, 65, this.textureX, this.textureY);
/*  302 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 145, 25, this.textureX, this.textureY);
/*  303 */     this.gunModel['û'] = new ModelRendererTurbo(this, 353, 121, this.textureX, this.textureY);
/*  304 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 201, 33, this.textureX, this.textureY);
/*  305 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*  306 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 393, 33, this.textureX, this.textureY);
/*  307 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 457, 121, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 417, 33, this.textureX, this.textureY);
/*  309 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 857, 1, this.textureX, this.textureY);
/*  311 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 617, 41, this.textureX, this.textureY);
/*  312 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 897, 1, this.textureX, this.textureY);
/*  313 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 937, 1, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
/*  315 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 1009, 41, this.textureX, this.textureY);
/*  316 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/*  317 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 569, 49, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/*  319 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 697, 33, this.textureX, this.textureY);
/*  320 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 129, 41, this.textureX, this.textureY);
/*  321 */     this.gunModel['č'] = new ModelRendererTurbo(this, 241, 41, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/*  323 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 513, 41, this.textureX, this.textureY);
/*  324 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
/*  325 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*  326 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
/*  327 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 601, 41, this.textureX, this.textureY);
/*  329 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 305, 1, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/*  331 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
/*  333 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 913, 41, this.textureX, this.textureY);
/*  334 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/*  335 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 513, 49, this.textureX, this.textureY);
/*  336 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 641, 49, this.textureX, this.textureY);
/*  337 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 809, 17, this.textureX, this.textureY);
/*  338 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
/*  339 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 809, 49, this.textureX, this.textureY);
/*  340 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 25, 57, this.textureX, this.textureY);
/*  341 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/*  342 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 489, 57, this.textureX, this.textureY);
/*  343 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 665, 57, this.textureX, this.textureY);
/*  344 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 945, 57, this.textureX, this.textureY);
/*  345 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 457, 65, this.textureX, this.textureY);
/*  346 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 489, 65, this.textureX, this.textureY);
/*  347 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 657, 65, this.textureX, this.textureY);
/*  348 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 705, 65, this.textureX, this.textureY);
/*  349 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 969, 33, this.textureX, this.textureY);
/*  350 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 217, 41, this.textureX, this.textureY);
/*  351 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 793, 9, this.textureX, this.textureY);
/*  353 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 729, 65, this.textureX, this.textureY);
/*  354 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 257, 73, this.textureX, this.textureY);
/*  355 */     this.gunModel['į'] = new ModelRendererTurbo(this, 745, 65, this.textureX, this.textureY);
/*  356 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  357 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/*  358 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 537, 41, this.textureX, this.textureY);
/*  359 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 409, 33, this.textureX, this.textureY);
/*  360 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/*  361 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 681, 33, this.textureX, this.textureY);
/*  362 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 713, 33, this.textureX, this.textureY);
/*  363 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/*  364 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 745, 33, this.textureX, this.textureY);
/*  365 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 745, 113, this.textureX, this.textureY);
/*  366 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 273, 73, this.textureX, this.textureY);
/*  367 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 497, 65, this.textureX, this.textureY);
/*  368 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 873, 81, this.textureX, this.textureY);
/*  369 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 761, 113, this.textureX, this.textureY);
/*  370 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 865, 113, this.textureX, this.textureY);
/*  371 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 65, 121, this.textureX, this.textureY);
/*  372 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 545, 121, this.textureX, this.textureY);
/*  373 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 89, 121, this.textureX, this.textureY);
/*  374 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 585, 121, this.textureX, this.textureY);
/*  375 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 889, 113, this.textureX, this.textureY);
/*  376 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 793, 41, this.textureX, this.textureY);
/*  377 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 665, 49, this.textureX, this.textureY);
/*  378 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 977, 49, this.textureX, this.textureY);
/*  379 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/*  380 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 337, 89, this.textureX, this.textureY);
/*  381 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 617, 65, this.textureX, this.textureY);
/*  382 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 513, 57, this.textureX, this.textureY);
/*  383 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 665, 121, this.textureX, this.textureY);
/*  384 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 537, 57, this.textureX, this.textureY);
/*  385 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/*  386 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 953, 73, this.textureX, this.textureY);
/*  387 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 777, 33, this.textureX, this.textureY);
/*  388 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 817, 33, this.textureX, this.textureY);
/*  389 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 881, 33, this.textureX, this.textureY);
/*  390 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 201, 41, this.textureX, this.textureY);
/*  391 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 233, 41, this.textureX, this.textureY);
/*  392 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 297, 41, this.textureX, this.textureY);
/*  393 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 377, 41, this.textureX, this.textureY);
/*  394 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 441, 41, this.textureX, this.textureY);
/*  395 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 553, 41, this.textureX, this.textureY);
/*  396 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 585, 41, this.textureX, this.textureY);
/*  397 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 681, 41, this.textureX, this.textureY);
/*  398 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 865, 41, this.textureX, this.textureY);
/*  399 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 9, 49, this.textureX, this.textureY);
/*  400 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 41, 49, this.textureX, this.textureY);
/*  401 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 297, 49, this.textureX, this.textureY);
/*  402 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 497, 49, this.textureX, this.textureY);
/*  403 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 977, 57, this.textureX, this.textureY);
/*  404 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 513, 65, this.textureX, this.textureY);
/*  405 */     this.gunModel['š'] = new ModelRendererTurbo(this, 537, 65, this.textureX, this.textureY);
/*  406 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 585, 49, this.textureX, this.textureY);
/*  407 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 9, 57, this.textureX, this.textureY);
/*  408 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 41, 57, this.textureX, this.textureY);
/*  409 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/*  410 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 401, 57, this.textureX, this.textureY);
/*  411 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/*  412 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 713, 57, this.textureX, this.textureY);
/*  413 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 753, 57, this.textureX, this.textureY);
/*  414 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 769, 57, this.textureX, this.textureY);
/*  415 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 961, 57, this.textureX, this.textureY);
/*  416 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 1001, 57, this.textureX, this.textureY);
/*  417 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 1017, 57, this.textureX, this.textureY);
/*  418 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 369, 65, this.textureX, this.textureY);
/*  419 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 473, 65, this.textureX, this.textureY);
/*  420 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 569, 65, this.textureX, this.textureY);
/*  421 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 577, 65, this.textureX, this.textureY);
/*  422 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 601, 65, this.textureX, this.textureY);
/*  423 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 689, 65, this.textureX, this.textureY);
/*  424 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 809, 65, this.textureX, this.textureY);
/*  425 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 673, 65, this.textureX, this.textureY);
/*  426 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 129, 73, this.textureX, this.textureY);
/*  427 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 249, 73, this.textureX, this.textureY);
/*  428 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 273, 73, this.textureX, this.textureY);
/*  429 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 289, 73, this.textureX, this.textureY);
/*  430 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 313, 73, this.textureX, this.textureY);
/*  431 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 321, 73, this.textureX, this.textureY);
/*  432 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 353, 73, this.textureX, this.textureY);
/*  433 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 425, 73, this.textureX, this.textureY);
/*  434 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 633, 73, this.textureX, this.textureY);
/*  435 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 657, 73, this.textureX, this.textureY);
/*  436 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 737, 73, this.textureX, this.textureY);
/*  437 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 857, 73, this.textureX, this.textureY);
/*  438 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 961, 73, this.textureX, this.textureY);
/*  439 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 969, 73, this.textureX, this.textureY);
/*  440 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 1017, 73, this.textureX, this.textureY);
/*  441 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 409, 81, this.textureX, this.textureY);
/*  442 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/*  443 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 449, 81, this.textureX, this.textureY);
/*  444 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 721, 81, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 777, 81, this.textureX, this.textureY);
/*  446 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 793, 81, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 705, 81, this.textureX, this.textureY);
/*  448 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 873, 81, this.textureX, this.textureY);
/*  449 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 905, 81, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 913, 81, this.textureX, this.textureY);
/*  451 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 929, 81, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 985, 81, this.textureX, this.textureY);
/*  453 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 25, 89, this.textureX, this.textureY);
/*  454 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 57, 89, this.textureX, this.textureY);
/*  455 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/*  456 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 129, 89, this.textureX, this.textureY);
/*  457 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 161, 89, this.textureX, this.textureY);
/*  458 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 193, 89, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 225, 89, this.textureX, this.textureY);
/*  460 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 249, 89, this.textureX, this.textureY);
/*  461 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 273, 89, this.textureX, this.textureY);
/*  462 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 609, 121, this.textureX, this.textureY);
/*  463 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 721, 121, this.textureX, this.textureY);
/*  464 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 113, 121, this.textureX, this.textureY);
/*  465 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 785, 121, this.textureX, this.textureY);
/*  466 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 817, 121, this.textureX, this.textureY);
/*  467 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 849, 121, this.textureX, this.textureY);
/*  468 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 889, 121, this.textureX, this.textureY);
/*  469 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 1, 129, this.textureX, this.textureY);
/*  470 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 961, 81, this.textureX, this.textureY);
/*  471 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 993, 81, this.textureX, this.textureY);
/*  472 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 1017, 81, this.textureX, this.textureY);
/*  473 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/*  474 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 297, 89, this.textureX, this.textureY);
/*  475 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 441, 89, this.textureX, this.textureY);
/*  476 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 473, 89, this.textureX, this.textureY);
/*  477 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 505, 89, this.textureX, this.textureY);
/*  478 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 33, 89, this.textureX, this.textureY);
/*  479 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 65, 89, this.textureX, this.textureY);
/*  480 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 105, 89, this.textureX, this.textureY);
/*  481 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 137, 89, this.textureX, this.textureY);
/*  482 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 169, 89, this.textureX, this.textureY);
/*  483 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 201, 89, this.textureX, this.textureY);
/*  484 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 233, 89, this.textureX, this.textureY);
/*  485 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 257, 89, this.textureX, this.textureY);
/*  486 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 281, 89, this.textureX, this.textureY);
/*  487 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 537, 89, this.textureX, this.textureY);
/*  488 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 545, 89, this.textureX, this.textureY);
/*  489 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 569, 89, this.textureX, this.textureY);
/*  490 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 577, 89, this.textureX, this.textureY);
/*  491 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 585, 89, this.textureX, this.textureY);
/*  492 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 633, 89, this.textureX, this.textureY);
/*  493 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 641, 89, this.textureX, this.textureY);
/*  494 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 649, 89, this.textureX, this.textureY);
/*  495 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 657, 89, this.textureX, this.textureY);
/*  496 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 905, 89, this.textureX, this.textureY);
/*      */     
/*  498 */     this.gunModel[0].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F);
/*  499 */     this.gunModel[0].setRotationPoint(-26.5F, -9.0F, 0.0F);
/*      */     
/*  501 */     this.gunModel[1].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 9, 0.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  502 */     this.gunModel[1].setRotationPoint(-24.5F, -3.0F, 0.0F);
/*      */     
/*  504 */     this.gunModel[2].addShapeBox(14.0F, -4.0F, -4.5F, 2, 3, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  505 */     this.gunModel[2].setRotationPoint(-23.5F, -6.0F, 0.0F);
/*      */     
/*  507 */     this.gunModel[3].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F);
/*  508 */     this.gunModel[3].setRotationPoint(-24.5F, -8.0F, 0.0F);
/*      */     
/*  510 */     this.gunModel[4].addShapeBox(14.0F, -4.0F, -4.5F, 2, 4, 9, 0.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F);
/*  511 */     this.gunModel[4].setRotationPoint(-25.5F, -1.0F, 0.0F);
/*      */     
/*  513 */     this.gunModel[5].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 9, 0.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  514 */     this.gunModel[5].setRotationPoint(-28.5F, 3.0F, 0.0F);
/*      */     
/*  516 */     this.gunModel[6].addShapeBox(14.0F, -4.0F, -4.5F, 2, 3, 9, 0.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  517 */     this.gunModel[6].setRotationPoint(-29.5F, 5.0F, 0.0F);
/*      */     
/*  519 */     this.gunModel[7].addShapeBox(14.0F, -4.0F, -4.5F, 2, 6, 9, 0.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  520 */     this.gunModel[7].setRotationPoint(-30.5F, 8.0F, 0.0F);
/*      */     
/*  522 */     this.gunModel[8].addShapeBox(14.0F, -4.0F, -4.5F, 2, 15, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -2.0F, -5.0F, 0.0F, -2.0F, 5.0F, 0.0F, 0.0F);
/*  523 */     this.gunModel[8].setRotationPoint(-15.5F, 1.0F, 0.0F);
/*      */     
/*  525 */     this.gunModel[9].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 9, 0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 0.0F, -2.0F, 2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  526 */     this.gunModel[9].setRotationPoint(-15.5F, -1.0F, 0.0F);
/*      */     
/*  528 */     this.gunModel[10].addShapeBox(14.0F, -4.0F, -4.5F, 2, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/*  529 */     this.gunModel[10].setRotationPoint(-11.5F, -9.0F, 0.0F);
/*      */     
/*  531 */     this.gunModel[11].addShapeBox(14.0F, -4.0F, -4.5F, 2, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/*  532 */     this.gunModel[11].setRotationPoint(-12.5F, -4.0F, 0.0F);
/*      */     
/*  534 */     this.gunModel[12].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  535 */     this.gunModel[12].setRotationPoint(-12.5F, -6.0F, 0.0F);
/*      */     
/*  537 */     this.gunModel[13].addShapeBox(14.0F, -4.0F, -4.5F, 10, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  538 */     this.gunModel[13].setRotationPoint(-21.5F, -9.0F, 0.0F);
/*      */     
/*  540 */     this.gunModel[14].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  541 */     this.gunModel[14].setRotationPoint(-24.5F, -9.0F, 0.0F);
/*      */     
/*  543 */     this.gunModel[15].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 9, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/*  544 */     this.gunModel[15].setRotationPoint(-23.5F, -8.0F, 0.0F);
/*      */     
/*  546 */     this.gunModel[16].addShapeBox(14.0F, -4.0F, -4.5F, 9, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  547 */     this.gunModel[16].setRotationPoint(-21.5F, -6.0F, 0.0F);
/*      */     
/*  549 */     this.gunModel[17].addShapeBox(14.0F, -4.0F, -4.5F, 9, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  550 */     this.gunModel[17].setRotationPoint(-21.5F, -4.0F, 0.0F);
/*      */     
/*  552 */     this.gunModel[18].addShapeBox(14.0F, -4.0F, -4.5F, 8, 1, 9, 0.0F, 0.5F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  553 */     this.gunModel[18].setRotationPoint(-21.5F, -2.0F, 0.0F);
/*      */     
/*  555 */     this.gunModel[19].addShapeBox(14.0F, -4.0F, -4.5F, 8, 1, 9, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/*  556 */     this.gunModel[19].setRotationPoint(-22.5F, 0.0F, 0.0F);
/*      */     
/*  558 */     this.gunModel[20].addShapeBox(14.0F, -4.0F, -4.5F, 8, 1, 9, 0.0F, 1.25F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/*  559 */     this.gunModel[20].setRotationPoint(-23.5F, 2.0F, 0.0F);
/*      */     
/*  561 */     this.gunModel[21].addShapeBox(14.0F, -4.0F, -4.5F, 8, 1, 9, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
/*  562 */     this.gunModel[21].setRotationPoint(-24.5F, 4.0F, 0.0F);
/*      */     
/*  564 */     this.gunModel[22].addShapeBox(14.0F, -4.0F, -4.5F, 8, 1, 9, 0.0F, 1.85F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 1.85F, 0.0F, 0.0F, 2.2F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, 2.2F, 0.0F, 0.0F);
/*  565 */     this.gunModel[22].setRotationPoint(-25.0F, 6.0F, 0.0F);
/*      */     
/*  567 */     this.gunModel[23].addShapeBox(14.0F, -4.0F, -4.5F, 8, 1, 9, 0.0F, 2.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.18F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 2.18F, 0.0F, 0.0F);
/*  568 */     this.gunModel[23].setRotationPoint(-25.5F, 8.0F, 0.0F);
/*      */     
/*  570 */     this.gunModel[24].addShapeBox(14.0F, -4.0F, -4.5F, 8, 1, 9, 0.0F, 1.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.35F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F);
/*  571 */     this.gunModel[24].setRotationPoint(-26.5F, 10.0F, 0.0F);
/*      */     
/*  573 */     this.gunModel[25].addShapeBox(14.0F, -4.0F, -4.5F, 8, 1, 9, 0.0F, 0.7F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.85F, 0.0F, 0.0F);
/*  574 */     this.gunModel[25].setRotationPoint(-27.5F, 12.0F, 0.0F);
/*      */     
/*  576 */     this.gunModel[26].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  577 */     this.gunModel[26].setRotationPoint(-30.5F, 14.0F, 0.0F);
/*      */     
/*  579 */     this.gunModel[27].addShapeBox(14.0F, -4.0F, -4.5F, 8, 2, 9, 0.0F, 1.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
/*  580 */     this.gunModel[27].setRotationPoint(-27.5F, 14.0F, 0.0F);
/*      */     
/*  582 */     this.gunModel[28].addShapeBox(14.0F, -4.0F, -4.5F, 10, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  583 */     this.gunModel[28].setRotationPoint(-22.5F, -3.0F, 1.0F);
/*      */     
/*  585 */     this.gunModel[29].addShapeBox(14.0F, -4.0F, -4.5F, 11, 4, 7, 0.0F, -3.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  586 */     this.gunModel[29].setRotationPoint(-25.5F, -1.0F, 1.0F);
/*      */     
/*  588 */     this.gunModel[30].addShapeBox(14.0F, -4.0F, -4.5F, 9, 2, 7, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  589 */     this.gunModel[30].setRotationPoint(-25.5F, 3.0F, 1.0F);
/*      */     
/*  591 */     this.gunModel[31].addShapeBox(14.0F, -4.0F, -4.5F, 9, 3, 7, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  592 */     this.gunModel[31].setRotationPoint(-27.5F, 5.0F, 1.0F);
/*      */     
/*  594 */     this.gunModel[32].addShapeBox(14.0F, -4.0F, -4.5F, 11, 6, 7, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  595 */     this.gunModel[32].setRotationPoint(-28.5F, 8.0F, 1.0F);
/*      */     
/*  597 */     this.gunModel[33].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 1.0F, 0.0F, 0.0F);
/*  598 */     this.gunModel[33].setRotationPoint(-10.5F, -10.0F, 0.0F);
/*      */     
/*  600 */     this.gunModel[34].addShapeBox(14.0F, -4.0F, -4.5F, 14, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  601 */     this.gunModel[34].setRotationPoint(-24.5F, -10.0F, 0.0F);
/*      */     
/*  603 */     this.gunModel[35].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/*  604 */     this.gunModel[35].setRotationPoint(-26.5F, -10.0F, 0.0F);
/*      */     
/*  606 */     this.gunModel[36].addShapeBox(14.0F, -4.0F, -4.5F, 2, 3, 5, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  607 */     this.gunModel[36].setRotationPoint(-11.5F, -4.0F, 2.0F);
/*      */     
/*  609 */     this.gunModel[37].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  610 */     this.gunModel[37].setRotationPoint(-9.5F, -2.0F, 2.0F);
/*      */     
/*  612 */     this.gunModel[38].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  613 */     this.gunModel[38].setRotationPoint(-6.5F, -0.5F, 2.0F);
/*      */     
/*  615 */     this.gunModel[39].addShapeBox(14.0F, -4.0F, -4.5F, 8, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  616 */     this.gunModel[39].setRotationPoint(-4.5F, 0.0F, 2.0F);
/*      */     
/*  618 */     this.gunModel[40].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  619 */     this.gunModel[40].setRotationPoint(3.5F, 0.0F, 2.0F);
/*      */     
/*  621 */     this.gunModel[41].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  622 */     this.gunModel[41].setRotationPoint(5.5F, -1.0F, 2.0F);
/*      */     
/*  624 */     this.gunModel[42].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 5, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  625 */     this.gunModel[42].setRotationPoint(6.5F, -1.0F, 2.0F);
/*      */     
/*  627 */     this.gunModel[43].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  628 */     this.gunModel[43].setRotationPoint(6.5F, -6.0F, 2.0F);
/*      */     
/*  630 */     this.gunModel[44].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  631 */     this.gunModel[44].setRotationPoint(7.0F, -8.0F, 2.0F);
/*      */     
/*  633 */     this.gunModel[45].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 5, 0.0F, 0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  634 */     this.gunModel[45].setRotationPoint(7.0F, -9.0F, 2.0F);
/*      */     
/*  636 */     this.gunModel[46].addShapeBox(14.0F, -4.0F, -4.5F, 4, 1, 5, 0.0F, 0.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  637 */     this.gunModel[46].setRotationPoint(6.0F, -10.0F, 2.0F);
/*      */     
/*  639 */     this.gunModel[47].addShapeBox(14.0F, -4.0F, -4.5F, 41, 12, 11, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  640 */     this.gunModel[47].setRotationPoint(-34.5F, -23.0F, -1.0F);
/*      */     
/*  642 */     this.gunModel[48].addShapeBox(14.0F, -4.0F, -4.5F, 42, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  643 */     this.gunModel[48].setRotationPoint(-34.5F, -11.0F, -1.0F);
/*      */     
/*  645 */     this.gunModel[49].addShapeBox(14.0F, -4.0F, -4.5F, 30, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  646 */     this.gunModel[49].setRotationPoint(6.5F, -23.5F, -1.0F);
/*      */     
/*  648 */     this.gunModel[50].addShapeBox(14.0F, -4.0F, -4.5F, 71, 2, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  649 */     this.gunModel[50].setRotationPoint(-34.5F, -26.0F, -1.0F);
/*      */     
/*  651 */     this.gunModel[51].addShapeBox(14.0F, -4.0F, -4.5F, 71, 2, 4, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  652 */     this.gunModel[51].setRotationPoint(-34.5F, -28.0F, -1.0F);
/*      */     
/*  654 */     this.gunModel[52].addShapeBox(14.0F, -4.0F, -4.5F, 14, 1, 5, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  655 */     this.gunModel[52].setRotationPoint(21.5F, -29.0F, 2.0F);
/*      */     
/*  657 */     this.gunModel[53].addShapeBox(14.0F, -4.0F, -4.5F, 73, 1, 10, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  658 */     this.gunModel[53].setRotationPoint(-34.5F, -24.5F, -0.5F);
/*      */     
/*  660 */     this.gunModel[54].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  661 */     this.gunModel[54].setRotationPoint(-6.5F, -10.0F, 3.5F);
/*      */     
/*  663 */     this.gunModel[55].addShapeBox(14.0F, -4.0F, -4.5F, 3, 2, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  664 */     this.gunModel[55].setRotationPoint(-7.0F, -9.0F, 3.5F);
/*      */     
/*  666 */     this.gunModel[56].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  667 */     this.gunModel[56].setRotationPoint(-6.0F, -7.0F, 3.5F);
/*      */     
/*  669 */     this.gunModel[57].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  670 */     this.gunModel[57].setRotationPoint(-5.5F, -5.0F, 3.5F);
/*      */     
/*  672 */     this.gunModel[58].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 2, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F);
/*  673 */     this.gunModel[58].setRotationPoint(-4.5F, -3.0F, 3.5F);
/*      */     
/*  675 */     this.gunModel[59].addShapeBox(14.0F, -4.0F, -4.5F, 71, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  676 */     this.gunModel[59].setRotationPoint(-34.5F, -26.0F, 7.0F);
/*      */     
/*  678 */     this.gunModel[60].addShapeBox(14.0F, -4.0F, -4.5F, 71, 2, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  679 */     this.gunModel[60].setRotationPoint(-34.5F, -28.0F, 6.0F);
/*      */     
/*  681 */     this.gunModel[61].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
/*  682 */     this.gunModel[61].setRotationPoint(-20.5F, 16.0F, 0.0F);
/*      */     
/*  684 */     this.gunModel[62].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F, 1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F);
/*  685 */     this.gunModel[62].setRotationPoint(-20.5F, 18.0F, 0.0F);
/*      */     
/*  687 */     this.gunModel[63].addShapeBox(14.0F, -4.0F, -4.5F, 8, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.5F, 0.0F);
/*  688 */     this.gunModel[63].setRotationPoint(-28.5F, 16.0F, 0.0F);
/*      */     
/*  690 */     this.gunModel[64].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  691 */     this.gunModel[64].setRotationPoint(-20.5F, 18.0F, 0.0F);
/*      */     
/*  693 */     this.gunModel[65].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -2.0F);
/*  694 */     this.gunModel[65].setRotationPoint(-30.5F, 16.0F, 0.0F);
/*      */     
/*  696 */     this.gunModel[66].addShapeBox(14.0F, -4.0F, -4.5F, 22, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  697 */     this.gunModel[66].setRotationPoint(14.5F, -28.0F, 2.0F);
/*      */     
/*  699 */     this.gunModel[67].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 11, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  700 */     this.gunModel[67].setRotationPoint(36.5F, -26.0F, -1.0F);
/*      */     
/*  702 */     this.gunModel[68].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 11, 0.0F, 0.0F, 0.0F, -2.75F, -0.5F, 0.0F, -2.75F, -0.5F, 0.0F, -2.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/*  703 */     this.gunModel[68].setRotationPoint(36.5F, -28.0F, -1.0F);
/*      */     
/*  705 */     this.gunModel[69].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 5, 0.0F, 0.0F, -0.5F, -2.25F, -0.75F, -0.5F, -2.25F, -0.75F, -0.5F, -2.25F, 0.0F, -0.5F, -2.25F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  706 */     this.gunModel[69].setRotationPoint(36.5F, -30.0F, 2.0F);
/*      */     
/*  708 */     this.gunModel[70].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 5, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -2.5F, 0.0F, 0.25F, -2.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  709 */     this.gunModel[70].setRotationPoint(35.5F, -29.0F, 2.0F);
/*      */     
/*  711 */     this.gunModel[71].addShapeBox(14.0F, -4.0F, -4.5F, 27, 1, 10, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.95F, 0.0F, 0.0F, 0.95F, 0.0F, 0.0F, 0.95F, 0.5F, 0.0F, 0.95F);
/*  712 */     this.gunModel[71].setRotationPoint(9.5F, -22.5F, -0.5F);
/*      */     
/*  714 */     this.gunModel[72].addShapeBox(14.0F, -4.0F, -4.5F, 27, 2, 11, 0.0F, 0.5F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.5F, 0.0F, 0.45F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/*  715 */     this.gunModel[72].setRotationPoint(9.5F, -21.5F, -1.0F);
/*      */     
/*  717 */     this.gunModel[73].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 13, 0.0F, 2.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 2.0F, 0.0F, -0.25F, 1.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F);
/*  718 */     this.gunModel[73].setRotationPoint(11.5F, -19.5F, -2.0F);
/*      */     
/*  720 */     this.gunModel[74].addShapeBox(14.0F, -4.0F, -4.5F, 3, 3, 15, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -0.8F, -0.5F, 0.0F, -0.8F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F);
/*  721 */     this.gunModel[74].setRotationPoint(7.5F, -16.5F, -3.0F);
/*      */     
/*  723 */     this.gunModel[75].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 13, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  724 */     this.gunModel[75].setRotationPoint(13.5F, -19.5F, -2.0F);
/*      */     
/*  726 */     this.gunModel[76].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 14, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  727 */     this.gunModel[76].setRotationPoint(13.5F, -16.5F, -2.5F);
/*      */     
/*  729 */     this.gunModel[77].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 13, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  730 */     this.gunModel[77].setRotationPoint(16.0F, -19.5F, -2.0F);
/*      */     
/*  732 */     this.gunModel[78].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 14, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  733 */     this.gunModel[78].setRotationPoint(16.0F, -16.5F, -2.5F);
/*      */     
/*  735 */     this.gunModel[79].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 13, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  736 */     this.gunModel[79].setRotationPoint(18.5F, -19.5F, -2.0F);
/*      */     
/*  738 */     this.gunModel[80].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 14, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  739 */     this.gunModel[80].setRotationPoint(18.5F, -16.5F, -2.5F);
/*      */     
/*  741 */     this.gunModel[81].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 13, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  742 */     this.gunModel[81].setRotationPoint(21.0F, -19.5F, -2.0F);
/*      */     
/*  744 */     this.gunModel[82].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 14, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  745 */     this.gunModel[82].setRotationPoint(21.0F, -16.5F, -2.5F);
/*      */     
/*  747 */     this.gunModel[83].addShapeBox(14.0F, -4.0F, -4.5F, 3, 3, 13, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F);
/*  748 */     this.gunModel[83].setRotationPoint(7.5F, -19.5F, -2.0F);
/*      */     
/*  750 */     this.gunModel[84].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 14, 0.0F, 1.5F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 1.5F, 0.0F, -0.25F, 1.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F);
/*  751 */     this.gunModel[84].setRotationPoint(11.5F, -16.5F, -2.5F);
/*      */     
/*  753 */     this.gunModel[85].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 14, 0.0F, 1.25F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 1.25F, 0.0F, -0.5F, 1.1F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, -1.0F, 0.0F, -1.5F, 1.1F, 0.0F, -1.5F);
/*  754 */     this.gunModel[85].setRotationPoint(11.5F, -13.5F, -2.5F);
/*      */     
/*  756 */     this.gunModel[86].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F);
/*  757 */     this.gunModel[86].setRotationPoint(13.5F, -13.5F, -2.5F);
/*      */     
/*  759 */     this.gunModel[87].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F);
/*  760 */     this.gunModel[87].setRotationPoint(16.0F, -13.5F, -2.5F);
/*      */     
/*  762 */     this.gunModel[88].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F);
/*  763 */     this.gunModel[88].setRotationPoint(18.5F, -13.5F, -2.5F);
/*      */     
/*  765 */     this.gunModel[89].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, -0.25F, -1.75F, 0.0F, -0.25F, -1.75F, 0.0F, 0.0F, -1.75F);
/*  766 */     this.gunModel[89].setRotationPoint(21.0F, -13.5F, -2.5F);
/*      */     
/*  768 */     this.gunModel[90].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.95F, 0.5F, 0.0F, 0.95F, 0.0F, 0.0F, 0.5F);
/*  769 */     this.gunModel[90].setRotationPoint(7.5F, -22.5F, -0.5F);
/*      */     
/*  771 */     this.gunModel[91].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.45F, 0.5F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.75F, 1.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F);
/*  772 */     this.gunModel[91].setRotationPoint(7.5F, -21.5F, -1.0F);
/*      */     
/*  774 */     this.gunModel[92].addShapeBox(14.0F, -4.0F, -4.5F, 3, 2, 16, 0.0F, 0.5F, 0.0F, -2.5F, -0.75F, 0.0F, -1.5F, -0.75F, 0.0F, -1.5F, 0.5F, 0.0F, -2.5F, 0.5F, 0.0F, -2.5F, -0.6F, 0.0F, -2.5F, -0.6F, 0.0F, -2.5F, 0.5F, 0.0F, -2.5F);
/*  775 */     this.gunModel[92].setRotationPoint(8.0F, -13.5F, -3.5F);
/*      */     
/*  777 */     this.gunModel[93].addShapeBox(14.0F, -4.0F, -4.5F, 4, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/*  778 */     this.gunModel[93].setRotationPoint(7.5F, -11.0F, -1.0F);
/*      */     
/*  780 */     this.gunModel[94].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 16, 0.0F, 0.1F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.1F, 0.0F, -2.5F, 0.1F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.1F, -0.5F, -2.5F);
/*  781 */     this.gunModel[94].setRotationPoint(10.5F, -11.5F, -3.5F);
/*      */     
/*  783 */     this.gunModel[95].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 16, 0.0F, 1.5F, 0.0F, -2.5F, 0.4F, 0.0F, -2.5F, 0.4F, 0.0F, -2.5F, 1.5F, 0.0F, -2.5F, 1.5F, -0.5F, -2.5F, 0.4F, -0.5F, -2.5F, 0.4F, -0.5F, -2.5F, 1.5F, -0.5F, -2.5F);
/*  784 */     this.gunModel[95].setRotationPoint(9.0F, -11.5F, -3.5F);
/*      */     
/*  786 */     this.gunModel[96].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 13, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  787 */     this.gunModel[96].setRotationPoint(23.5F, -19.5F, -2.0F);
/*      */     
/*  789 */     this.gunModel[97].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 14, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  790 */     this.gunModel[97].setRotationPoint(23.5F, -16.5F, -2.5F);
/*      */     
/*  792 */     this.gunModel[98].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.5F, -2.0F);
/*  793 */     this.gunModel[98].setRotationPoint(23.5F, -13.5F, -2.5F);
/*      */     
/*  795 */     this.gunModel[99].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 13, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  796 */     this.gunModel[99].setRotationPoint(26.0F, -19.5F, -2.0F);
/*      */     
/*  798 */     this.gunModel[100].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 14, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  799 */     this.gunModel[100].setRotationPoint(26.0F, -16.5F, -2.5F);
/*      */     
/*  801 */     this.gunModel[101].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, 0.0F, -1.25F);
/*  802 */     this.gunModel[101].setRotationPoint(26.0F, -13.5F, -2.5F);
/*      */     
/*  804 */     this.gunModel[102].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 13, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  805 */     this.gunModel[102].setRotationPoint(28.5F, -19.5F, -2.0F);
/*      */     
/*  807 */     this.gunModel[103].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 14, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  808 */     this.gunModel[103].setRotationPoint(28.5F, -16.5F, -2.5F);
/*      */     
/*  810 */     this.gunModel[104].addShapeBox(14.0F, -4.0F, -4.5F, 3, 3, 13, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  811 */     this.gunModel[104].setRotationPoint(31.0F, -19.5F, -2.0F);
/*      */     
/*  813 */     this.gunModel[105].addShapeBox(14.0F, -4.0F, -4.5F, 3, 2, 14, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F);
/*  814 */     this.gunModel[105].setRotationPoint(31.0F, -16.5F, -2.5F);
/*      */     
/*  816 */     this.gunModel[106].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 15, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F, 0.0F, 0.0F, -1.25F);
/*  817 */     this.gunModel[106].setRotationPoint(31.0F, -14.5F, -3.0F);
/*      */     
/*  819 */     this.gunModel[107].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 14, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, -0.5F, -3.5F, 0.0F, -0.75F, -3.5F, 0.0F, -0.75F, -3.5F, 0.0F, -0.5F, -3.5F);
/*  820 */     this.gunModel[107].setRotationPoint(13.5F, -11.5F, -2.5F);
/*      */     
/*  822 */     this.gunModel[108].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 14, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -3.0F, 0.0F, -0.25F, -3.0F, 0.0F, -0.25F, -3.0F, 0.0F, 0.0F, -3.0F);
/*  823 */     this.gunModel[108].setRotationPoint(16.0F, -11.5F, -2.5F);
/*      */     
/*  825 */     this.gunModel[109].addShapeBox(14.0F, -4.0F, -4.5F, 19, 6, 11, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.75F, 0.5F, -3.5F, 0.75F, 0.5F, -3.5F, 0.75F, 0.0F, 0.0F, 0.75F);
/*  826 */     this.gunModel[109].setRotationPoint(11.5F, -19.5F, -1.0F);
/*      */     
/*  828 */     this.gunModel[110].addShapeBox(14.0F, -4.0F, -4.5F, 19, 1, 8, 0.0F, 0.0F, 0.0F, 1.25F, 0.5F, 3.5F, 2.0F, 0.5F, 3.5F, 2.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.5F, -0.5F, 0.5F, -3.0F, 0.0F, 0.5F, -3.0F, 0.0F, 0.0F, 0.5F, -0.5F);
/*  829 */     this.gunModel[110].setRotationPoint(11.5F, -11.5F, 0.5F);
/*      */     
/*  831 */     this.gunModel[111].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 14, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, -0.5F, -2.5F, 0.0F, -0.75F, -2.5F, 0.0F, -0.75F, -2.5F, 0.0F, -0.5F, -2.5F);
/*  832 */     this.gunModel[111].setRotationPoint(18.5F, -11.5F, -2.5F);
/*      */     
/*  834 */     this.gunModel[112].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 14, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.5F, -1.0F);
/*  835 */     this.gunModel[112].setRotationPoint(28.5F, -13.5F, -2.5F);
/*      */     
/*  837 */     this.gunModel[113].addShapeBox(14.0F, -4.0F, -4.5F, 19, 2, 8, 0.0F, 0.0F, 0.0F, 2.25F, 0.5F, 3.5F, 2.25F, 0.5F, 3.5F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, 1.25F, 0.5F, -3.5F, 2.0F, 0.5F, -3.5F, 2.0F, 0.0F, 0.0F, 1.25F);
/*  838 */     this.gunModel[113].setRotationPoint(11.5F, -13.5F, 0.5F);
/*      */     
/*  840 */     this.gunModel[114].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 15, 0.0F, 0.0F, 0.0F, -0.85F, 0.0F, -1.5F, -1.35F, 0.0F, -1.5F, -1.35F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -1.25F, 0.0F, 1.5F, -3.0F, 0.0F, 1.5F, -3.0F, 0.0F, 0.0F, -1.25F);
/*  841 */     this.gunModel[114].setRotationPoint(34.0F, -14.5F, -3.0F);
/*      */     
/*  843 */     this.gunModel[115].addShapeBox(14.0F, -4.0F, -4.5F, 2, 3, 13, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  844 */     this.gunModel[115].setRotationPoint(34.0F, -19.5F, -2.0F);
/*      */     
/*  846 */     this.gunModel[116].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 14, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.35F, 0.0F, 1.5F, -0.85F, 0.0F, 1.5F, -0.85F, 0.0F, 0.0F, -0.35F);
/*  847 */     this.gunModel[116].setRotationPoint(34.0F, -16.5F, -2.5F);
/*      */     
/*  849 */     this.gunModel[117].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 14, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.7F, -0.5F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F, 0.0F, 0.0F, -0.7F);
/*  850 */     this.gunModel[117].setRotationPoint(36.0F, -16.5F, -2.5F);
/*      */     
/*  852 */     this.gunModel[118].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 14, 0.0F, 0.0F, 0.0F, -0.85F, -0.5F, 0.0F, -1.1F, -0.5F, 0.0F, -1.1F, 0.0F, 0.0F, -0.85F, 0.0F, 0.0F, -2.55F, -0.5F, 0.0F, -2.6F, -0.5F, 0.0F, -2.6F, 0.0F, 0.0F, -2.55F);
/*  853 */     this.gunModel[118].setRotationPoint(36.0F, -13.0F, -2.5F);
/*      */     
/*  855 */     this.gunModel[119].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 10, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  856 */     this.gunModel[119].setRotationPoint(36.5F, -23.5F, -0.5F);
/*      */     
/*  858 */     this.gunModel[120].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 10, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F);
/*  859 */     this.gunModel[120].setRotationPoint(36.5F, -22.5F, -0.5F);
/*      */     
/*  861 */     this.gunModel[121].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 11, 0.0F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F);
/*  862 */     this.gunModel[121].setRotationPoint(36.5F, -21.5F, -1.0F);
/*      */     
/*  864 */     this.gunModel[122].addShapeBox(14.0F, -4.0F, -4.5F, 2, 3, 12, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F);
/*  865 */     this.gunModel[122].setRotationPoint(36.5F, -19.5F, -1.5F);
/*      */     
/*  867 */     this.gunModel[123].addShapeBox(14.0F, -4.0F, -4.5F, 2, 3, 14, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.15F);
/*  868 */     this.gunModel[123].setRotationPoint(36.5F, -16.5F, -2.5F);
/*      */     
/*  870 */     this.gunModel[124].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 14, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.15F, 0.0F, -0.5F, -2.5F, 0.0F, -2.0F, -0.35F, 0.0F, -2.0F, -0.35F, 0.0F, -0.5F, -2.5F);
/*  871 */     this.gunModel[124].setRotationPoint(36.5F, -13.5F, -2.5F);
/*      */     
/*  873 */     this.gunModel[125].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 14, 0.0F, 0.0F, 0.0F, -0.7F, -0.5F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F, 0.0F, 0.0F, -0.7F, 0.0F, -0.5F, -0.85F, -0.5F, -0.5F, -1.1F, -0.5F, -0.5F, -1.1F, 0.0F, -0.5F, -0.85F);
/*  874 */     this.gunModel[125].setRotationPoint(36.0F, -13.5F, -2.5F);
/*      */     
/*  876 */     this.gunModel[126].addShapeBox(14.0F, -4.0F, -4.5F, 1, 12, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  877 */     this.gunModel[126].setRotationPoint(6.5F, -22.5F, -1.0F);
/*      */     
/*  879 */     this.gunModel[127].addShapeBox(14.0F, -4.0F, -4.5F, 1, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  880 */     this.gunModel[127].setRotationPoint(38.5F, -23.0F, 2.0F);
/*      */     
/*  882 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 5, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  883 */     this.gunModel[''].setRotationPoint(41.5F, -23.5F, 1.5F);
/*      */     
/*  885 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 2, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F);
/*  886 */     this.gunModel[''].setRotationPoint(39.5F, -23.0F, 2.0F);
/*      */     
/*  888 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 1, 5, 5, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F);
/*  889 */     this.gunModel[''].setRotationPoint(46.5F, -23.0F, 2.0F);
/*      */     
/*  891 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 48, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  892 */     this.gunModel[''].setRotationPoint(-34.5F, -28.0F, 2.0F);
/*      */     
/*  894 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 48, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  895 */     this.gunModel[''].setRotationPoint(-34.5F, -28.0F, 6.0F);
/*      */     
/*  897 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 6, 12, 11, 0.0F, 0.0F, -3.5F, 0.5F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, -3.5F, 0.5F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F);
/*  898 */     this.gunModel[''].setRotationPoint(-40.5F, -23.0F, -1.0F);
/*      */     
/*  900 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 6, 1, 11, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F);
/*  901 */     this.gunModel[''].setRotationPoint(-40.5F, -11.0F, -1.0F);
/*      */     
/*  903 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  904 */     this.gunModel[''].setRotationPoint(13.5F, -29.0F, 1.0F);
/*      */     
/*  906 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  907 */     this.gunModel[''].setRotationPoint(13.5F, -32.0F, 1.0F);
/*      */     
/*  909 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 5, 3, 1, 0.0F, 2.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.5F, 2.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  910 */     this.gunModel[''].setRotationPoint(12.5F, -35.0F, 1.0F);
/*      */     
/*  912 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, 2.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/*  913 */     this.gunModel[''].setRotationPoint(10.5F, -36.0F, 1.0F);
/*      */     
/*  915 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/*  916 */     this.gunModel[''].setRotationPoint(8.5F, -37.5F, 1.0F);
/*      */     
/*  918 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  919 */     this.gunModel[''].setRotationPoint(8.5F, -38.5F, 7.0F);
/*      */     
/*  921 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, -0.5F, 0.5F, -4.0F, -0.5F, 0.5F, -4.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  922 */     this.gunModel[''].setRotationPoint(8.5F, -39.5F, 7.0F);
/*      */     
/*  924 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 35, 5, 1, 0.0F, 0.5F, 0.5F, 0.5F, 0.0F, -1.5F, 0.5F, 0.0F, -1.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  925 */     this.gunModel[''].setRotationPoint(-26.5F, -40.5F, 7.0F);
/*      */     
/*  927 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 7, 2, 1, 0.0F, -1.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  928 */     this.gunModel[''].setRotationPoint(-35.5F, -29.0F, 7.0F);
/*      */     
/*  930 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 4, 7, 1, 0.0F, -1.5F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  931 */     this.gunModel[''].setRotationPoint(-38.5F, -36.0F, 7.0F);
/*      */     
/*  933 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 6, 5, 1, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/*  934 */     this.gunModel[''].setRotationPoint(-36.5F, -41.0F, 7.0F);
/*      */     
/*  936 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 7, 1, 1, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  937 */     this.gunModel[''].setRotationPoint(-35.5F, -42.0F, 7.0F);
/*      */     
/*  939 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 6, 1, 1, 0.0F, -1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/*  940 */     this.gunModel[''].setRotationPoint(-35.5F, -43.0F, 7.0F);
/*      */     
/*  942 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 4, 5, 1, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  943 */     this.gunModel[''].setRotationPoint(-30.5F, -41.0F, 7.0F);
/*      */     
/*  945 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, -3.0F, -0.5F, 0.5F, -3.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  946 */     this.gunModel[''].setRotationPoint(-30.5F, -36.0F, 7.0F);
/*      */     
/*  948 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, -2.0F, -0.5F, 0.5F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  949 */     this.gunModel[''].setRotationPoint(-30.5F, -34.5F, 7.0F);
/*      */     
/*  951 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  952 */     this.gunModel[''].setRotationPoint(8.5F, -38.5F, 1.0F);
/*      */     
/*  954 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.0F, -4.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  955 */     this.gunModel[''].setRotationPoint(8.5F, -39.5F, 1.0F);
/*      */     
/*  957 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 35, 5, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F);
/*  958 */     this.gunModel[''].setRotationPoint(-26.5F, -40.5F, 1.0F);
/*      */     
/*  960 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 6, 5, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F);
/*  961 */     this.gunModel[''].setRotationPoint(-36.5F, -41.0F, 1.0F);
/*      */     
/*  963 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 7, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  964 */     this.gunModel[''].setRotationPoint(-35.5F, -42.0F, 1.0F);
/*      */     
/*  966 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 6, 1, 1, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F);
/*  967 */     this.gunModel[''].setRotationPoint(-35.5F, -43.0F, 1.0F);
/*      */     
/*  969 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 4, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  970 */     this.gunModel[''].setRotationPoint(-30.5F, -41.0F, 1.0F);
/*      */     
/*  972 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  973 */     this.gunModel[''].setRotationPoint(-30.5F, -36.0F, 1.0F);
/*      */     
/*  975 */     this.gunModel[''].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  976 */     this.gunModel[''].setRotationPoint(-30.5F, -34.5F, 1.0F);
/*      */     
/*  978 */     this.gunModel[' '].addShapeBox(14.0F, -4.0F, -4.5F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/*  979 */     this.gunModel[' '].setRotationPoint(12.0F, -28.0F, 1.0F);
/*      */     
/*  981 */     this.gunModel['¡'].addShapeBox(14.0F, -4.0F, -4.5F, 35, 3, 4, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F);
/*  982 */     this.gunModel['¡'].setRotationPoint(-26.5F, -38.5F, 2.5F);
/*      */     
/*  984 */     this.gunModel['¢'].addShapeBox(14.0F, -4.0F, -4.5F, 8, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  985 */     this.gunModel['¢'].setRotationPoint(4.0F, -28.0F, 3.0F);
/*      */     
/*  987 */     this.gunModel['£'].addShapeBox(14.0F, -4.0F, -4.5F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  988 */     this.gunModel['£'].setRotationPoint(13.5F, -29.0F, 7.0F);
/*      */     
/*  990 */     this.gunModel['¤'].addShapeBox(14.0F, -4.0F, -4.5F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.5F, -3.5F, 0.0F, 0.5F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  991 */     this.gunModel['¤'].setRotationPoint(13.5F, -32.0F, 7.0F);
/*      */     
/*  993 */     this.gunModel['¥'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 3, 1, 0.0F, 2.0F, -0.5F, 0.5F, -3.0F, -0.5F, 0.5F, -3.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  994 */     this.gunModel['¥'].setRotationPoint(12.5F, -35.0F, 7.0F);
/*      */     
/*  996 */     this.gunModel['¦'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/*  997 */     this.gunModel['¦'].setRotationPoint(12.5F, -32.0F, 1.0F);
/*      */     
/*  999 */     this.gunModel['§'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 2.0F, 0.0F, 0.5F, -1.5F, 0.0F, 0.5F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1000 */     this.gunModel['§'].setRotationPoint(10.5F, -36.0F, 7.0F);
/*      */     
/* 1002 */     this.gunModel['¨'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1003 */     this.gunModel['¨'].setRotationPoint(8.5F, -37.5F, 7.0F);
/*      */     
/* 1005 */     this.gunModel['©'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 7, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1006 */     this.gunModel['©'].setRotationPoint(12.5F, -29.0F, 1.0F);
/*      */     
/* 1008 */     this.gunModel['ª'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 7, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1009 */     this.gunModel['ª'].setRotationPoint(12.5F, -30.0F, 1.0F);
/*      */     
/* 1011 */     this.gunModel['«'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1012 */     this.gunModel['«'].setRotationPoint(13.5F, -29.0F, 2.0F);
/*      */     
/* 1014 */     this.gunModel['¬'].addShapeBox(14.0F, -4.0F, -4.5F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1015 */     this.gunModel['¬'].setRotationPoint(13.5F, -32.0F, 2.5F);
/*      */     
/* 1017 */     this.gunModel['­'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 3, 4, 0.0F, 2.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, 2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1018 */     this.gunModel['­'].setRotationPoint(12.5F, -35.0F, 2.5F);
/*      */     
/* 1020 */     this.gunModel['®'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 4, 0.0F, 2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1021 */     this.gunModel['®'].setRotationPoint(10.5F, -36.0F, 2.5F);
/*      */     
/* 1023 */     this.gunModel['¯'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F);
/* 1024 */     this.gunModel['¯'].setRotationPoint(8.5F, -37.5F, 2.0F);
/*      */     
/* 1026 */     this.gunModel['°'].addShapeBox(14.0F, -4.0F, -4.5F, 4, 7, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1027 */     this.gunModel['°'].setRotationPoint(-34.5F, -36.0F, 7.0F);
/*      */     
/* 1029 */     this.gunModel['±'].addShapeBox(14.0F, -4.0F, -4.5F, 4, 7, 5, 0.0F, -1.5F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.0F, -1.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1030 */     this.gunModel['±'].setRotationPoint(-38.5F, -36.0F, 1.5F);
/*      */     
/* 1032 */     this.gunModel['²'].addShapeBox(14.0F, -4.0F, -4.5F, 4, 7, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1033 */     this.gunModel['²'].setRotationPoint(-34.5F, -36.0F, 1.5F);
/*      */     
/* 1035 */     this.gunModel['³'].addShapeBox(14.0F, -4.0F, -4.5F, 7, 2, 1, 0.0F, -2.0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1036 */     this.gunModel['³'].setRotationPoint(-40.5F, -29.0F, 7.0F);
/*      */     
/* 1038 */     this.gunModel['´'].addShapeBox(14.0F, -4.0F, -4.5F, 7, 2, 1, 0.0F, -1.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1039 */     this.gunModel['´'].setRotationPoint(-35.5F, -29.0F, 1.5F);
/*      */     
/* 1041 */     this.gunModel['µ'].addShapeBox(14.0F, -4.0F, -4.5F, 31, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1042 */     this.gunModel['µ'].setRotationPoint(-27.0F, -27.0F, 3.0F);
/*      */     
/* 1044 */     this.gunModel['¶'].addShapeBox(14.0F, -4.0F, -4.5F, 6, 2, 8, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.25F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 3.25F, 0.0F);
/* 1045 */     this.gunModel['¶'].setRotationPoint(-40.5F, -26.0F, -1.0F);
/*      */     
/* 1047 */     this.gunModel['·'].addShapeBox(14.0F, -4.0F, -4.5F, 6, 2, 4, 0.0F, 0.0F, 0.0F, -3.0F, -0.25F, 0.0F, -3.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1048 */     this.gunModel['·'].setRotationPoint(-40.5F, -28.0F, -1.0F);
/*      */     
/* 1050 */     this.gunModel['¸'].addShapeBox(14.0F, -4.0F, -4.5F, 6, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 3.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 3.25F, 0.5F);
/* 1051 */     this.gunModel['¸'].setRotationPoint(-40.5F, -26.0F, 7.0F);
/*      */     
/* 1053 */     this.gunModel['¹'].addShapeBox(14.0F, -4.0F, -4.5F, 6, 2, 4, 0.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F);
/* 1054 */     this.gunModel['¹'].setRotationPoint(-40.5F, -28.0F, 6.0F);
/*      */     
/* 1056 */     this.gunModel['º'].addShapeBox(14.0F, -4.0F, -4.5F, 4, 9, 12, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 4.5F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 4.5F, 1.0F);
/* 1057 */     this.gunModel['º'].setRotationPoint(-44.5F, -19.5F, -1.5F);
/*      */     
/* 1059 */     this.gunModel['»'].addShapeBox(14.0F, -4.0F, -4.5F, 4, 1, 12, 0.0F, 0.0F, -5.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 1.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 5.0F, 0.0F);
/* 1060 */     this.gunModel['»'].setRotationPoint(-44.5F, -11.0F, -1.5F);
/*      */     
/* 1062 */     this.gunModel['¼'].addShapeBox(14.0F, -4.0F, -4.5F, 7, 4, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/* 1063 */     this.gunModel['¼'].setRotationPoint(-34.0F, -28.0F, 3.0F);
/*      */     
/* 1065 */     this.gunModel['½'].addShapeBox(14.0F, -4.0F, -4.5F, 14, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1066 */     this.gunModel['½'].setRotationPoint(-58.5F, -19.5F, -2.5F);
/*      */     
/* 1068 */     this.gunModel['¾'].addShapeBox(14.0F, -4.0F, -4.5F, 14, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1069 */     this.gunModel['¾'].setRotationPoint(-58.5F, -14.0F, -2.5F);
/*      */     
/* 1071 */     this.gunModel['¿'].addShapeBox(14.0F, -4.0F, -4.5F, 14, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1072 */     this.gunModel['¿'].setRotationPoint(-58.5F, -6.0F, -2.5F);
/*      */     
/* 1074 */     this.gunModel['À'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 9, 12, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 4.5F, 1.0F, 0.0F, 4.5F, 1.0F, 0.0F, 1.0F, -0.5F);
/* 1075 */     this.gunModel['À'].setRotationPoint(-61.5F, -19.5F, -1.5F);
/*      */     
/* 1077 */     this.gunModel['Á'].addShapeBox(14.0F, -4.0F, -4.5F, 21, 14, 11, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1078 */     this.gunModel['Á'].setRotationPoint(-94.5F, -22.5F, -1.0F);
/*      */     
/* 1080 */     this.gunModel['Â'].addShapeBox(14.0F, -4.0F, -4.5F, 31, 2, 11, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
/* 1081 */     this.gunModel['Â'].setRotationPoint(-94.5F, -28.0F, -1.0F);
/*      */     
/* 1083 */     this.gunModel['Ã'].addShapeBox(14.0F, -4.0F, -4.5F, 4, 2, 11, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1084 */     this.gunModel['Ã'].setRotationPoint(-44.5F, -28.0F, -1.0F);
/*      */     
/* 1086 */     this.gunModel['Ä'].addShapeBox(14.0F, -4.0F, -4.5F, 31, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 2.25F, 1.0F, 0.0F, 2.25F, 1.0F, 0.0F, 2.25F, 0.0F, 0.0F, 2.25F, 0.0F);
/* 1087 */     this.gunModel['Ä'].setRotationPoint(-94.5F, -26.0F, 0.0F);
/*      */     
/* 1089 */     this.gunModel['Å'].addShapeBox(14.0F, -4.0F, -4.5F, 14, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1090 */     this.gunModel['Å'].setRotationPoint(-58.5F, -15.5F, -2.0F);
/*      */     
/* 1092 */     this.gunModel['Æ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 12, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1093 */     this.gunModel['Æ'].setRotationPoint(-58.5F, -15.0F, -2.5F);
/*      */     
/* 1095 */     this.gunModel['Ç'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1096 */     this.gunModel['Ç'].setRotationPoint(-58.5F, -15.5F, -2.5F);
/*      */     
/* 1098 */     this.gunModel['È'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 12, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1099 */     this.gunModel['È'].setRotationPoint(-45.5F, -15.0F, -2.5F);
/*      */     
/* 1101 */     this.gunModel['É'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 12, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1102 */     this.gunModel['É'].setRotationPoint(-45.5F, -15.5F, -2.5F);
/*      */     
/* 1104 */     this.gunModel['Ê'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 14, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, 0.5F, -2.5F, 0.0F, 4.0F, -1.0F, 0.0F, 4.0F, -1.0F, 0.0F, 0.5F, -2.5F);
/* 1105 */     this.gunModel['Ê'].setRotationPoint(-61.5F, -10.0F, -2.5F);
/*      */     
/* 1107 */     this.gunModel['Ë'].addShapeBox(14.0F, -4.0F, -4.5F, 10, 3, 11, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1108 */     this.gunModel['Ë'].setRotationPoint(-73.5F, -22.5F, -1.0F);
/*      */     
/* 1110 */     this.gunModel['Ì'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 5, 6, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 2.0F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F);
/* 1111 */     this.gunModel['Ì'].setRotationPoint(-42.5F, -26.0F, 0.0F);
/*      */     
/* 1113 */     this.gunModel['Í'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 5, 13, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F);
/* 1114 */     this.gunModel['Í'].setRotationPoint(-58.5F, -26.0F, -2.0F);
/*      */     
/* 1116 */     this.gunModel['Î'].addShapeBox(14.0F, -4.0F, -4.5F, 6, 3, 12, 0.0F, 0.0F, -3.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.0F, -3.25F, 0.0F, 0.0F, 1.25F, 0.0F, -0.25F, -2.75F, -0.5F, -0.25F, -2.75F, -0.5F, 0.0F, 1.25F, 0.0F);
/* 1117 */     this.gunModel['Î'].setRotationPoint(-40.5F, -24.0F, -1.5F);
/*      */     
/* 1119 */     this.gunModel['Ï'].addShapeBox(14.0F, -4.0F, -4.5F, 14, 2, 11, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1120 */     this.gunModel['Ï'].setRotationPoint(-58.5F, -28.0F, -1.0F);
/*      */     
/* 1122 */     this.gunModel['Ð'].addShapeBox(14.0F, -4.0F, -4.5F, 4, 5, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 2.5F);
/* 1123 */     this.gunModel['Ð'].setRotationPoint(-44.5F, -26.0F, 6.0F);
/*      */     
/* 1125 */     this.gunModel['Ñ'].addShapeBox(14.0F, -4.0F, -4.5F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
/* 1126 */     this.gunModel['Ñ'].setRotationPoint(-44.5F, -20.75F, -1.5F);
/*      */     
/* 1128 */     this.gunModel['Ò'].addShapeBox(14.0F, -4.0F, -4.5F, 14, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1129 */     this.gunModel['Ò'].setRotationPoint(-58.5F, -20.75F, -2.5F);
/*      */     
/* 1131 */     this.gunModel['Ó'].addShapeBox(14.0F, -4.0F, -4.5F, 12, 5, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 2.5F, 0.0F, 0.25F, 2.5F);
/* 1132 */     this.gunModel['Ó'].setRotationPoint(-56.5F, -26.0F, 6.0F);
/*      */     
/* 1134 */     this.gunModel['Ô'].addShapeBox(14.0F, -4.0F, -4.5F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1135 */     this.gunModel['Ô'].setRotationPoint(12.0F, -28.0F, 6.5F);
/*      */     
/* 1137 */     this.gunModel['Õ'].addShapeBox(14.0F, -4.0F, -4.5F, 7, 2, 5, 0.0F, -2.0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.25F, 0.0F, 0.5F, -1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1138 */     this.gunModel['Õ'].setRotationPoint(-40.5F, -29.0F, 1.5F);
/*      */     
/* 1140 */     this.gunModel['Ö'].addShapeBox(14.0F, -4.0F, -4.5F, 21, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -6.0F, 0.0F, -0.5F, -6.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1141 */     this.gunModel['Ö'].setRotationPoint(-94.5F, -8.5F, -1.0F);
/*      */     
/* 1143 */     this.gunModel['×'].addShapeBox(14.0F, -4.0F, -4.5F, 16, 2, 11, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, -4.0F, 0.0F, -1.5F, -4.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1144 */     this.gunModel['×'].setRotationPoint(-94.5F, -6.5F, -1.0F);
/*      */     
/* 1146 */     this.gunModel['Ø'].addShapeBox(14.0F, -4.0F, -4.5F, 12, 3, 9, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F, -3.5F, 0.0F, -3.0F, -3.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
/* 1147 */     this.gunModel['Ø'].setRotationPoint(-94.5F, -4.5F, 0.0F);
/*      */     
/* 1149 */     this.gunModel['Ù'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 2, 11, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F);
/* 1150 */     this.gunModel['Ù'].setRotationPoint(-63.5F, -28.0F, -1.0F);
/*      */     
/* 1152 */     this.gunModel['Ú'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 5, 13, 0.0F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.85F, 0.0F, -1.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -1.25F, -0.5F);
/* 1153 */     this.gunModel['Ú'].setRotationPoint(-61.5F, -26.0F, -2.0F);
/*      */     
/* 1155 */     this.gunModel['Û'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 14, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5F, -1.0F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -1.5F);
/* 1156 */     this.gunModel['Û'].setRotationPoint(-61.5F, -20.75F, -2.5F);
/*      */     
/* 1158 */     this.gunModel['Ü'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 3, 13, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -1.85F, 0.0F, 0.0F, -2.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F, -0.5F, 0.0F, 0.25F, -1.0F);
/* 1159 */     this.gunModel['Ü'].setRotationPoint(-63.5F, -26.0F, -2.0F);
/*      */     
/* 1161 */     this.gunModel['Ý'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 3, 11, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1162 */     this.gunModel['Ý'].setRotationPoint(-63.5F, -22.5F, -1.0F);
/*      */     
/* 1164 */     this.gunModel['Þ'].addShapeBox(14.0F, -4.0F, -4.5F, 12, 4, 9, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1165 */     this.gunModel['Þ'].setRotationPoint(-73.5F, -19.5F, 0.0F);
/*      */     
/* 1167 */     this.gunModel['ß'].addShapeBox(14.0F, -4.0F, -4.5F, 12, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1168 */     this.gunModel['ß'].setRotationPoint(-73.5F, -10.5F, 0.0F);
/*      */     
/* 1170 */     this.gunModel['à'].addShapeBox(14.0F, -4.0F, -4.5F, 8, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1171 */     this.gunModel['à'].setRotationPoint(-71.5F, -14.5F, 1.0F);
/*      */     
/* 1173 */     this.gunModel['á'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 5, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1174 */     this.gunModel['á'].setRotationPoint(-73.5F, -15.5F, 0.0F);
/*      */     
/* 1176 */     this.gunModel['â'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 5, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1177 */     this.gunModel['â'].setRotationPoint(-62.5F, -15.5F, 0.0F);
/*      */     
/* 1179 */     this.gunModel['ã'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F);
/* 1180 */     this.gunModel['ã'].setRotationPoint(-72.5F, -14.5F, 0.0F);
/*      */     
/* 1182 */     this.gunModel['ä'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 9, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F);
/* 1183 */     this.gunModel['ä'].setRotationPoint(-63.5F, -14.5F, 0.0F);
/*      */     
/* 1185 */     this.gunModel['å'].addShapeBox(14.0F, -4.0F, -4.5F, 8, 1, 7, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1186 */     this.gunModel['å'].setRotationPoint(-71.5F, -11.5F, 1.0F);
/*      */     
/* 1188 */     this.gunModel['æ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1189 */     this.gunModel['æ'].setRotationPoint(-72.5F, -11.5F, 0.0F);
/*      */     
/* 1191 */     this.gunModel['ç'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F);
/* 1192 */     this.gunModel['ç'].setRotationPoint(-72.5F, -15.5F, 0.0F);
/*      */     
/* 1194 */     this.gunModel['è'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 9, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1195 */     this.gunModel['è'].setRotationPoint(-63.5F, -11.5F, 0.0F);
/*      */     
/* 1197 */     this.gunModel['é'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F);
/* 1198 */     this.gunModel['é'].setRotationPoint(-63.5F, -15.5F, 0.0F);
/*      */     
/* 1200 */     this.gunModel['ê'].addShapeBox(14.0F, -4.0F, -4.5F, 8, 1, 7, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1201 */     this.gunModel['ê'].setRotationPoint(-71.5F, -15.5F, 1.0F);
/*      */     
/* 1203 */     this.gunModel['ë'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1204 */     this.gunModel['ë'].setRotationPoint(-73.5F, -19.5F, -1.0F);
/*      */     
/* 1206 */     this.gunModel['ì'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 11, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F);
/* 1207 */     this.gunModel['ì'].setRotationPoint(-62.5F, -19.5F, -1.0F);
/*      */     
/* 1209 */     this.gunModel['í'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1210 */     this.gunModel['í'].setRotationPoint(-73.5F, -18.5F, -1.0F);
/*      */     
/* 1212 */     this.gunModel['î'].addShapeBox(14.0F, -4.0F, -4.5F, 12, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1213 */     this.gunModel['î'].setRotationPoint(-73.5F, -9.5F, 0.0F);
/*      */     
/* 1215 */     this.gunModel['ï'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 9, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1216 */     this.gunModel['ï'].setRotationPoint(-33.5F, -36.0F, 7.75F);
/*      */     
/* 1218 */     this.gunModel['ð'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1219 */     this.gunModel['ð'].setRotationPoint(-33.5F, -37.0F, 7.75F);
/*      */     
/* 1221 */     this.gunModel['ñ'].addShapeBox(14.0F, -4.0F, -4.5F, 34, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1222 */     this.gunModel['ñ'].setRotationPoint(-31.5F, -40.0F, 7.75F);
/*      */     
/* 1224 */     this.gunModel['ò'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1225 */     this.gunModel['ò'].setRotationPoint(-33.5F, -39.0F, 7.75F);
/*      */     
/* 1227 */     this.gunModel['ó'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1228 */     this.gunModel['ó'].setRotationPoint(-33.5F, -40.0F, 7.75F);
/*      */     
/* 1230 */     this.gunModel['ô'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 9, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1231 */     this.gunModel['ô'].setRotationPoint(-33.5F, -36.0F, 0.25F);
/*      */     
/* 1233 */     this.gunModel['õ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1234 */     this.gunModel['õ'].setRotationPoint(-33.5F, -37.0F, 0.25F);
/*      */     
/* 1236 */     this.gunModel['ö'].addShapeBox(14.0F, -4.0F, -4.5F, 34, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1237 */     this.gunModel['ö'].setRotationPoint(-31.5F, -40.0F, 0.25F);
/*      */     
/* 1239 */     this.gunModel['÷'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1240 */     this.gunModel['÷'].setRotationPoint(-33.5F, -39.0F, 0.25F);
/*      */     
/* 1242 */     this.gunModel['ø'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1243 */     this.gunModel['ø'].setRotationPoint(-33.5F, -40.0F, 0.25F);
/*      */     
/* 1245 */     this.gunModel['ù'].addShapeBox(14.0F, -4.0F, -4.5F, 8, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1246 */     this.gunModel['ù'].setRotationPoint(-35.0F, -39.5F, 2.5F);
/*      */     
/* 1248 */     this.gunModel['ú'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
/* 1249 */     this.gunModel['ú'].setRotationPoint(-33.5F, -27.0F, 7.75F);
/*      */     
/* 1251 */     this.gunModel['û'].addShapeBox(14.0F, -4.0F, -4.5F, 48, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1252 */     this.gunModel['û'].setRotationPoint(-32.5F, -26.0F, 8.5F);
/*      */     
/* 1254 */     this.gunModel['ü'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F);
/* 1255 */     this.gunModel['ü'].setRotationPoint(15.5F, -26.0F, 8.5F);
/*      */     
/* 1257 */     this.gunModel['ý'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, 0.75F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 1258 */     this.gunModel['ý'].setRotationPoint(17.5F, -26.5F, 8.25F);
/*      */     
/* 1260 */     this.gunModel['þ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F);
/* 1261 */     this.gunModel['þ'].setRotationPoint(-33.5F, -27.0F, 0.25F);
/*      */     
/* 1263 */     this.gunModel['ÿ'].addShapeBox(14.0F, -4.0F, -4.5F, 48, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1264 */     this.gunModel['ÿ'].setRotationPoint(-32.5F, -26.0F, -0.5F);
/*      */     
/* 1266 */     this.gunModel['Ā'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.25F, 0.0F, 0.0F, 0.0F);
/* 1267 */     this.gunModel['Ā'].setRotationPoint(15.5F, -26.0F, -0.5F);
/*      */     
/* 1269 */     this.gunModel['ā'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, 0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F);
/* 1270 */     this.gunModel['ā'].setRotationPoint(17.5F, -26.5F, -0.25F);
/*      */     
/* 1272 */     this.gunModel['Ă'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1273 */     this.gunModel['Ă'].setRotationPoint(17.5F, -35.0F, 2.5F);
/*      */     
/* 1275 */     this.gunModel['ă'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1276 */     this.gunModel['ă'].setRotationPoint(13.5F, -40.0F, 2.5F);
/*      */     
/* 1278 */     this.gunModel['Ą'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1279 */     this.gunModel['Ą'].setRotationPoint(13.5F, -35.0F, 2.5F);
/*      */     
/* 1281 */     this.gunModel['ą'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1282 */     this.gunModel['ą'].setRotationPoint(13.5F, -35.0F, 5.5F);
/*      */     
/* 1284 */     this.gunModel['Ć'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1285 */     this.gunModel['Ć'].setRotationPoint(17.5F, -35.0F, 5.5F);
/*      */     
/* 1287 */     this.gunModel['ć'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1288 */     this.gunModel['ć'].setRotationPoint(13.5F, -40.0F, 5.5F);
/*      */     
/* 1290 */     this.gunModel['Ĉ'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1291 */     this.gunModel['Ĉ'].setRotationPoint(13.5F, -40.0F, 3.5F);
/*      */     
/* 1293 */     this.gunModel['ĉ'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1294 */     this.gunModel['ĉ'].setRotationPoint(13.5F, -36.0F, 3.5F);
/*      */     
/* 1296 */     this.gunModel['Ċ'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1297 */     this.gunModel['Ċ'].setRotationPoint(14.5F, -37.0F, 6.0F);
/*      */     
/* 1299 */     this.gunModel['ċ'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1300 */     this.gunModel['ċ'].setRotationPoint(14.5F, -38.0F, 6.0F);
/*      */     
/* 1302 */     this.gunModel['Č'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1303 */     this.gunModel['Č'].setRotationPoint(14.5F, -39.0F, 6.0F);
/*      */     
/* 1305 */     this.gunModel['č'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1306 */     this.gunModel['č'].setRotationPoint(14.5F, -37.0F, 2.0F);
/*      */     
/* 1308 */     this.gunModel['Ď'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1309 */     this.gunModel['Ď'].setRotationPoint(14.5F, -38.0F, 2.0F);
/*      */     
/* 1311 */     this.gunModel['ď'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1312 */     this.gunModel['ď'].setRotationPoint(14.5F, -39.0F, 2.0F);
/*      */     
/* 1314 */     this.gunModel['Đ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1315 */     this.gunModel['Đ'].setRotationPoint(14.5F, -35.0F, 5.5F);
/*      */     
/* 1317 */     this.gunModel['đ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1318 */     this.gunModel['đ'].setRotationPoint(16.5F, -35.0F, 5.5F);
/*      */     
/* 1320 */     this.gunModel['Ē'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1321 */     this.gunModel['Ē'].setRotationPoint(14.5F, -35.0F, 2.5F);
/*      */     
/* 1323 */     this.gunModel['ē'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1324 */     this.gunModel['ē'].setRotationPoint(16.5F, -35.0F, 2.5F);
/*      */     
/* 1326 */     this.gunModel['Ĕ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1327 */     this.gunModel['Ĕ'].setRotationPoint(17.5F, -33.0F, 3.5F);
/*      */     
/* 1329 */     this.gunModel['ĕ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1330 */     this.gunModel['ĕ'].setRotationPoint(17.5F, -34.0F, 4.5F);
/*      */     
/* 1332 */     this.gunModel['Ė'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1333 */     this.gunModel['Ė'].setRotationPoint(17.5F, -34.0F, 3.5F);
/*      */     
/* 1335 */     this.gunModel['ė'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1336 */     this.gunModel['ė'].setRotationPoint(17.5F, -35.0F, 4.5F);
/*      */     
/* 1338 */     this.gunModel['Ę'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 1339 */     this.gunModel['Ę'].setRotationPoint(17.5F, -35.0F, 3.5F);
/*      */     
/* 1341 */     this.gunModel['ę'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1342 */     this.gunModel['ę'].setRotationPoint(13.5F, -37.0F, 4.5F);
/*      */     
/* 1344 */     this.gunModel['Ě'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1345 */     this.gunModel['Ě'].setRotationPoint(13.5F, -37.0F, 3.5F);
/*      */     
/* 1347 */     this.gunModel['ě'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1348 */     this.gunModel['ě'].setRotationPoint(13.5F, -39.0F, 4.5F);
/*      */     
/* 1350 */     this.gunModel['Ĝ'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 1351 */     this.gunModel['Ĝ'].setRotationPoint(13.5F, -39.0F, 3.5F);
/*      */     
/* 1353 */     this.gunModel['ĝ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1354 */     this.gunModel['ĝ'].setRotationPoint(13.5F, -35.0F, 4.5F);
/*      */     
/* 1356 */     this.gunModel['Ğ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
/* 1357 */     this.gunModel['Ğ'].setRotationPoint(13.5F, -35.0F, 3.5F);
/*      */     
/* 1359 */     this.gunModel['ğ'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1360 */     this.gunModel['ğ'].setRotationPoint(13.5F, -43.0F, 1.5F);
/*      */     
/* 1362 */     this.gunModel['Ġ'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/* 1363 */     this.gunModel['Ġ'].setRotationPoint(13.5F, -41.0F, 1.75F);
/*      */     
/* 1365 */     this.gunModel['ġ'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1366 */     this.gunModel['ġ'].setRotationPoint(13.5F, -41.0F, 6.25F);
/*      */     
/* 1368 */     this.gunModel['Ģ'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1369 */     this.gunModel['Ģ'].setRotationPoint(13.5F, -44.0F, 6.75F);
/*      */     
/* 1371 */     this.gunModel['ģ'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1372 */     this.gunModel['ģ'].setRotationPoint(13.5F, -42.0F, 6.75F);
/*      */     
/* 1374 */     this.gunModel['Ĥ'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1375 */     this.gunModel['Ĥ'].setRotationPoint(13.5F, -42.0F, 1.25F);
/*      */     
/* 1377 */     this.gunModel['ĥ'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1378 */     this.gunModel['ĥ'].setRotationPoint(13.5F, -44.0F, 1.25F);
/*      */     
/* 1380 */     this.gunModel['Ħ'].addShapeBox(14.0F, -4.0F, -4.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1381 */     this.gunModel['Ħ'].setRotationPoint(13.5F, -43.0F, 6.5F);
/*      */     
/* 1383 */     this.gunModel['ħ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 4, 0.0F, -0.25F, -0.25F, -1.75F, -0.5F, -0.25F, -1.75F, -0.5F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F);
/* 1384 */     this.gunModel['ħ'].setRotationPoint(13.5F, -45.0F, 2.0F);
/*      */     
/* 1386 */     this.gunModel['Ĩ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 4, 0.0F, -0.5F, -0.25F, -1.75F, -0.25F, -0.25F, -1.75F, -0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.75F, -0.5F, 0.0F, 0.75F);
/* 1387 */     this.gunModel['Ĩ'].setRotationPoint(16.5F, -45.0F, 2.0F);
/*      */     
/* 1389 */     this.gunModel['ĩ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1390 */     this.gunModel['ĩ'].setRotationPoint(15.0F, -43.0F, 4.0F);
/*      */     
/* 1392 */     this.gunModel['Ī'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1393 */     this.gunModel['Ī'].setRotationPoint(15.0F, -41.0F, 5.0F);
/*      */     
/* 1395 */     this.gunModel['ī'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1396 */     this.gunModel['ī'].setRotationPoint(15.0F, -41.0F, 3.0F);
/*      */     
/* 1398 */     this.gunModel['Ĭ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1399 */     this.gunModel['Ĭ'].setRotationPoint(-31.5F, -41.0F, 2.5F);
/*      */     
/* 1401 */     this.gunModel['ĭ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1402 */     this.gunModel['ĭ'].setRotationPoint(-30.5F, -41.0F, 2.5F);
/*      */     
/* 1404 */     this.gunModel['Į'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 4, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1405 */     this.gunModel['Į'].setRotationPoint(-35.0F, -40.0F, 2.5F);
/*      */     
/* 1407 */     this.gunModel['į'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 4, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1408 */     this.gunModel['į'].setRotationPoint(-33.5F, -41.0F, 2.5F);
/*      */     
/* 1410 */     this.gunModel['İ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1411 */     this.gunModel['İ'].setRotationPoint(-31.5F, -43.0F, 2.5F);
/*      */     
/* 1413 */     this.gunModel['ı'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1414 */     this.gunModel['ı'].setRotationPoint(-31.5F, -43.0F, 5.5F);
/*      */     
/* 1416 */     this.gunModel['Ĳ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1417 */     this.gunModel['Ĳ'].setRotationPoint(-31.5F, -42.0F, 3.5F);
/*      */     
/* 1419 */     this.gunModel['ĳ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1420 */     this.gunModel['ĳ'].setRotationPoint(-31.5F, -42.5F, 4.5F);
/*      */     
/* 1422 */     this.gunModel['Ĵ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F);
/* 1423 */     this.gunModel['Ĵ'].setRotationPoint(-31.5F, -42.5F, 3.5F);
/*      */     
/* 1425 */     this.gunModel['ĵ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1426 */     this.gunModel['ĵ'].setRotationPoint(-31.65F, -42.75F, 2.5F);
/*      */     
/* 1428 */     this.gunModel['Ķ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1429 */     this.gunModel['Ķ'].setRotationPoint(-31.65F, -42.75F, 5.5F);
/*      */     
/* 1431 */     this.gunModel['ķ'].addShapeBox(14.0F, -4.0F, -4.5F, 6, 3, 4, 0.0F, -0.55F, 0.5F, 0.0F, -4.5F, 0.5F, 0.0F, -4.5F, 0.5F, 0.0F, -0.55F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1432 */     this.gunModel['ķ'].setRotationPoint(-36.5F, -39.0F, 2.5F);
/*      */     
/* 1434 */     this.gunModel['ĸ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
/* 1435 */     this.gunModel['ĸ'].setRotationPoint(14.85F, -42.75F, 4.0F);
/*      */     
/* 1437 */     this.gunModel['Ĺ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 9, 6, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1438 */     this.gunModel['Ĺ'].setRotationPoint(-35.5F, -36.0F, 1.5F);
/*      */     
/* 1440 */     this.gunModel['ĺ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 6, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.1F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.1F, -0.75F, 0.0F);
/* 1441 */     this.gunModel['ĺ'].setRotationPoint(-36.75F, -36.0F, 1.5F);
/*      */     
/* 1443 */     this.gunModel['Ļ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 6, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -0.75F, 0.0F, 1.0F);
/* 1444 */     this.gunModel['Ļ'].setRotationPoint(-35.5F, -27.0F, 1.5F);
/*      */     
/* 1446 */     this.gunModel['ļ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 8, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.0F, -0.75F, 0.25F, 1.0F);
/* 1447 */     this.gunModel['ļ'].setRotationPoint(-35.5F, -26.0F, 0.5F);
/*      */     
/* 1449 */     this.gunModel['Ľ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 13, 9, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1450 */     this.gunModel['Ľ'].setRotationPoint(-35.5F, -24.0F, 0.0F);
/*      */     
/* 1452 */     this.gunModel['ľ'].addShapeBox(14.0F, -4.0F, -4.5F, 7, 2, 9, 0.0F, -1.0F, -2.5F, 1.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -1.0F, -2.5F, 1.0F, -1.0F, 2.5F, 1.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -1.0F, 2.5F, 1.0F);
/* 1453 */     this.gunModel['ľ'].setRotationPoint(-41.5F, -24.0F, 0.0F);
/*      */     
/* 1455 */     this.gunModel['Ŀ'].addShapeBox(14.0F, -4.0F, -4.5F, 4, 1, 11, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 1.0F);
/* 1456 */     this.gunModel['Ŀ'].setRotationPoint(-44.5F, -19.75F, -1.0F);
/*      */     
/* 1458 */     this.gunModel['ŀ'].addShapeBox(14.0F, -4.0F, -4.5F, 14, 1, 11, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F);
/* 1459 */     this.gunModel['ŀ'].setRotationPoint(-58.5F, -19.75F, -1.0F);
/*      */     
/* 1461 */     this.gunModel['Ł'].addShapeBox(14.0F, -4.0F, -4.5F, 14, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1462 */     this.gunModel['Ł'].setRotationPoint(-58.5F, -19.5F, 9.5F);
/*      */     
/* 1464 */     this.gunModel['ł'].addShapeBox(14.0F, -4.0F, -4.5F, 14, 7, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1465 */     this.gunModel['ł'].setRotationPoint(-58.5F, -13.0F, 9.5F);
/*      */     
/* 1467 */     this.gunModel['Ń'].addShapeBox(14.0F, -4.0F, -4.5F, 14, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1468 */     this.gunModel['Ń'].setRotationPoint(-58.5F, -16.5F, 10.0F);
/*      */     
/* 1470 */     this.gunModel['ń'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1471 */     this.gunModel['ń'].setRotationPoint(-58.5F, -14.0F, 9.5F);
/*      */     
/* 1473 */     this.gunModel['Ņ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1474 */     this.gunModel['Ņ'].setRotationPoint(-58.5F, -16.5F, 9.5F);
/*      */     
/* 1476 */     this.gunModel['ņ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1477 */     this.gunModel['ņ'].setRotationPoint(-45.5F, -14.0F, 9.5F);
/*      */     
/* 1479 */     this.gunModel['Ň'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1480 */     this.gunModel['Ň'].setRotationPoint(-45.5F, -16.5F, 9.5F);
/*      */     
/* 1482 */     this.gunModel['ň'].addShapeBox(14.0F, -4.0F, -4.5F, 14, 1, 1, 0.0F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, -0.6F, 0.0F, -0.5F, 0.6F, 0.0F, -0.5F, 0.6F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1483 */     this.gunModel['ň'].setRotationPoint(-56.5F, -27.0F, -0.75F);
/*      */     
/* 1485 */     this.gunModel['ŉ'].addShapeBox(14.0F, -4.0F, -4.5F, 12, 1, 1, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/* 1486 */     this.gunModel['ŉ'].setRotationPoint(-56.5F, -20.75F, -2.75F);
/*      */     
/* 1488 */     this.gunModel['Ŋ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.75F);
/* 1489 */     this.gunModel['Ŋ'].setRotationPoint(-44.5F, -20.75F, -2.75F);
/*      */     
/* 1491 */     this.gunModel['ŋ'].addShapeBox(14.0F, -4.0F, -4.5F, 14, 5, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/* 1492 */     this.gunModel['ŋ'].setRotationPoint(-56.5F, -26.0F, -1.0F);
/*      */     
/* 1494 */     this.gunModel['Ō'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 2, 0.0F, -1.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F);
/* 1495 */     this.gunModel['Ō'].setRotationPoint(-57.5F, -26.5F, -0.75F);
/*      */     
/* 1497 */     this.gunModel['ō'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 6, 2, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.75F, 1.0F, 0.0F, -0.75F, 1.0F, 0.0F, -0.75F, -2.75F, -0.25F, -0.75F, -2.75F);
/* 1498 */     this.gunModel['ō'].setRotationPoint(-57.5F, -26.0F, -1.75F);
/*      */     
/* 1500 */     this.gunModel['Ŏ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 6, 2, 0.0F, -0.25F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.75F, 0.5F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F);
/* 1501 */     this.gunModel['Ŏ'].setRotationPoint(-42.75F, -26.0F, -1.75F);
/*      */     
/* 1503 */     this.gunModel['ŏ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1504 */     this.gunModel['ŏ'].setRotationPoint(-1.5F, -14.5F, -1.5F);
/*      */     
/* 1506 */     this.gunModel['Ő'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1507 */     this.gunModel['Ő'].setRotationPoint(0.5F, -14.5F, -1.5F);
/*      */     
/* 1509 */     this.gunModel['ő'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1510 */     this.gunModel['ő'].setRotationPoint(-1.5F, -15.5F, -1.5F);
/*      */     
/* 1512 */     this.gunModel['Œ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1513 */     this.gunModel['Œ'].setRotationPoint(-1.0F, -16.0F, -1.5F);
/*      */     
/* 1515 */     this.gunModel['œ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1516 */     this.gunModel['œ'].setRotationPoint(-0.5F, -15.5F, -1.5F);
/*      */     
/* 1518 */     this.gunModel['Ŕ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1519 */     this.gunModel['Ŕ'].setRotationPoint(0.5F, -15.5F, -1.5F);
/*      */     
/* 1521 */     this.gunModel['ŕ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1522 */     this.gunModel['ŕ'].setRotationPoint(0.0F, -16.0F, -1.5F);
/*      */     
/* 1524 */     this.gunModel['Ŗ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1525 */     this.gunModel['Ŗ'].setRotationPoint(-0.5F, -13.0F, -1.5F);
/*      */     
/* 1527 */     this.gunModel['ŗ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1528 */     this.gunModel['ŗ'].setRotationPoint(0.5F, -13.5F, -1.5F);
/*      */     
/* 1530 */     this.gunModel['Ř'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1531 */     this.gunModel['Ř'].setRotationPoint(-1.0F, -13.0F, -1.5F);
/*      */     
/* 1533 */     this.gunModel['ř'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1534 */     this.gunModel['ř'].setRotationPoint(0.0F, -13.0F, -1.5F);
/*      */     
/* 1536 */     this.gunModel['Ś'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1537 */     this.gunModel['Ś'].setRotationPoint(0.5F, -14.0F, -1.5F);
/*      */     
/* 1539 */     this.gunModel['ś'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1540 */     this.gunModel['ś'].setRotationPoint(-1.5F, -13.5F, -1.5F);
/*      */     
/* 1542 */     this.gunModel['Ŝ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1543 */     this.gunModel['Ŝ'].setRotationPoint(-1.5F, -14.0F, -1.5F);
/*      */     
/* 1545 */     this.gunModel['ŝ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1546 */     this.gunModel['ŝ'].setRotationPoint(0.5F, -15.0F, -1.5F);
/*      */     
/* 1548 */     this.gunModel['Ş'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1549 */     this.gunModel['Ş'].setRotationPoint(-1.5F, -15.0F, -1.5F);
/*      */     
/* 1551 */     this.gunModel['ş'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1552 */     this.gunModel['ş'].setRotationPoint(-1.5F, -13.5F, 9.5F);
/*      */     
/* 1554 */     this.gunModel['Š'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1555 */     this.gunModel['Š'].setRotationPoint(-1.5F, -15.5F, 9.5F);
/*      */     
/* 1557 */     this.gunModel['š'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1558 */     this.gunModel['š'].setRotationPoint(-1.5F, -14.5F, 9.5F);
/*      */     
/* 1560 */     this.gunModel['Ţ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1561 */     this.gunModel['Ţ'].setRotationPoint(-39.0F, -14.5F, 9.75F);
/*      */     
/* 1563 */     this.gunModel['ţ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1564 */     this.gunModel['ţ'].setRotationPoint(-37.0F, -14.5F, 9.75F);
/*      */     
/* 1566 */     this.gunModel['Ť'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1567 */     this.gunModel['Ť'].setRotationPoint(-39.0F, -15.5F, 9.75F);
/*      */     
/* 1569 */     this.gunModel['ť'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1570 */     this.gunModel['ť'].setRotationPoint(-38.5F, -16.0F, 9.75F);
/*      */     
/* 1572 */     this.gunModel['Ŧ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1573 */     this.gunModel['Ŧ'].setRotationPoint(-38.0F, -15.5F, 9.75F);
/*      */     
/* 1575 */     this.gunModel['ŧ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1576 */     this.gunModel['ŧ'].setRotationPoint(-37.0F, -15.5F, 9.75F);
/*      */     
/* 1578 */     this.gunModel['Ũ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1579 */     this.gunModel['Ũ'].setRotationPoint(-37.5F, -16.0F, 9.75F);
/*      */     
/* 1581 */     this.gunModel['ũ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1582 */     this.gunModel['ũ'].setRotationPoint(-38.0F, -13.0F, 9.75F);
/*      */     
/* 1584 */     this.gunModel['Ū'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1585 */     this.gunModel['Ū'].setRotationPoint(-37.0F, -13.5F, 9.75F);
/*      */     
/* 1587 */     this.gunModel['ū'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1588 */     this.gunModel['ū'].setRotationPoint(-38.5F, -13.0F, 9.75F);
/*      */     
/* 1590 */     this.gunModel['Ŭ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1591 */     this.gunModel['Ŭ'].setRotationPoint(-37.5F, -13.0F, 9.75F);
/*      */     
/* 1593 */     this.gunModel['ŭ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1594 */     this.gunModel['ŭ'].setRotationPoint(-37.0F, -14.0F, 9.75F);
/*      */     
/* 1596 */     this.gunModel['Ů'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1597 */     this.gunModel['Ů'].setRotationPoint(-39.0F, -13.5F, 9.75F);
/*      */     
/* 1599 */     this.gunModel['ů'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1600 */     this.gunModel['ů'].setRotationPoint(-39.0F, -14.0F, 9.75F);
/*      */     
/* 1602 */     this.gunModel['Ű'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1603 */     this.gunModel['Ű'].setRotationPoint(-37.0F, -15.0F, 9.75F);
/*      */     
/* 1605 */     this.gunModel['ű'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1606 */     this.gunModel['ű'].setRotationPoint(-39.0F, -15.0F, 9.75F);
/*      */     
/* 1608 */     this.gunModel['Ų'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1609 */     this.gunModel['Ų'].setRotationPoint(-38.5F, -14.5F, 9.75F);
/*      */     
/* 1611 */     this.gunModel['ų'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 1612 */     this.gunModel['ų'].setRotationPoint(-38.5F, -14.0F, 9.75F);
/*      */     
/* 1614 */     this.gunModel['Ŵ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1615 */     this.gunModel['Ŵ'].setRotationPoint(-38.5F, -15.0F, 9.75F);
/*      */     
/* 1617 */     this.gunModel['ŵ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1618 */     this.gunModel['ŵ'].setRotationPoint(-39.0F, -14.5F, -1.75F);
/*      */     
/* 1620 */     this.gunModel['Ŷ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1621 */     this.gunModel['Ŷ'].setRotationPoint(-37.0F, -14.5F, -1.75F);
/*      */     
/* 1623 */     this.gunModel['ŷ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1624 */     this.gunModel['ŷ'].setRotationPoint(-39.0F, -15.5F, -1.75F);
/*      */     
/* 1626 */     this.gunModel['Ÿ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1627 */     this.gunModel['Ÿ'].setRotationPoint(-38.5F, -16.0F, -1.75F);
/*      */     
/* 1629 */     this.gunModel['Ź'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1630 */     this.gunModel['Ź'].setRotationPoint(-38.0F, -15.5F, -1.75F);
/*      */     
/* 1632 */     this.gunModel['ź'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1633 */     this.gunModel['ź'].setRotationPoint(-37.0F, -15.5F, -1.75F);
/*      */     
/* 1635 */     this.gunModel['Ż'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1636 */     this.gunModel['Ż'].setRotationPoint(-37.5F, -16.0F, -1.75F);
/*      */     
/* 1638 */     this.gunModel['ż'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1639 */     this.gunModel['ż'].setRotationPoint(-38.0F, -13.0F, -1.75F);
/*      */     
/* 1641 */     this.gunModel['Ž'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1642 */     this.gunModel['Ž'].setRotationPoint(-37.0F, -13.5F, -1.75F);
/*      */     
/* 1644 */     this.gunModel['ž'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1645 */     this.gunModel['ž'].setRotationPoint(-38.5F, -13.0F, -1.75F);
/*      */     
/* 1647 */     this.gunModel['ſ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1648 */     this.gunModel['ſ'].setRotationPoint(-37.5F, -13.0F, -1.75F);
/*      */     
/* 1650 */     this.gunModel['ƀ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1651 */     this.gunModel['ƀ'].setRotationPoint(-37.0F, -14.0F, -1.75F);
/*      */     
/* 1653 */     this.gunModel['Ɓ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1654 */     this.gunModel['Ɓ'].setRotationPoint(-39.0F, -13.5F, -1.75F);
/*      */     
/* 1656 */     this.gunModel['Ƃ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1657 */     this.gunModel['Ƃ'].setRotationPoint(-39.0F, -14.0F, -1.75F);
/*      */     
/* 1659 */     this.gunModel['ƃ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1660 */     this.gunModel['ƃ'].setRotationPoint(-37.0F, -15.0F, -1.75F);
/*      */     
/* 1662 */     this.gunModel['Ƅ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1663 */     this.gunModel['Ƅ'].setRotationPoint(-39.0F, -15.0F, -1.75F);
/*      */     
/* 1665 */     this.gunModel['ƅ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1666 */     this.gunModel['ƅ'].setRotationPoint(-38.5F, -14.5F, -1.75F);
/*      */     
/* 1668 */     this.gunModel['Ɔ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 1669 */     this.gunModel['Ɔ'].setRotationPoint(-38.5F, -14.0F, -1.75F);
/*      */     
/* 1671 */     this.gunModel['Ƈ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1672 */     this.gunModel['Ƈ'].setRotationPoint(-38.5F, -15.0F, -1.75F);
/*      */     
/* 1674 */     this.gunModel['ƈ'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1675 */     this.gunModel['ƈ'].setRotationPoint(-18.5F, -15.5F, 9.5F);
/*      */     
/* 1677 */     this.gunModel['Ɖ'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1678 */     this.gunModel['Ɖ'].setRotationPoint(-18.5F, -13.5F, 9.5F);
/*      */     
/* 1680 */     this.gunModel['Ɗ'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1681 */     this.gunModel['Ɗ'].setRotationPoint(-18.5F, -14.5F, 9.5F);
/*      */     
/* 1683 */     this.gunModel['Ƌ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 1684 */     this.gunModel['Ƌ'].setRotationPoint(-19.5F, -14.5F, 10.0F);
/*      */     
/* 1686 */     this.gunModel['ƌ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
/* 1687 */     this.gunModel['ƌ'].setRotationPoint(-18.5F, -14.5F, 10.0F);
/*      */     
/* 1689 */     this.gunModel['ƍ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.75F, -0.25F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 1690 */     this.gunModel['ƍ'].setRotationPoint(-21.0F, -14.5F, 10.0F);
/*      */     
/* 1692 */     this.gunModel['Ǝ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.25F, -1.0F, -0.25F, -1.0F, -1.0F, -0.25F, -1.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F);
/* 1693 */     this.gunModel['Ǝ'].setRotationPoint(-16.25F, -16.0F, 10.0F);
/*      */     
/* 1695 */     this.gunModel['Ə'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -1.0F, -0.25F, 0.25F, -1.0F, -0.25F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F);
/* 1696 */     this.gunModel['Ə'].setRotationPoint(-18.75F, -16.0F, 10.0F);
/*      */     
/* 1698 */     this.gunModel['Ɛ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F);
/* 1699 */     this.gunModel['Ɛ'].setRotationPoint(-25.5F, -6.0F, 2.5F);
/*      */     
/* 1701 */     this.gunModel['Ƒ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1702 */     this.gunModel['Ƒ'].setRotationPoint(-24.5F, -6.0F, 2.5F);
/*      */     
/* 1704 */     this.gunModel['ƒ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 1.0F, 0.0F, -0.5F);
/* 1705 */     this.gunModel['ƒ'].setRotationPoint(-25.5F, -3.0F, 2.5F);
/*      */     
/* 1707 */     this.gunModel['Ɠ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 4, 0.0F, 1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1708 */     this.gunModel['Ɠ'].setRotationPoint(-24.5F, -8.0F, 2.5F);
/*      */     
/* 1710 */     this.gunModel['Ɣ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F);
/* 1711 */     this.gunModel['Ɣ'].setRotationPoint(-24.5F, -3.0F, 2.5F);
/*      */     
/* 1713 */     this.gunModel['ƕ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 4, 0.0F, 1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, 1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F);
/* 1714 */     this.gunModel['ƕ'].setRotationPoint(-25.5F, -8.0F, 2.5F);
/*      */     
/* 1716 */     this.gunModel['Ɩ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 4, 0.0F, 1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1717 */     this.gunModel['Ɩ'].setRotationPoint(-25.5F, -9.0F, 2.5F);
/*      */     
/* 1719 */     this.gunModel['Ɨ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 4, 0.0F, 1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.25F, -1.5F, 0.0F, 0.25F, 1.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F);
/* 1720 */     this.gunModel['Ɨ'].setRotationPoint(-26.5F, -9.0F, 2.5F);
/*      */     
/* 1722 */     this.gunModel['Ƙ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F);
/* 1723 */     this.gunModel['Ƙ'].setRotationPoint(-26.5F, 0.0F, 2.5F);
/*      */     
/* 1725 */     this.gunModel['ƙ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F);
/* 1726 */     this.gunModel['ƙ'].setRotationPoint(-25.5F, 0.0F, 2.5F);
/*      */     
/* 1728 */     this.gunModel['ƚ'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 14, 11, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1729 */     this.gunModel['ƚ'].setRotationPoint(-97.5F, -22.5F, -1.0F);
/*      */     
/* 1731 */     this.gunModel['ƛ'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 3, 11, 0.0F, -1.0F, 0.25F, -3.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, -1.0F, 0.25F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
/* 1732 */     this.gunModel['ƛ'].setRotationPoint(-97.5F, -25.75F, -1.0F);
/*      */     
/* 1734 */     this.gunModel['Ɯ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 11, 0.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F);
/* 1735 */     this.gunModel['Ɯ'].setRotationPoint(-96.5F, -28.0F, -1.0F);
/*      */     
/* 1737 */     this.gunModel['Ɲ'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 2, 11, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F);
/* 1738 */     this.gunModel['Ɲ'].setRotationPoint(-97.5F, -8.5F, -1.0F);
/*      */     
/* 1740 */     this.gunModel['ƞ'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 2, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -3.0F);
/* 1741 */     this.gunModel['ƞ'].setRotationPoint(-97.5F, -6.5F, -0.5F);
/*      */     
/* 1743 */     this.gunModel['Ɵ'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 3, 8, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -3.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, -3.0F, 0.0F, -2.5F);
/* 1744 */     this.gunModel['Ɵ'].setRotationPoint(-97.5F, -4.5F, 0.5F);
/*      */     
/* 1746 */     this.gunModel['Ơ'].addShapeBox(14.0F, -4.0F, -4.5F, 14, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1747 */     this.gunModel['Ơ'].setRotationPoint(-58.5F, -8.0F, -2.5F);
/*      */     
/* 1749 */     this.gunModel['ơ'].addShapeBox(14.0F, -4.0F, -4.5F, 14, 2, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1750 */     this.gunModel['ơ'].setRotationPoint(-58.5F, -10.0F, -2.25F);
/*      */     
/* 1752 */     this.gunModel['Ƣ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1753 */     this.gunModel['Ƣ'].setRotationPoint(-58.5F, -9.0F, -2.5F);
/*      */     
/* 1755 */     this.gunModel['ƣ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1756 */     this.gunModel['ƣ'].setRotationPoint(-58.5F, -10.0F, -2.5F);
/*      */     
/* 1758 */     this.gunModel['Ƥ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1759 */     this.gunModel['Ƥ'].setRotationPoint(-45.5F, -9.0F, -2.5F);
/*      */     
/* 1761 */     this.gunModel['ƥ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
/* 1762 */     this.gunModel['ƥ'].setRotationPoint(-45.5F, -10.0F, -2.5F);
/*      */     
/* 1764 */     this.gunModel['Ʀ'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F);
/* 1765 */     this.gunModel['Ʀ'].setRotationPoint(-53.5F, -7.5F, -2.75F);
/*      */     
/* 1767 */     this.gunModel['Ƨ'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 1768 */     this.gunModel['Ƨ'].setRotationPoint(-53.5F, -11.0F, -2.75F);
/*      */     
/* 1770 */     this.gunModel['ƨ'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/* 1771 */     this.gunModel['ƨ'].setRotationPoint(-53.5F, -10.0F, -2.75F);
/*      */     
/* 1773 */     this.gunModel['Ʃ'].addShapeBox(14.0F, -4.0F, -4.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/* 1774 */     this.gunModel['Ʃ'].setRotationPoint(-53.5F, -8.0F, -2.75F);
/*      */     
/* 1776 */     this.gunModel['ƪ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1777 */     this.gunModel['ƪ'].setRotationPoint(-91.0F, -14.5F, 9.5F);
/*      */     
/* 1779 */     this.gunModel['ƫ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1780 */     this.gunModel['ƫ'].setRotationPoint(-89.0F, -14.5F, 9.5F);
/*      */     
/* 1782 */     this.gunModel['Ƭ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1783 */     this.gunModel['Ƭ'].setRotationPoint(-91.0F, -15.5F, 9.5F);
/*      */     
/* 1785 */     this.gunModel['ƭ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1786 */     this.gunModel['ƭ'].setRotationPoint(-90.5F, -16.0F, 9.5F);
/*      */     
/* 1788 */     this.gunModel['Ʈ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1789 */     this.gunModel['Ʈ'].setRotationPoint(-90.0F, -15.5F, 9.5F);
/*      */     
/* 1791 */     this.gunModel['Ư'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1792 */     this.gunModel['Ư'].setRotationPoint(-89.0F, -15.5F, 9.5F);
/*      */     
/* 1794 */     this.gunModel['ư'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1795 */     this.gunModel['ư'].setRotationPoint(-89.5F, -16.0F, 9.5F);
/*      */     
/* 1797 */     this.gunModel['Ʊ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/* 1798 */     this.gunModel['Ʊ'].setRotationPoint(-90.0F, -13.0F, 9.5F);
/*      */     
/* 1800 */     this.gunModel['Ʋ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1801 */     this.gunModel['Ʋ'].setRotationPoint(-89.0F, -13.5F, 9.5F);
/*      */     
/* 1803 */     this.gunModel['Ƴ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1804 */     this.gunModel['Ƴ'].setRotationPoint(-90.5F, -13.0F, 9.5F);
/*      */     
/* 1806 */     this.gunModel['ƴ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1807 */     this.gunModel['ƴ'].setRotationPoint(-89.5F, -13.0F, 9.5F);
/*      */     
/* 1809 */     this.gunModel['Ƶ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1810 */     this.gunModel['Ƶ'].setRotationPoint(-89.0F, -14.0F, 9.5F);
/*      */     
/* 1812 */     this.gunModel['ƶ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1813 */     this.gunModel['ƶ'].setRotationPoint(-91.0F, -13.5F, 9.5F);
/*      */     
/* 1815 */     this.gunModel['Ʒ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 1816 */     this.gunModel['Ʒ'].setRotationPoint(-91.0F, -14.0F, 9.5F);
/*      */     
/* 1818 */     this.gunModel['Ƹ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1819 */     this.gunModel['Ƹ'].setRotationPoint(-89.0F, -15.0F, 9.5F);
/*      */     
/* 1821 */     this.gunModel['ƹ'].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1822 */     this.gunModel['ƹ'].setRotationPoint(-91.0F, -15.0F, 9.5F);
/*      */     
/* 1824 */     this.gunModel['ƺ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1825 */     this.gunModel['ƺ'].setRotationPoint(-90.5F, -14.5F, 9.5F);
/*      */     
/* 1827 */     this.gunModel['ƻ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 1828 */     this.gunModel['ƻ'].setRotationPoint(-90.5F, -14.0F, 9.5F);
/*      */     
/* 1830 */     this.gunModel['Ƽ'].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 1831 */     this.gunModel['Ƽ'].setRotationPoint(-90.5F, -15.0F, 9.5F);
/*      */   }
/*      */   
/*      */   private void initdefaultBarrelModel_1()
/*      */   {
/* 1836 */     this.defaultBarrelModel[0] = new ModelRendererTurbo(this, 817, 57, this.textureX, this.textureY);
/* 1837 */     this.defaultBarrelModel[1] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 1838 */     this.defaultBarrelModel[2] = new ModelRendererTurbo(this, 129, 73, this.textureX, this.textureY);
/* 1839 */     this.defaultBarrelModel[3] = new ModelRendererTurbo(this, 457, 73, this.textureX, this.textureY);
/* 1840 */     this.defaultBarrelModel[4] = new ModelRendererTurbo(this, 737, 73, this.textureX, this.textureY);
/* 1841 */     this.defaultBarrelModel[5] = new ModelRendererTurbo(this, 393, 33, this.textureX, this.textureY);
/* 1842 */     this.defaultBarrelModel[6] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/* 1843 */     this.defaultBarrelModel[7] = new ModelRendererTurbo(this, 697, 33, this.textureX, this.textureY);
/* 1844 */     this.defaultBarrelModel[8] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
/* 1845 */     this.defaultBarrelModel[9] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*      */     
/* 1847 */     this.defaultBarrelModel[0].addShapeBox(14.0F, -4.0F, -4.5F, 57, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1848 */     this.defaultBarrelModel[0].setRotationPoint(41.5F, -22.0F, 0.0F);
/*      */     
/* 1850 */     this.defaultBarrelModel[1].addShapeBox(14.0F, -4.0F, -4.5F, 57, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1851 */     this.defaultBarrelModel[1].setRotationPoint(41.5F, -19.0F, 0.0F);
/*      */     
/* 1853 */     this.defaultBarrelModel[2].addShapeBox(14.0F, -4.0F, -4.5F, 57, 1, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F);
/* 1854 */     this.defaultBarrelModel[2].setRotationPoint(41.5F, -17.0F, 2.0F);
/*      */     
/* 1856 */     this.defaultBarrelModel[3].addShapeBox(14.0F, -4.0F, -4.5F, 57, 2, 9, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1857 */     this.defaultBarrelModel[3].setRotationPoint(41.5F, -24.0F, 0.0F);
/*      */     
/* 1859 */     this.defaultBarrelModel[4].addShapeBox(14.0F, -4.0F, -4.5F, 57, 1, 5, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
/* 1860 */     this.defaultBarrelModel[4].setRotationPoint(41.5F, -25.0F, 2.0F);
/*      */     
/* 1862 */     this.defaultBarrelModel[5].addShapeBox(14.0F, -4.0F, -4.5F, 1, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1863 */     this.defaultBarrelModel[5].setRotationPoint(98.5F, -22.0F, 0.0F);
/*      */     
/* 1865 */     this.defaultBarrelModel[6].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.5F);
/* 1866 */     this.defaultBarrelModel[6].setRotationPoint(98.5F, -19.0F, 0.0F);
/*      */     
/* 1868 */     this.defaultBarrelModel[7].addShapeBox(14.0F, -4.0F, -4.5F, 1, 2, 9, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
/* 1869 */     this.defaultBarrelModel[7].setRotationPoint(98.5F, -24.0F, 0.0F);
/*      */     
/* 1871 */     this.defaultBarrelModel[8].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, -0.5F, -3.5F, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, -1.5F);
/* 1872 */     this.defaultBarrelModel[8].setRotationPoint(98.5F, -17.0F, 1.0F);
/*      */     
/* 1874 */     this.defaultBarrelModel[9].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 6, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, -0.5F, -3.5F, 0.0F, -0.5F, -2.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F);
/* 1875 */     this.defaultBarrelModel[9].setRotationPoint(98.5F, -25.0F, 1.0F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 1880 */     this.ammoModel[0] = new ModelRendererTurbo(this, 961, 81, this.textureX, this.textureY);
/* 1881 */     this.ammoModel[1] = new ModelRendererTurbo(this, 993, 81, this.textureX, this.textureY);
/* 1882 */     this.ammoModel[2] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/* 1883 */     this.ammoModel[3] = new ModelRendererTurbo(this, 33, 89, this.textureX, this.textureY);
/* 1884 */     this.ammoModel[4] = new ModelRendererTurbo(this, 65, 89, this.textureX, this.textureY);
/* 1885 */     this.ammoModel[5] = new ModelRendererTurbo(this, 105, 89, this.textureX, this.textureY);
/* 1886 */     this.ammoModel[6] = new ModelRendererTurbo(this, 137, 89, this.textureX, this.textureY);
/* 1887 */     this.ammoModel[7] = new ModelRendererTurbo(this, 169, 89, this.textureX, this.textureY);
/* 1888 */     this.ammoModel[8] = new ModelRendererTurbo(this, 201, 89, this.textureX, this.textureY);
/* 1889 */     this.ammoModel[9] = new ModelRendererTurbo(this, 913, 81, this.textureX, this.textureY);
/* 1890 */     this.ammoModel[10] = new ModelRendererTurbo(this, 233, 89, this.textureX, this.textureY);
/* 1891 */     this.ammoModel[11] = new ModelRendererTurbo(this, 257, 89, this.textureX, this.textureY);
/* 1892 */     this.ammoModel[12] = new ModelRendererTurbo(this, 281, 89, this.textureX, this.textureY);
/* 1893 */     this.ammoModel[13] = new ModelRendererTurbo(this, 305, 89, this.textureX, this.textureY);
/* 1894 */     this.ammoModel[14] = new ModelRendererTurbo(this, 449, 89, this.textureX, this.textureY);
/* 1895 */     this.ammoModel[15] = new ModelRendererTurbo(this, 481, 89, this.textureX, this.textureY);
/* 1896 */     this.ammoModel[16] = new ModelRendererTurbo(this, 513, 89, this.textureX, this.textureY);
/* 1897 */     this.ammoModel[17] = new ModelRendererTurbo(this, 545, 89, this.textureX, this.textureY);
/* 1898 */     this.ammoModel[18] = new ModelRendererTurbo(this, 929, 89, this.textureX, this.textureY);
/* 1899 */     this.ammoModel[19] = new ModelRendererTurbo(this, 769, 57, this.textureX, this.textureY);
/* 1900 */     this.ammoModel[20] = new ModelRendererTurbo(this, 1001, 57, this.textureX, this.textureY);
/* 1901 */     this.ammoModel[21] = new ModelRendererTurbo(this, 409, 81, this.textureX, this.textureY);
/* 1902 */     this.ammoModel[22] = new ModelRendererTurbo(this, 705, 81, this.textureX, this.textureY);
/*      */     
/* 1904 */     this.ammoModel[0].addShapeBox(14.0F, -4.0F, -4.5F, 5, 8, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1905 */     this.ammoModel[0].setRotationPoint(-48.5F, -1.0F, 0.5F);
/*      */     
/* 1907 */     this.ammoModel[1].addShapeBox(14.0F, -4.0F, -4.5F, 5, 9, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1908 */     this.ammoModel[1].setRotationPoint(-47.0F, 7.0F, 0.5F);
/*      */     
/* 1910 */     this.ammoModel[2].addShapeBox(14.0F, -4.0F, -4.5F, 5, 8, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 1911 */     this.ammoModel[2].setRotationPoint(-44.5F, 16.0F, 0.5F);
/*      */     
/* 1913 */     this.ammoModel[3].addShapeBox(14.0F, -4.0F, -4.5F, 5, 7, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F);
/* 1914 */     this.ammoModel[3].setRotationPoint(-41.5F, 24.0F, 0.5F);
/*      */     
/* 1916 */     this.ammoModel[4].addShapeBox(14.0F, -4.0F, -4.5F, 9, 5, 8, 0.0F, 2.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1917 */     this.ammoModel[4].setRotationPoint(-43.5F, 31.0F, 0.5F);
/*      */     
/* 1919 */     this.ammoModel[5].addShapeBox(14.0F, -4.0F, -4.5F, 5, 7, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F);
/* 1920 */     this.ammoModel[5].setRotationPoint(-46.5F, 24.0F, 0.5F);
/*      */     
/* 1922 */     this.ammoModel[6].addShapeBox(14.0F, -4.0F, -4.5F, 5, 8, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 1923 */     this.ammoModel[6].setRotationPoint(-49.5F, 16.0F, 0.5F);
/*      */     
/* 1925 */     this.ammoModel[7].addShapeBox(14.0F, -4.0F, -4.5F, 5, 9, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1926 */     this.ammoModel[7].setRotationPoint(-52.0F, 7.0F, 0.5F);
/*      */     
/* 1928 */     this.ammoModel[8].addShapeBox(14.0F, -4.0F, -4.5F, 5, 8, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1929 */     this.ammoModel[8].setRotationPoint(-53.5F, -1.0F, 0.5F);
/*      */     
/* 1931 */     this.ammoModel[9].addShapeBox(14.0F, -4.0F, -4.5F, 2, 7, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, 1.75F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F);
/* 1932 */     this.ammoModel[9].setRotationPoint(-48.5F, 24.0F, 0.5F);
/*      */     
/* 1934 */     this.ammoModel[10].addShapeBox(14.0F, -4.0F, -4.5F, 2, 8, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 1935 */     this.ammoModel[10].setRotationPoint(-51.5F, 16.0F, 0.5F);
/*      */     
/* 1937 */     this.ammoModel[11].addShapeBox(14.0F, -4.0F, -4.5F, 2, 9, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1938 */     this.ammoModel[11].setRotationPoint(-54.0F, 7.0F, 0.5F);
/*      */     
/* 1940 */     this.ammoModel[12].addShapeBox(14.0F, -4.0F, -4.5F, 2, 8, 8, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1941 */     this.ammoModel[12].setRotationPoint(-55.5F, -1.0F, 0.5F);
/*      */     
/* 1943 */     this.ammoModel[13].addShapeBox(14.0F, -4.0F, -4.5F, 11, 10, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1944 */     this.ammoModel[13].setRotationPoint(-56.0F, -12.0F, 0.0F);
/*      */     
/* 1946 */     this.ammoModel[14].addShapeBox(14.0F, -4.0F, -4.5F, 7, 7, 6, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -2.75F, 0.0F, 0.0F);
/* 1947 */     this.ammoModel[14].setRotationPoint(-47.5F, 24.0F, 1.5F);
/*      */     
/* 1949 */     this.ammoModel[15].addShapeBox(14.0F, -4.0F, -4.5F, 7, 8, 6, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, 1.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F);
/* 1950 */     this.ammoModel[15].setRotationPoint(-50.5F, 16.0F, 1.5F);
/*      */     
/* 1952 */     this.ammoModel[16].addShapeBox(14.0F, -4.0F, -4.5F, 7, 9, 6, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
/* 1953 */     this.ammoModel[16].setRotationPoint(-53.0F, 7.0F, 1.5F);
/*      */     
/* 1955 */     this.ammoModel[17].addShapeBox(14.0F, -4.0F, -4.5F, 7, 8, 6, 0.0F, 0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
/* 1956 */     this.ammoModel[17].setRotationPoint(-54.5F, -1.0F, 1.5F);
/*      */     
/* 1958 */     this.ammoModel[18].addShapeBox(14.0F, -4.0F, -4.5F, 11, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1959 */     this.ammoModel[18].setRotationPoint(-56.0F, -2.0F, 0.0F);
/*      */     
/* 1961 */     this.ammoModel[19].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 8, 0.0F, -0.55F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F, -0.55F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 1962 */     this.ammoModel[19].setRotationPoint(-39.5F, 30.0F, 0.5F);
/*      */     
/* 1964 */     this.ammoModel[20].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 8, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1965 */     this.ammoModel[20].setRotationPoint(-40.5F, 30.0F, 0.5F);
/*      */     
/* 1967 */     this.ammoModel[21].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 8, 0.0F, -0.52F, -0.5F, 0.0F, -0.48F, -0.5F, 0.0F, -0.48F, -0.5F, 0.0F, -0.52F, -0.5F, 0.0F, -0.4F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 1968 */     this.ammoModel[21].setRotationPoint(-44.5F, 30.0F, 0.5F);
/*      */     
/* 1970 */     this.ammoModel[22].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 8, 0.0F, -0.52F, -0.5F, 0.0F, -0.48F, -0.5F, 0.0F, -0.48F, -0.5F, 0.0F, -0.52F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/* 1971 */     this.ammoModel[22].setRotationPoint(-45.5F, 30.0F, 0.5F);
/*      */   }
/*      */   
/*      */   private void initslideModel_1()
/*      */   {
/* 1976 */     this.slideModel[0] = new ModelRendererTurbo(this, 313, 1, this.textureX, this.textureY);
/* 1977 */     this.slideModel[1] = new ModelRendererTurbo(this, 521, 1, this.textureX, this.textureY);
/* 1978 */     this.slideModel[2] = new ModelRendererTurbo(this, 561, 1, this.textureX, this.textureY);
/* 1979 */     this.slideModel[3] = new ModelRendererTurbo(this, 601, 1, this.textureX, this.textureY);
/* 1980 */     this.slideModel[4] = new ModelRendererTurbo(this, 641, 1, this.textureX, this.textureY);
/* 1981 */     this.slideModel[5] = new ModelRendererTurbo(this, 153, 17, this.textureX, this.textureY);
/* 1982 */     this.slideModel[6] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
/* 1983 */     this.slideModel[7] = new ModelRendererTurbo(this, 673, 9, this.textureX, this.textureY);
/* 1984 */     this.slideModel[8] = new ModelRendererTurbo(this, 713, 9, this.textureX, this.textureY);
/* 1985 */     this.slideModel[9] = new ModelRendererTurbo(this, 753, 9, this.textureX, this.textureY);
/* 1986 */     this.slideModel[10] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
/* 1987 */     this.slideModel[11] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/* 1988 */     this.slideModel[12] = new ModelRendererTurbo(this, 865, 1, this.textureX, this.textureY);
/* 1989 */     this.slideModel[13] = new ModelRendererTurbo(this, 905, 1, this.textureX, this.textureY);
/* 1990 */     this.slideModel[14] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
/* 1991 */     this.slideModel[15] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
/* 1992 */     this.slideModel[16] = new ModelRendererTurbo(this, 945, 1, this.textureX, this.textureY);
/* 1993 */     this.slideModel[17] = new ModelRendererTurbo(this, 1017, 1, this.textureX, this.textureY);
/*      */     
/* 1995 */     this.slideModel[0].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F);
/* 1996 */     this.slideModel[0].setRotationPoint(3.0F, -34.5F, 3.5F);
/*      */     
/* 1998 */     this.slideModel[1].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 2, 0.0F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 1.5F, 0.0F, 0.5F);
/* 1999 */     this.slideModel[1].setRotationPoint(2.0F, -33.5F, 3.5F);
/*      */     
/* 2001 */     this.slideModel[2].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 2, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.5F);
/* 2002 */     this.slideModel[2].setRotationPoint(1.0F, -32.5F, 3.5F);
/*      */     
/* 2004 */     this.slideModel[3].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 2, 0.0F, 1.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.0F, 0.0F, 0.25F, 1.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.25F, 0.0F, 0.25F);
/* 2005 */     this.slideModel[3].setRotationPoint(1.0F, -31.5F, 3.5F);
/*      */     
/* 2007 */     this.slideModel[4].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 2, 0.0F, 1.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 1.25F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F);
/* 2008 */     this.slideModel[4].setRotationPoint(1.0F, -30.5F, 3.5F);
/*      */     
/* 2010 */     this.slideModel[5].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 2, 0.0F, 1.5F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 1.5F, 0.0F, 0.25F, 2.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 2.0F, 0.0F, 0.25F);
/* 2011 */     this.slideModel[5].setRotationPoint(1.0F, -29.5F, 3.5F);
/*      */     
/* 2013 */     this.slideModel[6].addShapeBox(14.0F, -4.0F, -4.5F, 2, 2, 2, 0.0F, 2.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 2.0F, 0.0F, 0.25F, 2.0F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 0.75F, 0.0F, 0.25F, 2.0F, 0.0F, 0.25F);
/* 2014 */     this.slideModel[6].setRotationPoint(1.0F, -28.5F, 3.5F);
/*      */     
/* 2016 */     this.slideModel[7].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 3, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F);
/* 2017 */     this.slideModel[7].setRotationPoint(0.25F, -29.5F, 3.0F);
/*      */     
/* 2019 */     this.slideModel[8].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 3, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2020 */     this.slideModel[8].setRotationPoint(0.25F, -30.0F, 3.0F);
/*      */     
/* 2022 */     this.slideModel[9].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 3, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/* 2023 */     this.slideModel[9].setRotationPoint(0.25F, -30.5F, 3.0F);
/*      */     
/* 2025 */     this.slideModel[10].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F);
/* 2026 */     this.slideModel[10].setRotationPoint(2.0F, -30.5F, 5.5F);
/*      */     
/* 2028 */     this.slideModel[11].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2029 */     this.slideModel[11].setRotationPoint(2.0F, -31.5F, 5.5F);
/*      */     
/* 2031 */     this.slideModel[12].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F);
/* 2032 */     this.slideModel[12].setRotationPoint(0.0F, -31.5F, 5.5F);
/*      */     
/* 2034 */     this.slideModel[13].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.15F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.15F, -0.5F, -0.5F);
/* 2035 */     this.slideModel[13].setRotationPoint(0.0F, -31.5F, 5.5F);
/*      */     
/* 2037 */     this.slideModel[14].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/* 2038 */     this.slideModel[14].setRotationPoint(2.0F, -30.5F, 2.5F);
/*      */     
/* 2040 */     this.slideModel[15].addShapeBox(14.0F, -4.0F, -4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2041 */     this.slideModel[15].setRotationPoint(2.0F, -31.5F, 2.75F);
/*      */     
/* 2043 */     this.slideModel[16].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, -1.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -2.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F);
/* 2044 */     this.slideModel[16].setRotationPoint(0.0F, -31.5F, 2.75F);
/*      */     
/* 2046 */     this.slideModel[17].addShapeBox(14.0F, -4.0F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.15F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.5F, 0.15F, -0.5F, -0.5F);
/* 2047 */     this.slideModel[17].setRotationPoint(0.0F, -31.5F, 2.75F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelqcw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */