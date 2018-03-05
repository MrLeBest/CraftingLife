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
/*      */ public class Modelmk46
/*      */   extends ModelGun
/*      */ {
/*   16 */   int textureX = 512;
/*   17 */   int textureY = 512;
/*      */   
/*      */   public Modelmk46()
/*      */   {
/*   21 */     this.gunModel = new ModelRendererTurbo['Ǌ'];
/*   22 */     this.defaultScopeModel = new ModelRendererTurbo[71];
/*   23 */     this.ammoModel = new ModelRendererTurbo['Ģ'];
/*      */     
/*   25 */     initgunModel_1();
/*   26 */     initdefaultScopeModel_1();
/*   27 */     initammoModel_1();
/*      */     
/*   29 */     this.scopeAttachPoint = new Vector3f(0.0F, 0.78125F, 0.00125F);
/*   30 */     this.gripAttachPoint = new Vector3f(1.25F, 0.3888889F, 0.0F);
/*      */     
/*   32 */     translateAll(0.0F, -4.35F, -0.78F);
/*   33 */     this.thirdPersonOffset = new Vector3f(0.0F, -0.12F, 0.0F);
/*      */     
/*   35 */     this.gunSlideDistance = 0.0F;
/*   36 */     this.animationType = EnumAnimationType.BOTTOM_CLIP;
/*      */     
/*      */ 
/*   39 */     flipAll();
/*      */   }
/*      */   
/*      */   private void initgunModel_1()
/*      */   {
/*   44 */     this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
/*   45 */     this.gunModel[1] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
/*   46 */     this.gunModel[2] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
/*   47 */     this.gunModel[3] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
/*   48 */     this.gunModel[4] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
/*   49 */     this.gunModel[5] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
/*   50 */     this.gunModel[6] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
/*   51 */     this.gunModel[7] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
/*   52 */     this.gunModel[8] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
/*   53 */     this.gunModel[9] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
/*   54 */     this.gunModel[10] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
/*   55 */     this.gunModel[11] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
/*   56 */     this.gunModel[12] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
/*   57 */     this.gunModel[13] = new ModelRendererTurbo(this, 65, 9, this.textureX, this.textureY);
/*   58 */     this.gunModel[14] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
/*   59 */     this.gunModel[15] = new ModelRendererTurbo(this, 505, 1, this.textureX, this.textureY);
/*   60 */     this.gunModel[16] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
/*   61 */     this.gunModel[17] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
/*   62 */     this.gunModel[18] = new ModelRendererTurbo(this, 121, 9, this.textureX, this.textureY);
/*   63 */     this.gunModel[19] = new ModelRendererTurbo(this, 129, 9, this.textureX, this.textureY);
/*   64 */     this.gunModel[20] = new ModelRendererTurbo(this, 145, 9, this.textureX, this.textureY);
/*   65 */     this.gunModel[21] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
/*   66 */     this.gunModel[22] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
/*   67 */     this.gunModel[23] = new ModelRendererTurbo(this, 177, 9, this.textureX, this.textureY);
/*   68 */     this.gunModel[24] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
/*   69 */     this.gunModel[25] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
/*   70 */     this.gunModel[26] = new ModelRendererTurbo(this, 209, 9, this.textureX, this.textureY);
/*   71 */     this.gunModel[27] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
/*   72 */     this.gunModel[28] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
/*   73 */     this.gunModel[29] = new ModelRendererTurbo(this, 313, 9, this.textureX, this.textureY);
/*   74 */     this.gunModel[30] = new ModelRendererTurbo(this, 329, 9, this.textureX, this.textureY);
/*   75 */     this.gunModel[31] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
/*   76 */     this.gunModel[32] = new ModelRendererTurbo(this, 361, 9, this.textureX, this.textureY);
/*   77 */     this.gunModel[33] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
/*   78 */     this.gunModel[34] = new ModelRendererTurbo(this, 377, 9, this.textureX, this.textureY);
/*   79 */     this.gunModel[35] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
/*   80 */     this.gunModel[36] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
/*   81 */     this.gunModel[37] = new ModelRendererTurbo(this, 473, 9, this.textureX, this.textureY);
/*   82 */     this.gunModel[38] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
/*   83 */     this.gunModel[39] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
/*   84 */     this.gunModel[40] = new ModelRendererTurbo(this, 497, 9, this.textureX, this.textureY);
/*   85 */     this.gunModel[41] = new ModelRendererTurbo(this, 505, 9, this.textureX, this.textureY);
/*   86 */     this.gunModel[42] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
/*   87 */     this.gunModel[43] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
/*   88 */     this.gunModel[44] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
/*   89 */     this.gunModel[45] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
/*   90 */     this.gunModel[46] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
/*   91 */     this.gunModel[47] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
/*   92 */     this.gunModel[48] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
/*   93 */     this.gunModel[49] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
/*   94 */     this.gunModel[50] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
/*   95 */     this.gunModel[51] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
/*   96 */     this.gunModel[52] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
/*   97 */     this.gunModel[53] = new ModelRendererTurbo(this, 129, 17, this.textureX, this.textureY);
/*   98 */     this.gunModel[54] = new ModelRendererTurbo(this, 137, 17, this.textureX, this.textureY);
/*   99 */     this.gunModel[55] = new ModelRendererTurbo(this, 145, 17, this.textureX, this.textureY);
/*  100 */     this.gunModel[56] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/*  101 */     this.gunModel[57] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
/*  102 */     this.gunModel[58] = new ModelRendererTurbo(this, 169, 17, this.textureX, this.textureY);
/*  103 */     this.gunModel[59] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
/*  104 */     this.gunModel[60] = new ModelRendererTurbo(this, 185, 17, this.textureX, this.textureY);
/*  105 */     this.gunModel[61] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
/*  106 */     this.gunModel[62] = new ModelRendererTurbo(this, 201, 17, this.textureX, this.textureY);
/*  107 */     this.gunModel[63] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
/*  108 */     this.gunModel[64] = new ModelRendererTurbo(this, 217, 17, this.textureX, this.textureY);
/*  109 */     this.gunModel[65] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
/*  110 */     this.gunModel[66] = new ModelRendererTurbo(this, 233, 17, this.textureX, this.textureY);
/*  111 */     this.gunModel[67] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
/*  112 */     this.gunModel[68] = new ModelRendererTurbo(this, 249, 17, this.textureX, this.textureY);
/*  113 */     this.gunModel[69] = new ModelRendererTurbo(this, 281, 17, this.textureX, this.textureY);
/*  114 */     this.gunModel[70] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
/*  115 */     this.gunModel[71] = new ModelRendererTurbo(this, 297, 17, this.textureX, this.textureY);
/*  116 */     this.gunModel[72] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
/*  117 */     this.gunModel[73] = new ModelRendererTurbo(this, 313, 17, this.textureX, this.textureY);
/*  118 */     this.gunModel[74] = new ModelRendererTurbo(this, 321, 17, this.textureX, this.textureY);
/*  119 */     this.gunModel[75] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
/*  120 */     this.gunModel[76] = new ModelRendererTurbo(this, 337, 17, this.textureX, this.textureY);
/*  121 */     this.gunModel[77] = new ModelRendererTurbo(this, 345, 17, this.textureX, this.textureY);
/*  122 */     this.gunModel[78] = new ModelRendererTurbo(this, 353, 17, this.textureX, this.textureY);
/*  123 */     this.gunModel[79] = new ModelRendererTurbo(this, 361, 17, this.textureX, this.textureY);
/*  124 */     this.gunModel[80] = new ModelRendererTurbo(this, 369, 17, this.textureX, this.textureY);
/*  125 */     this.gunModel[81] = new ModelRendererTurbo(this, 377, 17, this.textureX, this.textureY);
/*  126 */     this.gunModel[82] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
/*  127 */     this.gunModel[83] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
/*  128 */     this.gunModel[84] = new ModelRendererTurbo(this, 401, 17, this.textureX, this.textureY);
/*  129 */     this.gunModel[85] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
/*  130 */     this.gunModel[86] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
/*  131 */     this.gunModel[87] = new ModelRendererTurbo(this, 425, 17, this.textureX, this.textureY);
/*  132 */     this.gunModel[88] = new ModelRendererTurbo(this, 441, 17, this.textureX, this.textureY);
/*  133 */     this.gunModel[89] = new ModelRendererTurbo(this, 481, 17, this.textureX, this.textureY);
/*  134 */     this.gunModel[90] = new ModelRendererTurbo(this, 489, 17, this.textureX, this.textureY);
/*  135 */     this.gunModel[91] = new ModelRendererTurbo(this, 497, 17, this.textureX, this.textureY);
/*  136 */     this.gunModel[92] = new ModelRendererTurbo(this, 505, 17, this.textureX, this.textureY);
/*  137 */     this.gunModel[93] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
/*  138 */     this.gunModel[94] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
/*  139 */     this.gunModel[95] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
/*  140 */     this.gunModel[96] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
/*  141 */     this.gunModel[97] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
/*  142 */     this.gunModel[98] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
/*  143 */     this.gunModel[99] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
/*  144 */     this.gunModel[100] = new ModelRendererTurbo(this, 65, 25, this.textureX, this.textureY);
/*  145 */     this.gunModel[101] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
/*  146 */     this.gunModel[102] = new ModelRendererTurbo(this, 89, 25, this.textureX, this.textureY);
/*  147 */     this.gunModel[103] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
/*  148 */     this.gunModel[104] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
/*  149 */     this.gunModel[105] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
/*  150 */     this.gunModel[106] = new ModelRendererTurbo(this, 121, 25, this.textureX, this.textureY);
/*  151 */     this.gunModel[107] = new ModelRendererTurbo(this, 137, 25, this.textureX, this.textureY);
/*  152 */     this.gunModel[108] = new ModelRendererTurbo(this, 153, 25, this.textureX, this.textureY);
/*  153 */     this.gunModel[109] = new ModelRendererTurbo(this, 169, 25, this.textureX, this.textureY);
/*  154 */     this.gunModel[110] = new ModelRendererTurbo(this, 177, 25, this.textureX, this.textureY);
/*  155 */     this.gunModel[111] = new ModelRendererTurbo(this, 201, 25, this.textureX, this.textureY);
/*  156 */     this.gunModel[112] = new ModelRendererTurbo(this, 217, 25, this.textureX, this.textureY);
/*  157 */     this.gunModel[113] = new ModelRendererTurbo(this, 233, 25, this.textureX, this.textureY);
/*  158 */     this.gunModel[114] = new ModelRendererTurbo(this, 249, 25, this.textureX, this.textureY);
/*  159 */     this.gunModel[115] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
/*  160 */     this.gunModel[116] = new ModelRendererTurbo(this, 265, 25, this.textureX, this.textureY);
/*  161 */     this.gunModel[117] = new ModelRendererTurbo(this, 273, 25, this.textureX, this.textureY);
/*  162 */     this.gunModel[118] = new ModelRendererTurbo(this, 297, 25, this.textureX, this.textureY);
/*  163 */     this.gunModel[119] = new ModelRendererTurbo(this, 305, 25, this.textureX, this.textureY);
/*  164 */     this.gunModel[120] = new ModelRendererTurbo(this, 329, 25, this.textureX, this.textureY);
/*  165 */     this.gunModel[121] = new ModelRendererTurbo(this, 337, 25, this.textureX, this.textureY);
/*  166 */     this.gunModel[122] = new ModelRendererTurbo(this, 345, 25, this.textureX, this.textureY);
/*  167 */     this.gunModel[123] = new ModelRendererTurbo(this, 353, 25, this.textureX, this.textureY);
/*  168 */     this.gunModel[124] = new ModelRendererTurbo(this, 361, 25, this.textureX, this.textureY);
/*  169 */     this.gunModel[125] = new ModelRendererTurbo(this, 369, 25, this.textureX, this.textureY);
/*  170 */     this.gunModel[126] = new ModelRendererTurbo(this, 377, 25, this.textureX, this.textureY);
/*  171 */     this.gunModel[127] = new ModelRendererTurbo(this, 385, 25, this.textureX, this.textureY);
/*  172 */     this.gunModel[''] = new ModelRendererTurbo(this, 393, 25, this.textureX, this.textureY);
/*  173 */     this.gunModel[''] = new ModelRendererTurbo(this, 401, 25, this.textureX, this.textureY);
/*  174 */     this.gunModel[''] = new ModelRendererTurbo(this, 409, 25, this.textureX, this.textureY);
/*  175 */     this.gunModel[''] = new ModelRendererTurbo(this, 417, 25, this.textureX, this.textureY);
/*  176 */     this.gunModel[''] = new ModelRendererTurbo(this, 425, 25, this.textureX, this.textureY);
/*  177 */     this.gunModel[''] = new ModelRendererTurbo(this, 433, 25, this.textureX, this.textureY);
/*  178 */     this.gunModel[''] = new ModelRendererTurbo(this, 441, 25, this.textureX, this.textureY);
/*  179 */     this.gunModel[''] = new ModelRendererTurbo(this, 449, 25, this.textureX, this.textureY);
/*  180 */     this.gunModel[''] = new ModelRendererTurbo(this, 457, 25, this.textureX, this.textureY);
/*  181 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 25, this.textureX, this.textureY);
/*  182 */     this.gunModel[''] = new ModelRendererTurbo(this, 473, 25, this.textureX, this.textureY);
/*  183 */     this.gunModel[''] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
/*  184 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
/*  185 */     this.gunModel[''] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
/*  186 */     this.gunModel[''] = new ModelRendererTurbo(this, 489, 25, this.textureX, this.textureY);
/*  187 */     this.gunModel[''] = new ModelRendererTurbo(this, 497, 25, this.textureX, this.textureY);
/*  188 */     this.gunModel[''] = new ModelRendererTurbo(this, 505, 25, this.textureX, this.textureY);
/*  189 */     this.gunModel[''] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
/*  190 */     this.gunModel[''] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
/*  191 */     this.gunModel[''] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
/*  192 */     this.gunModel[''] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
/*  193 */     this.gunModel[''] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
/*  194 */     this.gunModel[''] = new ModelRendererTurbo(this, 65, 33, this.textureX, this.textureY);
/*  195 */     this.gunModel[''] = new ModelRendererTurbo(this, 73, 33, this.textureX, this.textureY);
/*  196 */     this.gunModel[''] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
/*  197 */     this.gunModel[''] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
/*  198 */     this.gunModel[''] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
/*  199 */     this.gunModel[''] = new ModelRendererTurbo(this, 105, 33, this.textureX, this.textureY);
/*  200 */     this.gunModel[''] = new ModelRendererTurbo(this, 113, 33, this.textureX, this.textureY);
/*  201 */     this.gunModel[''] = new ModelRendererTurbo(this, 121, 33, this.textureX, this.textureY);
/*  202 */     this.gunModel[''] = new ModelRendererTurbo(this, 129, 33, this.textureX, this.textureY);
/*  203 */     this.gunModel[''] = new ModelRendererTurbo(this, 145, 33, this.textureX, this.textureY);
/*  204 */     this.gunModel[' '] = new ModelRendererTurbo(this, 161, 33, this.textureX, this.textureY);
/*  205 */     this.gunModel['¡'] = new ModelRendererTurbo(this, 169, 33, this.textureX, this.textureY);
/*  206 */     this.gunModel['¢'] = new ModelRendererTurbo(this, 177, 33, this.textureX, this.textureY);
/*  207 */     this.gunModel['£'] = new ModelRendererTurbo(this, 193, 33, this.textureX, this.textureY);
/*  208 */     this.gunModel['¤'] = new ModelRendererTurbo(this, 201, 33, this.textureX, this.textureY);
/*  209 */     this.gunModel['¥'] = new ModelRendererTurbo(this, 209, 33, this.textureX, this.textureY);
/*  210 */     this.gunModel['¦'] = new ModelRendererTurbo(this, 233, 33, this.textureX, this.textureY);
/*  211 */     this.gunModel['§'] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
/*  212 */     this.gunModel['¨'] = new ModelRendererTurbo(this, 249, 33, this.textureX, this.textureY);
/*  213 */     this.gunModel['©'] = new ModelRendererTurbo(this, 265, 33, this.textureX, this.textureY);
/*  214 */     this.gunModel['ª'] = new ModelRendererTurbo(this, 281, 33, this.textureX, this.textureY);
/*  215 */     this.gunModel['«'] = new ModelRendererTurbo(this, 297, 33, this.textureX, this.textureY);
/*  216 */     this.gunModel['¬'] = new ModelRendererTurbo(this, 329, 33, this.textureX, this.textureY);
/*  217 */     this.gunModel['­'] = new ModelRendererTurbo(this, 337, 33, this.textureX, this.textureY);
/*  218 */     this.gunModel['®'] = new ModelRendererTurbo(this, 353, 33, this.textureX, this.textureY);
/*  219 */     this.gunModel['¯'] = new ModelRendererTurbo(this, 361, 33, this.textureX, this.textureY);
/*  220 */     this.gunModel['°'] = new ModelRendererTurbo(this, 257, 33, this.textureX, this.textureY);
/*  221 */     this.gunModel['±'] = new ModelRendererTurbo(this, 377, 33, this.textureX, this.textureY);
/*  222 */     this.gunModel['²'] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
/*  223 */     this.gunModel['³'] = new ModelRendererTurbo(this, 385, 33, this.textureX, this.textureY);
/*  224 */     this.gunModel['´'] = new ModelRendererTurbo(this, 401, 33, this.textureX, this.textureY);
/*  225 */     this.gunModel['µ'] = new ModelRendererTurbo(this, 409, 33, this.textureX, this.textureY);
/*  226 */     this.gunModel['¶'] = new ModelRendererTurbo(this, 417, 33, this.textureX, this.textureY);
/*  227 */     this.gunModel['·'] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
/*  228 */     this.gunModel['¸'] = new ModelRendererTurbo(this, 425, 33, this.textureX, this.textureY);
/*  229 */     this.gunModel['¹'] = new ModelRendererTurbo(this, 433, 33, this.textureX, this.textureY);
/*  230 */     this.gunModel['º'] = new ModelRendererTurbo(this, 441, 33, this.textureX, this.textureY);
/*  231 */     this.gunModel['»'] = new ModelRendererTurbo(this, 457, 33, this.textureX, this.textureY);
/*  232 */     this.gunModel['¼'] = new ModelRendererTurbo(this, 465, 33, this.textureX, this.textureY);
/*  233 */     this.gunModel['½'] = new ModelRendererTurbo(this, 473, 33, this.textureX, this.textureY);
/*  234 */     this.gunModel['¾'] = new ModelRendererTurbo(this, 481, 33, this.textureX, this.textureY);
/*  235 */     this.gunModel['¿'] = new ModelRendererTurbo(this, 113, 41, this.textureX, this.textureY);
/*  236 */     this.gunModel['À'] = new ModelRendererTurbo(this, 153, 41, this.textureX, this.textureY);
/*  237 */     this.gunModel['Á'] = new ModelRendererTurbo(this, 161, 41, this.textureX, this.textureY);
/*  238 */     this.gunModel['Â'] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
/*  239 */     this.gunModel['Ã'] = new ModelRendererTurbo(this, 177, 41, this.textureX, this.textureY);
/*  240 */     this.gunModel['Ä'] = new ModelRendererTurbo(this, 185, 41, this.textureX, this.textureY);
/*  241 */     this.gunModel['Å'] = new ModelRendererTurbo(this, 193, 41, this.textureX, this.textureY);
/*  242 */     this.gunModel['Æ'] = new ModelRendererTurbo(this, 201, 41, this.textureX, this.textureY);
/*  243 */     this.gunModel['Ç'] = new ModelRendererTurbo(this, 209, 41, this.textureX, this.textureY);
/*  244 */     this.gunModel['È'] = new ModelRendererTurbo(this, 217, 41, this.textureX, this.textureY);
/*  245 */     this.gunModel['É'] = new ModelRendererTurbo(this, 225, 41, this.textureX, this.textureY);
/*  246 */     this.gunModel['Ê'] = new ModelRendererTurbo(this, 233, 41, this.textureX, this.textureY);
/*  247 */     this.gunModel['Ë'] = new ModelRendererTurbo(this, 241, 41, this.textureX, this.textureY);
/*  248 */     this.gunModel['Ì'] = new ModelRendererTurbo(this, 249, 41, this.textureX, this.textureY);
/*  249 */     this.gunModel['Í'] = new ModelRendererTurbo(this, 257, 41, this.textureX, this.textureY);
/*  250 */     this.gunModel['Î'] = new ModelRendererTurbo(this, 297, 41, this.textureX, this.textureY);
/*  251 */     this.gunModel['Ï'] = new ModelRendererTurbo(this, 305, 41, this.textureX, this.textureY);
/*  252 */     this.gunModel['Ð'] = new ModelRendererTurbo(this, 313, 41, this.textureX, this.textureY);
/*  253 */     this.gunModel['Ñ'] = new ModelRendererTurbo(this, 321, 41, this.textureX, this.textureY);
/*  254 */     this.gunModel['Ò'] = new ModelRendererTurbo(this, 329, 41, this.textureX, this.textureY);
/*  255 */     this.gunModel['Ó'] = new ModelRendererTurbo(this, 337, 41, this.textureX, this.textureY);
/*  256 */     this.gunModel['Ô'] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
/*  257 */     this.gunModel['Õ'] = new ModelRendererTurbo(this, 353, 41, this.textureX, this.textureY);
/*  258 */     this.gunModel['Ö'] = new ModelRendererTurbo(this, 361, 41, this.textureX, this.textureY);
/*  259 */     this.gunModel['×'] = new ModelRendererTurbo(this, 369, 41, this.textureX, this.textureY);
/*  260 */     this.gunModel['Ø'] = new ModelRendererTurbo(this, 377, 41, this.textureX, this.textureY);
/*  261 */     this.gunModel['Ù'] = new ModelRendererTurbo(this, 393, 41, this.textureX, this.textureY);
/*  262 */     this.gunModel['Ú'] = new ModelRendererTurbo(this, 409, 41, this.textureX, this.textureY);
/*  263 */     this.gunModel['Û'] = new ModelRendererTurbo(this, 425, 41, this.textureX, this.textureY);
/*  264 */     this.gunModel['Ü'] = new ModelRendererTurbo(this, 441, 41, this.textureX, this.textureY);
/*  265 */     this.gunModel['Ý'] = new ModelRendererTurbo(this, 449, 41, this.textureX, this.textureY);
/*  266 */     this.gunModel['Þ'] = new ModelRendererTurbo(this, 457, 41, this.textureX, this.textureY);
/*  267 */     this.gunModel['ß'] = new ModelRendererTurbo(this, 465, 41, this.textureX, this.textureY);
/*  268 */     this.gunModel['à'] = new ModelRendererTurbo(this, 473, 41, this.textureX, this.textureY);
/*  269 */     this.gunModel['á'] = new ModelRendererTurbo(this, 481, 41, this.textureX, this.textureY);
/*  270 */     this.gunModel['â'] = new ModelRendererTurbo(this, 25, 81, this.textureX, this.textureY);
/*  271 */     this.gunModel['ã'] = new ModelRendererTurbo(this, 225, 81, this.textureX, this.textureY);
/*  272 */     this.gunModel['ä'] = new ModelRendererTurbo(this, 113, 89, this.textureX, this.textureY);
/*  273 */     this.gunModel['å'] = new ModelRendererTurbo(this, 121, 89, this.textureX, this.textureY);
/*  274 */     this.gunModel['æ'] = new ModelRendererTurbo(this, 137, 89, this.textureX, this.textureY);
/*  275 */     this.gunModel['ç'] = new ModelRendererTurbo(this, 153, 89, this.textureX, this.textureY);
/*  276 */     this.gunModel['è'] = new ModelRendererTurbo(this, 169, 89, this.textureX, this.textureY);
/*  277 */     this.gunModel['é'] = new ModelRendererTurbo(this, 449, 33, this.textureX, this.textureY);
/*  278 */     this.gunModel['ê'] = new ModelRendererTurbo(this, 433, 41, this.textureX, this.textureY);
/*  279 */     this.gunModel['ë'] = new ModelRendererTurbo(this, 9, 89, this.textureX, this.textureY);
/*  280 */     this.gunModel['ì'] = new ModelRendererTurbo(this, 185, 89, this.textureX, this.textureY);
/*  281 */     this.gunModel['í'] = new ModelRendererTurbo(this, 217, 89, this.textureX, this.textureY);
/*  282 */     this.gunModel['î'] = new ModelRendererTurbo(this, 265, 89, this.textureX, this.textureY);
/*  283 */     this.gunModel['ï'] = new ModelRendererTurbo(this, 289, 89, this.textureX, this.textureY);
/*  284 */     this.gunModel['ð'] = new ModelRendererTurbo(this, 313, 89, this.textureX, this.textureY);
/*  285 */     this.gunModel['ñ'] = new ModelRendererTurbo(this, 345, 89, this.textureX, this.textureY);
/*  286 */     this.gunModel['ò'] = new ModelRendererTurbo(this, 377, 89, this.textureX, this.textureY);
/*  287 */     this.gunModel['ó'] = new ModelRendererTurbo(this, 401, 89, this.textureX, this.textureY);
/*  288 */     this.gunModel['ô'] = new ModelRendererTurbo(this, 409, 89, this.textureX, this.textureY);
/*  289 */     this.gunModel['õ'] = new ModelRendererTurbo(this, 433, 89, this.textureX, this.textureY);
/*  290 */     this.gunModel['ö'] = new ModelRendererTurbo(this, 441, 89, this.textureX, this.textureY);
/*  291 */     this.gunModel['÷'] = new ModelRendererTurbo(this, 449, 89, this.textureX, this.textureY);
/*  292 */     this.gunModel['ø'] = new ModelRendererTurbo(this, 473, 89, this.textureX, this.textureY);
/*  293 */     this.gunModel['ù'] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
/*  294 */     this.gunModel['ú'] = new ModelRendererTurbo(this, 25, 97, this.textureX, this.textureY);
/*  295 */     this.gunModel['û'] = new ModelRendererTurbo(this, 497, 89, this.textureX, this.textureY);
/*  296 */     this.gunModel['ü'] = new ModelRendererTurbo(this, 505, 89, this.textureX, this.textureY);
/*  297 */     this.gunModel['ý'] = new ModelRendererTurbo(this, 49, 97, this.textureX, this.textureY);
/*  298 */     this.gunModel['þ'] = new ModelRendererTurbo(this, 57, 97, this.textureX, this.textureY);
/*  299 */     this.gunModel['ÿ'] = new ModelRendererTurbo(this, 65, 97, this.textureX, this.textureY);
/*  300 */     this.gunModel['Ā'] = new ModelRendererTurbo(this, 73, 97, this.textureX, this.textureY);
/*  301 */     this.gunModel['ā'] = new ModelRendererTurbo(this, 81, 97, this.textureX, this.textureY);
/*  302 */     this.gunModel['Ă'] = new ModelRendererTurbo(this, 89, 97, this.textureX, this.textureY);
/*  303 */     this.gunModel['ă'] = new ModelRendererTurbo(this, 97, 97, this.textureX, this.textureY);
/*  304 */     this.gunModel['Ą'] = new ModelRendererTurbo(this, 105, 97, this.textureX, this.textureY);
/*  305 */     this.gunModel['ą'] = new ModelRendererTurbo(this, 113, 97, this.textureX, this.textureY);
/*  306 */     this.gunModel['Ć'] = new ModelRendererTurbo(this, 121, 97, this.textureX, this.textureY);
/*  307 */     this.gunModel['ć'] = new ModelRendererTurbo(this, 129, 97, this.textureX, this.textureY);
/*  308 */     this.gunModel['Ĉ'] = new ModelRendererTurbo(this, 137, 97, this.textureX, this.textureY);
/*  309 */     this.gunModel['ĉ'] = new ModelRendererTurbo(this, 145, 97, this.textureX, this.textureY);
/*  310 */     this.gunModel['Ċ'] = new ModelRendererTurbo(this, 153, 97, this.textureX, this.textureY);
/*  311 */     this.gunModel['ċ'] = new ModelRendererTurbo(this, 161, 97, this.textureX, this.textureY);
/*  312 */     this.gunModel['Č'] = new ModelRendererTurbo(this, 169, 97, this.textureX, this.textureY);
/*  313 */     this.gunModel['č'] = new ModelRendererTurbo(this, 177, 97, this.textureX, this.textureY);
/*  314 */     this.gunModel['Ď'] = new ModelRendererTurbo(this, 185, 97, this.textureX, this.textureY);
/*  315 */     this.gunModel['ď'] = new ModelRendererTurbo(this, 193, 97, this.textureX, this.textureY);
/*  316 */     this.gunModel['Đ'] = new ModelRendererTurbo(this, 201, 97, this.textureX, this.textureY);
/*  317 */     this.gunModel['đ'] = new ModelRendererTurbo(this, 209, 97, this.textureX, this.textureY);
/*  318 */     this.gunModel['Ē'] = new ModelRendererTurbo(this, 217, 97, this.textureX, this.textureY);
/*  319 */     this.gunModel['ē'] = new ModelRendererTurbo(this, 225, 97, this.textureX, this.textureY);
/*  320 */     this.gunModel['Ĕ'] = new ModelRendererTurbo(this, 233, 97, this.textureX, this.textureY);
/*  321 */     this.gunModel['ĕ'] = new ModelRendererTurbo(this, 241, 97, this.textureX, this.textureY);
/*  322 */     this.gunModel['Ė'] = new ModelRendererTurbo(this, 249, 97, this.textureX, this.textureY);
/*  323 */     this.gunModel['ė'] = new ModelRendererTurbo(this, 257, 97, this.textureX, this.textureY);
/*  324 */     this.gunModel['Ę'] = new ModelRendererTurbo(this, 265, 97, this.textureX, this.textureY);
/*  325 */     this.gunModel['ę'] = new ModelRendererTurbo(this, 273, 97, this.textureX, this.textureY);
/*  326 */     this.gunModel['Ě'] = new ModelRendererTurbo(this, 281, 97, this.textureX, this.textureY);
/*  327 */     this.gunModel['ě'] = new ModelRendererTurbo(this, 289, 97, this.textureX, this.textureY);
/*  328 */     this.gunModel['Ĝ'] = new ModelRendererTurbo(this, 297, 97, this.textureX, this.textureY);
/*  329 */     this.gunModel['ĝ'] = new ModelRendererTurbo(this, 305, 97, this.textureX, this.textureY);
/*  330 */     this.gunModel['Ğ'] = new ModelRendererTurbo(this, 313, 97, this.textureX, this.textureY);
/*  331 */     this.gunModel['ğ'] = new ModelRendererTurbo(this, 321, 97, this.textureX, this.textureY);
/*  332 */     this.gunModel['Ġ'] = new ModelRendererTurbo(this, 329, 97, this.textureX, this.textureY);
/*  333 */     this.gunModel['ġ'] = new ModelRendererTurbo(this, 337, 97, this.textureX, this.textureY);
/*  334 */     this.gunModel['Ģ'] = new ModelRendererTurbo(this, 345, 97, this.textureX, this.textureY);
/*  335 */     this.gunModel['ģ'] = new ModelRendererTurbo(this, 353, 97, this.textureX, this.textureY);
/*  336 */     this.gunModel['Ĥ'] = new ModelRendererTurbo(this, 361, 97, this.textureX, this.textureY);
/*  337 */     this.gunModel['ĥ'] = new ModelRendererTurbo(this, 369, 97, this.textureX, this.textureY);
/*  338 */     this.gunModel['Ħ'] = new ModelRendererTurbo(this, 377, 97, this.textureX, this.textureY);
/*  339 */     this.gunModel['ħ'] = new ModelRendererTurbo(this, 385, 97, this.textureX, this.textureY);
/*  340 */     this.gunModel['Ĩ'] = new ModelRendererTurbo(this, 393, 97, this.textureX, this.textureY);
/*  341 */     this.gunModel['ĩ'] = new ModelRendererTurbo(this, 401, 97, this.textureX, this.textureY);
/*  342 */     this.gunModel['Ī'] = new ModelRendererTurbo(this, 409, 97, this.textureX, this.textureY);
/*  343 */     this.gunModel['ī'] = new ModelRendererTurbo(this, 417, 97, this.textureX, this.textureY);
/*  344 */     this.gunModel['Ĭ'] = new ModelRendererTurbo(this, 425, 97, this.textureX, this.textureY);
/*  345 */     this.gunModel['ĭ'] = new ModelRendererTurbo(this, 433, 97, this.textureX, this.textureY);
/*  346 */     this.gunModel['Į'] = new ModelRendererTurbo(this, 441, 97, this.textureX, this.textureY);
/*  347 */     this.gunModel['į'] = new ModelRendererTurbo(this, 449, 97, this.textureX, this.textureY);
/*  348 */     this.gunModel['İ'] = new ModelRendererTurbo(this, 457, 97, this.textureX, this.textureY);
/*  349 */     this.gunModel['ı'] = new ModelRendererTurbo(this, 465, 97, this.textureX, this.textureY);
/*  350 */     this.gunModel['Ĳ'] = new ModelRendererTurbo(this, 473, 97, this.textureX, this.textureY);
/*  351 */     this.gunModel['ĳ'] = new ModelRendererTurbo(this, 481, 97, this.textureX, this.textureY);
/*  352 */     this.gunModel['Ĵ'] = new ModelRendererTurbo(this, 489, 97, this.textureX, this.textureY);
/*  353 */     this.gunModel['ĵ'] = new ModelRendererTurbo(this, 497, 97, this.textureX, this.textureY);
/*  354 */     this.gunModel['Ķ'] = new ModelRendererTurbo(this, 505, 97, this.textureX, this.textureY);
/*  355 */     this.gunModel['ķ'] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
/*  356 */     this.gunModel['ĸ'] = new ModelRendererTurbo(this, 9, 105, this.textureX, this.textureY);
/*  357 */     this.gunModel['Ĺ'] = new ModelRendererTurbo(this, 17, 105, this.textureX, this.textureY);
/*  358 */     this.gunModel['ĺ'] = new ModelRendererTurbo(this, 25, 105, this.textureX, this.textureY);
/*  359 */     this.gunModel['Ļ'] = new ModelRendererTurbo(this, 33, 105, this.textureX, this.textureY);
/*  360 */     this.gunModel['ļ'] = new ModelRendererTurbo(this, 41, 105, this.textureX, this.textureY);
/*  361 */     this.gunModel['Ľ'] = new ModelRendererTurbo(this, 49, 105, this.textureX, this.textureY);
/*  362 */     this.gunModel['ľ'] = new ModelRendererTurbo(this, 57, 105, this.textureX, this.textureY);
/*  363 */     this.gunModel['Ŀ'] = new ModelRendererTurbo(this, 65, 105, this.textureX, this.textureY);
/*  364 */     this.gunModel['ŀ'] = new ModelRendererTurbo(this, 73, 105, this.textureX, this.textureY);
/*  365 */     this.gunModel['Ł'] = new ModelRendererTurbo(this, 81, 105, this.textureX, this.textureY);
/*  366 */     this.gunModel['ł'] = new ModelRendererTurbo(this, 89, 105, this.textureX, this.textureY);
/*  367 */     this.gunModel['Ń'] = new ModelRendererTurbo(this, 97, 105, this.textureX, this.textureY);
/*  368 */     this.gunModel['ń'] = new ModelRendererTurbo(this, 105, 105, this.textureX, this.textureY);
/*  369 */     this.gunModel['Ņ'] = new ModelRendererTurbo(this, 113, 105, this.textureX, this.textureY);
/*  370 */     this.gunModel['ņ'] = new ModelRendererTurbo(this, 121, 105, this.textureX, this.textureY);
/*  371 */     this.gunModel['Ň'] = new ModelRendererTurbo(this, 129, 105, this.textureX, this.textureY);
/*  372 */     this.gunModel['ň'] = new ModelRendererTurbo(this, 137, 105, this.textureX, this.textureY);
/*  373 */     this.gunModel['ŉ'] = new ModelRendererTurbo(this, 145, 105, this.textureX, this.textureY);
/*  374 */     this.gunModel['Ŋ'] = new ModelRendererTurbo(this, 153, 105, this.textureX, this.textureY);
/*  375 */     this.gunModel['ŋ'] = new ModelRendererTurbo(this, 161, 105, this.textureX, this.textureY);
/*  376 */     this.gunModel['Ō'] = new ModelRendererTurbo(this, 169, 105, this.textureX, this.textureY);
/*  377 */     this.gunModel['ō'] = new ModelRendererTurbo(this, 177, 105, this.textureX, this.textureY);
/*  378 */     this.gunModel['Ŏ'] = new ModelRendererTurbo(this, 185, 105, this.textureX, this.textureY);
/*  379 */     this.gunModel['ŏ'] = new ModelRendererTurbo(this, 193, 105, this.textureX, this.textureY);
/*  380 */     this.gunModel['Ő'] = new ModelRendererTurbo(this, 201, 105, this.textureX, this.textureY);
/*  381 */     this.gunModel['ő'] = new ModelRendererTurbo(this, 209, 105, this.textureX, this.textureY);
/*  382 */     this.gunModel['Œ'] = new ModelRendererTurbo(this, 217, 105, this.textureX, this.textureY);
/*  383 */     this.gunModel['œ'] = new ModelRendererTurbo(this, 225, 105, this.textureX, this.textureY);
/*  384 */     this.gunModel['Ŕ'] = new ModelRendererTurbo(this, 233, 105, this.textureX, this.textureY);
/*  385 */     this.gunModel['ŕ'] = new ModelRendererTurbo(this, 241, 105, this.textureX, this.textureY);
/*  386 */     this.gunModel['Ŗ'] = new ModelRendererTurbo(this, 249, 105, this.textureX, this.textureY);
/*  387 */     this.gunModel['ŗ'] = new ModelRendererTurbo(this, 257, 105, this.textureX, this.textureY);
/*  388 */     this.gunModel['Ř'] = new ModelRendererTurbo(this, 265, 105, this.textureX, this.textureY);
/*  389 */     this.gunModel['ř'] = new ModelRendererTurbo(this, 273, 105, this.textureX, this.textureY);
/*  390 */     this.gunModel['Ś'] = new ModelRendererTurbo(this, 281, 105, this.textureX, this.textureY);
/*  391 */     this.gunModel['ś'] = new ModelRendererTurbo(this, 289, 105, this.textureX, this.textureY);
/*  392 */     this.gunModel['Ŝ'] = new ModelRendererTurbo(this, 297, 105, this.textureX, this.textureY);
/*  393 */     this.gunModel['ŝ'] = new ModelRendererTurbo(this, 305, 105, this.textureX, this.textureY);
/*  394 */     this.gunModel['Ş'] = new ModelRendererTurbo(this, 313, 105, this.textureX, this.textureY);
/*  395 */     this.gunModel['ş'] = new ModelRendererTurbo(this, 345, 105, this.textureX, this.textureY);
/*  396 */     this.gunModel['Š'] = new ModelRendererTurbo(this, 377, 105, this.textureX, this.textureY);
/*  397 */     this.gunModel['š'] = new ModelRendererTurbo(this, 409, 105, this.textureX, this.textureY);
/*  398 */     this.gunModel['Ţ'] = new ModelRendererTurbo(this, 417, 105, this.textureX, this.textureY);
/*  399 */     this.gunModel['ţ'] = new ModelRendererTurbo(this, 425, 105, this.textureX, this.textureY);
/*  400 */     this.gunModel['Ť'] = new ModelRendererTurbo(this, 433, 105, this.textureX, this.textureY);
/*  401 */     this.gunModel['ť'] = new ModelRendererTurbo(this, 441, 105, this.textureX, this.textureY);
/*  402 */     this.gunModel['Ŧ'] = new ModelRendererTurbo(this, 449, 105, this.textureX, this.textureY);
/*  403 */     this.gunModel['ŧ'] = new ModelRendererTurbo(this, 457, 105, this.textureX, this.textureY);
/*  404 */     this.gunModel['Ũ'] = new ModelRendererTurbo(this, 465, 105, this.textureX, this.textureY);
/*  405 */     this.gunModel['ũ'] = new ModelRendererTurbo(this, 473, 105, this.textureX, this.textureY);
/*  406 */     this.gunModel['Ū'] = new ModelRendererTurbo(this, 481, 105, this.textureX, this.textureY);
/*  407 */     this.gunModel['ū'] = new ModelRendererTurbo(this, 489, 105, this.textureX, this.textureY);
/*  408 */     this.gunModel['Ŭ'] = new ModelRendererTurbo(this, 497, 105, this.textureX, this.textureY);
/*  409 */     this.gunModel['ŭ'] = new ModelRendererTurbo(this, 505, 105, this.textureX, this.textureY);
/*  410 */     this.gunModel['Ů'] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
/*  411 */     this.gunModel['ů'] = new ModelRendererTurbo(this, 9, 113, this.textureX, this.textureY);
/*  412 */     this.gunModel['Ű'] = new ModelRendererTurbo(this, 17, 113, this.textureX, this.textureY);
/*  413 */     this.gunModel['ű'] = new ModelRendererTurbo(this, 25, 113, this.textureX, this.textureY);
/*  414 */     this.gunModel['Ų'] = new ModelRendererTurbo(this, 33, 113, this.textureX, this.textureY);
/*  415 */     this.gunModel['ų'] = new ModelRendererTurbo(this, 41, 113, this.textureX, this.textureY);
/*  416 */     this.gunModel['Ŵ'] = new ModelRendererTurbo(this, 49, 113, this.textureX, this.textureY);
/*  417 */     this.gunModel['ŵ'] = new ModelRendererTurbo(this, 57, 113, this.textureX, this.textureY);
/*  418 */     this.gunModel['Ŷ'] = new ModelRendererTurbo(this, 65, 113, this.textureX, this.textureY);
/*  419 */     this.gunModel['ŷ'] = new ModelRendererTurbo(this, 73, 113, this.textureX, this.textureY);
/*  420 */     this.gunModel['Ÿ'] = new ModelRendererTurbo(this, 81, 113, this.textureX, this.textureY);
/*  421 */     this.gunModel['Ź'] = new ModelRendererTurbo(this, 89, 113, this.textureX, this.textureY);
/*  422 */     this.gunModel['ź'] = new ModelRendererTurbo(this, 97, 113, this.textureX, this.textureY);
/*  423 */     this.gunModel['Ż'] = new ModelRendererTurbo(this, 105, 113, this.textureX, this.textureY);
/*  424 */     this.gunModel['ż'] = new ModelRendererTurbo(this, 113, 113, this.textureX, this.textureY);
/*  425 */     this.gunModel['Ž'] = new ModelRendererTurbo(this, 121, 113, this.textureX, this.textureY);
/*  426 */     this.gunModel['ž'] = new ModelRendererTurbo(this, 129, 113, this.textureX, this.textureY);
/*  427 */     this.gunModel['ſ'] = new ModelRendererTurbo(this, 137, 113, this.textureX, this.textureY);
/*  428 */     this.gunModel['ƀ'] = new ModelRendererTurbo(this, 145, 113, this.textureX, this.textureY);
/*  429 */     this.gunModel['Ɓ'] = new ModelRendererTurbo(this, 153, 113, this.textureX, this.textureY);
/*  430 */     this.gunModel['Ƃ'] = new ModelRendererTurbo(this, 161, 113, this.textureX, this.textureY);
/*  431 */     this.gunModel['ƃ'] = new ModelRendererTurbo(this, 169, 113, this.textureX, this.textureY);
/*  432 */     this.gunModel['Ƅ'] = new ModelRendererTurbo(this, 177, 113, this.textureX, this.textureY);
/*  433 */     this.gunModel['ƅ'] = new ModelRendererTurbo(this, 185, 113, this.textureX, this.textureY);
/*  434 */     this.gunModel['Ɔ'] = new ModelRendererTurbo(this, 193, 113, this.textureX, this.textureY);
/*  435 */     this.gunModel['Ƈ'] = new ModelRendererTurbo(this, 201, 113, this.textureX, this.textureY);
/*  436 */     this.gunModel['ƈ'] = new ModelRendererTurbo(this, 209, 113, this.textureX, this.textureY);
/*  437 */     this.gunModel['Ɖ'] = new ModelRendererTurbo(this, 217, 113, this.textureX, this.textureY);
/*  438 */     this.gunModel['Ɗ'] = new ModelRendererTurbo(this, 225, 113, this.textureX, this.textureY);
/*  439 */     this.gunModel['Ƌ'] = new ModelRendererTurbo(this, 233, 113, this.textureX, this.textureY);
/*  440 */     this.gunModel['ƌ'] = new ModelRendererTurbo(this, 241, 113, this.textureX, this.textureY);
/*  441 */     this.gunModel['ƍ'] = new ModelRendererTurbo(this, 249, 113, this.textureX, this.textureY);
/*  442 */     this.gunModel['Ǝ'] = new ModelRendererTurbo(this, 257, 113, this.textureX, this.textureY);
/*  443 */     this.gunModel['Ə'] = new ModelRendererTurbo(this, 265, 113, this.textureX, this.textureY);
/*  444 */     this.gunModel['Ɛ'] = new ModelRendererTurbo(this, 273, 113, this.textureX, this.textureY);
/*  445 */     this.gunModel['Ƒ'] = new ModelRendererTurbo(this, 281, 113, this.textureX, this.textureY);
/*  446 */     this.gunModel['ƒ'] = new ModelRendererTurbo(this, 289, 113, this.textureX, this.textureY);
/*  447 */     this.gunModel['Ɠ'] = new ModelRendererTurbo(this, 297, 113, this.textureX, this.textureY);
/*  448 */     this.gunModel['Ɣ'] = new ModelRendererTurbo(this, 305, 113, this.textureX, this.textureY);
/*  449 */     this.gunModel['ƕ'] = new ModelRendererTurbo(this, 313, 113, this.textureX, this.textureY);
/*  450 */     this.gunModel['Ɩ'] = new ModelRendererTurbo(this, 321, 113, this.textureX, this.textureY);
/*  451 */     this.gunModel['Ɨ'] = new ModelRendererTurbo(this, 329, 113, this.textureX, this.textureY);
/*  452 */     this.gunModel['Ƙ'] = new ModelRendererTurbo(this, 337, 113, this.textureX, this.textureY);
/*  453 */     this.gunModel['ƙ'] = new ModelRendererTurbo(this, 345, 113, this.textureX, this.textureY);
/*  454 */     this.gunModel['ƚ'] = new ModelRendererTurbo(this, 353, 113, this.textureX, this.textureY);
/*  455 */     this.gunModel['ƛ'] = new ModelRendererTurbo(this, 361, 113, this.textureX, this.textureY);
/*  456 */     this.gunModel['Ɯ'] = new ModelRendererTurbo(this, 369, 113, this.textureX, this.textureY);
/*  457 */     this.gunModel['Ɲ'] = new ModelRendererTurbo(this, 377, 113, this.textureX, this.textureY);
/*  458 */     this.gunModel['ƞ'] = new ModelRendererTurbo(this, 385, 113, this.textureX, this.textureY);
/*  459 */     this.gunModel['Ɵ'] = new ModelRendererTurbo(this, 393, 113, this.textureX, this.textureY);
/*  460 */     this.gunModel['Ơ'] = new ModelRendererTurbo(this, 401, 113, this.textureX, this.textureY);
/*  461 */     this.gunModel['ơ'] = new ModelRendererTurbo(this, 409, 113, this.textureX, this.textureY);
/*  462 */     this.gunModel['Ƣ'] = new ModelRendererTurbo(this, 417, 113, this.textureX, this.textureY);
/*  463 */     this.gunModel['ƣ'] = new ModelRendererTurbo(this, 425, 113, this.textureX, this.textureY);
/*  464 */     this.gunModel['Ƥ'] = new ModelRendererTurbo(this, 433, 113, this.textureX, this.textureY);
/*  465 */     this.gunModel['ƥ'] = new ModelRendererTurbo(this, 441, 113, this.textureX, this.textureY);
/*  466 */     this.gunModel['Ʀ'] = new ModelRendererTurbo(this, 449, 113, this.textureX, this.textureY);
/*  467 */     this.gunModel['Ƨ'] = new ModelRendererTurbo(this, 457, 113, this.textureX, this.textureY);
/*  468 */     this.gunModel['ƨ'] = new ModelRendererTurbo(this, 465, 113, this.textureX, this.textureY);
/*  469 */     this.gunModel['Ʃ'] = new ModelRendererTurbo(this, 489, 113, this.textureX, this.textureY);
/*  470 */     this.gunModel['ƪ'] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
/*  471 */     this.gunModel['ƫ'] = new ModelRendererTurbo(this, 25, 121, this.textureX, this.textureY);
/*  472 */     this.gunModel['Ƭ'] = new ModelRendererTurbo(this, 49, 121, this.textureX, this.textureY);
/*  473 */     this.gunModel['ƭ'] = new ModelRendererTurbo(this, 73, 121, this.textureX, this.textureY);
/*  474 */     this.gunModel['Ʈ'] = new ModelRendererTurbo(this, 97, 121, this.textureX, this.textureY);
/*  475 */     this.gunModel['Ư'] = new ModelRendererTurbo(this, 105, 121, this.textureX, this.textureY);
/*  476 */     this.gunModel['ư'] = new ModelRendererTurbo(this, 113, 121, this.textureX, this.textureY);
/*  477 */     this.gunModel['Ʊ'] = new ModelRendererTurbo(this, 121, 121, this.textureX, this.textureY);
/*  478 */     this.gunModel['Ʋ'] = new ModelRendererTurbo(this, 129, 121, this.textureX, this.textureY);
/*  479 */     this.gunModel['Ƴ'] = new ModelRendererTurbo(this, 137, 121, this.textureX, this.textureY);
/*  480 */     this.gunModel['ƴ'] = new ModelRendererTurbo(this, 145, 121, this.textureX, this.textureY);
/*  481 */     this.gunModel['Ƶ'] = new ModelRendererTurbo(this, 153, 121, this.textureX, this.textureY);
/*  482 */     this.gunModel['ƶ'] = new ModelRendererTurbo(this, 161, 121, this.textureX, this.textureY);
/*  483 */     this.gunModel['Ʒ'] = new ModelRendererTurbo(this, 169, 121, this.textureX, this.textureY);
/*  484 */     this.gunModel['Ƹ'] = new ModelRendererTurbo(this, 177, 121, this.textureX, this.textureY);
/*  485 */     this.gunModel['ƹ'] = new ModelRendererTurbo(this, 185, 121, this.textureX, this.textureY);
/*  486 */     this.gunModel['ƺ'] = new ModelRendererTurbo(this, 193, 121, this.textureX, this.textureY);
/*  487 */     this.gunModel['ƻ'] = new ModelRendererTurbo(this, 201, 121, this.textureX, this.textureY);
/*  488 */     this.gunModel['Ƽ'] = new ModelRendererTurbo(this, 209, 121, this.textureX, this.textureY);
/*  489 */     this.gunModel['ƽ'] = new ModelRendererTurbo(this, 217, 121, this.textureX, this.textureY);
/*  490 */     this.gunModel['ƾ'] = new ModelRendererTurbo(this, 225, 121, this.textureX, this.textureY);
/*  491 */     this.gunModel['ƿ'] = new ModelRendererTurbo(this, 233, 121, this.textureX, this.textureY);
/*  492 */     this.gunModel['ǀ'] = new ModelRendererTurbo(this, 241, 121, this.textureX, this.textureY);
/*  493 */     this.gunModel['ǁ'] = new ModelRendererTurbo(this, 249, 121, this.textureX, this.textureY);
/*  494 */     this.gunModel['ǂ'] = new ModelRendererTurbo(this, 257, 121, this.textureX, this.textureY);
/*  495 */     this.gunModel['ǃ'] = new ModelRendererTurbo(this, 265, 121, this.textureX, this.textureY);
/*  496 */     this.gunModel['Ǆ'] = new ModelRendererTurbo(this, 273, 121, this.textureX, this.textureY);
/*  497 */     this.gunModel['ǅ'] = new ModelRendererTurbo(this, 281, 121, this.textureX, this.textureY);
/*  498 */     this.gunModel['ǆ'] = new ModelRendererTurbo(this, 289, 121, this.textureX, this.textureY);
/*  499 */     this.gunModel['Ǉ'] = new ModelRendererTurbo(this, 321, 121, this.textureX, this.textureY);
/*  500 */     this.gunModel['ǈ'] = new ModelRendererTurbo(this, 353, 121, this.textureX, this.textureY);
/*  501 */     this.gunModel['ǉ'] = new ModelRendererTurbo(this, 385, 121, this.textureX, this.textureY);
/*      */     
/*  503 */     this.gunModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 17, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  504 */     this.gunModel[0].setRotationPoint(-5.0F, -8.0F, 0.0F);
/*      */     
/*  506 */     this.gunModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  507 */     this.gunModel[1].setRotationPoint(-5.0F, -8.0F, -1.0F);
/*      */     
/*  509 */     this.gunModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  510 */     this.gunModel[2].setRotationPoint(-5.0F, -8.0F, 1.0F);
/*      */     
/*  512 */     this.gunModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F);
/*  513 */     this.gunModel[3].setRotationPoint(4.0F, -8.0F, 2.0F);
/*      */     
/*  515 */     this.gunModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/*  516 */     this.gunModel[4].setRotationPoint(8.0F, -8.0F, 1.5F);
/*      */     
/*  518 */     this.gunModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 19, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  519 */     this.gunModel[5].setRotationPoint(-5.0F, -6.0F, 1.0F);
/*      */     
/*  521 */     this.gunModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 17, 2, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  522 */     this.gunModel[6].setRotationPoint(-5.0F, -6.0F, -1.0F);
/*      */     
/*  524 */     this.gunModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 31, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  525 */     this.gunModel[7].setRotationPoint(-5.0F, -4.5F, -1.0F);
/*      */     
/*  527 */     this.gunModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 31, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  528 */     this.gunModel[8].setRotationPoint(-5.0F, -4.5F, 1.0F);
/*      */     
/*  530 */     this.gunModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 24, 1, 1, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
/*  531 */     this.gunModel[9].setRotationPoint(14.0F, -6.25F, 0.25F);
/*      */     
/*  533 */     this.gunModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 33, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  534 */     this.gunModel[10].setRotationPoint(-5.0F, -3.0F, 0.0F);
/*      */     
/*  536 */     this.gunModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 1, 0.0F, 0.0F, 0.0F, -1.0F, -0.125F, 0.0F, -1.0F, -0.125F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, -1.0F, -0.125F, -0.5F, -1.0F, -0.125F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  537 */     this.gunModel[11].setRotationPoint(14.0F, -6.0F, 1.0F);
/*      */     
/*  539 */     this.gunModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.25F, -0.125F, -0.5F, -0.25F, -0.125F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
/*  540 */     this.gunModel[12].setRotationPoint(14.0F, -6.0F, -1.0F);
/*      */     
/*  542 */     this.gunModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 14, 1, 1, 0.0F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.625F, -0.125F, -0.25F, 0.625F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.125F, -0.125F, -0.5F, 0.625F, -0.125F, -0.5F, 0.625F);
/*  543 */     this.gunModel[13].setRotationPoint(-2.0F, -8.5F, 0.0F);
/*      */     
/*  545 */     this.gunModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  546 */     this.gunModel[14].setRotationPoint(30.0F, -6.25F, -1.0F);
/*      */     
/*  548 */     this.gunModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
/*  549 */     this.gunModel[15].setRotationPoint(30.0F, -6.25F, 1.0F);
/*      */     
/*  551 */     this.gunModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  552 */     this.gunModel[16].setRotationPoint(30.0F, -7.5F, -0.5F);
/*      */     
/*  554 */     this.gunModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F);
/*  555 */     this.gunModel[17].setRotationPoint(30.0F, -6.25F, 1.25F);
/*      */     
/*  557 */     this.gunModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/*  558 */     this.gunModel[18].setRotationPoint(30.0F, -6.25F, -0.75F);
/*      */     
/*  560 */     this.gunModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.625F, -0.75F, 0.0F, -0.625F, -0.75F, 0.0F, -0.625F, -0.25F, 0.0F, -0.625F, -0.25F);
/*  561 */     this.gunModel[19].setRotationPoint(30.0F, -5.0F, -0.5F);
/*      */     
/*  563 */     this.gunModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
/*  564 */     this.gunModel[20].setRotationPoint(28.0F, -4.0F, -1.0F);
/*      */     
/*  566 */     this.gunModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F, -0.375F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.25F, -0.375F, 0.25F, -0.25F);
/*  567 */     this.gunModel[21].setRotationPoint(28.0F, -4.0F, 1.0F);
/*      */     
/*  569 */     this.gunModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -0.375F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.375F, 0.0F, 0.25F);
/*  570 */     this.gunModel[22].setRotationPoint(28.0F, -5.25F, -0.5F);
/*      */     
/*  572 */     this.gunModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -0.375F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.375F, 0.0F, 0.25F, -0.375F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F);
/*  573 */     this.gunModel[23].setRotationPoint(28.0F, -2.75F, -0.5F);
/*      */     
/*  575 */     this.gunModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, -0.5F, -0.375F, -0.375F, -0.5F, -0.375F);
/*  576 */     this.gunModel[24].setRotationPoint(28.0F, -4.0F, 1.25F);
/*      */     
/*  578 */     this.gunModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, 0.25F, -0.5F, -0.375F, 0.25F, -0.5F, -0.375F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, 0.25F, -0.5F, -0.375F, 0.25F, -0.5F);
/*  579 */     this.gunModel[25].setRotationPoint(28.0F, -4.0F, -0.75F);
/*      */     
/*  581 */     this.gunModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -0.375F, -0.875F, -1.25F, 0.0F, -0.875F, -1.25F, 0.0F, -0.875F, -0.75F, -0.375F, -0.875F, -0.75F, -0.375F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F);
/*  582 */     this.gunModel[26].setRotationPoint(28.0F, -5.5F, -0.5F);
/*      */     
/*  584 */     this.gunModel[27].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F, 0.0F, -0.5F, 0.25F);
/*  585 */     this.gunModel[27].setRotationPoint(29.0F, -4.25F, 0.25F);
/*      */     
/*  587 */     this.gunModel[28].addShapeBox(0.0F, 0.0F, 0.0F, 9, 1, 2, 0.0F, 0.0F, 0.0F, -0.125F, 0.5F, 0.0F, -0.125F, 0.5F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.5F, 0.0F, -0.125F, 0.5F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F);
/*  588 */     this.gunModel[28].setRotationPoint(-3.0F, -2.5F, -0.25F);
/*      */     
/*  590 */     this.gunModel[29].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.5F, -0.875F, 0.0F, -0.5F, -0.875F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F);
/*  591 */     this.gunModel[29].setRotationPoint(30.0F, -4.88F, -0.5F);
/*      */     
/*  593 */     this.gunModel[30].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, -0.5F, -0.625F, 0.0F, -0.5F, -0.625F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F);
/*  594 */     this.gunModel[30].setRotationPoint(30.0F, -4.38F, -0.5F);
/*      */     
/*  596 */     this.gunModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, -0.25F, -0.625F, 0.0F, -0.25F, -0.625F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F);
/*  597 */     this.gunModel[31].setRotationPoint(30.0F, -3.88F, -0.5F);
/*      */     
/*  599 */     this.gunModel[32].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.25F, -0.625F, 0.0F, 0.25F, -0.625F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F, -0.125F, 0.0F, -1.0F, -0.875F, 0.0F, -1.0F, -0.875F, 0.0F, -1.0F, -0.375F, 0.0F, -1.0F, -0.375F);
/*  600 */     this.gunModel[32].setRotationPoint(30.0F, -2.88F, -0.5F);
/*      */     
/*  602 */     this.gunModel[33].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  603 */     this.gunModel[33].setRotationPoint(12.0F, -6.0F, -1.0F);
/*      */     
/*  605 */     this.gunModel[34].addShapeBox(0.0F, 0.0F, 0.0F, 17, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.625F, -0.75F, 0.0F, -0.625F, -0.75F, 0.0F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F);
/*  606 */     this.gunModel[34].setRotationPoint(-5.0F, -6.0F, -1.5F);
/*      */     
/*  608 */     this.gunModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 17, 1, 1, 0.0F, 0.0F, 0.125F, -0.75F, 0.0F, 0.125F, -0.75F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/*  609 */     this.gunModel[35].setRotationPoint(-5.0F, -4.75F, -1.5F);
/*      */     
/*  611 */     this.gunModel[36].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, -0.125F, -0.5F, 0.0F, -0.125F, -0.5F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, -0.5F, 0.0F, -0.125F, -0.5F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F);
/*  612 */     this.gunModel[36].setRotationPoint(7.0F, -5.75F, -1.5F);
/*      */     
/*  614 */     this.gunModel[37].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F);
/*  615 */     this.gunModel[37].setRotationPoint(10.0F, -5.75F, -1.5F);
/*      */     
/*  617 */     this.gunModel[38].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.125F, -0.625F, 0.0F, -0.125F, -0.625F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, -0.625F, 0.0F, -0.125F, -0.625F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F);
/*  618 */     this.gunModel[38].setRotationPoint(10.0F, -5.75F, -1.37F);
/*      */     
/*  620 */     this.gunModel[39].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.333F, 0.0F, 0.0F, -0.333F, 0.0F, 0.0F, -0.333F, 0.0F, -0.125F, -0.333F, 0.0F, -0.125F, 0.0F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, -0.666F, -0.125F, 0.0F, -0.666F, -0.125F);
/*  621 */     this.gunModel[39].setRotationPoint(11.0F, -5.75F, -2.87F);
/*      */     
/*  623 */     this.gunModel[40].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, -0.666F, -0.125F, 0.0F, -0.666F, -0.125F, -0.333F, 0.0F, 0.0F, -0.333F, 0.0F, 0.0F, -0.333F, 0.0F, -0.125F, -0.333F, 0.0F, -0.125F);
/*  624 */     this.gunModel[40].setRotationPoint(11.0F, -5.75F, -2.87F);
/*      */     
/*  626 */     this.gunModel[41].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, -0.666F, 0.0F, 0.0F, -0.666F, -0.125F, 0.0F, -0.666F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F);
/*  627 */     this.gunModel[41].setRotationPoint(11.0F, -6.08F, -2.87F);
/*      */     
/*  629 */     this.gunModel[42].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, -0.75F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, -0.75F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F);
/*  630 */     this.gunModel[42].setRotationPoint(5.0F, -1.5F, -0.25F);
/*      */     
/*  632 */     this.gunModel[43].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, -0.25F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F);
/*  633 */     this.gunModel[43].setRotationPoint(2.0F, 0.5F, -0.25F);
/*      */     
/*  635 */     this.gunModel[44].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.375F, -0.25F, 0.5F, -0.375F, -0.25F, 0.5F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, -0.75F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, -0.75F, -0.375F);
/*  636 */     this.gunModel[44].setRotationPoint(5.0F, 0.5F, -0.25F);
/*      */     
/*  638 */     this.gunModel[45].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.375F, 0.5F, 0.0F, -0.375F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.375F, 0.5F, 0.0F, -0.375F, -1.0F, 0.0F, 0.0F);
/*  639 */     this.gunModel[45].setRotationPoint(0.5F, -1.5F, -0.25F);
/*      */     
/*  641 */     this.gunModel[46].addShapeBox(0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, -0.95F, 0.0F, 0.0F, 0.5F, 0.0F, -0.375F, 0.5F, 0.0F, -0.375F, -1.0F, 0.0F, 0.0F, 1.0F, -0.12F, 0.0F, -1.4F, 0.03F, -0.375F, -1.4F, 0.03F, -0.375F, 1.0F, -0.12F, 0.0F);
/*  642 */     this.gunModel[46].setRotationPoint(0.5F, -0.5F, -0.25F);
/*      */     
/*  644 */     this.gunModel[47].addShapeBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -0.5714286F, 0.0F, -1.5F, -0.125F, 0.0F, -1.5F, -0.125F, 0.0F, 2.0F, -0.5714286F, 0.0F);
/*  645 */     this.gunModel[47].setRotationPoint(-1.0F, -0.5F, -0.25F);
/*      */     
/*  647 */     this.gunModel[48].addShapeBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F, -2.0F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 0.75F, -0.74142855F, -0.5F, -1.5F, -0.5714286F, 0.0F, -1.5F, -0.5714286F, 0.0F, 0.75F, -0.74642855F, -0.5F);
/*  648 */     this.gunModel[48].setRotationPoint(-3.5F, -0.5F, -0.25F);
/*      */     
/*  650 */     this.gunModel[49].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  651 */     this.gunModel[49].setRotationPoint(-1.0F, -1.5F, -0.25F);
/*      */     
/*  653 */     this.gunModel[50].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -1.125F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.125F, 0.0F, -0.5F, -1.75F, -0.5F, -0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -1.75F, -0.5F, -0.5F);
/*  654 */     this.gunModel[50].setRotationPoint(-3.5F, -1.5F, -0.25F);
/*      */     
/*  656 */     this.gunModel[51].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -1.75F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.75F, 0.0F, -0.5F, -2.0F, -0.5F, -0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, -2.0F, -0.5F, -0.5F);
/*  657 */     this.gunModel[51].setRotationPoint(-3.5F, -1.0F, -0.25F);
/*      */     
/*  659 */     this.gunModel[52].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  660 */     this.gunModel[52].setRotationPoint(12.0F, -7.0F, -0.75F);
/*      */     
/*  662 */     this.gunModel[53].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  663 */     this.gunModel[53].setRotationPoint(12.0F, -7.75F, 1.25F);
/*      */     
/*  665 */     this.gunModel[54].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  666 */     this.gunModel[54].setRotationPoint(12.0F, -7.75F, -0.75F);
/*      */     
/*  668 */     this.gunModel[55].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  669 */     this.gunModel[55].setRotationPoint(12.0F, -7.75F, -0.5F);
/*      */     
/*  671 */     this.gunModel[56].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  672 */     this.gunModel[56].setRotationPoint(13.0F, -8.0F, -0.25F);
/*      */     
/*  674 */     this.gunModel[57].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  675 */     this.gunModel[57].setRotationPoint(13.0F, -8.0F, 0.5F);
/*      */     
/*  677 */     this.gunModel[58].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  678 */     this.gunModel[58].setRotationPoint(13.0F, -8.25F, -0.25F);
/*      */     
/*  680 */     this.gunModel[59].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/*  681 */     this.gunModel[59].setRotationPoint(13.0F, -8.25F, 0.75F);
/*      */     
/*  683 */     this.gunModel[60].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.25F, -0.125F, -0.25F, 0.0F, -0.125F, -0.25F, 0.0F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  684 */     this.gunModel[60].setRotationPoint(12.0F, -8.0F, -0.5F);
/*      */     
/*  686 */     this.gunModel[61].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.375F, -0.875F, -0.25F, -0.375F, -0.875F, -0.25F, -0.375F, -0.875F, 0.0F, -0.375F, -0.875F, 0.0F, -0.25F, -0.005F, -0.25F, 0.0F, -0.005F, -0.25F, 0.0F, -0.005F, 0.0F, -0.25F, -0.005F, 0.0F);
/*  687 */     this.gunModel[61].setRotationPoint(12.0F, -8.87F, -0.5F);
/*      */     
/*  689 */     this.gunModel[62].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.125F, 0.0F, -0.25F, -0.625F, -0.125F, -0.25F, -0.625F, -0.125F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, -0.5F, -0.25F, -0.625F, -0.625F, -0.25F, -0.625F, -0.625F, -0.25F, -0.125F, -0.5F, -0.25F);
/*  690 */     this.gunModel[62].setRotationPoint(12.5F, -8.0F, -1.0F);
/*      */     
/*  692 */     this.gunModel[63].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, -0.375F, 0.0F, -0.25F, -0.375F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F);
/*  693 */     this.gunModel[63].setRotationPoint(12.0F, -8.0F, -1.0F);
/*      */     
/*  695 */     this.gunModel[64].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.125F, 0.0F, -0.5F, -0.625F, -0.125F, -0.5F, -0.625F, -0.125F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, -0.5F, -0.5F, -0.625F, -0.625F, -0.5F, -0.625F, -0.625F, 0.0F, -0.125F, -0.5F, 0.0F);
/*  696 */     this.gunModel[64].setRotationPoint(12.5F, -8.0F, 1.75F);
/*      */     
/*  698 */     this.gunModel[65].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  699 */     this.gunModel[65].setRotationPoint(12.0F, -8.0F, 1.75F);
/*      */     
/*  701 */     this.gunModel[66].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.375F, -0.125F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.625F, -0.375F, -0.125F, -0.625F, -0.25F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.625F, -0.25F, -0.25F, -0.625F);
/*  702 */     this.gunModel[66].setRotationPoint(13.0F, -8.5F, 0.0F);
/*      */     
/*  704 */     this.gunModel[67].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.375F, -0.125F, -0.375F, 0.125F, -0.375F, -0.375F, 0.125F, -0.375F, -0.5F, -0.375F, -0.125F, -0.5F, -0.25F, -0.25F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.5F, -0.25F, -0.25F, -0.5F);
/*  705 */     this.gunModel[67].setRotationPoint(13.0F, -8.5F, 0.5F);
/*      */     
/*  707 */     this.gunModel[68].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.375F, -0.125F, -0.125F, 0.125F, -0.375F, -0.125F, 0.125F, -0.375F, -0.375F, -0.375F, -0.125F, -0.375F, -0.36F, -0.75F, -0.125F, 0.1F, -0.5F, -0.125F, 0.1F, -0.5F, -0.375F, -0.36F, -0.75F, -0.375F);
/*  708 */     this.gunModel[68].setRotationPoint(13.0F, -8.5F, 0.25F);
/*      */     
/*  710 */     this.gunModel[69].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.625F, -0.25F, -0.125F, 0.125F, -0.375F, -0.125F, 0.125F, -0.375F, 0.25F, -0.625F, -0.25F, 0.25F, -0.61F, -0.625F, -0.125F, 0.1F, -0.5F, -0.125F, 0.1F, -0.5F, 0.25F, -0.61F, -0.625F, 0.25F);
/*  711 */     this.gunModel[69].setRotationPoint(13.0F, -8.67F, 0.13F);
/*      */     
/*  713 */     this.gunModel[70].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.625F, -0.25F, -0.125F, 0.125F, -0.375F, -0.125F, 0.125F, -0.375F, -0.75F, -0.625F, -0.25F, -0.75F, -0.485F, 0.25F, -0.125F, -0.025F, 0.25F, -0.125F, -0.025F, 0.25F, -0.75F, -0.485F, 0.25F, -0.75F);
/*  714 */     this.gunModel[70].setRotationPoint(13.0F, -8.67F, 2.25F);
/*      */     
/*  716 */     this.gunModel[71].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.86F, 0.25F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.75F, -0.86F, 0.25F, -0.75F);
/*  717 */     this.gunModel[71].setRotationPoint(13.0F, -7.67F, 2.25F);
/*      */     
/*  719 */     this.gunModel[72].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.875F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.5F, -0.875F, -0.25F, -0.5F, -1.235F, 0.25F, -0.125F, 0.35F, 0.25F, -0.125F, 0.35F, 0.25F, -0.5F, -1.235F, 0.25F, -0.5F);
/*  720 */     this.gunModel[72].setRotationPoint(12.5F, -7.67F, 2.25F);
/*      */     
/*  722 */     this.gunModel[73].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.875F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.075F, -0.5F, -0.5F, -0.95F, -0.5F, -0.5F, -1.235F, 0.25F, -0.25F, 0.35F, 0.25F, -0.25F, 0.275F, 0.0F, -0.5F, -1.16F, 0.0F, -0.5F);
/*  723 */     this.gunModel[73].setRotationPoint(12.5F, -7.67F, 2.5F);
/*      */     
/*  725 */     this.gunModel[74].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.125F, 0.5F, -0.25F, -0.125F, 0.5F, -0.25F, 0.125F, 0.0F, -0.25F, 0.125F, 0.0F, -0.5F, -0.125F, 0.5F, -0.5F, -0.125F, 0.5F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F);
/*  726 */     this.gunModel[74].setRotationPoint(8.5F, -8.5F, 1.5F);
/*      */     
/*  728 */     this.gunModel[75].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.625F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.375F, -0.625F, -0.25F, -0.875F, -0.625F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.375F, -0.625F, -0.5F, -0.875F);
/*  729 */     this.gunModel[75].setRotationPoint(7.5F, -8.5F, 1.5F);
/*      */     
/*  731 */     this.gunModel[76].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.125F, -0.625F, -0.25F, -0.125F, -0.625F, -0.25F, -0.875F, 0.0F, -0.25F, -0.375F, 0.0F, -0.5F, 0.125F, -0.625F, -0.5F, 0.125F, -0.625F, -0.5F, -0.875F, 0.0F, -0.5F, -0.375F);
/*  732 */     this.gunModel[76].setRotationPoint(10.0F, -8.5F, 1.5F);
/*      */     
/*  734 */     this.gunModel[77].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  735 */     this.gunModel[77].setRotationPoint(8.0F, -8.0F, -1.0F);
/*      */     
/*  737 */     this.gunModel[78].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  738 */     this.gunModel[78].setRotationPoint(10.0F, -8.0F, -1.0F);
/*      */     
/*  740 */     this.gunModel[79].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.125F, 0.5F, -0.25F, 0.125F, 0.5F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.5F, 0.125F, 0.5F, -0.5F, 0.125F, 0.5F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F);
/*  741 */     this.gunModel[79].setRotationPoint(8.5F, -8.5F, -1.0F);
/*      */     
/*  743 */     this.gunModel[80].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.625F, -0.25F, -0.875F, 0.0F, -0.25F, -0.375F, 0.0F, -0.25F, -0.125F, -0.625F, -0.25F, -0.125F, -0.625F, -0.5F, -0.875F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.125F, -0.625F, -0.5F, -0.125F);
/*  744 */     this.gunModel[80].setRotationPoint(7.5F, -8.5F, -1.0F);
/*      */     
/*  746 */     this.gunModel[81].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.375F, -0.625F, -0.25F, -0.875F, -0.625F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.5F, -0.375F, -0.625F, -0.5F, -0.875F, -0.625F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F);
/*  747 */     this.gunModel[81].setRotationPoint(10.0F, -8.5F, -1.0F);
/*      */     
/*  749 */     this.gunModel[82].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  750 */     this.gunModel[82].setRotationPoint(10.5F, -8.0F, -1.0F);
/*      */     
/*  752 */     this.gunModel[83].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
/*  753 */     this.gunModel[83].setRotationPoint(8.5F, -8.0F, -1.0F);
/*      */     
/*  755 */     this.gunModel[84].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F);
/*  756 */     this.gunModel[84].setRotationPoint(8.5F, -7.5F, -1.0F);
/*      */     
/*  758 */     this.gunModel[85].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, -0.25F, 0.0F, -1.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, -1.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/*  759 */     this.gunModel[85].setRotationPoint(7.5F, -8.0F, -1.5F);
/*      */     
/*  761 */     this.gunModel[86].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, -0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -1.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/*  762 */     this.gunModel[86].setRotationPoint(10.0F, -8.0F, -1.75F);
/*      */     
/*  764 */     this.gunModel[87].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.875F, 0.0F, 1.0F, -0.875F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, -0.875F, 0.0F, -0.25F, -0.875F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  765 */     this.gunModel[87].setRotationPoint(-4.0F, -6.75F, -1.5F);
/*      */     
/*  767 */     this.gunModel[88].addShapeBox(0.0F, 0.0F, 0.0F, 17, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  768 */     this.gunModel[88].setRotationPoint(-5.0F, -7.0F, 1.0F);
/*      */     
/*  770 */     this.gunModel[89].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.125F, -0.5F, -0.5F, -0.125F, -0.5F, -0.5F, -0.125F, -0.25F, 0.0F, -0.125F, -0.25F);
/*  771 */     this.gunModel[89].setRotationPoint(7.0F, -6.5F, -1.5F);
/*      */     
/*  773 */     this.gunModel[90].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.625F, -0.5F, -1.0F, -0.625F, -0.5F, -1.0F, -0.625F, -0.25F, 0.0F, -0.625F, -0.25F, 0.0F, -0.125F, -0.5F, -0.75F, -0.125F, -0.5F, -0.75F, -0.125F, -0.25F, 0.0F, -0.125F, -0.25F);
/*  774 */     this.gunModel[90].setRotationPoint(7.5F, -6.5F, -1.5F);
/*      */     
/*  776 */     this.gunModel[91].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/*  777 */     this.gunModel[91].setRotationPoint(7.0F, -7.25F, -1.5F);
/*      */     
/*  779 */     this.gunModel[92].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 1.0F, -0.875F, -0.25F, 0.125F, -0.875F, -0.25F, 0.125F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/*  780 */     this.gunModel[92].setRotationPoint(1.0F, -6.75F, -1.5F);
/*      */     
/*  782 */     this.gunModel[93].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.25F, 0.125F, -0.875F, 0.0F, 0.125F, -0.875F, 0.0F, 0.125F, 0.0F, 0.25F, 0.125F, 0.0F, 0.25F, -0.25F, -0.875F, 0.0F, -0.25F, -0.875F, 0.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F);
/*  783 */     this.gunModel[93].setRotationPoint(3.0F, -6.75F, -1.5F);
/*      */     
/*  785 */     this.gunModel[94].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, -0.25F, 0.0F, -0.875F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, -0.875F, 0.0F, -0.25F, -0.875F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  786 */     this.gunModel[94].setRotationPoint(5.5F, -7.75F, -1.5F);
/*      */     
/*  788 */     this.gunModel[95].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.25F, 0.125F, -0.875F, 0.0F, 1.0F, -0.875F, 0.0F, 1.0F, 0.0F, -0.25F, 0.125F, 0.0F, -0.25F, -0.25F, -0.875F, 0.0F, -0.25F, -0.875F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  789 */     this.gunModel[95].setRotationPoint(3.75F, -6.75F, -1.5F);
/*      */     
/*  791 */     this.gunModel[96].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, -0.25F, 0.0F, -0.875F, 0.5F, -0.75F, -0.875F, 0.5F, -0.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.25F, -0.875F, 0.5F, -1.0F, -0.875F, 0.5F, -1.0F, 0.0F, -0.25F, -0.25F, 0.0F);
/*  792 */     this.gunModel[96].setRotationPoint(6.25F, -7.75F, -1.5F);
/*      */     
/*  794 */     this.gunModel[97].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.375F, -0.5F, 0.0F, 0.375F, -0.5F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, 0.0F, -0.625F, 0.375F, -0.5F, -0.625F, 0.375F, -0.5F, -0.625F, 0.375F, 0.0F, -0.625F, 0.375F);
/*  795 */     this.gunModel[97].setRotationPoint(5.5F, -2.5F, -0.25F);
/*      */     
/*  797 */     this.gunModel[98].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.125F, 0.375F, 0.125F, 0.125F, 0.375F, 0.125F, 0.125F, 0.375F, 0.0F, 0.125F, 0.375F, 0.0F, -1.0F, 0.375F, 0.125F, -1.0F, 0.375F, 0.125F, -1.0F, 0.375F, 0.0F, -1.0F, 0.375F);
/*  798 */     this.gunModel[98].setRotationPoint(5.5F, -2.0F, -0.25F);
/*      */     
/*  800 */     this.gunModel[99].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.375F, 0.125F, 0.0F, 0.375F, 0.125F, 0.0F, 0.375F, 0.0F, 0.0F, 0.375F, -0.375F, -0.625F, 0.375F, -0.25F, -0.625F, 0.375F, -0.25F, -0.625F, 0.375F, -0.375F, -0.625F, 0.375F);
/*  801 */     this.gunModel[99].setRotationPoint(5.5F, -2.0F, -0.25F);
/*      */     
/*  803 */     this.gunModel[100].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F, 0.0F, -0.25F, -0.125F);
/*  804 */     this.gunModel[100].setRotationPoint(-5.0F, -2.5F, -0.25F);
/*      */     
/*  806 */     this.gunModel[101].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.75F, 0.25F, -0.125F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F, -0.125F, -0.75F, 0.25F, -0.125F, -0.75F, -1.25F, -0.125F, 0.0F, -1.0F, -0.125F, 0.0F, -1.0F, -0.125F, -0.75F, -1.25F, -0.125F);
/*  807 */     this.gunModel[101].setRotationPoint(-4.0F, -1.5F, -0.25F);
/*      */     
/*  809 */     this.gunModel[102].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, 0.5F, -0.875F, 0.5F, 0.0F, -0.375F, 0.5F, 0.0F, -0.375F, 0.5F, 0.5F, -0.875F, 0.5F, 0.375F, -0.125F, 0.5F, 0.0F, -0.125F, 0.5F, 0.0F, -0.125F, 0.5F, 0.375F, -0.125F, 0.5F);
/*  810 */     this.gunModel[102].setRotationPoint(-6.0F, -8.0F, -0.25F);
/*      */     
/*  812 */     this.gunModel[103].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, 0.375F, 0.125F, 0.75F, 0.0F, 0.125F, 0.75F, 0.0F, 0.125F, 0.75F, 0.375F, 0.125F, 0.75F, 0.125F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F, 0.125F, -0.25F, 0.75F);
/*  813 */     this.gunModel[103].setRotationPoint(-6.0F, -6.0F, -0.25F);
/*      */     
/*  815 */     this.gunModel[104].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, 0.125F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.125F, -0.75F, 0.5F, -0.125F, 0.625F, 0.5F, 0.0F, 0.625F, 0.5F, 0.0F, 0.625F, 0.5F, -0.125F, 0.625F, 0.5F);
/*  816 */     this.gunModel[104].setRotationPoint(-6.0F, -5.0F, -0.25F);
/*      */     
/*  818 */     this.gunModel[105].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.125F, -0.625F, 0.25F, 0.0F, -0.625F, 0.25F, 0.0F, -0.625F, 0.25F, -0.125F, -0.625F, 0.25F, -0.25F, 0.375F, 0.25F, 0.0F, 0.375F, 0.25F, 0.0F, 0.375F, 0.25F, -0.25F, 0.375F, 0.25F);
/*  819 */     this.gunModel[105].setRotationPoint(-6.0F, -3.0F, -0.25F);
/*      */     
/*  821 */     this.gunModel[106].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.5F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.25F, -0.25F, 0.125F, 0.5F, -0.25F, 0.125F, 0.5F, 0.0F, -0.375F, 0.25F, 0.0F, -0.375F, 0.25F, 0.0F, -0.375F, 0.5F, 0.0F, -0.375F);
/*  822 */     this.gunModel[106].setRotationPoint(-8.0F, -3.25F, -0.25F);
/*      */     
/*  824 */     this.gunModel[107].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.5F, -0.5F, -0.375F, -0.45F, 0.875F, -0.375F, -0.45F, 0.875F, -0.375F, 0.5F, -0.5F, -0.375F, 0.5F, 0.25F, 0.125F, -0.2F, -1.25F, 0.125F, -0.2F, -1.25F, 0.125F, 0.5F, 0.25F, 0.125F);
/*  825 */     this.gunModel[107].setRotationPoint(-8.0F, -6.0F, -0.25F);
/*      */     
/*  827 */     this.gunModel[108].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F, 0.0F, -0.25F, 0.125F, 0.0F, 0.75F, 0.125F, 0.0F, 0.75F, 0.125F, 0.0F, -0.25F, 0.125F, 0.0F, 0.0F, -0.375F, 0.0F, -1.0F, -0.375F, 0.0F, -1.0F, -0.375F, 0.0F, 0.0F, -0.375F);
/*  828 */     this.gunModel[108].setRotationPoint(-13.5F, -2.25F, -0.25F);
/*      */     
/*  830 */     this.gunModel[109].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, -0.25F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, -0.25F, 0.125F);
/*  831 */     this.gunModel[109].setRotationPoint(-14.5F, -6.0F, -0.25F);
/*      */     
/*  833 */     this.gunModel[110].addShapeBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F, 0.0F, -0.75F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, -0.75F, -0.375F, 0.0F, 0.5F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, 0.5F, 0.125F);
/*  834 */     this.gunModel[110].setRotationPoint(-22.5F, -7.5F, -0.25F);
/*      */     
/*  836 */     this.gunModel[111].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F, 0.0F, -1.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, -1.0F, -0.375F, 0.0F, 0.75F, 0.125F, 0.0F, -0.25F, 0.125F, 0.0F, -0.25F, 0.125F, 0.0F, 0.75F, 0.125F);
/*  837 */     this.gunModel[111].setRotationPoint(-13.5F, -5.5F, -0.25F);
/*      */     
/*  839 */     this.gunModel[112].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F, 0.0F, -1.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, -1.0F, 0.125F, 0.0F, 0.75F, 0.125F, 0.0F, -0.25F, 0.125F, 0.0F, -0.25F, 0.125F, 0.0F, 0.75F, 0.125F);
/*  840 */     this.gunModel[112].setRotationPoint(-13.5F, -4.75F, -0.25F);
/*      */     
/*  842 */     this.gunModel[113].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.5F, -0.5F, 0.125F, -0.225F, 1.0F, 0.125F, -0.175F, 1.0F, 0.125F, 0.5F, -0.5F, 0.125F, 0.5F, 1.25F, 0.125F, 0.05F, 1.25F, 0.125F, 0.05F, 1.25F, 0.125F, 0.5F, 1.25F, 0.125F);
/*  843 */     this.gunModel[113].setRotationPoint(-8.0F, -5.25F, -0.25F);
/*      */     
/*  845 */     this.gunModel[114].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, 0.0F, 0.125F, -0.5F, -1.0F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, -1.5F, -0.375F, -0.5F, -1.0F, -0.375F);
/*  846 */     this.gunModel[114].setRotationPoint(-14.5F, -0.75F, -0.25F);
/*      */     
/*  848 */     this.gunModel[115].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.5F, -0.75F, -0.375F, 0.0F, -1.5F, -0.375F, 0.0F, -1.5F, -0.375F, -0.5F, -0.75F, -0.375F, 0.0F, -0.25F, 0.125F, -0.5F, 0.5F, 0.125F, -0.5F, 0.5F, 0.125F, 0.0F, -0.25F, 0.125F);
/*  849 */     this.gunModel[115].setRotationPoint(-14.5F, -1.0F, -0.25F);
/*      */     
/*  851 */     this.gunModel[116].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.5F, -1.0F, -0.375F, -0.5F, -1.5F, -0.375F, -0.5F, -1.5F, -0.375F, -0.5F, -1.0F, -0.375F, 0.0F, 0.0F, 0.125F, -1.0F, 0.5F, 0.125F, -1.0F, 0.5F, 0.125F, 0.0F, 0.0F, 0.125F);
/*  852 */     this.gunModel[116].setRotationPoint(-14.5F, -1.75F, -0.25F);
/*      */     
/*  854 */     this.gunModel[117].addShapeBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F, 0.0F, 0.5F, 0.125F, 0.5F, 1.25F, 0.125F, 0.5F, 1.25F, 0.125F, 0.0F, 0.5F, 0.125F, 0.0F, -0.75F, -0.375F, 0.5F, -1.5F, -0.375F, 0.5F, -1.5F, -0.375F, 0.0F, -0.75F, -0.375F);
/*  855 */     this.gunModel[117].setRotationPoint(-22.5F, 1.75F, -0.25F);
/*      */     
/*  857 */     this.gunModel[118].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.5F, -1.0F, -0.375F, 0.0F, -1.625F, -0.375F, 0.0F, -1.625F, -0.375F, -0.5F, -1.0F, -0.375F, 0.0F, 0.0F, 0.125F, -1.0F, 0.75F, -0.375F, -1.0F, 0.75F, -0.375F, 0.0F, 0.0F, 0.125F);
/*  858 */     this.gunModel[118].setRotationPoint(-14.0F, -0.5F, -0.25F);
/*      */     
/*  860 */     this.gunModel[119].addShapeBox(0.0F, 0.0F, 0.0F, 8, 6, 2, 0.0F, 0.0F, -0.75F, 0.125F, 0.0F, -1.5F, 0.125F, 0.0F, -1.5F, 0.125F, 0.0F, -0.75F, 0.125F, 0.0F, 2.0F, 0.125F, 0.0F, 1.3F, 0.125F, 0.0F, 1.3F, 0.125F, 0.0F, 2.0F, 0.125F);
/*  861 */     this.gunModel[119].setRotationPoint(-22.5F, -6.75F, -0.25F);
/*      */     
/*  863 */     this.gunModel[120].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, -1.5F, 0.125F, 0.0F, -1.5F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 2.5F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, 1.25F, 0.125F, 0.0F, 2.5F, 0.125F);
/*  864 */     this.gunModel[120].setRotationPoint(-14.5F, -5.25F, -0.25F);
/*      */     
/*  866 */     this.gunModel[121].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.5F, -0.75F, 0.125F, 0.0F, -1.5F, 0.125F, 0.0F, -1.5F, 0.125F, -0.5F, -0.75F, 0.125F, -0.5F, -0.25F, 0.125F, -0.5F, 0.55F, 0.125F, -0.5F, 0.55F, 0.125F, -0.5F, -0.25F, 0.125F);
/*  867 */     this.gunModel[121].setRotationPoint(-15.0F, -1.0F, -0.25F);
/*      */     
/*  869 */     this.gunModel[122].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.125F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.25F, 0.125F, 0.0F, 0.25F, 0.125F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.125F, -0.5F, 0.25F);
/*  870 */     this.gunModel[122].setRotationPoint(27.0F, -6.0F, 1.0F);
/*      */     
/*  872 */     this.gunModel[123].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.375F, -1.0F, 0.0F, -0.375F, -1.0F, 0.0F, -0.375F, 0.25F, -0.5F, -0.375F, 0.25F);
/*  873 */     this.gunModel[123].setRotationPoint(27.0F, -5.5F, 1.0F);
/*      */     
/*  875 */     this.gunModel[124].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.125F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, 0.25F, 0.125F, -0.125F, 0.25F, 0.125F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.125F, -0.5F, 0.25F);
/*  876 */     this.gunModel[124].setRotationPoint(27.0F, -5.0F, 1.0F);
/*      */     
/*  878 */     this.gunModel[125].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.125F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F);
/*  879 */     this.gunModel[125].setRotationPoint(27.0F, -4.5F, 1.0F);
/*      */     
/*  881 */     this.gunModel[126].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.625F, -0.5F, -0.125F, -0.625F, -0.5F, -0.125F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F);
/*  882 */     this.gunModel[126].setRotationPoint(26.0F, -4.5F, 1.0F);
/*      */     
/*  884 */     this.gunModel[127].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  885 */     this.gunModel[127].setRotationPoint(26.0F, -3.5F, 1.0F);
/*      */     
/*  887 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.5F, -0.875F, -0.375F, -0.5F, -0.875F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, 0.0F, -0.5F, -0.875F, 0.0F, -0.5F, -0.875F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  888 */     this.gunModel[''].setRotationPoint(26.0F, -4.5F, 1.0F);
/*      */     
/*  890 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.5F, -0.875F, -0.375F, -0.5F, -0.875F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, 0.0F, -0.5F, -0.875F, 0.0F, -0.5F, -0.875F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  891 */     this.gunModel[''].setRotationPoint(26.75F, -4.5F, 1.0F);
/*      */     
/*  893 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.125F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F);
/*  894 */     this.gunModel[''].setRotationPoint(27.0F, -4.5F, -1.0F);
/*      */     
/*  896 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.625F, -0.5F, -0.125F, -0.625F, -0.5F, -0.125F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F);
/*  897 */     this.gunModel[''].setRotationPoint(26.0F, -4.5F, -1.0F);
/*      */     
/*  899 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.125F, 0.0F, -0.5F, -0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  900 */     this.gunModel[''].setRotationPoint(26.0F, -3.5F, -1.0F);
/*      */     
/*  902 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.5F, -0.875F, -0.375F, -0.5F, -0.875F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, 0.0F, -0.5F, -0.875F, 0.0F, -0.5F, -0.875F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  903 */     this.gunModel[''].setRotationPoint(26.0F, -4.5F, -1.0F);
/*      */     
/*  905 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.5F, -0.875F, -0.375F, -0.5F, -0.875F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, 0.0F, -0.5F, -0.875F, 0.0F, -0.5F, -0.875F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/*  906 */     this.gunModel[''].setRotationPoint(26.75F, -4.5F, -1.0F);
/*      */     
/*  908 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.125F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.25F, 0.125F, 0.0F, 0.25F, 0.125F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.125F, -0.5F, 0.25F);
/*  909 */     this.gunModel[''].setRotationPoint(27.0F, -6.0F, -1.75F);
/*      */     
/*  911 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.375F, -1.0F, 0.0F, -0.375F, -1.0F, 0.0F, -0.375F, 0.25F, -0.5F, -0.375F, 0.25F);
/*  912 */     this.gunModel[''].setRotationPoint(27.0F, -5.5F, -1.75F);
/*      */     
/*  914 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.125F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, 0.25F, 0.125F, -0.125F, 0.25F, 0.125F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.25F, 0.125F, -0.5F, 0.25F);
/*  915 */     this.gunModel[''].setRotationPoint(27.0F, -5.0F, -1.75F);
/*      */     
/*  917 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  918 */     this.gunModel[''].setRotationPoint(27.25F, -4.5F, 1.5F);
/*      */     
/*  920 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, -0.25F, 0.0F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/*  921 */     this.gunModel[''].setRotationPoint(27.25F, -4.5F, -1.5F);
/*      */     
/*  923 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, -0.25F, 0.0F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.125F, -0.75F, -0.5F, 0.125F, -0.75F, -0.5F, 0.125F, -0.75F, 0.0F, -0.125F, -0.75F, 0.0F);
/*  924 */     this.gunModel[''].setRotationPoint(27.25F, -2.5F, -1.5F);
/*      */     
/*  926 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, -0.75F, 0.0F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.125F, 0.0F, -0.5F, 0.125F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F);
/*  927 */     this.gunModel[''].setRotationPoint(27.25F, -4.5F, -1.0F);
/*      */     
/*  929 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, -0.75F, -0.625F, -0.625F, 0.125F, -0.625F, -0.625F, 0.125F, -0.625F, -0.125F, -0.75F, -0.625F, -0.125F, -0.75F, 0.0F, -0.625F, 0.125F, 0.0F, -0.625F, 0.125F, 0.0F, -0.125F, -0.75F, 0.0F, -0.125F);
/*  930 */     this.gunModel[''].setRotationPoint(27.25F, -5.5F, -1.0F);
/*      */     
/*  932 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.625F, -0.625F, 0.125F, -0.625F, -0.625F, 0.125F, -0.625F, -0.375F, -0.75F, -0.625F, -0.375F, -0.75F, 0.125F, -0.625F, 0.125F, 0.125F, -0.625F, 0.125F, 0.125F, 0.0F, -0.75F, 0.125F, 0.0F);
/*  933 */     this.gunModel[''].setRotationPoint(27.25F, -6.0F, -1.0F);
/*      */     
/*  935 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.625F, -0.375F, 0.125F, -0.625F, -0.375F, 0.125F, -0.625F, -0.625F, -0.75F, -0.625F, -0.625F, -0.75F, 0.125F, 0.0F, 0.125F, 0.125F, 0.0F, 0.125F, 0.125F, -0.625F, -0.75F, 0.125F, -0.625F);
/*  936 */     this.gunModel[''].setRotationPoint(27.25F, -6.0F, 1.5F);
/*      */     
/*  938 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -0.375F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, -0.375F, 0.0F, 0.25F);
/*  939 */     this.gunModel[''].setRotationPoint(28.0F, -3.25F, -0.5F);
/*      */     
/*  941 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F);
/*  942 */     this.gunModel[''].setRotationPoint(28.0F, -3.0F, 0.75F);
/*      */     
/*  944 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F);
/*  945 */     this.gunModel[''].setRotationPoint(28.0F, -3.0F, -0.25F);
/*      */     
/*  947 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F);
/*  948 */     this.gunModel[''].setRotationPoint(28.0F, -2.75F, 0.75F);
/*      */     
/*  950 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.375F, 0.0F, -0.75F);
/*  951 */     this.gunModel[''].setRotationPoint(28.0F, -2.75F, -0.25F);
/*      */     
/*  953 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F);
/*  954 */     this.gunModel[''].setRotationPoint(28.0F, -2.5F, 0.75F);
/*      */     
/*  956 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.75F, -0.375F, -0.75F, -0.75F, -0.375F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.375F, 0.0F, -0.75F);
/*  957 */     this.gunModel[''].setRotationPoint(28.0F, -2.5F, -0.25F);
/*      */     
/*  959 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.25F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0.25F, 0.0F, -0.375F, 0.25F, 0.0F);
/*  960 */     this.gunModel[''].setRotationPoint(28.0F, -2.25F, 0.75F);
/*      */     
/*  962 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, -0.75F, -0.375F, -0.75F, -0.75F, -0.375F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.75F, -0.375F, 0.25F, -0.75F);
/*  963 */     this.gunModel[''].setRotationPoint(28.0F, -2.25F, -0.25F);
/*      */     
/*  965 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, -0.125F, -0.75F, 0.0F, -0.125F, -0.75F, 0.0F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F);
/*  966 */     this.gunModel[''].setRotationPoint(28.0F, -1.75F, 0.75F);
/*      */     
/*  968 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.75F, -0.375F, -0.75F, -0.75F, -0.375F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, -0.75F, -0.375F, -0.125F, -0.75F);
/*  969 */     this.gunModel[''].setRotationPoint(28.0F, -1.75F, -0.25F);
/*      */     
/*  971 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, -0.625F, -0.75F, 0.0F, -0.625F, -0.75F, 0.0F, -0.625F, 0.0F, -0.375F, -0.625F, 0.0F, -0.375F, 0.125F, -0.75F, -0.25F, 0.125F, -0.75F, -0.25F, 0.125F, 0.0F, -0.375F, 0.125F, 0.0F);
/*  972 */     this.gunModel[''].setRotationPoint(28.0F, -1.5F, 0.75F);
/*      */     
/*  974 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.375F, -0.625F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F, -0.625F, -0.75F, -0.375F, -0.625F, -0.75F, -0.375F, 0.125F, 0.0F, -0.25F, 0.125F, 0.0F, -0.25F, 0.125F, -0.75F, -0.375F, 0.125F, -0.75F);
/*  975 */     this.gunModel[''].setRotationPoint(28.0F, -1.5F, -0.25F);
/*      */     
/*  977 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -0.625F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.625F, -0.75F, 0.0F, -0.375F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, 0.0F, -0.375F, 0.25F, 0.0F);
/*  978 */     this.gunModel[''].setRotationPoint(28.0F, -1.5F, -0.5F);
/*      */     
/*  980 */     this.gunModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -0.875F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0.0F, -0.875F, -0.75F, 0.0F, -0.625F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.625F, 0.0F, 0.0F);
/*  981 */     this.gunModel[''].setRotationPoint(28.0F, -1.75F, -0.5F);
/*      */     
/*  983 */     this.gunModel[' '].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.5F, -0.5F, -0.375F, 0.5F, -0.5F, -0.375F, 0.5F, 0.0F, -0.375F, 0.5F, 0.0F);
/*  984 */     this.gunModel[' '].setRotationPoint(28.0F, -1.0F, -0.5F);
/*      */     
/*  986 */     this.gunModel['¡'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.5F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.5F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F);
/*  987 */     this.gunModel['¡'].setRotationPoint(29.25F, -1.0F, -0.5F);
/*      */     
/*  989 */     this.gunModel['¢'].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.125F, -0.75F, 0.0F, -0.125F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.625F, -0.75F, 0.0F, -0.625F, -0.75F);
/*  990 */     this.gunModel['¢'].setRotationPoint(8.0F, -8.0F, 3.0F);
/*      */     
/*  992 */     this.gunModel['£'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.425F, -0.125F, -0.25F, -0.275F, -0.125F, -0.25F, -0.275F, -0.125F, 0.0F, -0.425F, -0.125F, 0.0F, -0.425F, -0.575F, -0.25F, -0.275F, -0.575F, -0.25F, -0.275F, -0.575F, 0.0F, -0.425F, -0.575F, 0.0F);
/*  993 */     this.gunModel['£'].setRotationPoint(12.0F, -8.0F, 1.25F);
/*      */     
/*  995 */     this.gunModel['¤'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.5F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F);
/*  996 */     this.gunModel['¤'].setRotationPoint(29.25F, -0.25F, -0.5F);
/*      */     
/*  998 */     this.gunModel['¥'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, -0.5F, -0.375F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, 0.0F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, 0.0F, -0.25F, -0.375F, 0.0F, -0.25F);
/*  999 */     this.gunModel['¥'].setRotationPoint(28.0F, -0.25F, -0.5F);
/*      */     
/* 1001 */     this.gunModel['¦'].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, 0.25F, -0.75F, 0.0F);
/* 1002 */     this.gunModel['¦'].setRotationPoint(8.0F, -2.5F, -0.5F);
/*      */     
/* 1004 */     this.gunModel['§'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
/* 1005 */     this.gunModel['§'].setRotationPoint(7.75F, -2.25F, -0.5F);
/*      */     
/* 1007 */     this.gunModel['¨'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F);
/* 1008 */     this.gunModel['¨'].setRotationPoint(10.75F, -2.25F, -0.5F);
/*      */     
/* 1010 */     this.gunModel['©'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F, -0.5F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.5F, 4.0F, -0.625F, 0.5F, 4.0F, -0.625F, 0.5F, -5.0F, -0.5F, 0.5F, -5.0F);
/* 1011 */     this.gunModel['©'].setRotationPoint(28.25F, -1.0F, -0.5F);
/*      */     
/* 1013 */     this.gunModel['ª'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F, -0.5F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.5F, -5.0F, -0.625F, 0.5F, -5.0F, -0.625F, 0.5F, 4.0F, -0.5F, 0.5F, 4.0F);
/* 1014 */     this.gunModel['ª'].setRotationPoint(28.25F, -1.0F, 0.0F);
/*      */     
/* 1016 */     this.gunModel['«'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.125F, 0.0F, -0.75F, 0.125F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
/* 1017 */     this.gunModel['«'].setRotationPoint(27.75F, 9.5F, 5.0F);
/*      */     
/* 1019 */     this.gunModel['¬'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.125F, 0.0F, -0.75F, 0.125F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.0F);
/* 1020 */     this.gunModel['¬'].setRotationPoint(29.75F, 9.5F, 5.0F);
/*      */     
/* 1022 */     this.gunModel['­'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.125F, 0.0F, -0.75F, 0.125F);
/* 1023 */     this.gunModel['­'].setRotationPoint(27.75F, 9.5F, -5.5F);
/*      */     
/* 1025 */     this.gunModel['®'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.125F, 0.0F, 0.0F, 0.125F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.125F, 0.0F, -0.75F, 0.125F);
/* 1026 */     this.gunModel['®'].setRotationPoint(29.75F, 9.5F, -5.5F);
/*      */     
/* 1028 */     this.gunModel['¯'].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, -0.625F, 0.5F, 0.0F, -0.625F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.625F, 0.5F, -0.75F, -0.625F, 0.5F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F);
/* 1029 */     this.gunModel['¯'].setRotationPoint(8.0F, -6.5F, 0.5F);
/*      */     
/* 1031 */     this.gunModel['°'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.125F, 0.0F, 0.0F, -0.125F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.125F, 0.0F, -0.75F, -0.125F);
/* 1032 */     this.gunModel['°'].setRotationPoint(8.0F, -6.5F, -0.5F);
/*      */     
/* 1034 */     this.gunModel['±'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.25F, -0.125F, 0.5F, 0.25F, -0.125F, 0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.125F, 0.5F, -0.75F, -0.125F, 0.5F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 1035 */     this.gunModel['±'].setRotationPoint(10.0F, -6.5F, -0.5F);
/*      */     
/* 1037 */     this.gunModel['²'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, -0.75F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.25F, -0.75F, 1.0F, -0.25F, -0.75F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F);
/* 1038 */     this.gunModel['²'].setRotationPoint(7.0F, -7.5F, -0.75F);
/*      */     
/* 1040 */     this.gunModel['³'].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.125F, -0.5F, 0.5F, -0.125F, -0.5F, 0.5F, -0.125F, -0.25F, 0.0F, -0.125F, -0.25F);
/* 1041 */     this.gunModel['³'].setRotationPoint(8.0F, -6.5F, 2.5F);
/*      */     
/* 1043 */     this.gunModel['´'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F);
/* 1044 */     this.gunModel['´'].setRotationPoint(10.0F, -6.5F, -1.0F);
/*      */     
/* 1046 */     this.gunModel['µ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, -0.75F, 1.0F, -0.25F, -0.75F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.75F, -1.0F, -0.25F);
/* 1047 */     this.gunModel['µ'].setRotationPoint(7.0F, -6.5F, 2.5F);
/*      */     
/* 1049 */     this.gunModel['¶'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.25F, -0.75F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.25F, -0.75F, -1.0F, -0.25F);
/* 1050 */     this.gunModel['¶'].setRotationPoint(7.0F, -6.25F, 2.5F);
/*      */     
/* 1052 */     this.gunModel['·'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, 0.0F, 1.0F, -0.5F, -0.75F, 1.0F, -0.5F, -0.75F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
/* 1053 */     this.gunModel['·'].setRotationPoint(11.5F, -6.5F, -0.75F);
/*      */     
/* 1055 */     this.gunModel['¸'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 1.0F, -0.5F, -0.75F, 1.0F, -0.5F, -0.75F, 1.0F, -0.25F, 0.0F, 1.0F, -0.5F, 0.0F, -1.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.75F, -1.0F, -0.25F, 0.0F, -1.0F, -0.5F);
/* 1056 */     this.gunModel['¸'].setRotationPoint(11.5F, -6.5F, 2.5F);
/*      */     
/* 1058 */     this.gunModel['¹'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.25F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.25F, 0.0F, 0.25F, -0.5F, 0.0F, -1.0F, -0.5F, -0.75F, -1.0F, -0.5F, -0.75F, -1.0F, -0.25F, 0.0F, -1.0F, -0.25F);
/* 1059 */     this.gunModel['¹'].setRotationPoint(11.5F, -6.25F, 2.5F);
/*      */     
/* 1061 */     this.gunModel['º'].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.0625F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, -0.0625F, 0.0F, 0.25F, -1.0F);
/* 1062 */     this.gunModel['º'].setRotationPoint(4.0F, -7.5F, 2.0F);
/*      */     
/* 1064 */     this.gunModel['»'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 1.0F, -0.5F, 0.25F, 1.0F, -0.5F, 0.25F, 1.0F, -0.25F, -0.75F, 1.0F, -0.25F, -0.75F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F);
/* 1065 */     this.gunModel['»'].setRotationPoint(6.5F, -6.5F, 2.5F);
/*      */     
/* 1067 */     this.gunModel['¼'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 1.0F, -0.5F, 0.25F, 1.0F, -0.5F, 0.25F, 1.0F, -0.25F, -0.75F, 1.0F, -0.25F, -0.75F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F);
/* 1068 */     this.gunModel['¼'].setRotationPoint(11.0F, -6.5F, 2.5F);
/*      */     
/* 1070 */     this.gunModel['½'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.25F, -0.75F, 1.0F, -0.25F, -0.75F, -1.375F, -0.5F, 0.0F, -1.375F, -0.5F, 0.0F, -1.375F, -0.25F, -0.75F, -1.375F, -0.25F);
/* 1071 */     this.gunModel['½'].setRotationPoint(7.0F, -5.25F, 2.5F);
/*      */     
/* 1073 */     this.gunModel['¾'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 1.0F, -0.5F, -0.75F, 1.0F, -0.5F, -0.75F, 1.0F, -0.25F, 0.0F, 1.0F, -0.25F, 0.0F, -1.375F, -0.5F, -0.75F, -1.375F, -0.5F, -0.75F, -1.375F, -0.25F, 0.0F, -1.375F, -0.25F);
/* 1074 */     this.gunModel['¾'].setRotationPoint(11.5F, -5.25F, 2.5F);
/*      */     
/* 1076 */     this.gunModel['¿'].addShapeBox(0.0F, 0.0F, 0.0F, 17, 2, 1, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
/* 1077 */     this.gunModel['¿'].setRotationPoint(-5.0F, -6.0F, 0.0F);
/*      */     
/* 1079 */     this.gunModel['À'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, -1.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.25F, -0.75F, -1.0F, 0.25F);
/* 1080 */     this.gunModel['À'].setRotationPoint(26.5F, -5.5F, 1.0F);
/*      */     
/* 1082 */     this.gunModel['Á'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.125F, 0.0F, -1.0F, -0.625F, 0.0F, -1.0F, -0.625F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F, -0.125F, -0.75F, -1.0F, -0.625F, -1.0F, -1.0F, -0.625F, -1.0F, 0.25F, -0.125F, -0.75F, 0.25F);
/* 1083 */     this.gunModel['Á'].setRotationPoint(26.75F, -5.5F, 1.0F);
/*      */     
/* 1085 */     this.gunModel['Â'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.875F, -1.0F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, 0.25F, -0.75F, -0.875F, 0.25F, -0.75F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, 0.25F, -0.75F, -0.125F, 0.25F);
/* 1086 */     this.gunModel['Â'].setRotationPoint(26.5F, -5.75F, 1.0F);
/*      */     
/* 1088 */     this.gunModel['Ã'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.125F, -0.625F, -1.0F, -0.625F, -0.875F, -1.0F, -0.625F, -0.875F, 0.25F, -0.125F, -0.625F, 0.25F, -0.125F, -0.125F, -1.0F, -0.625F, -0.125F, -1.0F, -0.625F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F);
/* 1089 */     this.gunModel['Ã'].setRotationPoint(26.75F, -5.75F, 1.0F);
/*      */     
/* 1091 */     this.gunModel['Ä'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -0.75F, -1.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.25F, -0.75F, -1.0F, 0.25F);
/* 1092 */     this.gunModel['Ä'].setRotationPoint(26.5F, -5.5F, -1.75F);
/*      */     
/* 1094 */     this.gunModel['Å'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.125F, 0.0F, -1.0F, -0.625F, 0.0F, -1.0F, -0.625F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F, -0.125F, -0.75F, -1.0F, -0.625F, -1.0F, -1.0F, -0.625F, -1.0F, 0.25F, -0.125F, -0.75F, 0.25F);
/* 1095 */     this.gunModel['Å'].setRotationPoint(26.75F, -5.5F, -1.75F);
/*      */     
/* 1097 */     this.gunModel['Æ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.875F, -1.0F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, 0.25F, -0.75F, -0.875F, 0.25F, -0.75F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, 0.25F, -0.75F, -0.125F, 0.25F);
/* 1098 */     this.gunModel['Æ'].setRotationPoint(26.5F, -5.75F, -1.75F);
/*      */     
/* 1100 */     this.gunModel['Ç'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.125F, -0.625F, -1.0F, -0.625F, -0.875F, -1.0F, -0.625F, -0.875F, 0.25F, -0.125F, -0.625F, 0.25F, -0.125F, -0.125F, -1.0F, -0.625F, -0.125F, -1.0F, -0.625F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F);
/* 1101 */     this.gunModel['Ç'].setRotationPoint(26.75F, -5.75F, -1.75F);
/*      */     
/* 1103 */     this.gunModel['È'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, 0.25F, -0.75F, -0.125F, 0.25F, -0.75F, -0.875F, -1.0F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, 0.25F, -0.75F, -0.875F, 0.25F);
/* 1104 */     this.gunModel['È'].setRotationPoint(25.75F, -4.25F, 0.75F);
/*      */     
/* 1106 */     this.gunModel['É'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.125F, -0.125F, -1.0F, -0.625F, -0.125F, -1.0F, -0.625F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.625F, -1.0F, -0.625F, -0.875F, -1.0F, -0.625F, -0.875F, 0.25F, -0.125F, -0.625F, 0.25F);
/* 1107 */     this.gunModel['É'].setRotationPoint(26.0F, -4.25F, 0.75F);
/*      */     
/* 1109 */     this.gunModel['Ê'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -1.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.25F, -0.75F, -1.0F, 0.25F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1110 */     this.gunModel['Ê'].setRotationPoint(25.75F, -4.5F, 0.75F);
/*      */     
/* 1112 */     this.gunModel['Ë'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.125F, -0.75F, -1.0F, -0.625F, -1.0F, -1.0F, -0.625F, -1.0F, 0.25F, -0.125F, -0.75F, 0.25F, -0.125F, 0.0F, -1.0F, -0.625F, 0.0F, -1.0F, -0.625F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F);
/* 1113 */     this.gunModel['Ë'].setRotationPoint(26.0F, -4.5F, 0.75F);
/*      */     
/* 1115 */     this.gunModel['Ì'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.125F, -1.0F, 0.0F, -0.125F, -1.0F, 0.0F, -0.125F, 0.25F, -0.75F, -0.125F, 0.25F, -0.75F, -0.875F, -1.0F, 0.0F, -0.625F, -1.0F, 0.0F, -0.625F, 0.25F, -0.75F, -0.875F, 0.25F);
/* 1116 */     this.gunModel['Ì'].setRotationPoint(25.75F, -4.25F, -1.5F);
/*      */     
/* 1118 */     this.gunModel['Í'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.125F, -0.125F, -1.0F, -0.625F, -0.125F, -1.0F, -0.625F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.625F, -1.0F, -0.625F, -0.875F, -1.0F, -0.625F, -0.875F, 0.25F, -0.125F, -0.625F, 0.25F);
/* 1119 */     this.gunModel['Í'].setRotationPoint(26.0F, -4.25F, -1.5F);
/*      */     
/* 1121 */     this.gunModel['Î'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -1.0F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, 0.25F, -0.75F, -1.0F, 0.25F, -0.75F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1122 */     this.gunModel['Î'].setRotationPoint(25.75F, -4.5F, -1.5F);
/*      */     
/* 1124 */     this.gunModel['Ï'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.125F, -0.75F, -1.0F, -0.625F, -1.0F, -1.0F, -0.625F, -1.0F, 0.25F, -0.125F, -0.75F, 0.25F, -0.125F, 0.0F, -1.0F, -0.625F, 0.0F, -1.0F, -0.625F, 0.0F, 0.25F, -0.125F, 0.0F, 0.25F);
/* 1125 */     this.gunModel['Ï'].setRotationPoint(26.0F, -4.5F, -1.5F);
/*      */     
/* 1127 */     this.gunModel['Ð'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, 0.0F, 0.125F, 0.75F, -0.25F, 0.125F, 0.75F, -0.25F, 0.125F, 0.75F, 0.0F, 0.125F, 0.75F, 0.0F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, -0.25F, -0.25F, 0.75F, 0.0F, -0.25F, 0.75F);
/* 1128 */     this.gunModel['Ð'].setRotationPoint(-5.0F, -6.0F, -0.25F);
/*      */     
/* 1130 */     this.gunModel['Ñ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, 0.0F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.625F, 0.5F, -0.25F, 0.625F, 0.5F, -0.25F, 0.625F, 0.5F, 0.0F, 0.625F, 0.5F);
/* 1131 */     this.gunModel['Ñ'].setRotationPoint(-5.0F, -5.0F, -0.25F);
/*      */     
/* 1133 */     this.gunModel['Ò'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, -0.625F, 0.25F, -0.25F, -0.625F, 0.25F, -0.25F, -0.625F, 0.25F, 0.0F, -0.625F, 0.25F, 0.0F, 0.375F, 0.25F, -0.25F, 0.375F, 0.25F, -0.25F, 0.375F, 0.25F, 0.0F, 0.375F, 0.25F);
/* 1134 */     this.gunModel['Ò'].setRotationPoint(-5.0F, -3.0F, -0.25F);
/*      */     
/* 1136 */     this.gunModel['Ó'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.25F, 0.25F, 0.5F, 0.0F, 0.25F, 0.5F);
/* 1137 */     this.gunModel['Ó'].setRotationPoint(-4.25F, -5.0F, -0.25F);
/*      */     
/* 1139 */     this.gunModel['Ô'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, -0.875F, 0.5F, -0.25F, -0.875F, 0.5F, -0.25F, -0.875F, -1.25F, 0.0F, -0.875F, -1.25F, 0.0F, -0.125F, 0.5F, -0.25F, -0.125F, 0.5F, -0.25F, -0.125F, -1.25F, 0.0F, -0.125F, -1.25F);
/* 1140 */     this.gunModel['Ô'].setRotationPoint(-5.0F, -8.0F, -0.25F);
/*      */     
/* 1142 */     this.gunModel['Õ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, -0.875F, 0.5F, -0.25F, -0.875F, 0.5F, -0.25F, -0.875F, -1.25F, 0.0F, -0.875F, -1.25F, 0.0F, -0.125F, 0.5F, -0.25F, -0.125F, 0.5F, -0.25F, -0.125F, -1.25F, 0.0F, -0.125F, -1.25F);
/* 1143 */     this.gunModel['Õ'].setRotationPoint(-5.0F, -8.0F, 2.5F);
/*      */     
/* 1145 */     this.gunModel['Ö'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.9F, 0.0F, -0.6F, -0.9F, 0.0F, -0.6F, -0.9F, -0.5F, -0.25F, -0.9F, -0.5F, -0.05F, 0.125F, 0.0F, -0.4F, 0.125F, 0.0F, -0.4F, 0.125F, -0.5F, -0.05F, 0.125F, -0.5F);
/* 1146 */     this.gunModel['Ö'].setRotationPoint(-5.0F, -8.25F, 2.0F);
/*      */     
/* 1148 */     this.gunModel['×'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.9F, 0.0F, -0.6F, -0.9F, 0.0F, -0.6F, -0.9F, -0.5F, -0.25F, -0.9F, -0.5F, -0.05F, 0.125F, 0.0F, -0.4F, 0.125F, 0.0F, -0.4F, 0.125F, -0.5F, -0.05F, 0.125F, -0.5F);
/* 1149 */     this.gunModel['×'].setRotationPoint(-5.0F, -8.25F, -1.0F);
/*      */     
/* 1151 */     this.gunModel['Ø'].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, 0.0F, 0.25F, -0.875F, 0.0F, 0.25F, -0.875F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, -0.875F, 0.0F, -0.25F, -0.875F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1152 */     this.gunModel['Ø'].setRotationPoint(7.0F, -3.75F, -1.5F);
/*      */     
/* 1154 */     this.gunModel['Ù'].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, 0.0F, 0.25F, -0.875F, 0.0F, 0.25F, -0.875F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.375F, -0.875F, -0.875F, -0.375F, -0.875F, -0.875F, -0.375F, -0.875F, 0.0F, -0.375F, -0.875F, 0.0F);
/* 1155 */     this.gunModel['Ù'].setRotationPoint(7.0F, -2.75F, -1.5F);
/*      */     
/* 1157 */     this.gunModel['Ú'].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -0.375F, -0.625F, -0.875F, -0.375F, -0.625F, -0.875F, -0.375F, -0.625F, 0.0F, -0.375F, -0.625F, 0.0F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, -0.875F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 1158 */     this.gunModel['Ú'].setRotationPoint(7.0F, -5.0F, -1.5F);
/*      */     
/* 1160 */     this.gunModel['Û'].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, -0.375F, -0.5F, -0.875F, -0.375F, -0.5F, -0.875F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, -0.875F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F);
/* 1161 */     this.gunModel['Û'].setRotationPoint(7.0F, -5.0F, -1.5F);
/*      */     
/* 1163 */     this.gunModel['Ü'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, -0.25F, -1.25F, 0.0F, -0.25F, 0.375F, 0.0F, 0.25F, 0.375F, 0.0F, -1.0F, -1.25F, 0.0F, -0.5F, -1.25F, 0.0F, -0.5F, 0.375F, 0.0F, -1.0F, 0.375F);
/* 1164 */     this.gunModel['Ü'].setRotationPoint(7.5F, -3.75F, -2.0F);
/*      */     
/* 1166 */     this.gunModel['Ý'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.375F, 0.0F, 0.25F, 0.375F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 0.375F, 0.0F, -1.0F, 0.375F);
/* 1167 */     this.gunModel['Ý'].setRotationPoint(9.5F, -3.25F, -2.0F);
/*      */     
/* 1169 */     this.gunModel['Þ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -1.26F, -0.1F, 0.25F, -1.26F, -0.1F, 0.25F, 0.375F, 0.0F, -0.25F, 0.375F, -0.1F, -0.5F, -1.26F, 0.0F, -1.0F, -1.26F, 0.0F, -1.0F, 0.375F, -0.1F, -0.5F, 0.375F);
/* 1170 */     this.gunModel['Þ'].setRotationPoint(7.5F, -3.75F, -2.0F);
/*      */     
/* 1172 */     this.gunModel['ß'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.375F, -0.75F, 0.25F, 0.375F, -0.75F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 0.375F, -0.75F, -1.0F, 0.375F);
/* 1173 */     this.gunModel['ß'].setRotationPoint(9.5F, -4.05F, -2.0F);
/*      */     
/* 1175 */     this.gunModel['à'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.25F, -1.25F, 0.0F, 0.25F, -1.25F, 0.0F, 0.25F, 0.375F, -0.75F, 0.25F, 0.375F, -0.75F, -1.0F, -1.25F, 0.0F, -1.0F, -1.25F, 0.0F, -1.0F, 0.375F, -0.75F, -1.0F, 0.375F);
/* 1176 */     this.gunModel['à'].setRotationPoint(9.0F, -4.05F, -2.0F);
/*      */     
/* 1178 */     this.gunModel['á'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1179 */     this.gunModel['á'].setRotationPoint(16.0F, -7.0F, 1.25F);
/*      */     
/* 1181 */     this.gunModel['â'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -0.5F, 0.25F, -0.35F, 0.0F, 0.25F, -0.35F, 0.0F, 0.25F, -0.35F, -0.5F, 0.25F, -0.35F, -0.5F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.5F, 0.0F, -0.35F);
/* 1182 */     this.gunModel['â'].setRotationPoint(29.75F, -7.75F, -0.25F);
/*      */     
/* 1184 */     this.gunModel['ã'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.1F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.1F, -0.1F, -0.25F, 0.1F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, 0.1F, -0.5F, -0.35F, 0.1F);
/* 1185 */     this.gunModel['ã'].setRotationPoint(-3.1F, -9.5F, 0.75F);
/*      */     
/* 1187 */     this.gunModel['ä'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, -0.75F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, -0.75F, -1.0F, -0.375F, 0.0F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.75F, -1.0F, -0.375F);
/* 1188 */     this.gunModel['ä'].setRotationPoint(1.25F, -1.5F, -0.25F);
/*      */     
/* 1190 */     this.gunModel['å'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -0.5F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.5F, -0.75F, -0.375F, -0.5F, -0.75F, -0.375F, -0.5F, -0.75F, -0.375F);
/* 1191 */     this.gunModel['å'].setRotationPoint(2.25F, -1.5F, -0.25F);
/*      */     
/* 1193 */     this.gunModel['æ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F, -0.75F, -0.25F, -0.375F);
/* 1194 */     this.gunModel['æ'].setRotationPoint(2.25F, -1.25F, -0.25F);
/*      */     
/* 1196 */     this.gunModel['ç'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, -0.75F, 0.0F, -0.375F, -1.0F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -0.5F, -0.5F, -0.375F, -1.0F, -0.5F, -0.375F);
/* 1197 */     this.gunModel['ç'].setRotationPoint(2.25F, -0.5F, -0.25F);
/*      */     
/* 1199 */     this.gunModel['è'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, -1.0F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -0.5F, 0.0F, -0.375F, -1.0F, 0.0F, -0.375F, -1.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -0.25F, -0.75F, -0.375F, -1.25F, -0.75F, -0.375F);
/* 1200 */     this.gunModel['è'].setRotationPoint(2.25F, 0.0F, -0.25F);
/*      */     
/* 1202 */     this.gunModel['é'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1203 */     this.gunModel['é'].setRotationPoint(0.35F, -2.12F, -0.55F);
/*      */     
/* 1205 */     this.gunModel['ê'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1206 */     this.gunModel['ê'].setRotationPoint(0.35F, -2.37F, -0.55F);
/*      */     
/* 1208 */     this.gunModel['ë'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F);
/* 1209 */     this.gunModel['ë'].setRotationPoint(0.35F, -1.87F, -0.55F);
/*      */     
/* 1211 */     this.gunModel['ì'].addShapeBox(0.0F, 0.0F, 0.0F, 11, 2, 3, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
/* 1212 */     this.gunModel['ì'].setRotationPoint(15.0F, -4.0F, -0.75F);
/*      */     
/* 1214 */     this.gunModel['í'].addShapeBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, 0.25F, -0.35F, 0.0F, 0.25F, -0.35F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.35F, 0.0F, 0.25F, -0.35F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/* 1215 */     this.gunModel['í'].setRotationPoint(15.0F, -4.0F, 2.25F);
/*      */     
/* 1217 */     this.gunModel['î'].addShapeBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
/* 1218 */     this.gunModel['î'].setRotationPoint(16.0F, -6.0F, -1.75F);
/*      */     
/* 1220 */     this.gunModel['ï'].addShapeBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F);
/* 1221 */     this.gunModel['ï'].setRotationPoint(16.0F, -6.0F, 2.25F);
/*      */     
/* 1223 */     this.gunModel['ð'].addShapeBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1224 */     this.gunModel['ð'].setRotationPoint(15.0F, -4.0F, 2.0F);
/*      */     
/* 1226 */     this.gunModel['ñ'].addShapeBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F);
/* 1227 */     this.gunModel['ñ'].setRotationPoint(15.0F, -4.0F, 2.15F);
/*      */     
/* 1229 */     this.gunModel['ò'].addShapeBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, 0.0F, -1.25F, -0.75F, 0.0F, -1.25F, -0.75F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F);
/* 1230 */     this.gunModel['ò'].setRotationPoint(16.0F, -8.5F, 1.25F);
/*      */     
/* 1232 */     this.gunModel['ó'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.25F, -0.25F, 0.75F, 0.25F, -0.25F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F);
/* 1233 */     this.gunModel['ó'].setRotationPoint(16.0F, -9.0F, -0.75F);
/*      */     
/* 1235 */     this.gunModel['ô'].addShapeBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, 0.0F, -1.25F, -0.75F, 0.0F, -1.25F, -0.75F, 0.0F, -1.25F, 0.25F, 0.0F, -1.25F, 0.25F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F);
/* 1236 */     this.gunModel['ô'].setRotationPoint(16.0F, -8.5F, -1.75F);
/*      */     
/* 1238 */     this.gunModel['õ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -0.25F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1239 */     this.gunModel['õ'].setRotationPoint(16.0F, -9.0F, 1.25F);
/*      */     
/* 1241 */     this.gunModel['ö'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, -0.35F, -0.25F, 0.0F, -0.35F, -0.25F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F);
/* 1242 */     this.gunModel['ö'].setRotationPoint(16.0F, -9.25F, -0.25F);
/*      */     
/* 1244 */     this.gunModel['÷'].addShapeBox(0.0F, 0.0F, 0.0F, 10, 1, 3, 0.0F, 0.0F, -0.9F, -0.65F, 0.0F, -0.9F, -0.65F, 0.0F, -0.9F, -0.65F, 0.0F, -0.9F, -0.65F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1245 */     this.gunModel['÷'].setRotationPoint(16.0F, -9.5F, -0.75F);
/*      */     
/* 1247 */     this.gunModel['ø'].addShapeBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, 0.0F, -0.65F, 0.25F, 0.0F, -0.65F, 0.25F, 0.0F, -0.65F, 0.25F, 0.0F, -0.65F, 0.25F, 0.0F, -0.1F, 0.25F, 0.0F, -0.1F, 0.25F, 0.0F, -0.1F, 0.25F, 0.0F, -0.1F, 0.25F);
/* 1248 */     this.gunModel['ø'].setRotationPoint(16.0F, -9.5F, 0.25F);
/*      */     
/* 1250 */     this.gunModel['ù'].addShapeBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, 0.0F, -0.85F, 0.5F, 0.0F, -0.85F, 0.5F, 0.0F, -0.85F, 0.5F, 0.0F, -0.85F, 0.5F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1251 */     this.gunModel['ù'].setRotationPoint(16.0F, -9.85F, 0.25F);
/*      */     
/* 1253 */     this.gunModel['ú'].addShapeBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F, 0.5F, -0.05F, 0.5F, 0.5F, -0.05F, 0.5F, 0.5F, -0.05F, 0.5F, 0.5F, -0.05F, 0.5F, 0.5F, -0.85F, 0.5F, 0.5F, -0.85F, 0.5F, 0.5F, -0.85F, 0.5F, 0.5F, -0.85F, 0.5F);
/* 1254 */     this.gunModel['ú'].setRotationPoint(16.5F, -9.15F, 0.25F);
/*      */     
/* 1256 */     this.gunModel['û'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F);
/* 1257 */     this.gunModel['û'].setRotationPoint(25.0F, -9.0F, -0.75F);
/*      */     
/* 1259 */     this.gunModel['ü'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, 0.25F, -0.25F, 0.75F, 0.25F);
/* 1260 */     this.gunModel['ü'].setRotationPoint(25.0F, -9.0F, 1.25F);
/*      */     
/* 1262 */     this.gunModel['ý'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -0.25F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, -0.25F, 0.0F, -0.35F);
/* 1263 */     this.gunModel['ý'].setRotationPoint(25.0F, -9.25F, -0.25F);
/*      */     
/* 1265 */     this.gunModel['þ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.75F, -0.75F, -0.75F, 0.75F, -0.75F, -0.75F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1266 */     this.gunModel['þ'].setRotationPoint(17.75F, -9.0F, 1.25F);
/*      */     
/* 1268 */     this.gunModel['ÿ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.75F, -0.75F, -0.75F, 0.75F, -0.75F, -0.75F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1269 */     this.gunModel['ÿ'].setRotationPoint(19.0F, -9.0F, 1.25F);
/*      */     
/* 1271 */     this.gunModel['Ā'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.75F, -0.75F, -0.75F, 0.75F, -0.75F, -0.75F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1272 */     this.gunModel['Ā'].setRotationPoint(20.25F, -9.0F, 1.25F);
/*      */     
/* 1274 */     this.gunModel['ā'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.75F, -0.75F, -0.75F, 0.75F, -0.75F, -0.75F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1275 */     this.gunModel['ā'].setRotationPoint(21.5F, -9.0F, 1.25F);
/*      */     
/* 1277 */     this.gunModel['Ă'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.75F, -0.75F, -0.75F, 0.75F, -0.75F, -0.75F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1278 */     this.gunModel['Ă'].setRotationPoint(22.75F, -9.0F, 1.25F);
/*      */     
/* 1280 */     this.gunModel['ă'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.75F, -0.75F, -0.75F, 0.75F, -0.75F, -0.75F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1281 */     this.gunModel['ă'].setRotationPoint(24.0F, -9.0F, 1.25F);
/*      */     
/* 1283 */     this.gunModel['Ą'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, 0.15F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1284 */     this.gunModel['Ą'].setRotationPoint(24.25F, -9.0F, 1.25F);
/*      */     
/* 1286 */     this.gunModel['ą'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, 0.19F);
/* 1287 */     this.gunModel['ą'].setRotationPoint(24.25F, -10.0F, 0.65F);
/*      */     
/* 1289 */     this.gunModel['Ć'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, 0.15F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1290 */     this.gunModel['Ć'].setRotationPoint(23.0F, -9.0F, 1.25F);
/*      */     
/* 1292 */     this.gunModel['ć'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, 0.19F);
/* 1293 */     this.gunModel['ć'].setRotationPoint(23.0F, -10.0F, 0.65F);
/*      */     
/* 1295 */     this.gunModel['Ĉ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, 0.15F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1296 */     this.gunModel['Ĉ'].setRotationPoint(21.75F, -9.0F, 1.25F);
/*      */     
/* 1298 */     this.gunModel['ĉ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, 0.19F);
/* 1299 */     this.gunModel['ĉ'].setRotationPoint(21.75F, -10.0F, 0.65F);
/*      */     
/* 1301 */     this.gunModel['Ċ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, 0.15F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1302 */     this.gunModel['Ċ'].setRotationPoint(20.5F, -9.0F, 1.25F);
/*      */     
/* 1304 */     this.gunModel['ċ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, 0.19F);
/* 1305 */     this.gunModel['ċ'].setRotationPoint(20.5F, -10.0F, 0.65F);
/*      */     
/* 1307 */     this.gunModel['Č'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, 0.15F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1308 */     this.gunModel['Č'].setRotationPoint(19.25F, -9.0F, 1.25F);
/*      */     
/* 1310 */     this.gunModel['č'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, 0.19F);
/* 1311 */     this.gunModel['č'].setRotationPoint(19.25F, -10.0F, 0.65F);
/*      */     
/* 1313 */     this.gunModel['Ď'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, 0.15F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1314 */     this.gunModel['Ď'].setRotationPoint(18.0F, -9.0F, 1.25F);
/*      */     
/* 1316 */     this.gunModel['ď'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, 0.19F);
/* 1317 */     this.gunModel['ď'].setRotationPoint(18.0F, -10.0F, 0.65F);
/*      */     
/* 1319 */     this.gunModel['Đ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, 0.15F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F);
/* 1320 */     this.gunModel['Đ'].setRotationPoint(16.75F, -9.0F, 1.25F);
/*      */     
/* 1322 */     this.gunModel['đ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, 0.19F);
/* 1323 */     this.gunModel['đ'].setRotationPoint(16.75F, -10.0F, 0.65F);
/*      */     
/* 1325 */     this.gunModel['Ē'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.25F, -0.75F, 0.75F, 0.25F, -0.75F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F);
/* 1326 */     this.gunModel['Ē'].setRotationPoint(17.75F, -9.0F, -0.75F);
/*      */     
/* 1328 */     this.gunModel['ē'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.25F, -0.75F, 0.75F, 0.25F, -0.75F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F);
/* 1329 */     this.gunModel['ē'].setRotationPoint(19.0F, -9.0F, -0.75F);
/*      */     
/* 1331 */     this.gunModel['Ĕ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.25F, -0.75F, 0.75F, 0.25F, -0.75F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F);
/* 1332 */     this.gunModel['Ĕ'].setRotationPoint(20.25F, -9.0F, -0.75F);
/*      */     
/* 1334 */     this.gunModel['ĕ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.25F, -0.75F, 0.75F, 0.25F, -0.75F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F);
/* 1335 */     this.gunModel['ĕ'].setRotationPoint(21.5F, -9.0F, -0.75F);
/*      */     
/* 1337 */     this.gunModel['Ė'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.25F, -0.75F, 0.75F, 0.25F, -0.75F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F);
/* 1338 */     this.gunModel['Ė'].setRotationPoint(22.75F, -9.0F, -0.75F);
/*      */     
/* 1340 */     this.gunModel['ė'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.75F, 0.25F, -0.75F, 0.75F, 0.25F, -0.75F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F);
/* 1341 */     this.gunModel['ė'].setRotationPoint(24.0F, -9.0F, -0.75F);
/*      */     
/* 1343 */     this.gunModel['Ę'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, -0.65F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F);
/* 1344 */     this.gunModel['Ę'].setRotationPoint(24.25F, -9.0F, -0.75F);
/*      */     
/* 1346 */     this.gunModel['ę'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, -0.7F);
/* 1347 */     this.gunModel['ę'].setRotationPoint(24.25F, -10.0F, -0.15F);
/*      */     
/* 1349 */     this.gunModel['Ě'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, -0.65F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F);
/* 1350 */     this.gunModel['Ě'].setRotationPoint(23.0F, -9.0F, -0.75F);
/*      */     
/* 1352 */     this.gunModel['ě'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, -0.7F);
/* 1353 */     this.gunModel['ě'].setRotationPoint(23.0F, -10.0F, -0.15F);
/*      */     
/* 1355 */     this.gunModel['Ĝ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, -0.65F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F);
/* 1356 */     this.gunModel['Ĝ'].setRotationPoint(21.75F, -9.0F, -0.75F);
/*      */     
/* 1358 */     this.gunModel['ĝ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, -0.7F);
/* 1359 */     this.gunModel['ĝ'].setRotationPoint(21.75F, -10.0F, -0.15F);
/*      */     
/* 1361 */     this.gunModel['Ğ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, -0.65F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F);
/* 1362 */     this.gunModel['Ğ'].setRotationPoint(20.5F, -9.0F, -0.75F);
/*      */     
/* 1364 */     this.gunModel['ğ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, -0.7F);
/* 1365 */     this.gunModel['ğ'].setRotationPoint(20.5F, -10.0F, -0.15F);
/*      */     
/* 1367 */     this.gunModel['Ġ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, -0.65F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F);
/* 1368 */     this.gunModel['Ġ'].setRotationPoint(19.25F, -9.0F, -0.75F);
/*      */     
/* 1370 */     this.gunModel['ġ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, -0.7F);
/* 1371 */     this.gunModel['ġ'].setRotationPoint(19.25F, -10.0F, -0.15F);
/*      */     
/* 1373 */     this.gunModel['Ģ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, -0.65F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F);
/* 1374 */     this.gunModel['Ģ'].setRotationPoint(18.0F, -9.0F, -0.75F);
/*      */     
/* 1376 */     this.gunModel['ģ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, -0.7F);
/* 1377 */     this.gunModel['ģ'].setRotationPoint(18.0F, -10.0F, -0.15F);
/*      */     
/* 1379 */     this.gunModel['Ĥ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, 0.15F, 0.0F, -1.6F, -0.65F, 0.0F, -1.6F, -0.65F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, 0.25F, 0.0F, 0.75F, -0.75F, 0.0F, 0.75F, -0.75F);
/* 1380 */     this.gunModel['Ĥ'].setRotationPoint(16.75F, -9.0F, -0.75F);
/*      */     
/* 1382 */     this.gunModel['ĥ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, 0.1F, 0.0F, -1.5F, -0.6F, 0.0F, -1.5F, -0.6F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, 0.19F, 0.0F, 0.65F, -0.7F, 0.0F, 0.65F, -0.7F);
/* 1383 */     this.gunModel['ĥ'].setRotationPoint(16.75F, -10.0F, -0.15F);
/*      */     
/* 1385 */     this.gunModel['Ħ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F);
/* 1386 */     this.gunModel['Ħ'].setRotationPoint(16.75F, -8.4F, 1.25F);
/*      */     
/* 1388 */     this.gunModel['ħ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.09F, -0.75F, 0.0F, 0.09F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.24F, -1.0F, -0.75F, 0.24F);
/* 1389 */     this.gunModel['ħ'].setRotationPoint(16.75F, -8.35F, 0.75F);
/*      */     
/* 1391 */     this.gunModel['Ĩ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F);
/* 1392 */     this.gunModel['Ĩ'].setRotationPoint(18.0F, -8.4F, 1.25F);
/*      */     
/* 1394 */     this.gunModel['ĩ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.65F, -0.75F, 0.0F, -0.65F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 1395 */     this.gunModel['ĩ'].setRotationPoint(18.0F, -8.4F, 1.25F);
/*      */     
/* 1397 */     this.gunModel['Ī'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F);
/* 1398 */     this.gunModel['Ī'].setRotationPoint(19.25F, -8.4F, 1.25F);
/*      */     
/* 1400 */     this.gunModel['ī'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.65F, -0.75F, 0.0F, -0.65F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 1401 */     this.gunModel['ī'].setRotationPoint(19.25F, -8.4F, 1.25F);
/*      */     
/* 1403 */     this.gunModel['Ĭ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F);
/* 1404 */     this.gunModel['Ĭ'].setRotationPoint(20.5F, -8.4F, 1.25F);
/*      */     
/* 1406 */     this.gunModel['ĭ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.65F, -0.75F, 0.0F, -0.65F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 1407 */     this.gunModel['ĭ'].setRotationPoint(20.5F, -8.4F, 1.25F);
/*      */     
/* 1409 */     this.gunModel['Į'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F);
/* 1410 */     this.gunModel['Į'].setRotationPoint(21.75F, -8.4F, 1.25F);
/*      */     
/* 1412 */     this.gunModel['į'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.65F, -0.75F, 0.0F, -0.65F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 1413 */     this.gunModel['į'].setRotationPoint(21.75F, -8.4F, 1.25F);
/*      */     
/* 1415 */     this.gunModel['İ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F);
/* 1416 */     this.gunModel['İ'].setRotationPoint(23.0F, -8.4F, 1.25F);
/*      */     
/* 1418 */     this.gunModel['ı'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.65F, -0.75F, 0.0F, -0.65F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 1419 */     this.gunModel['ı'].setRotationPoint(23.0F, -8.4F, 1.25F);
/*      */     
/* 1421 */     this.gunModel['Ĳ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F);
/* 1422 */     this.gunModel['Ĳ'].setRotationPoint(24.25F, -8.4F, 1.25F);
/*      */     
/* 1424 */     this.gunModel['ĳ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.65F, -0.75F, 0.0F, -0.65F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 1425 */     this.gunModel['ĳ'].setRotationPoint(24.25F, -8.4F, 1.25F);
/*      */     
/* 1427 */     this.gunModel['Ĵ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, -0.65F, -0.75F, 0.0F, -0.65F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F);
/* 1428 */     this.gunModel['Ĵ'].setRotationPoint(16.75F, -8.4F, 1.25F);
/*      */     
/* 1430 */     this.gunModel['ĵ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -0.75F, 0.0F, 0.09F, 0.0F, 0.0F, 0.09F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.24F, 0.0F, -0.75F, 0.24F);
/* 1431 */     this.gunModel['ĵ'].setRotationPoint(16.75F, -8.35F, 0.75F);
/*      */     
/* 1433 */     this.gunModel['Ķ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.09F, -0.75F, 0.0F, 0.09F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.24F, -1.0F, -0.75F, 0.24F);
/* 1434 */     this.gunModel['Ķ'].setRotationPoint(18.0F, -8.35F, 0.75F);
/*      */     
/* 1436 */     this.gunModel['ķ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -0.75F, 0.0F, 0.09F, 0.0F, 0.0F, 0.09F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.24F, 0.0F, -0.75F, 0.24F);
/* 1437 */     this.gunModel['ķ'].setRotationPoint(18.0F, -8.35F, 0.75F);
/*      */     
/* 1439 */     this.gunModel['ĸ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.09F, -0.75F, 0.0F, 0.09F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.24F, -1.0F, -0.75F, 0.24F);
/* 1440 */     this.gunModel['ĸ'].setRotationPoint(19.25F, -8.35F, 0.75F);
/*      */     
/* 1442 */     this.gunModel['Ĺ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -0.75F, 0.0F, 0.09F, 0.0F, 0.0F, 0.09F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.24F, 0.0F, -0.75F, 0.24F);
/* 1443 */     this.gunModel['Ĺ'].setRotationPoint(19.25F, -8.35F, 0.75F);
/*      */     
/* 1445 */     this.gunModel['ĺ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.09F, -0.75F, 0.0F, 0.09F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.24F, -1.0F, -0.75F, 0.24F);
/* 1446 */     this.gunModel['ĺ'].setRotationPoint(20.5F, -8.35F, 0.75F);
/*      */     
/* 1448 */     this.gunModel['Ļ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -0.75F, 0.0F, 0.09F, 0.0F, 0.0F, 0.09F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.24F, 0.0F, -0.75F, 0.24F);
/* 1449 */     this.gunModel['Ļ'].setRotationPoint(20.5F, -8.35F, 0.75F);
/*      */     
/* 1451 */     this.gunModel['ļ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.09F, -0.75F, 0.0F, 0.09F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.24F, -1.0F, -0.75F, 0.24F);
/* 1452 */     this.gunModel['ļ'].setRotationPoint(21.75F, -8.35F, 0.75F);
/*      */     
/* 1454 */     this.gunModel['Ľ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -0.75F, 0.0F, 0.09F, 0.0F, 0.0F, 0.09F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.24F, 0.0F, -0.75F, 0.24F);
/* 1455 */     this.gunModel['Ľ'].setRotationPoint(21.75F, -8.35F, 0.75F);
/*      */     
/* 1457 */     this.gunModel['ľ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.09F, -0.75F, 0.0F, 0.09F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.24F, -1.0F, -0.75F, 0.24F);
/* 1458 */     this.gunModel['ľ'].setRotationPoint(23.0F, -8.35F, 0.75F);
/*      */     
/* 1460 */     this.gunModel['Ŀ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -0.75F, 0.0F, 0.09F, 0.0F, 0.0F, 0.09F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.24F, 0.0F, -0.75F, 0.24F);
/* 1461 */     this.gunModel['Ŀ'].setRotationPoint(23.0F, -8.35F, 0.75F);
/*      */     
/* 1463 */     this.gunModel['ŀ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.09F, -0.75F, 0.0F, 0.09F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.24F, -1.0F, -0.75F, 0.24F);
/* 1464 */     this.gunModel['ŀ'].setRotationPoint(24.25F, -8.35F, 0.75F);
/*      */     
/* 1466 */     this.gunModel['Ł'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -0.75F, 0.0F, 0.09F, 0.0F, 0.0F, 0.09F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.24F, 0.0F, -0.75F, 0.24F);
/* 1467 */     this.gunModel['Ł'].setRotationPoint(24.25F, -8.35F, 0.75F);
/*      */     
/* 1469 */     this.gunModel['ł'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, 0.09F, 0.0F, 0.0F, 0.09F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -1.0F, -0.75F, 0.24F, 0.0F, -0.75F, 0.24F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F);
/* 1470 */     this.gunModel['ł'].setRotationPoint(16.75F, -8.35F, -0.25F);
/*      */     
/* 1472 */     this.gunModel['Ń'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.09F, -0.75F, 0.0F, 0.09F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.75F, 0.24F, -1.0F, -0.75F, 0.24F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F);
/* 1473 */     this.gunModel['Ń'].setRotationPoint(16.75F, -8.35F, -0.25F);
/*      */     
/* 1475 */     this.gunModel['ń'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.65F, -0.75F, 0.0F, -0.65F);
/* 1476 */     this.gunModel['ń'].setRotationPoint(16.75F, -8.4F, -0.75F);
/*      */     
/* 1478 */     this.gunModel['Ņ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F, -0.75F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 1479 */     this.gunModel['Ņ'].setRotationPoint(16.75F, -8.4F, -0.75F);
/*      */     
/* 1481 */     this.gunModel['ņ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, 0.09F, 0.0F, 0.0F, 0.09F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -1.0F, -0.75F, 0.24F, 0.0F, -0.75F, 0.24F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F);
/* 1482 */     this.gunModel['ņ'].setRotationPoint(18.0F, -8.35F, -0.25F);
/*      */     
/* 1484 */     this.gunModel['Ň'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.09F, -0.75F, 0.0F, 0.09F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.75F, 0.24F, -1.0F, -0.75F, 0.24F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F);
/* 1485 */     this.gunModel['Ň'].setRotationPoint(18.0F, -8.35F, -0.25F);
/*      */     
/* 1487 */     this.gunModel['ň'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.65F, -0.75F, 0.0F, -0.65F);
/* 1488 */     this.gunModel['ň'].setRotationPoint(18.0F, -8.4F, -0.75F);
/*      */     
/* 1490 */     this.gunModel['ŉ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F, -0.75F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 1491 */     this.gunModel['ŉ'].setRotationPoint(18.0F, -8.4F, -0.75F);
/*      */     
/* 1493 */     this.gunModel['Ŋ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, 0.09F, 0.0F, 0.0F, 0.09F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -1.0F, -0.75F, 0.24F, 0.0F, -0.75F, 0.24F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F);
/* 1494 */     this.gunModel['Ŋ'].setRotationPoint(19.25F, -8.35F, -0.25F);
/*      */     
/* 1496 */     this.gunModel['ŋ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.09F, -0.75F, 0.0F, 0.09F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.75F, 0.24F, -1.0F, -0.75F, 0.24F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F);
/* 1497 */     this.gunModel['ŋ'].setRotationPoint(19.25F, -8.35F, -0.25F);
/*      */     
/* 1499 */     this.gunModel['Ō'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.65F, -0.75F, 0.0F, -0.65F);
/* 1500 */     this.gunModel['Ō'].setRotationPoint(19.25F, -8.4F, -0.75F);
/*      */     
/* 1502 */     this.gunModel['ō'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F, -0.75F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 1503 */     this.gunModel['ō'].setRotationPoint(19.25F, -8.4F, -0.75F);
/*      */     
/* 1505 */     this.gunModel['Ŏ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, 0.09F, 0.0F, 0.0F, 0.09F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -1.0F, -0.75F, 0.24F, 0.0F, -0.75F, 0.24F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F);
/* 1506 */     this.gunModel['Ŏ'].setRotationPoint(20.5F, -8.35F, -0.25F);
/*      */     
/* 1508 */     this.gunModel['ŏ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.09F, -0.75F, 0.0F, 0.09F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.75F, 0.24F, -1.0F, -0.75F, 0.24F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F);
/* 1509 */     this.gunModel['ŏ'].setRotationPoint(20.5F, -8.35F, -0.25F);
/*      */     
/* 1511 */     this.gunModel['Ő'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.65F, -0.75F, 0.0F, -0.65F);
/* 1512 */     this.gunModel['Ő'].setRotationPoint(20.5F, -8.4F, -0.75F);
/*      */     
/* 1514 */     this.gunModel['ő'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F, -0.75F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 1515 */     this.gunModel['ő'].setRotationPoint(20.5F, -8.4F, -0.75F);
/*      */     
/* 1517 */     this.gunModel['Œ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, 0.09F, 0.0F, 0.0F, 0.09F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -1.0F, -0.75F, 0.24F, 0.0F, -0.75F, 0.24F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F);
/* 1518 */     this.gunModel['Œ'].setRotationPoint(21.75F, -8.35F, -0.25F);
/*      */     
/* 1520 */     this.gunModel['œ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.09F, -0.75F, 0.0F, 0.09F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.75F, 0.24F, -1.0F, -0.75F, 0.24F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F);
/* 1521 */     this.gunModel['œ'].setRotationPoint(21.75F, -8.35F, -0.25F);
/*      */     
/* 1523 */     this.gunModel['Ŕ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.65F, -0.75F, 0.0F, -0.65F);
/* 1524 */     this.gunModel['Ŕ'].setRotationPoint(21.75F, -8.4F, -0.75F);
/*      */     
/* 1526 */     this.gunModel['ŕ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F, -0.75F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 1527 */     this.gunModel['ŕ'].setRotationPoint(21.75F, -8.4F, -0.75F);
/*      */     
/* 1529 */     this.gunModel['Ŗ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, 0.09F, 0.0F, 0.0F, 0.09F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -1.0F, -0.75F, 0.24F, 0.0F, -0.75F, 0.24F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F);
/* 1530 */     this.gunModel['Ŗ'].setRotationPoint(23.0F, -8.35F, -0.25F);
/*      */     
/* 1532 */     this.gunModel['ŗ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.09F, -0.75F, 0.0F, 0.09F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.75F, 0.24F, -1.0F, -0.75F, 0.24F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F);
/* 1533 */     this.gunModel['ŗ'].setRotationPoint(23.0F, -8.35F, -0.25F);
/*      */     
/* 1535 */     this.gunModel['Ř'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.65F, -0.75F, 0.0F, -0.65F);
/* 1536 */     this.gunModel['Ř'].setRotationPoint(23.0F, -8.4F, -0.75F);
/*      */     
/* 1538 */     this.gunModel['ř'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F, -0.75F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 1539 */     this.gunModel['ř'].setRotationPoint(23.0F, -8.4F, -0.75F);
/*      */     
/* 1541 */     this.gunModel['Ś'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, 0.09F, 0.0F, 0.0F, 0.09F, 0.0F, 0.0F, -0.6F, -0.75F, 0.0F, -0.6F, -1.0F, -0.75F, 0.24F, 0.0F, -0.75F, 0.24F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F);
/* 1542 */     this.gunModel['Ś'].setRotationPoint(24.25F, -8.35F, -0.25F);
/*      */     
/* 1544 */     this.gunModel['ś'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.09F, -0.75F, 0.0F, 0.09F, -0.75F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, -0.75F, 0.24F, -1.0F, -0.75F, 0.24F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F);
/* 1545 */     this.gunModel['ś'].setRotationPoint(24.25F, -8.35F, -0.25F);
/*      */     
/* 1547 */     this.gunModel['Ŝ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, -1.0F, -0.75F, -0.5F, -0.75F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.65F, -0.75F, 0.0F, -0.65F);
/* 1548 */     this.gunModel['Ŝ'].setRotationPoint(24.25F, -8.4F, -0.75F);
/*      */     
/* 1550 */     this.gunModel['ŝ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.0F, 0.15F, -0.75F, 0.0F, 0.15F, -0.75F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F);
/* 1551 */     this.gunModel['ŝ'].setRotationPoint(24.25F, -8.4F, -0.75F);
/*      */     
/* 1553 */     this.gunModel['Ş'].addShapeBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, 0.25F, -0.35F, 0.0F, 0.25F, -0.35F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.35F, 0.0F, 0.25F, -0.35F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F);
/* 1554 */     this.gunModel['Ş'].setRotationPoint(15.0F, -4.0F, -1.6F);
/*      */     
/* 1556 */     this.gunModel['ş'].addShapeBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1557 */     this.gunModel['ş'].setRotationPoint(15.0F, -4.0F, -1.25F);
/*      */     
/* 1559 */     this.gunModel['Š'].addShapeBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F);
/* 1560 */     this.gunModel['Š'].setRotationPoint(15.0F, -4.0F, -1.65F);
/*      */     
/* 1562 */     this.gunModel['š'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F);
/* 1563 */     this.gunModel['š'].setRotationPoint(25.5F, -7.0F, 1.25F);
/*      */     
/* 1565 */     this.gunModel['Ţ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1566 */     this.gunModel['Ţ'].setRotationPoint(23.5F, -7.0F, 1.25F);
/*      */     
/* 1568 */     this.gunModel['ţ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1569 */     this.gunModel['ţ'].setRotationPoint(18.25F, -7.0F, 1.25F);
/*      */     
/* 1571 */     this.gunModel['Ť'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1572 */     this.gunModel['Ť'].setRotationPoint(19.5F, -7.0F, 1.25F);
/*      */     
/* 1574 */     this.gunModel['ť'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1575 */     this.gunModel['ť'].setRotationPoint(20.75F, -7.0F, 1.25F);
/*      */     
/* 1577 */     this.gunModel['Ŧ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1578 */     this.gunModel['Ŧ'].setRotationPoint(22.0F, -7.0F, 1.25F);
/*      */     
/* 1580 */     this.gunModel['ŧ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1581 */     this.gunModel['ŧ'].setRotationPoint(23.25F, -7.0F, 1.25F);
/*      */     
/* 1583 */     this.gunModel['Ũ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1584 */     this.gunModel['Ũ'].setRotationPoint(24.5F, -7.0F, 1.25F);
/*      */     
/* 1586 */     this.gunModel['ũ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1587 */     this.gunModel['ũ'].setRotationPoint(23.5F, -7.0F, 1.25F);
/*      */     
/* 1589 */     this.gunModel['Ū'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1590 */     this.gunModel['Ū'].setRotationPoint(23.5F, -7.0F, 1.25F);
/*      */     
/* 1592 */     this.gunModel['ū'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1593 */     this.gunModel['ū'].setRotationPoint(23.5F, -7.0F, 1.25F);
/*      */     
/* 1595 */     this.gunModel['Ŭ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1596 */     this.gunModel['Ŭ'].setRotationPoint(24.75F, -7.0F, 1.25F);
/*      */     
/* 1598 */     this.gunModel['ŭ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1599 */     this.gunModel['ŭ'].setRotationPoint(24.75F, -7.0F, 1.25F);
/*      */     
/* 1601 */     this.gunModel['Ů'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1602 */     this.gunModel['Ů'].setRotationPoint(24.75F, -7.0F, 1.25F);
/*      */     
/* 1604 */     this.gunModel['ů'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1605 */     this.gunModel['ů'].setRotationPoint(24.75F, -7.0F, 1.25F);
/*      */     
/* 1607 */     this.gunModel['Ű'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1608 */     this.gunModel['Ű'].setRotationPoint(21.0F, -7.0F, 1.25F);
/*      */     
/* 1610 */     this.gunModel['ű'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1611 */     this.gunModel['ű'].setRotationPoint(21.0F, -7.0F, 1.25F);
/*      */     
/* 1613 */     this.gunModel['Ų'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1614 */     this.gunModel['Ų'].setRotationPoint(21.0F, -7.0F, 1.25F);
/*      */     
/* 1616 */     this.gunModel['ų'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1617 */     this.gunModel['ų'].setRotationPoint(21.0F, -7.0F, 1.25F);
/*      */     
/* 1619 */     this.gunModel['Ŵ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1620 */     this.gunModel['Ŵ'].setRotationPoint(22.25F, -7.0F, 1.25F);
/*      */     
/* 1622 */     this.gunModel['ŵ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1623 */     this.gunModel['ŵ'].setRotationPoint(22.25F, -7.0F, 1.25F);
/*      */     
/* 1625 */     this.gunModel['Ŷ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1626 */     this.gunModel['Ŷ'].setRotationPoint(22.25F, -7.0F, 1.25F);
/*      */     
/* 1628 */     this.gunModel['ŷ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1629 */     this.gunModel['ŷ'].setRotationPoint(22.25F, -7.0F, 1.25F);
/*      */     
/* 1631 */     this.gunModel['Ÿ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1632 */     this.gunModel['Ÿ'].setRotationPoint(19.75F, -7.0F, 1.25F);
/*      */     
/* 1634 */     this.gunModel['Ź'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1635 */     this.gunModel['Ź'].setRotationPoint(19.75F, -7.0F, 1.25F);
/*      */     
/* 1637 */     this.gunModel['ź'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1638 */     this.gunModel['ź'].setRotationPoint(19.75F, -7.0F, 1.25F);
/*      */     
/* 1640 */     this.gunModel['Ż'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1641 */     this.gunModel['Ż'].setRotationPoint(19.75F, -7.0F, 1.25F);
/*      */     
/* 1643 */     this.gunModel['ż'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1644 */     this.gunModel['ż'].setRotationPoint(17.25F, -7.0F, 1.25F);
/*      */     
/* 1646 */     this.gunModel['Ž'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1647 */     this.gunModel['Ž'].setRotationPoint(17.25F, -7.0F, 1.25F);
/*      */     
/* 1649 */     this.gunModel['ž'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1650 */     this.gunModel['ž'].setRotationPoint(17.25F, -7.0F, 1.25F);
/*      */     
/* 1652 */     this.gunModel['ſ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1653 */     this.gunModel['ſ'].setRotationPoint(17.25F, -7.0F, 1.25F);
/*      */     
/* 1655 */     this.gunModel['ƀ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1656 */     this.gunModel['ƀ'].setRotationPoint(18.5F, -7.0F, 1.25F);
/*      */     
/* 1658 */     this.gunModel['Ɓ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1659 */     this.gunModel['Ɓ'].setRotationPoint(18.5F, -7.0F, 1.25F);
/*      */     
/* 1661 */     this.gunModel['Ƃ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1662 */     this.gunModel['Ƃ'].setRotationPoint(18.5F, -7.0F, 1.25F);
/*      */     
/* 1664 */     this.gunModel['ƃ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1665 */     this.gunModel['ƃ'].setRotationPoint(18.5F, -7.0F, 1.25F);
/*      */     
/* 1667 */     this.gunModel['Ƅ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F);
/* 1668 */     this.gunModel['Ƅ'].setRotationPoint(25.5F, -7.0F, -1.75F);
/*      */     
/* 1670 */     this.gunModel['ƅ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1671 */     this.gunModel['ƅ'].setRotationPoint(23.5F, -7.0F, -1.75F);
/*      */     
/* 1673 */     this.gunModel['Ɔ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1674 */     this.gunModel['Ɔ'].setRotationPoint(18.25F, -7.0F, -1.75F);
/*      */     
/* 1676 */     this.gunModel['Ƈ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1677 */     this.gunModel['Ƈ'].setRotationPoint(19.5F, -7.0F, -1.75F);
/*      */     
/* 1679 */     this.gunModel['ƈ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1680 */     this.gunModel['ƈ'].setRotationPoint(20.75F, -7.0F, -1.75F);
/*      */     
/* 1682 */     this.gunModel['Ɖ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1683 */     this.gunModel['Ɖ'].setRotationPoint(22.0F, -7.0F, -1.75F);
/*      */     
/* 1685 */     this.gunModel['Ɗ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1686 */     this.gunModel['Ɗ'].setRotationPoint(23.25F, -7.0F, -1.75F);
/*      */     
/* 1688 */     this.gunModel['Ƌ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1689 */     this.gunModel['Ƌ'].setRotationPoint(24.5F, -7.0F, -1.75F);
/*      */     
/* 1691 */     this.gunModel['ƌ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1692 */     this.gunModel['ƌ'].setRotationPoint(23.5F, -7.0F, -1.75F);
/*      */     
/* 1694 */     this.gunModel['ƍ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1695 */     this.gunModel['ƍ'].setRotationPoint(23.5F, -7.0F, -1.75F);
/*      */     
/* 1697 */     this.gunModel['Ǝ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1698 */     this.gunModel['Ǝ'].setRotationPoint(23.5F, -7.0F, -1.75F);
/*      */     
/* 1700 */     this.gunModel['Ə'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1701 */     this.gunModel['Ə'].setRotationPoint(24.75F, -7.0F, -1.75F);
/*      */     
/* 1703 */     this.gunModel['Ɛ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1704 */     this.gunModel['Ɛ'].setRotationPoint(24.75F, -7.0F, -1.75F);
/*      */     
/* 1706 */     this.gunModel['Ƒ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1707 */     this.gunModel['Ƒ'].setRotationPoint(24.75F, -7.0F, -1.75F);
/*      */     
/* 1709 */     this.gunModel['ƒ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1710 */     this.gunModel['ƒ'].setRotationPoint(24.75F, -7.0F, -1.75F);
/*      */     
/* 1712 */     this.gunModel['Ɠ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1713 */     this.gunModel['Ɠ'].setRotationPoint(21.0F, -7.0F, -1.75F);
/*      */     
/* 1715 */     this.gunModel['Ɣ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1716 */     this.gunModel['Ɣ'].setRotationPoint(21.0F, -7.0F, -1.75F);
/*      */     
/* 1718 */     this.gunModel['ƕ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1719 */     this.gunModel['ƕ'].setRotationPoint(21.0F, -7.0F, -1.75F);
/*      */     
/* 1721 */     this.gunModel['Ɩ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1722 */     this.gunModel['Ɩ'].setRotationPoint(21.0F, -7.0F, -1.75F);
/*      */     
/* 1724 */     this.gunModel['Ɨ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1725 */     this.gunModel['Ɨ'].setRotationPoint(22.25F, -7.0F, -1.75F);
/*      */     
/* 1727 */     this.gunModel['Ƙ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1728 */     this.gunModel['Ƙ'].setRotationPoint(22.25F, -7.0F, -1.75F);
/*      */     
/* 1730 */     this.gunModel['ƙ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1731 */     this.gunModel['ƙ'].setRotationPoint(22.25F, -7.0F, -1.75F);
/*      */     
/* 1733 */     this.gunModel['ƚ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1734 */     this.gunModel['ƚ'].setRotationPoint(22.25F, -7.0F, -1.75F);
/*      */     
/* 1736 */     this.gunModel['ƛ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1737 */     this.gunModel['ƛ'].setRotationPoint(19.75F, -7.0F, -1.75F);
/*      */     
/* 1739 */     this.gunModel['Ɯ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1740 */     this.gunModel['Ɯ'].setRotationPoint(19.75F, -7.0F, -1.75F);
/*      */     
/* 1742 */     this.gunModel['Ɲ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1743 */     this.gunModel['Ɲ'].setRotationPoint(19.75F, -7.0F, -1.75F);
/*      */     
/* 1745 */     this.gunModel['ƞ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1746 */     this.gunModel['ƞ'].setRotationPoint(19.75F, -7.0F, -1.75F);
/*      */     
/* 1748 */     this.gunModel['Ɵ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1749 */     this.gunModel['Ɵ'].setRotationPoint(17.25F, -7.0F, -1.75F);
/*      */     
/* 1751 */     this.gunModel['Ơ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1752 */     this.gunModel['Ơ'].setRotationPoint(17.25F, -7.0F, -1.75F);
/*      */     
/* 1754 */     this.gunModel['ơ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1755 */     this.gunModel['ơ'].setRotationPoint(17.25F, -7.0F, -1.75F);
/*      */     
/* 1757 */     this.gunModel['Ƣ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1758 */     this.gunModel['Ƣ'].setRotationPoint(17.25F, -7.0F, -1.75F);
/*      */     
/* 1760 */     this.gunModel['ƣ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1761 */     this.gunModel['ƣ'].setRotationPoint(18.5F, -7.0F, -1.75F);
/*      */     
/* 1763 */     this.gunModel['Ƥ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1764 */     this.gunModel['Ƥ'].setRotationPoint(18.5F, -7.0F, -1.75F);
/*      */     
/* 1766 */     this.gunModel['ƥ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F);
/* 1767 */     this.gunModel['ƥ'].setRotationPoint(18.5F, -7.0F, -1.75F);
/*      */     
/* 1769 */     this.gunModel['Ʀ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.25F, -1.0F, -0.75F, 0.25F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.25F, -0.75F, 0.0F, 0.25F);
/* 1770 */     this.gunModel['Ʀ'].setRotationPoint(18.5F, -7.0F, -1.75F);
/*      */     
/* 1772 */     this.gunModel['Ƨ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F);
/* 1773 */     this.gunModel['Ƨ'].setRotationPoint(16.0F, -7.0F, -1.75F);
/*      */     
/* 1775 */     this.gunModel['ƨ'].addShapeBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F);
/* 1776 */     this.gunModel['ƨ'].setRotationPoint(16.5F, -5.75F, 2.5F);
/*      */     
/* 1778 */     this.gunModel['Ʃ'].addShapeBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 1779 */     this.gunModel['Ʃ'].setRotationPoint(16.0F, -5.75F, 2.25F);
/*      */     
/* 1781 */     this.gunModel['ƪ'].addShapeBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F);
/* 1782 */     this.gunModel['ƪ'].setRotationPoint(16.0F, -5.75F, 2.4F);
/*      */     
/* 1784 */     this.gunModel['ƫ'].addShapeBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.5F, 0.5F, 0.25F, -0.35F, 0.5F, 0.25F, -0.35F);
/* 1785 */     this.gunModel['ƫ'].setRotationPoint(16.5F, -5.75F, -2.0F);
/*      */     
/* 1787 */     this.gunModel['Ƭ'].addShapeBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
/* 1788 */     this.gunModel['Ƭ'].setRotationPoint(16.0F, -5.75F, -1.75F);
/*      */     
/* 1790 */     this.gunModel['ƭ'].addShapeBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.25F, -0.55F, 0.0F, 0.25F, -0.55F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F);
/* 1791 */     this.gunModel['ƭ'].setRotationPoint(16.0F, -5.75F, -1.9F);
/*      */     
/* 1793 */     this.gunModel['Ʈ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1794 */     this.gunModel['Ʈ'].setRotationPoint(15.75F, -5.4F, 2.6F);
/*      */     
/* 1796 */     this.gunModel['Ư'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1797 */     this.gunModel['Ư'].setRotationPoint(15.75F, -5.65F, 2.6F);
/*      */     
/* 1799 */     this.gunModel['ư'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F);
/* 1800 */     this.gunModel['ư'].setRotationPoint(15.75F, -5.15F, 2.6F);
/*      */     
/* 1802 */     this.gunModel['Ʊ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1803 */     this.gunModel['Ʊ'].setRotationPoint(24.5F, -5.4F, 2.6F);
/*      */     
/* 1805 */     this.gunModel['Ʋ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1806 */     this.gunModel['Ʋ'].setRotationPoint(24.5F, -5.65F, 2.6F);
/*      */     
/* 1808 */     this.gunModel['Ƴ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F);
/* 1809 */     this.gunModel['Ƴ'].setRotationPoint(24.5F, -5.15F, 2.6F);
/*      */     
/* 1811 */     this.gunModel['ƴ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1812 */     this.gunModel['ƴ'].setRotationPoint(14.75F, -3.6F, 2.35F);
/*      */     
/* 1814 */     this.gunModel['Ƶ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1815 */     this.gunModel['Ƶ'].setRotationPoint(14.75F, -3.85F, 2.35F);
/*      */     
/* 1817 */     this.gunModel['ƶ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F);
/* 1818 */     this.gunModel['ƶ'].setRotationPoint(14.75F, -3.35F, 2.35F);
/*      */     
/* 1820 */     this.gunModel['Ʒ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1821 */     this.gunModel['Ʒ'].setRotationPoint(24.5F, -3.6F, 2.35F);
/*      */     
/* 1823 */     this.gunModel['Ƹ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1824 */     this.gunModel['Ƹ'].setRotationPoint(24.5F, -3.85F, 2.35F);
/*      */     
/* 1826 */     this.gunModel['ƹ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F);
/* 1827 */     this.gunModel['ƹ'].setRotationPoint(24.5F, -3.35F, 2.35F);
/*      */     
/* 1829 */     this.gunModel['ƺ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1830 */     this.gunModel['ƺ'].setRotationPoint(15.75F, -5.4F, -1.85F);
/*      */     
/* 1832 */     this.gunModel['ƻ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1833 */     this.gunModel['ƻ'].setRotationPoint(15.75F, -5.65F, -1.85F);
/*      */     
/* 1835 */     this.gunModel['Ƽ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F);
/* 1836 */     this.gunModel['Ƽ'].setRotationPoint(15.75F, -5.15F, -1.85F);
/*      */     
/* 1838 */     this.gunModel['ƽ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1839 */     this.gunModel['ƽ'].setRotationPoint(24.5F, -5.4F, -1.85F);
/*      */     
/* 1841 */     this.gunModel['ƾ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1842 */     this.gunModel['ƾ'].setRotationPoint(24.5F, -5.65F, -1.85F);
/*      */     
/* 1844 */     this.gunModel['ƿ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F);
/* 1845 */     this.gunModel['ƿ'].setRotationPoint(24.5F, -5.15F, -1.85F);
/*      */     
/* 1847 */     this.gunModel['ǀ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1848 */     this.gunModel['ǀ'].setRotationPoint(14.75F, -3.6F, -1.6F);
/*      */     
/* 1850 */     this.gunModel['ǁ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1851 */     this.gunModel['ǁ'].setRotationPoint(14.75F, -3.85F, -1.6F);
/*      */     
/* 1853 */     this.gunModel['ǂ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F);
/* 1854 */     this.gunModel['ǂ'].setRotationPoint(14.75F, -3.35F, -1.6F);
/*      */     
/* 1856 */     this.gunModel['ǃ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1857 */     this.gunModel['ǃ'].setRotationPoint(24.5F, -3.6F, -1.6F);
/*      */     
/* 1859 */     this.gunModel['Ǆ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F);
/* 1860 */     this.gunModel['Ǆ'].setRotationPoint(24.5F, -3.85F, -1.6F);
/*      */     
/* 1862 */     this.gunModel['ǅ'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F);
/* 1863 */     this.gunModel['ǅ'].setRotationPoint(24.5F, -3.35F, -1.6F);
/*      */     
/* 1865 */     this.gunModel['ǆ'].addShapeBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
/* 1866 */     this.gunModel['ǆ'].setRotationPoint(15.0F, -2.25F, 0.25F);
/*      */     
/* 1868 */     this.gunModel['Ǉ'].addShapeBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.85F, 0.5F, 0.0F, -0.85F, 0.5F, 0.0F, -0.85F, 0.5F, 0.0F, -0.85F, 0.5F);
/* 1869 */     this.gunModel['Ǉ'].setRotationPoint(15.0F, -2.0F, 0.25F);
/*      */     
/* 1871 */     this.gunModel['ǈ'].addShapeBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, -0.85F, 0.5F, 0.0F, -0.85F, 0.5F, 0.0F, -0.85F, 0.5F, 0.0F, -0.85F, 0.5F, 0.0F, -0.05F, 0.5F, 0.0F, -0.05F, 0.5F, 0.0F, -0.05F, 0.5F, 0.0F, -0.05F, 0.5F);
/* 1872 */     this.gunModel['ǈ'].setRotationPoint(15.0F, -2.7F, 0.25F);
/*      */     
/* 1874 */     this.gunModel['ǉ'].addShapeBox(0.0F, 0.0F, 0.0F, 13, 1, 1, 0.0F, 0.375F, -0.25F, 0.0F, -0.125F, -0.25F, 0.0F, -0.125F, -0.25F, 0.5F, 0.375F, -0.25F, 0.5F, 0.375F, -0.25F, 0.0F, -0.125F, -0.25F, 0.0F, -0.125F, -0.25F, 0.5F, 0.375F, -0.25F, 0.5F);
/* 1875 */     this.gunModel['ǉ'].setRotationPoint(-1.0F, -9.0F, 0.0F);
/*      */   }
/*      */   
/*      */   private void initdefaultScopeModel_1()
/*      */   {
/* 1880 */     this.defaultScopeModel[0] = new ModelRendererTurbo(this, 41, 81, this.textureX, this.textureY);
/* 1881 */     this.defaultScopeModel[1] = new ModelRendererTurbo(this, 49, 81, this.textureX, this.textureY);
/* 1882 */     this.defaultScopeModel[2] = new ModelRendererTurbo(this, 57, 81, this.textureX, this.textureY);
/* 1883 */     this.defaultScopeModel[3] = new ModelRendererTurbo(this, 65, 81, this.textureX, this.textureY);
/* 1884 */     this.defaultScopeModel[4] = new ModelRendererTurbo(this, 73, 81, this.textureX, this.textureY);
/* 1885 */     this.defaultScopeModel[5] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
/* 1886 */     this.defaultScopeModel[6] = new ModelRendererTurbo(this, 89, 81, this.textureX, this.textureY);
/* 1887 */     this.defaultScopeModel[7] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
/* 1888 */     this.defaultScopeModel[8] = new ModelRendererTurbo(this, 105, 81, this.textureX, this.textureY);
/* 1889 */     this.defaultScopeModel[9] = new ModelRendererTurbo(this, 113, 81, this.textureX, this.textureY);
/* 1890 */     this.defaultScopeModel[10] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
/* 1891 */     this.defaultScopeModel[11] = new ModelRendererTurbo(this, 129, 81, this.textureX, this.textureY);
/* 1892 */     this.defaultScopeModel[12] = new ModelRendererTurbo(this, 137, 81, this.textureX, this.textureY);
/* 1893 */     this.defaultScopeModel[13] = new ModelRendererTurbo(this, 145, 81, this.textureX, this.textureY);
/* 1894 */     this.defaultScopeModel[14] = new ModelRendererTurbo(this, 153, 81, this.textureX, this.textureY);
/* 1895 */     this.defaultScopeModel[15] = new ModelRendererTurbo(this, 161, 81, this.textureX, this.textureY);
/* 1896 */     this.defaultScopeModel[16] = new ModelRendererTurbo(this, 169, 81, this.textureX, this.textureY);
/* 1897 */     this.defaultScopeModel[17] = new ModelRendererTurbo(this, 177, 81, this.textureX, this.textureY);
/* 1898 */     this.defaultScopeModel[18] = new ModelRendererTurbo(this, 185, 81, this.textureX, this.textureY);
/* 1899 */     this.defaultScopeModel[19] = new ModelRendererTurbo(this, 193, 81, this.textureX, this.textureY);
/* 1900 */     this.defaultScopeModel[20] = new ModelRendererTurbo(this, 201, 81, this.textureX, this.textureY);
/* 1901 */     this.defaultScopeModel[21] = new ModelRendererTurbo(this, 209, 81, this.textureX, this.textureY);
/* 1902 */     this.defaultScopeModel[22] = new ModelRendererTurbo(this, 217, 81, this.textureX, this.textureY);
/* 1903 */     this.defaultScopeModel[23] = new ModelRendererTurbo(this, 233, 81, this.textureX, this.textureY);
/* 1904 */     this.defaultScopeModel[24] = new ModelRendererTurbo(this, 241, 81, this.textureX, this.textureY);
/* 1905 */     this.defaultScopeModel[25] = new ModelRendererTurbo(this, 249, 81, this.textureX, this.textureY);
/* 1906 */     this.defaultScopeModel[26] = new ModelRendererTurbo(this, 257, 81, this.textureX, this.textureY);
/* 1907 */     this.defaultScopeModel[27] = new ModelRendererTurbo(this, 265, 81, this.textureX, this.textureY);
/* 1908 */     this.defaultScopeModel[28] = new ModelRendererTurbo(this, 273, 81, this.textureX, this.textureY);
/* 1909 */     this.defaultScopeModel[29] = new ModelRendererTurbo(this, 281, 81, this.textureX, this.textureY);
/* 1910 */     this.defaultScopeModel[30] = new ModelRendererTurbo(this, 289, 81, this.textureX, this.textureY);
/* 1911 */     this.defaultScopeModel[31] = new ModelRendererTurbo(this, 297, 81, this.textureX, this.textureY);
/* 1912 */     this.defaultScopeModel[32] = new ModelRendererTurbo(this, 305, 81, this.textureX, this.textureY);
/* 1913 */     this.defaultScopeModel[33] = new ModelRendererTurbo(this, 313, 81, this.textureX, this.textureY);
/* 1914 */     this.defaultScopeModel[34] = new ModelRendererTurbo(this, 321, 81, this.textureX, this.textureY);
/* 1915 */     this.defaultScopeModel[35] = new ModelRendererTurbo(this, 329, 81, this.textureX, this.textureY);
/* 1916 */     this.defaultScopeModel[36] = new ModelRendererTurbo(this, 337, 81, this.textureX, this.textureY);
/* 1917 */     this.defaultScopeModel[37] = new ModelRendererTurbo(this, 345, 81, this.textureX, this.textureY);
/* 1918 */     this.defaultScopeModel[38] = new ModelRendererTurbo(this, 353, 81, this.textureX, this.textureY);
/* 1919 */     this.defaultScopeModel[39] = new ModelRendererTurbo(this, 361, 81, this.textureX, this.textureY);
/* 1920 */     this.defaultScopeModel[40] = new ModelRendererTurbo(this, 369, 81, this.textureX, this.textureY);
/* 1921 */     this.defaultScopeModel[41] = new ModelRendererTurbo(this, 377, 81, this.textureX, this.textureY);
/* 1922 */     this.defaultScopeModel[42] = new ModelRendererTurbo(this, 385, 81, this.textureX, this.textureY);
/* 1923 */     this.defaultScopeModel[43] = new ModelRendererTurbo(this, 393, 81, this.textureX, this.textureY);
/* 1924 */     this.defaultScopeModel[44] = new ModelRendererTurbo(this, 401, 81, this.textureX, this.textureY);
/* 1925 */     this.defaultScopeModel[45] = new ModelRendererTurbo(this, 409, 81, this.textureX, this.textureY);
/* 1926 */     this.defaultScopeModel[46] = new ModelRendererTurbo(this, 417, 81, this.textureX, this.textureY);
/* 1927 */     this.defaultScopeModel[47] = new ModelRendererTurbo(this, 425, 81, this.textureX, this.textureY);
/* 1928 */     this.defaultScopeModel[48] = new ModelRendererTurbo(this, 433, 81, this.textureX, this.textureY);
/* 1929 */     this.defaultScopeModel[49] = new ModelRendererTurbo(this, 441, 81, this.textureX, this.textureY);
/* 1930 */     this.defaultScopeModel[50] = new ModelRendererTurbo(this, 449, 81, this.textureX, this.textureY);
/* 1931 */     this.defaultScopeModel[51] = new ModelRendererTurbo(this, 457, 81, this.textureX, this.textureY);
/* 1932 */     this.defaultScopeModel[52] = new ModelRendererTurbo(this, 465, 81, this.textureX, this.textureY);
/* 1933 */     this.defaultScopeModel[53] = new ModelRendererTurbo(this, 393, 33, this.textureX, this.textureY);
/* 1934 */     this.defaultScopeModel[54] = new ModelRendererTurbo(this, 473, 81, this.textureX, this.textureY);
/* 1935 */     this.defaultScopeModel[55] = new ModelRendererTurbo(this, 481, 81, this.textureX, this.textureY);
/* 1936 */     this.defaultScopeModel[56] = new ModelRendererTurbo(this, 489, 81, this.textureX, this.textureY);
/* 1937 */     this.defaultScopeModel[57] = new ModelRendererTurbo(this, 497, 81, this.textureX, this.textureY);
/* 1938 */     this.defaultScopeModel[58] = new ModelRendererTurbo(this, 505, 81, this.textureX, this.textureY);
/* 1939 */     this.defaultScopeModel[59] = new ModelRendererTurbo(this, 1, 89, this.textureX, this.textureY);
/* 1940 */     this.defaultScopeModel[60] = new ModelRendererTurbo(this, 17, 89, this.textureX, this.textureY);
/* 1941 */     this.defaultScopeModel[61] = new ModelRendererTurbo(this, 33, 89, this.textureX, this.textureY);
/* 1942 */     this.defaultScopeModel[62] = new ModelRendererTurbo(this, 41, 89, this.textureX, this.textureY);
/* 1943 */     this.defaultScopeModel[63] = new ModelRendererTurbo(this, 49, 89, this.textureX, this.textureY);
/* 1944 */     this.defaultScopeModel[64] = new ModelRendererTurbo(this, 57, 89, this.textureX, this.textureY);
/* 1945 */     this.defaultScopeModel[65] = new ModelRendererTurbo(this, 65, 89, this.textureX, this.textureY);
/* 1946 */     this.defaultScopeModel[66] = new ModelRendererTurbo(this, 73, 89, this.textureX, this.textureY);
/* 1947 */     this.defaultScopeModel[67] = new ModelRendererTurbo(this, 81, 89, this.textureX, this.textureY);
/* 1948 */     this.defaultScopeModel[68] = new ModelRendererTurbo(this, 89, 89, this.textureX, this.textureY);
/* 1949 */     this.defaultScopeModel[69] = new ModelRendererTurbo(this, 97, 89, this.textureX, this.textureY);
/* 1950 */     this.defaultScopeModel[70] = new ModelRendererTurbo(this, 105, 89, this.textureX, this.textureY);
/*      */     
/* 1952 */     this.defaultScopeModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.25F, -0.1F, 0.0F, 0.25F, -0.1F, 0.0F, 0.25F, -0.1F, -0.5F, 0.25F, -0.1F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F);
/* 1953 */     this.defaultScopeModel[0].setRotationPoint(29.75F, -9.0F, 0.25F);
/*      */     
/* 1955 */     this.defaultScopeModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, -0.6F, -0.65F, 0.0F, -0.6F, -0.65F, 0.0F, -1.0F, -0.1F, -0.5F, -1.0F, -0.1F, -0.5F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F);
/* 1956 */     this.defaultScopeModel[1].setRotationPoint(29.75F, -9.0F, 0.5F);
/*      */     
/* 1958 */     this.defaultScopeModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, -1.0F, -0.1F, 0.0F, -1.0F, -0.1F, 0.0F, -0.6F, -0.65F, -0.5F, -0.6F, -0.65F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.65F, -0.5F, 0.0F, -0.65F);
/* 1959 */     this.defaultScopeModel[2].setRotationPoint(29.75F, -9.0F, 0.0F);
/*      */     
/* 1961 */     this.defaultScopeModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, 0.0F, -0.15F, -0.4F, -0.5F, -0.15F, -0.4F, -0.3F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F, -0.4F, -0.3F, -0.25F, -0.4F);
/* 1962 */     this.defaultScopeModel[3].setRotationPoint(30.25F, -10.0F, 0.25F);
/*      */     
/* 1964 */     this.defaultScopeModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.7F, -0.5F, -0.25F, -0.7F);
/* 1965 */     this.defaultScopeModel[4].setRotationPoint(29.75F, -9.55F, 0.85F);
/*      */     
/* 1967 */     this.defaultScopeModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F);
/* 1968 */     this.defaultScopeModel[5].setRotationPoint(29.75F, -10.05F, 0.85F);
/*      */     
/* 1970 */     this.defaultScopeModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.7F, -0.5F, -0.25F, -0.7F, -0.5F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F);
/* 1971 */     this.defaultScopeModel[6].setRotationPoint(29.75F, -10.5F, 0.85F);
/*      */     
/* 1973 */     this.defaultScopeModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F);
/* 1974 */     this.defaultScopeModel[7].setRotationPoint(29.75F, -9.55F, -0.35F);
/*      */     
/* 1976 */     this.defaultScopeModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, -0.3F, -0.35F, 0.0F, -0.3F, -0.35F, 0.0F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.25F, -0.35F, 0.0F, -0.25F, -0.35F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F);
/* 1977 */     this.defaultScopeModel[8].setRotationPoint(29.75F, -10.05F, -0.4F);
/*      */     
/* 1979 */     this.defaultScopeModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, -0.25F, -0.7F, 0.0F, -0.25F, -0.7F, 0.0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, 0.0F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F);
/* 1980 */     this.defaultScopeModel[9].setRotationPoint(29.75F, -10.5F, -0.35F);
/*      */     
/* 1982 */     this.defaultScopeModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, -0.25F, 0.05F, 0.0F, -0.25F, 0.05F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.5F, 0.05F, 0.0F, -0.5F, 0.05F, 0.0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F);
/* 1983 */     this.defaultScopeModel[10].setRotationPoint(29.75F, -10.5F, 0.4F);
/*      */     
/* 1985 */     this.defaultScopeModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.35F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.1F, 0.35F, -0.25F, 0.1F, 0.35F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, 0.35F, 0.0F, 0.1F);
/* 1986 */     this.defaultScopeModel[11].setRotationPoint(-2.25F, -9.0F, 0.75F);
/*      */     
/* 1988 */     this.defaultScopeModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0.1F, -0.25F, -0.75F, 0.1F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F);
/* 1989 */     this.defaultScopeModel[12].setRotationPoint(-2.25F, -9.75F, 0.75F);
/*      */     
/* 1991 */     this.defaultScopeModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0.1F, -0.25F, -0.75F, 0.1F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F);
/* 1992 */     this.defaultScopeModel[13].setRotationPoint(-2.25F, -10.0F, 0.75F);
/*      */     
/* 1994 */     this.defaultScopeModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.4F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, 0.1F, -0.4F, -0.5F, 0.1F, -0.4F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, -0.4F, 0.0F, 0.1F);
/* 1995 */     this.defaultScopeModel[14].setRotationPoint(-3.0F, -9.75F, 0.75F);
/*      */     
/* 1997 */     this.defaultScopeModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F);
/* 1998 */     this.defaultScopeModel[15].setRotationPoint(-4.0F, -10.25F, 0.75F);
/*      */     
/* 2000 */     this.defaultScopeModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.75F, 0.15F, -0.25F, -0.75F, 0.15F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/* 2001 */     this.defaultScopeModel[16].setRotationPoint(-5.0F, -9.0F, 0.75F);
/*      */     
/* 2003 */     this.defaultScopeModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.75F, 0.15F, -0.5F, -0.75F, 0.15F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, 0.0F, 0.0F, -0.75F, 0.15F, 0.0F, -0.75F, 0.15F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
/* 2004 */     this.defaultScopeModel[17].setRotationPoint(-5.0F, -9.75F, 0.75F);
/*      */     
/* 2006 */     this.defaultScopeModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.1F, -0.5F, -0.75F, 0.1F, -0.25F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F);
/* 2007 */     this.defaultScopeModel[18].setRotationPoint(-5.0F, -10.25F, 0.75F);
/*      */     
/* 2009 */     this.defaultScopeModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, 0.1F, -1.0F, -0.75F, 0.1F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F);
/* 2010 */     this.defaultScopeModel[19].setRotationPoint(-5.0F, -10.5F, 0.75F);
/*      */     
/* 2012 */     this.defaultScopeModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.1F, -0.25F, -0.5F, 0.1F, -0.25F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F);
/* 2013 */     this.defaultScopeModel[20].setRotationPoint(-4.25F, -10.25F, 0.75F);
/*      */     
/* 2015 */     this.defaultScopeModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, -0.25F, -0.75F, -0.1F, -0.25F, -0.75F, -0.1F, -0.25F, 0.1F, -0.5F, -0.25F, 0.1F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, 0.1F, -0.5F, -0.35F, 0.1F);
/* 2016 */     this.defaultScopeModel[21].setRotationPoint(-4.35F, -9.5F, 0.75F);
/*      */     
/* 2018 */     this.defaultScopeModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, 0.1F, -0.5F, -0.35F, 0.1F, -0.5F, -0.25F, -0.75F, -0.1F, -0.25F, -0.75F, -0.1F, -0.25F, 0.1F, -0.5F, -0.25F, 0.1F);
/* 2019 */     this.defaultScopeModel[22].setRotationPoint(-4.35F, -8.9F, 0.75F);
/*      */     
/* 2021 */     this.defaultScopeModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, -0.75F, -0.5F, -0.35F, 0.1F, -0.5F, -0.35F, 0.1F, -0.1F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.1F, -0.1F, -0.25F, 0.1F);
/* 2022 */     this.defaultScopeModel[23].setRotationPoint(-3.1F, -8.9F, 0.75F);
/*      */     
/* 2024 */     this.defaultScopeModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.75F, 0.25F, -0.65F, -0.75F, 0.25F, -0.65F, 0.1F, 0.0F, -0.65F, 0.1F, 0.0F, -0.2F, -0.75F, 0.25F, -0.2F, -0.75F, 0.25F, -0.2F, 0.1F, 0.0F, -0.2F, 0.1F);
/* 2025 */     this.defaultScopeModel[24].setRotationPoint(-3.85F, -8.8F, 0.75F);
/*      */     
/* 2027 */     this.defaultScopeModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.35F, -0.25F, -0.65F, 0.0F, -0.25F, -0.65F, 0.0F, -0.25F, 0.0F, 0.35F, -0.25F, 0.0F, 0.35F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F);
/* 2028 */     this.defaultScopeModel[25].setRotationPoint(-2.25F, -9.0F, -1.0F);
/*      */     
/* 2030 */     this.defaultScopeModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.75F, -0.65F, -0.25F, -0.75F, -0.65F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2031 */     this.defaultScopeModel[26].setRotationPoint(-2.25F, -9.75F, -1.0F);
/*      */     
/* 2033 */     this.defaultScopeModel[27].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.75F, -0.65F, -0.75F, -0.75F, -0.65F, -0.75F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, 0.0F, -0.65F, -0.25F, 0.0F, -0.65F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2034 */     this.defaultScopeModel[27].setRotationPoint(-2.25F, -10.0F, -1.0F);
/*      */     
/* 2036 */     this.defaultScopeModel[28].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.4F, -0.5F, -0.65F, 0.0F, -0.5F, -0.65F, 0.0F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
/* 2037 */     this.defaultScopeModel[28].setRotationPoint(-3.0F, -9.75F, -1.0F);
/*      */     
/* 2039 */     this.defaultScopeModel[29].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.25F, -0.5F, -0.65F, 0.0F, -1.0F, -0.65F, 0.0F, -1.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2040 */     this.defaultScopeModel[29].setRotationPoint(-4.0F, -10.25F, -1.0F);
/*      */     
/* 2042 */     this.defaultScopeModel[30].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.65F, 0.15F, -0.25F, -0.65F, 0.15F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2043 */     this.defaultScopeModel[30].setRotationPoint(-5.0F, -9.0F, -1.0F);
/*      */     
/* 2045 */     this.defaultScopeModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.65F, 0.15F, -0.5F, -0.65F, 0.15F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, -0.65F, 0.15F, 0.0F, -0.65F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
/* 2046 */     this.defaultScopeModel[31].setRotationPoint(-5.0F, -9.75F, -1.0F);
/*      */     
/* 2048 */     this.defaultScopeModel[32].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, -0.75F, -0.65F, 0.0F, -0.75F, -0.65F, 0.0F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, -0.25F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2049 */     this.defaultScopeModel[32].setRotationPoint(-5.0F, -10.25F, -1.0F);
/*      */     
/* 2051 */     this.defaultScopeModel[33].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.0F, -0.75F, -0.65F, 0.0F, -0.75F, -0.65F, 0.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
/* 2052 */     this.defaultScopeModel[33].setRotationPoint(-5.0F, -10.5F, -1.0F);
/*      */     
/* 2054 */     this.defaultScopeModel[34].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.5F, -0.65F, -0.5F, -0.5F, -0.65F, -0.5F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.65F, -0.5F, 0.0F, -0.65F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
/* 2055 */     this.defaultScopeModel[34].setRotationPoint(-4.25F, -10.25F, -1.0F);
/*      */     
/* 2057 */     this.defaultScopeModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, -0.25F, -0.65F, -0.1F, -0.25F, -0.65F, -0.1F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F);
/* 2058 */     this.defaultScopeModel[35].setRotationPoint(-4.35F, -9.5F, -1.0F);
/*      */     
/* 2060 */     this.defaultScopeModel[36].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, -0.5F, -0.25F, -0.65F, -0.1F, -0.25F, -0.65F, -0.1F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F);
/* 2061 */     this.defaultScopeModel[36].setRotationPoint(-4.35F, -8.9F, -1.0F);
/*      */     
/* 2063 */     this.defaultScopeModel[37].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.1F, -0.25F, -0.65F, -0.5F, -0.25F, -0.65F, -0.5F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F);
/* 2064 */     this.defaultScopeModel[37].setRotationPoint(-3.1F, -9.5F, -1.0F);
/*      */     
/* 2066 */     this.defaultScopeModel[38].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, -0.65F, -0.5F, -0.35F, 0.0F, -0.5F, -0.35F, 0.0F, -0.1F, -0.25F, -0.65F, -0.5F, -0.25F, -0.65F, -0.5F, -0.25F, 0.0F, -0.1F, -0.25F, 0.0F);
/* 2067 */     this.defaultScopeModel[38].setRotationPoint(-3.1F, -8.9F, -1.0F);
/*      */     
/* 2069 */     this.defaultScopeModel[39].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.65F, -0.65F, 0.25F, -0.65F, -0.65F, 0.25F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.2F, -0.65F, 0.25F, -0.2F, -0.65F, 0.25F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
/* 2070 */     this.defaultScopeModel[39].setRotationPoint(-3.85F, -8.8F, -1.0F);
/*      */     
/* 2072 */     this.defaultScopeModel[40].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2073 */     this.defaultScopeModel[40].setRotationPoint(-5.25F, -8.75F, 1.5F);
/*      */     
/* 2075 */     this.defaultScopeModel[41].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2076 */     this.defaultScopeModel[41].setRotationPoint(-5.25F, -9.0F, 1.5F);
/*      */     
/* 2078 */     this.defaultScopeModel[42].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F);
/* 2079 */     this.defaultScopeModel[42].setRotationPoint(-5.25F, -8.5F, 1.5F);
/*      */     
/* 2081 */     this.defaultScopeModel[43].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2082 */     this.defaultScopeModel[43].setRotationPoint(-2.75F, -8.75F, 1.5F);
/*      */     
/* 2084 */     this.defaultScopeModel[44].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2085 */     this.defaultScopeModel[44].setRotationPoint(-2.75F, -9.0F, 1.5F);
/*      */     
/* 2087 */     this.defaultScopeModel[45].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F);
/* 2088 */     this.defaultScopeModel[45].setRotationPoint(-2.75F, -8.5F, 1.5F);
/*      */     
/* 2090 */     this.defaultScopeModel[46].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2091 */     this.defaultScopeModel[46].setRotationPoint(-5.25F, -8.75F, -0.5F);
/*      */     
/* 2093 */     this.defaultScopeModel[47].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2094 */     this.defaultScopeModel[47].setRotationPoint(-5.25F, -9.0F, -0.5F);
/*      */     
/* 2096 */     this.defaultScopeModel[48].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F);
/* 2097 */     this.defaultScopeModel[48].setRotationPoint(-5.25F, -8.5F, -0.5F);
/*      */     
/* 2099 */     this.defaultScopeModel[49].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2100 */     this.defaultScopeModel[49].setRotationPoint(-5.25F, -8.75F, 1.0F);
/*      */     
/* 2102 */     this.defaultScopeModel[50].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F);
/* 2103 */     this.defaultScopeModel[50].setRotationPoint(-5.25F, -9.0F, 1.0F);
/*      */     
/* 2105 */     this.defaultScopeModel[51].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.75F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -1.0F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F);
/* 2106 */     this.defaultScopeModel[51].setRotationPoint(-5.25F, -8.5F, 1.0F);
/*      */     
/* 2108 */     this.defaultScopeModel[52].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.75F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F);
/* 2109 */     this.defaultScopeModel[52].setRotationPoint(-5.25F, -8.75F, 0.25F);
/*      */     
/* 2111 */     this.defaultScopeModel[53].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, -0.75F, 0.0F, -0.75F, -1.0F, 0.0F, -0.75F, -1.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.75F, -0.75F, -1.0F, -0.75F, -0.75F, -1.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F);
/* 2112 */     this.defaultScopeModel[53].setRotationPoint(-2.75F, -8.75F, -1.25F);
/*      */     
/* 2114 */     this.defaultScopeModel[54].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.65F, 0.1F, -0.75F, -0.9F, 0.1F, -0.75F, -0.9F, 0.1F, 0.2F, -0.65F, 0.1F, 0.2F, -0.65F, -0.6F, -0.75F, -0.9F, -0.6F, -0.75F, -0.9F, -0.6F, 0.2F, -0.65F, -0.6F, 0.2F);
/* 2115 */     this.defaultScopeModel[54].setRotationPoint(-2.75F, -8.8F, -0.75F);
/*      */     
/* 2117 */     this.defaultScopeModel[55].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.65F, 0.1F, -0.75F, -0.9F, 0.1F, -0.75F, -0.9F, 0.1F, 0.2F, -0.65F, 0.1F, 0.2F, -0.65F, -0.6F, -0.75F, -0.9F, -0.6F, -0.75F, -0.9F, -0.6F, 0.2F, -0.65F, -0.6F, 0.2F);
/* 2118 */     this.defaultScopeModel[55].setRotationPoint(-2.75F, -8.8F, 0.3F);
/*      */     
/* 2120 */     this.defaultScopeModel[56].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.35F, -0.05F, -0.75F, -0.9F, 0.1F, -0.75F, -0.9F, 0.1F, 0.2F, -0.35F, -0.05F, -0.25F, -0.35F, -0.6F, -0.75F, -0.9F, -0.6F, -0.75F, -0.9F, -0.6F, 0.2F, -0.35F, -0.6F, -0.25F);
/* 2121 */     this.defaultScopeModel[56].setRotationPoint(-3.2F, -8.8F, 0.3F);
/*      */     
/* 2123 */     this.defaultScopeModel[57].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.35F, -0.05F, -0.25F, -0.9F, 0.1F, 0.2F, -0.9F, 0.1F, -0.75F, -0.35F, -0.05F, -0.75F, -0.35F, -0.6F, -0.25F, -0.9F, -0.6F, 0.2F, -0.9F, -0.6F, -0.75F, -0.35F, -0.6F, -0.75F);
/* 2124 */     this.defaultScopeModel[57].setRotationPoint(-3.2F, -8.8F, 0.2F);
/*      */     
/* 2126 */     this.defaultScopeModel[58].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.55F, -0.05F, 0.2F, -1.1F, 0.02F, 0.2F, -1.1F, 0.02F, -0.6F, -0.55F, -0.05F, -0.6F, -0.55F, -0.6F, 0.2F, -1.1F, -0.6F, 0.2F, -1.1F, -0.6F, -0.6F, -0.55F, -0.6F, -0.6F);
/* 2127 */     this.defaultScopeModel[58].setRotationPoint(-3.4F, -8.8F, 0.65F);
/*      */     
/* 2129 */     this.defaultScopeModel[59].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, -0.8F, 0.2F, 0.1F, -1.1F, -0.05F, 0.2F, -1.1F, -0.05F, -0.6F, -0.8F, 0.2F, -0.7F, -0.8F, -0.85F, 0.1F, -1.1F, -0.6F, 0.2F, -1.1F, -0.6F, -0.6F, -0.8F, -0.85F, -0.7F);
/* 2130 */     this.defaultScopeModel[59].setRotationPoint(-4.75F, -8.8F, 0.65F);
/*      */     
/* 2132 */     this.defaultScopeModel[60].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, -1.05F, 0.2F, 0.1F, -1.2F, 0.2F, 0.1F, -1.2F, 0.2F, -0.7F, -1.05F, 0.2F, -0.7F, -1.05F, -1.0F, 0.1F, -1.2F, -0.85F, 0.1F, -1.2F, -0.85F, -0.7F, -1.05F, -1.0F, -0.7F);
/* 2133 */     this.defaultScopeModel[60].setRotationPoint(-5.75F, -8.8F, 0.65F);
/*      */     
/* 2135 */     this.defaultScopeModel[61].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.05F, -0.75F, -0.75F, -0.05F, -0.75F, -0.75F, -0.85F, 0.0F, -0.75F, -0.85F, 0.0F, -0.05F, -0.05F, -0.75F, -0.05F, -0.05F, -0.75F, -0.05F, -0.85F, 0.0F, -0.05F, -0.85F);
/* 2136 */     this.defaultScopeModel[61].setRotationPoint(-4.35F, -10.4F, 0.8F);
/*      */     
/* 2138 */     this.defaultScopeModel[62].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.1F, -0.75F, -0.75F, -0.1F, -0.75F, -0.75F, -0.8F, 0.0F, -0.75F, -0.8F, 0.0F, -0.05F, -0.1F, -0.75F, -0.05F, -0.1F, -0.75F, -0.05F, -0.8F, 0.0F, -0.05F, -0.8F);
/* 2139 */     this.defaultScopeModel[62].setRotationPoint(-4.35F, -10.4F, 0.45F);
/*      */     
/* 2141 */     this.defaultScopeModel[63].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.55F, -0.1F, -0.75F, -0.55F, -0.1F, -0.75F, -0.55F, -0.5F, 0.0F, -0.55F, -0.5F, 0.0F, 0.0F, -0.1F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
/* 2142 */     this.defaultScopeModel[63].setRotationPoint(-4.35F, -10.0F, 0.45F);
/*      */     
/* 2144 */     this.defaultScopeModel[64].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.95F, -0.1F, -0.75F, -0.95F, -0.1F, -0.75F, -0.85F, -0.8F, 0.0F, -0.85F, -0.8F, 0.0F, 0.0F, -0.1F, -0.75F, 0.0F, -0.1F, -0.75F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F);
/* 2145 */     this.defaultScopeModel[64].setRotationPoint(-4.35F, -10.65F, 0.45F);
/*      */     
/* 2147 */     this.defaultScopeModel[65].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.85F, -0.15F, -0.75F, -0.85F, -0.15F, -0.75F, -0.95F, -0.75F, 0.0F, -0.95F, -0.75F, 0.0F, 0.0F, -0.15F, -0.75F, 0.0F, -0.15F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2148 */     this.defaultScopeModel[65].setRotationPoint(-4.35F, -10.65F, 0.7F);
/*      */     
/* 2150 */     this.defaultScopeModel[66].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.07F, -0.75F, -0.75F, -0.07F, -0.75F, -0.75F, -0.85F, 0.0F, -0.75F, -0.85F, 0.0F, -0.17F, -0.15F, -0.75F, -0.17F, -0.15F, -0.75F, -0.17F, -0.85F, 0.0F, -0.17F, -0.85F);
/* 2151 */     this.defaultScopeModel[66].setRotationPoint(-4.35F, -10.4F, 0.7F);
/*      */     
/* 2153 */     this.defaultScopeModel[67].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.77F, -0.15F, -0.75F, -0.77F, -0.15F, -0.75F, -0.77F, -0.85F, 0.0F, -0.77F, -0.85F, 0.0F, -0.15F, -0.07F, -0.75F, -0.15F, -0.07F, -0.75F, -0.15F, -0.85F, 0.0F, -0.15F, -0.85F);
/* 2154 */     this.defaultScopeModel[67].setRotationPoint(-4.35F, -10.3F, 0.7F);
/*      */     
/* 2156 */     this.defaultScopeModel[68].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.77F, -0.85F, -0.75F, -0.77F, -0.85F, -0.75F, -0.77F, -0.15F, 0.0F, -0.77F, -0.15F, 0.0F, -0.15F, -0.85F, -0.75F, -0.15F, -0.85F, -0.75F, -0.15F, -0.07F, 0.0F, -0.15F, -0.07F);
/* 2157 */     this.defaultScopeModel[68].setRotationPoint(-4.35F, -10.3F, -0.2F);
/*      */     
/* 2159 */     this.defaultScopeModel[69].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.85F, -0.75F, -0.75F, -0.85F, -0.75F, -0.75F, -0.07F, 0.0F, -0.75F, -0.07F, 0.0F, -0.17F, -0.85F, -0.75F, -0.17F, -0.85F, -0.75F, -0.17F, -0.15F, 0.0F, -0.17F, -0.15F);
/* 2160 */     this.defaultScopeModel[69].setRotationPoint(-4.35F, -10.4F, -0.2F);
/*      */     
/* 2162 */     this.defaultScopeModel[70].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.85F, -0.05F, -0.75F, -0.85F, -0.05F, -0.75F, -0.85F, -0.75F, 0.0F, -0.85F, -0.75F, 0.0F, 0.0F, -0.05F, -0.75F, 0.0F, -0.05F, -0.75F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F);
/* 2163 */     this.defaultScopeModel[70].setRotationPoint(-4.35F, -10.65F, 0.6F);
/*      */   }
/*      */   
/*      */   private void initammoModel_1()
/*      */   {
/* 2168 */     this.ammoModel[0] = new ModelRendererTurbo(this, 257, 9, this.textureX, this.textureY);
/* 2169 */     this.ammoModel[1] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY);
/* 2170 */     this.ammoModel[2] = new ModelRendererTurbo(this, 297, 9, this.textureX, this.textureY);
/* 2171 */     this.ammoModel[3] = new ModelRendererTurbo(this, 305, 9, this.textureX, this.textureY);
/* 2172 */     this.ammoModel[4] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
/* 2173 */     this.ammoModel[5] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
/* 2174 */     this.ammoModel[6] = new ModelRendererTurbo(this, 497, 33, this.textureX, this.textureY);
/* 2175 */     this.ammoModel[7] = new ModelRendererTurbo(this, 505, 33, this.textureX, this.textureY);
/* 2176 */     this.ammoModel[8] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
/* 2177 */     this.ammoModel[9] = new ModelRendererTurbo(this, 9, 41, this.textureX, this.textureY);
/* 2178 */     this.ammoModel[10] = new ModelRendererTurbo(this, 17, 41, this.textureX, this.textureY);
/* 2179 */     this.ammoModel[11] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
/* 2180 */     this.ammoModel[12] = new ModelRendererTurbo(this, 33, 41, this.textureX, this.textureY);
/* 2181 */     this.ammoModel[13] = new ModelRendererTurbo(this, 41, 41, this.textureX, this.textureY);
/* 2182 */     this.ammoModel[14] = new ModelRendererTurbo(this, 49, 41, this.textureX, this.textureY);
/* 2183 */     this.ammoModel[15] = new ModelRendererTurbo(this, 57, 41, this.textureX, this.textureY);
/* 2184 */     this.ammoModel[16] = new ModelRendererTurbo(this, 65, 41, this.textureX, this.textureY);
/* 2185 */     this.ammoModel[17] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
/* 2186 */     this.ammoModel[18] = new ModelRendererTurbo(this, 81, 41, this.textureX, this.textureY);
/* 2187 */     this.ammoModel[19] = new ModelRendererTurbo(this, 89, 41, this.textureX, this.textureY);
/* 2188 */     this.ammoModel[20] = new ModelRendererTurbo(this, 97, 41, this.textureX, this.textureY);
/* 2189 */     this.ammoModel[21] = new ModelRendererTurbo(this, 105, 41, this.textureX, this.textureY);
/* 2190 */     this.ammoModel[22] = new ModelRendererTurbo(this, 489, 41, this.textureX, this.textureY);
/* 2191 */     this.ammoModel[23] = new ModelRendererTurbo(this, 497, 41, this.textureX, this.textureY);
/* 2192 */     this.ammoModel[24] = new ModelRendererTurbo(this, 505, 41, this.textureX, this.textureY);
/* 2193 */     this.ammoModel[25] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
/* 2194 */     this.ammoModel[26] = new ModelRendererTurbo(this, 9, 49, this.textureX, this.textureY);
/* 2195 */     this.ammoModel[27] = new ModelRendererTurbo(this, 17, 49, this.textureX, this.textureY);
/* 2196 */     this.ammoModel[28] = new ModelRendererTurbo(this, 25, 49, this.textureX, this.textureY);
/* 2197 */     this.ammoModel[29] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
/* 2198 */     this.ammoModel[30] = new ModelRendererTurbo(this, 41, 49, this.textureX, this.textureY);
/* 2199 */     this.ammoModel[31] = new ModelRendererTurbo(this, 49, 49, this.textureX, this.textureY);
/* 2200 */     this.ammoModel[32] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
/* 2201 */     this.ammoModel[33] = new ModelRendererTurbo(this, 65, 49, this.textureX, this.textureY);
/* 2202 */     this.ammoModel[34] = new ModelRendererTurbo(this, 73, 49, this.textureX, this.textureY);
/* 2203 */     this.ammoModel[35] = new ModelRendererTurbo(this, 81, 49, this.textureX, this.textureY);
/* 2204 */     this.ammoModel[36] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
/* 2205 */     this.ammoModel[37] = new ModelRendererTurbo(this, 97, 49, this.textureX, this.textureY);
/* 2206 */     this.ammoModel[38] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
/* 2207 */     this.ammoModel[39] = new ModelRendererTurbo(this, 113, 49, this.textureX, this.textureY);
/* 2208 */     this.ammoModel[40] = new ModelRendererTurbo(this, 121, 49, this.textureX, this.textureY);
/* 2209 */     this.ammoModel[41] = new ModelRendererTurbo(this, 129, 49, this.textureX, this.textureY);
/* 2210 */     this.ammoModel[42] = new ModelRendererTurbo(this, 137, 49, this.textureX, this.textureY);
/* 2211 */     this.ammoModel[43] = new ModelRendererTurbo(this, 145, 49, this.textureX, this.textureY);
/* 2212 */     this.ammoModel[44] = new ModelRendererTurbo(this, 153, 49, this.textureX, this.textureY);
/* 2213 */     this.ammoModel[45] = new ModelRendererTurbo(this, 161, 49, this.textureX, this.textureY);
/* 2214 */     this.ammoModel[46] = new ModelRendererTurbo(this, 169, 49, this.textureX, this.textureY);
/* 2215 */     this.ammoModel[47] = new ModelRendererTurbo(this, 177, 49, this.textureX, this.textureY);
/* 2216 */     this.ammoModel[48] = new ModelRendererTurbo(this, 185, 49, this.textureX, this.textureY);
/* 2217 */     this.ammoModel[49] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
/* 2218 */     this.ammoModel[50] = new ModelRendererTurbo(this, 201, 49, this.textureX, this.textureY);
/* 2219 */     this.ammoModel[51] = new ModelRendererTurbo(this, 209, 49, this.textureX, this.textureY);
/* 2220 */     this.ammoModel[52] = new ModelRendererTurbo(this, 217, 49, this.textureX, this.textureY);
/* 2221 */     this.ammoModel[53] = new ModelRendererTurbo(this, 225, 49, this.textureX, this.textureY);
/* 2222 */     this.ammoModel[54] = new ModelRendererTurbo(this, 233, 49, this.textureX, this.textureY);
/* 2223 */     this.ammoModel[55] = new ModelRendererTurbo(this, 241, 49, this.textureX, this.textureY);
/* 2224 */     this.ammoModel[56] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
/* 2225 */     this.ammoModel[57] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
/* 2226 */     this.ammoModel[58] = new ModelRendererTurbo(this, 265, 49, this.textureX, this.textureY);
/* 2227 */     this.ammoModel[59] = new ModelRendererTurbo(this, 273, 49, this.textureX, this.textureY);
/* 2228 */     this.ammoModel[60] = new ModelRendererTurbo(this, 281, 49, this.textureX, this.textureY);
/* 2229 */     this.ammoModel[61] = new ModelRendererTurbo(this, 289, 49, this.textureX, this.textureY);
/* 2230 */     this.ammoModel[62] = new ModelRendererTurbo(this, 297, 49, this.textureX, this.textureY);
/* 2231 */     this.ammoModel[63] = new ModelRendererTurbo(this, 305, 49, this.textureX, this.textureY);
/* 2232 */     this.ammoModel[64] = new ModelRendererTurbo(this, 313, 49, this.textureX, this.textureY);
/* 2233 */     this.ammoModel[65] = new ModelRendererTurbo(this, 321, 49, this.textureX, this.textureY);
/* 2234 */     this.ammoModel[66] = new ModelRendererTurbo(this, 329, 49, this.textureX, this.textureY);
/* 2235 */     this.ammoModel[67] = new ModelRendererTurbo(this, 337, 49, this.textureX, this.textureY);
/* 2236 */     this.ammoModel[68] = new ModelRendererTurbo(this, 345, 49, this.textureX, this.textureY);
/* 2237 */     this.ammoModel[69] = new ModelRendererTurbo(this, 353, 49, this.textureX, this.textureY);
/* 2238 */     this.ammoModel[70] = new ModelRendererTurbo(this, 361, 49, this.textureX, this.textureY);
/* 2239 */     this.ammoModel[71] = new ModelRendererTurbo(this, 369, 49, this.textureX, this.textureY);
/* 2240 */     this.ammoModel[72] = new ModelRendererTurbo(this, 377, 49, this.textureX, this.textureY);
/* 2241 */     this.ammoModel[73] = new ModelRendererTurbo(this, 385, 49, this.textureX, this.textureY);
/* 2242 */     this.ammoModel[74] = new ModelRendererTurbo(this, 393, 49, this.textureX, this.textureY);
/* 2243 */     this.ammoModel[75] = new ModelRendererTurbo(this, 401, 49, this.textureX, this.textureY);
/* 2244 */     this.ammoModel[76] = new ModelRendererTurbo(this, 409, 49, this.textureX, this.textureY);
/* 2245 */     this.ammoModel[77] = new ModelRendererTurbo(this, 417, 49, this.textureX, this.textureY);
/* 2246 */     this.ammoModel[78] = new ModelRendererTurbo(this, 425, 49, this.textureX, this.textureY);
/* 2247 */     this.ammoModel[79] = new ModelRendererTurbo(this, 433, 49, this.textureX, this.textureY);
/* 2248 */     this.ammoModel[80] = new ModelRendererTurbo(this, 441, 49, this.textureX, this.textureY);
/* 2249 */     this.ammoModel[81] = new ModelRendererTurbo(this, 449, 49, this.textureX, this.textureY);
/* 2250 */     this.ammoModel[82] = new ModelRendererTurbo(this, 457, 49, this.textureX, this.textureY);
/* 2251 */     this.ammoModel[83] = new ModelRendererTurbo(this, 465, 49, this.textureX, this.textureY);
/* 2252 */     this.ammoModel[84] = new ModelRendererTurbo(this, 473, 49, this.textureX, this.textureY);
/* 2253 */     this.ammoModel[85] = new ModelRendererTurbo(this, 481, 49, this.textureX, this.textureY);
/* 2254 */     this.ammoModel[86] = new ModelRendererTurbo(this, 489, 49, this.textureX, this.textureY);
/* 2255 */     this.ammoModel[87] = new ModelRendererTurbo(this, 497, 49, this.textureX, this.textureY);
/* 2256 */     this.ammoModel[88] = new ModelRendererTurbo(this, 505, 49, this.textureX, this.textureY);
/* 2257 */     this.ammoModel[89] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
/* 2258 */     this.ammoModel[90] = new ModelRendererTurbo(this, 9, 57, this.textureX, this.textureY);
/* 2259 */     this.ammoModel[91] = new ModelRendererTurbo(this, 17, 57, this.textureX, this.textureY);
/* 2260 */     this.ammoModel[92] = new ModelRendererTurbo(this, 25, 57, this.textureX, this.textureY);
/* 2261 */     this.ammoModel[93] = new ModelRendererTurbo(this, 33, 57, this.textureX, this.textureY);
/* 2262 */     this.ammoModel[94] = new ModelRendererTurbo(this, 41, 57, this.textureX, this.textureY);
/* 2263 */     this.ammoModel[95] = new ModelRendererTurbo(this, 49, 57, this.textureX, this.textureY);
/* 2264 */     this.ammoModel[96] = new ModelRendererTurbo(this, 57, 57, this.textureX, this.textureY);
/* 2265 */     this.ammoModel[97] = new ModelRendererTurbo(this, 65, 57, this.textureX, this.textureY);
/* 2266 */     this.ammoModel[98] = new ModelRendererTurbo(this, 73, 57, this.textureX, this.textureY);
/* 2267 */     this.ammoModel[99] = new ModelRendererTurbo(this, 81, 57, this.textureX, this.textureY);
/* 2268 */     this.ammoModel[100] = new ModelRendererTurbo(this, 89, 57, this.textureX, this.textureY);
/* 2269 */     this.ammoModel[101] = new ModelRendererTurbo(this, 97, 57, this.textureX, this.textureY);
/* 2270 */     this.ammoModel[102] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
/* 2271 */     this.ammoModel[103] = new ModelRendererTurbo(this, 113, 57, this.textureX, this.textureY);
/* 2272 */     this.ammoModel[104] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
/* 2273 */     this.ammoModel[105] = new ModelRendererTurbo(this, 129, 57, this.textureX, this.textureY);
/* 2274 */     this.ammoModel[106] = new ModelRendererTurbo(this, 137, 57, this.textureX, this.textureY);
/* 2275 */     this.ammoModel[107] = new ModelRendererTurbo(this, 145, 57, this.textureX, this.textureY);
/* 2276 */     this.ammoModel[108] = new ModelRendererTurbo(this, 153, 57, this.textureX, this.textureY);
/* 2277 */     this.ammoModel[109] = new ModelRendererTurbo(this, 161, 57, this.textureX, this.textureY);
/* 2278 */     this.ammoModel[110] = new ModelRendererTurbo(this, 169, 57, this.textureX, this.textureY);
/* 2279 */     this.ammoModel[111] = new ModelRendererTurbo(this, 177, 57, this.textureX, this.textureY);
/* 2280 */     this.ammoModel[112] = new ModelRendererTurbo(this, 185, 57, this.textureX, this.textureY);
/* 2281 */     this.ammoModel[113] = new ModelRendererTurbo(this, 193, 57, this.textureX, this.textureY);
/* 2282 */     this.ammoModel[114] = new ModelRendererTurbo(this, 201, 57, this.textureX, this.textureY);
/* 2283 */     this.ammoModel[115] = new ModelRendererTurbo(this, 209, 57, this.textureX, this.textureY);
/* 2284 */     this.ammoModel[116] = new ModelRendererTurbo(this, 217, 57, this.textureX, this.textureY);
/* 2285 */     this.ammoModel[117] = new ModelRendererTurbo(this, 225, 57, this.textureX, this.textureY);
/* 2286 */     this.ammoModel[118] = new ModelRendererTurbo(this, 233, 57, this.textureX, this.textureY);
/* 2287 */     this.ammoModel[119] = new ModelRendererTurbo(this, 241, 57, this.textureX, this.textureY);
/* 2288 */     this.ammoModel[120] = new ModelRendererTurbo(this, 249, 57, this.textureX, this.textureY);
/* 2289 */     this.ammoModel[121] = new ModelRendererTurbo(this, 257, 57, this.textureX, this.textureY);
/* 2290 */     this.ammoModel[122] = new ModelRendererTurbo(this, 265, 57, this.textureX, this.textureY);
/* 2291 */     this.ammoModel[123] = new ModelRendererTurbo(this, 273, 57, this.textureX, this.textureY);
/* 2292 */     this.ammoModel[124] = new ModelRendererTurbo(this, 281, 57, this.textureX, this.textureY);
/* 2293 */     this.ammoModel[125] = new ModelRendererTurbo(this, 289, 57, this.textureX, this.textureY);
/* 2294 */     this.ammoModel[126] = new ModelRendererTurbo(this, 297, 57, this.textureX, this.textureY);
/* 2295 */     this.ammoModel[127] = new ModelRendererTurbo(this, 305, 57, this.textureX, this.textureY);
/* 2296 */     this.ammoModel[''] = new ModelRendererTurbo(this, 313, 57, this.textureX, this.textureY);
/* 2297 */     this.ammoModel[''] = new ModelRendererTurbo(this, 321, 57, this.textureX, this.textureY);
/* 2298 */     this.ammoModel[''] = new ModelRendererTurbo(this, 329, 57, this.textureX, this.textureY);
/* 2299 */     this.ammoModel[''] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
/* 2300 */     this.ammoModel[''] = new ModelRendererTurbo(this, 345, 57, this.textureX, this.textureY);
/* 2301 */     this.ammoModel[''] = new ModelRendererTurbo(this, 353, 57, this.textureX, this.textureY);
/* 2302 */     this.ammoModel[''] = new ModelRendererTurbo(this, 361, 57, this.textureX, this.textureY);
/* 2303 */     this.ammoModel[''] = new ModelRendererTurbo(this, 369, 57, this.textureX, this.textureY);
/* 2304 */     this.ammoModel[''] = new ModelRendererTurbo(this, 377, 57, this.textureX, this.textureY);
/* 2305 */     this.ammoModel[''] = new ModelRendererTurbo(this, 385, 57, this.textureX, this.textureY);
/* 2306 */     this.ammoModel[''] = new ModelRendererTurbo(this, 393, 57, this.textureX, this.textureY);
/* 2307 */     this.ammoModel[''] = new ModelRendererTurbo(this, 401, 57, this.textureX, this.textureY);
/* 2308 */     this.ammoModel[''] = new ModelRendererTurbo(this, 409, 57, this.textureX, this.textureY);
/* 2309 */     this.ammoModel[''] = new ModelRendererTurbo(this, 417, 57, this.textureX, this.textureY);
/* 2310 */     this.ammoModel[''] = new ModelRendererTurbo(this, 425, 57, this.textureX, this.textureY);
/* 2311 */     this.ammoModel[''] = new ModelRendererTurbo(this, 433, 57, this.textureX, this.textureY);
/* 2312 */     this.ammoModel[''] = new ModelRendererTurbo(this, 441, 57, this.textureX, this.textureY);
/* 2313 */     this.ammoModel[''] = new ModelRendererTurbo(this, 449, 57, this.textureX, this.textureY);
/* 2314 */     this.ammoModel[''] = new ModelRendererTurbo(this, 457, 57, this.textureX, this.textureY);
/* 2315 */     this.ammoModel[''] = new ModelRendererTurbo(this, 465, 57, this.textureX, this.textureY);
/* 2316 */     this.ammoModel[''] = new ModelRendererTurbo(this, 473, 57, this.textureX, this.textureY);
/* 2317 */     this.ammoModel[''] = new ModelRendererTurbo(this, 481, 57, this.textureX, this.textureY);
/* 2318 */     this.ammoModel[''] = new ModelRendererTurbo(this, 489, 57, this.textureX, this.textureY);
/* 2319 */     this.ammoModel[''] = new ModelRendererTurbo(this, 497, 57, this.textureX, this.textureY);
/* 2320 */     this.ammoModel[''] = new ModelRendererTurbo(this, 505, 57, this.textureX, this.textureY);
/* 2321 */     this.ammoModel[''] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
/* 2322 */     this.ammoModel[''] = new ModelRendererTurbo(this, 9, 65, this.textureX, this.textureY);
/* 2323 */     this.ammoModel[''] = new ModelRendererTurbo(this, 17, 65, this.textureX, this.textureY);
/* 2324 */     this.ammoModel[''] = new ModelRendererTurbo(this, 25, 65, this.textureX, this.textureY);
/* 2325 */     this.ammoModel[''] = new ModelRendererTurbo(this, 33, 65, this.textureX, this.textureY);
/* 2326 */     this.ammoModel[''] = new ModelRendererTurbo(this, 41, 65, this.textureX, this.textureY);
/* 2327 */     this.ammoModel[''] = new ModelRendererTurbo(this, 49, 65, this.textureX, this.textureY);
/* 2328 */     this.ammoModel[' '] = new ModelRendererTurbo(this, 57, 65, this.textureX, this.textureY);
/* 2329 */     this.ammoModel['¡'] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
/* 2330 */     this.ammoModel['¢'] = new ModelRendererTurbo(this, 73, 65, this.textureX, this.textureY);
/* 2331 */     this.ammoModel['£'] = new ModelRendererTurbo(this, 81, 65, this.textureX, this.textureY);
/* 2332 */     this.ammoModel['¤'] = new ModelRendererTurbo(this, 89, 65, this.textureX, this.textureY);
/* 2333 */     this.ammoModel['¥'] = new ModelRendererTurbo(this, 97, 65, this.textureX, this.textureY);
/* 2334 */     this.ammoModel['¦'] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
/* 2335 */     this.ammoModel['§'] = new ModelRendererTurbo(this, 113, 65, this.textureX, this.textureY);
/* 2336 */     this.ammoModel['¨'] = new ModelRendererTurbo(this, 121, 65, this.textureX, this.textureY);
/* 2337 */     this.ammoModel['©'] = new ModelRendererTurbo(this, 129, 65, this.textureX, this.textureY);
/* 2338 */     this.ammoModel['ª'] = new ModelRendererTurbo(this, 137, 65, this.textureX, this.textureY);
/* 2339 */     this.ammoModel['«'] = new ModelRendererTurbo(this, 145, 65, this.textureX, this.textureY);
/* 2340 */     this.ammoModel['¬'] = new ModelRendererTurbo(this, 153, 65, this.textureX, this.textureY);
/* 2341 */     this.ammoModel['­'] = new ModelRendererTurbo(this, 161, 65, this.textureX, this.textureY);
/* 2342 */     this.ammoModel['®'] = new ModelRendererTurbo(this, 169, 65, this.textureX, this.textureY);
/* 2343 */     this.ammoModel['¯'] = new ModelRendererTurbo(this, 177, 65, this.textureX, this.textureY);
/* 2344 */     this.ammoModel['°'] = new ModelRendererTurbo(this, 185, 65, this.textureX, this.textureY);
/* 2345 */     this.ammoModel['±'] = new ModelRendererTurbo(this, 193, 65, this.textureX, this.textureY);
/* 2346 */     this.ammoModel['²'] = new ModelRendererTurbo(this, 201, 65, this.textureX, this.textureY);
/* 2347 */     this.ammoModel['³'] = new ModelRendererTurbo(this, 209, 65, this.textureX, this.textureY);
/* 2348 */     this.ammoModel['´'] = new ModelRendererTurbo(this, 217, 65, this.textureX, this.textureY);
/* 2349 */     this.ammoModel['µ'] = new ModelRendererTurbo(this, 225, 65, this.textureX, this.textureY);
/* 2350 */     this.ammoModel['¶'] = new ModelRendererTurbo(this, 233, 65, this.textureX, this.textureY);
/* 2351 */     this.ammoModel['·'] = new ModelRendererTurbo(this, 241, 65, this.textureX, this.textureY);
/* 2352 */     this.ammoModel['¸'] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
/* 2353 */     this.ammoModel['¹'] = new ModelRendererTurbo(this, 257, 65, this.textureX, this.textureY);
/* 2354 */     this.ammoModel['º'] = new ModelRendererTurbo(this, 265, 65, this.textureX, this.textureY);
/* 2355 */     this.ammoModel['»'] = new ModelRendererTurbo(this, 273, 65, this.textureX, this.textureY);
/* 2356 */     this.ammoModel['¼'] = new ModelRendererTurbo(this, 281, 65, this.textureX, this.textureY);
/* 2357 */     this.ammoModel['½'] = new ModelRendererTurbo(this, 289, 65, this.textureX, this.textureY);
/* 2358 */     this.ammoModel['¾'] = new ModelRendererTurbo(this, 297, 65, this.textureX, this.textureY);
/* 2359 */     this.ammoModel['¿'] = new ModelRendererTurbo(this, 305, 65, this.textureX, this.textureY);
/* 2360 */     this.ammoModel['À'] = new ModelRendererTurbo(this, 313, 65, this.textureX, this.textureY);
/* 2361 */     this.ammoModel['Á'] = new ModelRendererTurbo(this, 321, 65, this.textureX, this.textureY);
/* 2362 */     this.ammoModel['Â'] = new ModelRendererTurbo(this, 329, 65, this.textureX, this.textureY);
/* 2363 */     this.ammoModel['Ã'] = new ModelRendererTurbo(this, 337, 65, this.textureX, this.textureY);
/* 2364 */     this.ammoModel['Ä'] = new ModelRendererTurbo(this, 345, 65, this.textureX, this.textureY);
/* 2365 */     this.ammoModel['Å'] = new ModelRendererTurbo(this, 353, 65, this.textureX, this.textureY);
/* 2366 */     this.ammoModel['Æ'] = new ModelRendererTurbo(this, 361, 65, this.textureX, this.textureY);
/* 2367 */     this.ammoModel['Ç'] = new ModelRendererTurbo(this, 369, 65, this.textureX, this.textureY);
/* 2368 */     this.ammoModel['È'] = new ModelRendererTurbo(this, 377, 65, this.textureX, this.textureY);
/* 2369 */     this.ammoModel['É'] = new ModelRendererTurbo(this, 385, 65, this.textureX, this.textureY);
/* 2370 */     this.ammoModel['Ê'] = new ModelRendererTurbo(this, 393, 65, this.textureX, this.textureY);
/* 2371 */     this.ammoModel['Ë'] = new ModelRendererTurbo(this, 401, 65, this.textureX, this.textureY);
/* 2372 */     this.ammoModel['Ì'] = new ModelRendererTurbo(this, 409, 65, this.textureX, this.textureY);
/* 2373 */     this.ammoModel['Í'] = new ModelRendererTurbo(this, 417, 65, this.textureX, this.textureY);
/* 2374 */     this.ammoModel['Î'] = new ModelRendererTurbo(this, 425, 65, this.textureX, this.textureY);
/* 2375 */     this.ammoModel['Ï'] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY);
/* 2376 */     this.ammoModel['Ð'] = new ModelRendererTurbo(this, 441, 65, this.textureX, this.textureY);
/* 2377 */     this.ammoModel['Ñ'] = new ModelRendererTurbo(this, 449, 65, this.textureX, this.textureY);
/* 2378 */     this.ammoModel['Ò'] = new ModelRendererTurbo(this, 457, 65, this.textureX, this.textureY);
/* 2379 */     this.ammoModel['Ó'] = new ModelRendererTurbo(this, 465, 65, this.textureX, this.textureY);
/* 2380 */     this.ammoModel['Ô'] = new ModelRendererTurbo(this, 473, 65, this.textureX, this.textureY);
/* 2381 */     this.ammoModel['Õ'] = new ModelRendererTurbo(this, 481, 65, this.textureX, this.textureY);
/* 2382 */     this.ammoModel['Ö'] = new ModelRendererTurbo(this, 489, 65, this.textureX, this.textureY);
/* 2383 */     this.ammoModel['×'] = new ModelRendererTurbo(this, 497, 65, this.textureX, this.textureY);
/* 2384 */     this.ammoModel['Ø'] = new ModelRendererTurbo(this, 505, 65, this.textureX, this.textureY);
/* 2385 */     this.ammoModel['Ù'] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
/* 2386 */     this.ammoModel['Ú'] = new ModelRendererTurbo(this, 9, 73, this.textureX, this.textureY);
/* 2387 */     this.ammoModel['Û'] = new ModelRendererTurbo(this, 17, 73, this.textureX, this.textureY);
/* 2388 */     this.ammoModel['Ü'] = new ModelRendererTurbo(this, 25, 73, this.textureX, this.textureY);
/* 2389 */     this.ammoModel['Ý'] = new ModelRendererTurbo(this, 33, 73, this.textureX, this.textureY);
/* 2390 */     this.ammoModel['Þ'] = new ModelRendererTurbo(this, 41, 73, this.textureX, this.textureY);
/* 2391 */     this.ammoModel['ß'] = new ModelRendererTurbo(this, 49, 73, this.textureX, this.textureY);
/* 2392 */     this.ammoModel['à'] = new ModelRendererTurbo(this, 57, 73, this.textureX, this.textureY);
/* 2393 */     this.ammoModel['á'] = new ModelRendererTurbo(this, 65, 73, this.textureX, this.textureY);
/* 2394 */     this.ammoModel['â'] = new ModelRendererTurbo(this, 73, 73, this.textureX, this.textureY);
/* 2395 */     this.ammoModel['ã'] = new ModelRendererTurbo(this, 81, 73, this.textureX, this.textureY);
/* 2396 */     this.ammoModel['ä'] = new ModelRendererTurbo(this, 89, 73, this.textureX, this.textureY);
/* 2397 */     this.ammoModel['å'] = new ModelRendererTurbo(this, 97, 73, this.textureX, this.textureY);
/* 2398 */     this.ammoModel['æ'] = new ModelRendererTurbo(this, 105, 73, this.textureX, this.textureY);
/* 2399 */     this.ammoModel['ç'] = new ModelRendererTurbo(this, 113, 73, this.textureX, this.textureY);
/* 2400 */     this.ammoModel['è'] = new ModelRendererTurbo(this, 121, 73, this.textureX, this.textureY);
/* 2401 */     this.ammoModel['é'] = new ModelRendererTurbo(this, 129, 73, this.textureX, this.textureY);
/* 2402 */     this.ammoModel['ê'] = new ModelRendererTurbo(this, 137, 73, this.textureX, this.textureY);
/* 2403 */     this.ammoModel['ë'] = new ModelRendererTurbo(this, 145, 73, this.textureX, this.textureY);
/* 2404 */     this.ammoModel['ì'] = new ModelRendererTurbo(this, 153, 73, this.textureX, this.textureY);
/* 2405 */     this.ammoModel['í'] = new ModelRendererTurbo(this, 161, 73, this.textureX, this.textureY);
/* 2406 */     this.ammoModel['î'] = new ModelRendererTurbo(this, 169, 73, this.textureX, this.textureY);
/* 2407 */     this.ammoModel['ï'] = new ModelRendererTurbo(this, 177, 73, this.textureX, this.textureY);
/* 2408 */     this.ammoModel['ð'] = new ModelRendererTurbo(this, 185, 73, this.textureX, this.textureY);
/* 2409 */     this.ammoModel['ñ'] = new ModelRendererTurbo(this, 193, 73, this.textureX, this.textureY);
/* 2410 */     this.ammoModel['ò'] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
/* 2411 */     this.ammoModel['ó'] = new ModelRendererTurbo(this, 209, 73, this.textureX, this.textureY);
/* 2412 */     this.ammoModel['ô'] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
/* 2413 */     this.ammoModel['õ'] = new ModelRendererTurbo(this, 225, 73, this.textureX, this.textureY);
/* 2414 */     this.ammoModel['ö'] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
/* 2415 */     this.ammoModel['÷'] = new ModelRendererTurbo(this, 241, 73, this.textureX, this.textureY);
/* 2416 */     this.ammoModel['ø'] = new ModelRendererTurbo(this, 249, 73, this.textureX, this.textureY);
/* 2417 */     this.ammoModel['ù'] = new ModelRendererTurbo(this, 257, 73, this.textureX, this.textureY);
/* 2418 */     this.ammoModel['ú'] = new ModelRendererTurbo(this, 265, 73, this.textureX, this.textureY);
/* 2419 */     this.ammoModel['û'] = new ModelRendererTurbo(this, 273, 73, this.textureX, this.textureY);
/* 2420 */     this.ammoModel['ü'] = new ModelRendererTurbo(this, 281, 73, this.textureX, this.textureY);
/* 2421 */     this.ammoModel['ý'] = new ModelRendererTurbo(this, 289, 73, this.textureX, this.textureY);
/* 2422 */     this.ammoModel['þ'] = new ModelRendererTurbo(this, 297, 73, this.textureX, this.textureY);
/* 2423 */     this.ammoModel['ÿ'] = new ModelRendererTurbo(this, 305, 73, this.textureX, this.textureY);
/* 2424 */     this.ammoModel['Ā'] = new ModelRendererTurbo(this, 313, 73, this.textureX, this.textureY);
/* 2425 */     this.ammoModel['ā'] = new ModelRendererTurbo(this, 321, 73, this.textureX, this.textureY);
/* 2426 */     this.ammoModel['Ă'] = new ModelRendererTurbo(this, 329, 73, this.textureX, this.textureY);
/* 2427 */     this.ammoModel['ă'] = new ModelRendererTurbo(this, 337, 73, this.textureX, this.textureY);
/* 2428 */     this.ammoModel['Ą'] = new ModelRendererTurbo(this, 345, 73, this.textureX, this.textureY);
/* 2429 */     this.ammoModel['ą'] = new ModelRendererTurbo(this, 353, 73, this.textureX, this.textureY);
/* 2430 */     this.ammoModel['Ć'] = new ModelRendererTurbo(this, 361, 73, this.textureX, this.textureY);
/* 2431 */     this.ammoModel['ć'] = new ModelRendererTurbo(this, 369, 73, this.textureX, this.textureY);
/* 2432 */     this.ammoModel['Ĉ'] = new ModelRendererTurbo(this, 377, 73, this.textureX, this.textureY);
/* 2433 */     this.ammoModel['ĉ'] = new ModelRendererTurbo(this, 385, 73, this.textureX, this.textureY);
/* 2434 */     this.ammoModel['Ċ'] = new ModelRendererTurbo(this, 393, 73, this.textureX, this.textureY);
/* 2435 */     this.ammoModel['ċ'] = new ModelRendererTurbo(this, 401, 73, this.textureX, this.textureY);
/* 2436 */     this.ammoModel['Č'] = new ModelRendererTurbo(this, 409, 73, this.textureX, this.textureY);
/* 2437 */     this.ammoModel['č'] = new ModelRendererTurbo(this, 417, 73, this.textureX, this.textureY);
/* 2438 */     this.ammoModel['Ď'] = new ModelRendererTurbo(this, 425, 73, this.textureX, this.textureY);
/* 2439 */     this.ammoModel['ď'] = new ModelRendererTurbo(this, 433, 73, this.textureX, this.textureY);
/* 2440 */     this.ammoModel['Đ'] = new ModelRendererTurbo(this, 441, 73, this.textureX, this.textureY);
/* 2441 */     this.ammoModel['đ'] = new ModelRendererTurbo(this, 449, 73, this.textureX, this.textureY);
/* 2442 */     this.ammoModel['Ē'] = new ModelRendererTurbo(this, 457, 73, this.textureX, this.textureY);
/* 2443 */     this.ammoModel['ē'] = new ModelRendererTurbo(this, 465, 73, this.textureX, this.textureY);
/* 2444 */     this.ammoModel['Ĕ'] = new ModelRendererTurbo(this, 473, 73, this.textureX, this.textureY);
/* 2445 */     this.ammoModel['ĕ'] = new ModelRendererTurbo(this, 481, 73, this.textureX, this.textureY);
/* 2446 */     this.ammoModel['Ė'] = new ModelRendererTurbo(this, 489, 73, this.textureX, this.textureY);
/* 2447 */     this.ammoModel['ė'] = new ModelRendererTurbo(this, 497, 73, this.textureX, this.textureY);
/* 2448 */     this.ammoModel['Ę'] = new ModelRendererTurbo(this, 505, 73, this.textureX, this.textureY);
/* 2449 */     this.ammoModel['ę'] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
/* 2450 */     this.ammoModel['Ě'] = new ModelRendererTurbo(this, 9, 81, this.textureX, this.textureY);
/* 2451 */     this.ammoModel['ě'] = new ModelRendererTurbo(this, 17, 81, this.textureX, this.textureY);
/* 2452 */     this.ammoModel['Ĝ'] = new ModelRendererTurbo(this, 417, 121, this.textureX, this.textureY);
/* 2453 */     this.ammoModel['ĝ'] = new ModelRendererTurbo(this, 433, 121, this.textureX, this.textureY);
/* 2454 */     this.ammoModel['Ğ'] = new ModelRendererTurbo(this, 449, 121, this.textureX, this.textureY);
/* 2455 */     this.ammoModel['ğ'] = new ModelRendererTurbo(this, 465, 121, this.textureX, this.textureY);
/* 2456 */     this.ammoModel['Ġ'] = new ModelRendererTurbo(this, 481, 121, this.textureX, this.textureY);
/* 2457 */     this.ammoModel['ġ'] = new ModelRendererTurbo(this, 497, 121, this.textureX, this.textureY);
/*      */     
/* 2459 */     this.ammoModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 4, 6, 5, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 2460 */     this.ammoModel[0].setRotationPoint(8.0F, -1.75F, -0.5F);
/*      */     
/* 2462 */     this.ammoModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 4, 5, 1, 0.0F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F);
/* 2463 */     this.ammoModel[1].setRotationPoint(8.0F, -0.75F, 4.5F);
/*      */     
/* 2465 */     this.ammoModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F);
/* 2466 */     this.ammoModel[2].setRotationPoint(7.75F, -1.75F, 4.5F);
/*      */     
/* 2468 */     this.ammoModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F, 0.25F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, 0.25F, 0.0F, 0.5F);
/* 2469 */     this.ammoModel[3].setRotationPoint(12.0F, -1.75F, 4.5F);
/*      */     
/* 2471 */     this.ammoModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.5F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -1.0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F);
/* 2472 */     this.ammoModel[4].setRotationPoint(8.0F, -2.5F, -0.5F);
/*      */     
/* 2474 */     this.ammoModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 2475 */     this.ammoModel[5].setRotationPoint(9.15F, -7.5F, 1.5F);
/*      */     
/* 2477 */     this.ammoModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.7F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F);
/* 2478 */     this.ammoModel[6].setRotationPoint(7.8F, -7.5F, 1.5F);
/*      */     
/* 2480 */     this.ammoModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 2481 */     this.ammoModel[7].setRotationPoint(9.15F, -7.5F, 2.5F);
/*      */     
/* 2483 */     this.ammoModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.9F, -0.775F, -0.375F, 0.0F, -0.775F, -0.375F, -0.2F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.9F, -0.075F, -0.525F, 0.0F, -0.075F, -0.525F);
/* 2484 */     this.ammoModel[8].setRotationPoint(9.15F, -7.5F, 3.5F);
/*      */     
/* 2486 */     this.ammoModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.7F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, 0.0F, -0.775F, -0.375F, -0.9F, -0.775F, -0.375F, -0.7F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, 0.0F, -0.075F, -0.525F, -0.9F, -0.075F, -0.525F);
/* 2487 */     this.ammoModel[9].setRotationPoint(7.8F, -7.5F, 3.5F);
/*      */     
/* 2489 */     this.ammoModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.275F, -0.425F, -0.7F, -0.275F, -0.425F, -0.9F, -0.675F, -0.475F, 0.0F, -0.675F, -0.475F, -0.2F, -0.525F, -0.225F, -0.7F, -0.525F, -0.225F, -0.9F, -0.325F, -0.675F, 0.0F, -0.325F, -0.675F);
/* 2490 */     this.ammoModel[10].setRotationPoint(9.15F, -6.5F, 4.3F);
/*      */     
/* 2492 */     this.ammoModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.7F, -0.275F, -0.425F, -0.2F, -0.275F, -0.425F, 0.0F, -0.675F, -0.475F, -0.9F, -0.675F, -0.475F, -0.7F, -0.525F, -0.225F, -0.2F, -0.525F, -0.225F, 0.0F, -0.325F, -0.675F, -0.9F, -0.325F, -0.675F);
/* 2493 */     this.ammoModel[11].setRotationPoint(7.8F, -6.5F, 4.3F);
/*      */     
/* 2495 */     this.ammoModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.275F, -0.425F, -0.7F, -0.275F, -0.425F, -0.9F, -0.725F, -0.575F, 0.0F, -0.725F, -0.575F, -0.2F, -0.525F, -0.225F, -0.7F, -0.525F, -0.225F, -0.9F, -0.275F, -0.825F, 0.0F, -0.275F, -0.825F);
/* 2496 */     this.ammoModel[12].setRotationPoint(9.15F, -5.5F, 4.7F);
/*      */     
/* 2498 */     this.ammoModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.7F, -0.275F, -0.425F, -0.2F, -0.275F, -0.425F, 0.0F, -0.725F, -0.575F, -0.9F, -0.725F, -0.575F, -0.7F, -0.525F, -0.225F, -0.2F, -0.525F, -0.225F, 0.0F, -0.275F, -0.825F, -0.9F, -0.275F, -0.825F);
/* 2499 */     this.ammoModel[13].setRotationPoint(7.8F, -5.5F, 4.7F);
/*      */     
/* 2501 */     this.ammoModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.275F, -0.425F, -0.7F, -0.275F, -0.425F, -0.9F, -0.725F, -0.575F, 0.0F, -0.725F, -0.575F, -0.2F, -0.525F, -0.225F, -0.7F, -0.525F, -0.225F, -0.9F, -0.275F, -0.825F, 0.0F, -0.275F, -0.825F);
/* 2502 */     this.ammoModel[14].setRotationPoint(9.15F, -4.5F, 4.95F);
/*      */     
/* 2504 */     this.ammoModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.7F, -0.275F, -0.425F, -0.2F, -0.275F, -0.425F, 0.0F, -0.725F, -0.575F, -0.9F, -0.725F, -0.575F, -0.7F, -0.525F, -0.225F, -0.2F, -0.525F, -0.225F, 0.0F, -0.275F, -0.825F, -0.9F, -0.275F, -0.825F);
/* 2505 */     this.ammoModel[15].setRotationPoint(7.8F, -4.5F, 4.95F);
/*      */     
/* 2507 */     this.ammoModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.275F, -0.425F, -0.7F, -0.275F, -0.425F, -0.9F, -0.725F, -0.575F, 0.0F, -0.725F, -0.575F, -0.2F, -0.525F, -0.225F, -0.7F, -0.525F, -0.225F, -0.9F, -0.275F, -0.825F, 0.0F, -0.275F, -0.825F);
/* 2508 */     this.ammoModel[16].setRotationPoint(9.15F, -3.5F, 5.2F);
/*      */     
/* 2510 */     this.ammoModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.7F, -0.275F, -0.425F, -0.2F, -0.275F, -0.425F, 0.0F, -0.725F, -0.575F, -0.9F, -0.725F, -0.575F, -0.7F, -0.525F, -0.225F, -0.2F, -0.525F, -0.225F, 0.0F, -0.275F, -0.825F, -0.9F, -0.275F, -0.825F);
/* 2511 */     this.ammoModel[17].setRotationPoint(7.8F, -3.5F, 5.2F);
/*      */     
/* 2513 */     this.ammoModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.175F, -0.375F, -0.65F, -0.175F, -0.375F, -0.65F, -0.175F, -0.375F, -0.2F, -0.175F, -0.375F, 0.05F, -0.675F, -0.375F, -0.9F, -0.675F, -0.375F, -0.9F, -0.675F, -0.375F, 0.05F, -0.675F, -0.375F);
/* 2514 */     this.ammoModel[18].setRotationPoint(9.15F, -2.1F, 5.0F);
/*      */     
/* 2516 */     this.ammoModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.175F, -0.375F, -0.2F, -0.175F, -0.375F, -0.2F, -0.175F, -0.375F, -0.65F, -0.175F, -0.375F, -0.9F, -0.675F, -0.375F, 0.0F, -0.675F, -0.375F, 0.0F, -0.675F, -0.375F, -0.9F, -0.675F, -0.375F);
/* 2517 */     this.ammoModel[19].setRotationPoint(7.8F, -2.1F, 5.0F);
/*      */     
/* 2519 */     this.ammoModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.175F, -0.375F, -0.65F, -0.175F, -0.375F, -0.65F, -0.175F, -0.375F, -0.2F, -0.175F, -0.375F, 0.05F, -0.675F, -0.375F, -0.9F, -0.675F, -0.375F, -0.9F, -0.675F, -0.375F, 0.05F, -0.675F, -0.375F);
/* 2520 */     this.ammoModel[20].setRotationPoint(9.15F, -1.1F, 5.0F);
/*      */     
/* 2522 */     this.ammoModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.175F, -0.375F, -0.2F, -0.175F, -0.375F, -0.2F, -0.175F, -0.375F, -0.65F, -0.175F, -0.375F, -0.9F, -0.675F, -0.375F, 0.0F, -0.675F, -0.375F, 0.0F, -0.675F, -0.375F, -0.9F, -0.675F, -0.375F);
/* 2523 */     this.ammoModel[21].setRotationPoint(7.8F, -1.1F, 5.0F);
/*      */     
/* 2525 */     this.ammoModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2526 */     this.ammoModel[22].setRotationPoint(8.0F, -4.85F, 4.75F);
/*      */     
/* 2528 */     this.ammoModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 2529 */     this.ammoModel[23].setRotationPoint(8.0F, -5.1F, 4.5F);
/*      */     
/* 2531 */     this.ammoModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2532 */     this.ammoModel[24].setRotationPoint(8.0F, -4.6F, 4.5F);
/*      */     
/* 2534 */     this.ammoModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 2535 */     this.ammoModel[25].setRotationPoint(8.0F, -4.85F, 4.5F);
/*      */     
/* 2537 */     this.ammoModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2538 */     this.ammoModel[26].setRotationPoint(8.0F, -4.85F, 4.25F);
/*      */     
/* 2540 */     this.ammoModel[27].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 2541 */     this.ammoModel[27].setRotationPoint(8.0F, -4.85F, 4.25F);
/*      */     
/* 2543 */     this.ammoModel[28].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 2544 */     this.ammoModel[28].setRotationPoint(8.0F, -5.1F, 4.5F);
/*      */     
/* 2546 */     this.ammoModel[29].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 2547 */     this.ammoModel[29].setRotationPoint(8.0F, -4.6F, 4.5F);
/*      */     
/* 2549 */     this.ammoModel[30].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 2550 */     this.ammoModel[30].setRotationPoint(8.1F, -4.85F, 4.75F);
/*      */     
/* 2552 */     this.ammoModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 2553 */     this.ammoModel[31].setRotationPoint(8.1F, -4.6F, 4.5F);
/*      */     
/* 2555 */     this.ammoModel[32].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 2556 */     this.ammoModel[32].setRotationPoint(8.1F, -5.1F, 4.5F);
/*      */     
/* 2558 */     this.ammoModel[33].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 2559 */     this.ammoModel[33].setRotationPoint(9.35F, -5.1F, 4.5F);
/*      */     
/* 2561 */     this.ammoModel[34].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 2562 */     this.ammoModel[34].setRotationPoint(9.35F, -4.85F, 4.75F);
/*      */     
/* 2564 */     this.ammoModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 2565 */     this.ammoModel[35].setRotationPoint(9.35F, -4.6F, 4.5F);
/*      */     
/* 2567 */     this.ammoModel[36].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 2568 */     this.ammoModel[36].setRotationPoint(9.7F, -4.6F, 4.5F);
/*      */     
/* 2570 */     this.ammoModel[37].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 2571 */     this.ammoModel[37].setRotationPoint(9.7F, -4.85F, 4.75F);
/*      */     
/* 2573 */     this.ammoModel[38].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 2574 */     this.ammoModel[38].setRotationPoint(9.7F, -5.1F, 4.5F);
/*      */     
/* 2576 */     this.ammoModel[39].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 2577 */     this.ammoModel[39].setRotationPoint(9.95F, -5.1F, 4.5F);
/*      */     
/* 2579 */     this.ammoModel[40].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 2580 */     this.ammoModel[40].setRotationPoint(9.95F, -4.85F, 4.25F);
/*      */     
/* 2582 */     this.ammoModel[41].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 2583 */     this.ammoModel[41].setRotationPoint(9.95F, -4.6F, 4.5F);
/*      */     
/* 2585 */     this.ammoModel[42].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 2586 */     this.ammoModel[42].setRotationPoint(8.5F, -5.1F, 4.5F);
/*      */     
/* 2588 */     this.ammoModel[43].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 2589 */     this.ammoModel[43].setRotationPoint(8.5F, -4.6F, 4.5F);
/*      */     
/* 2591 */     this.ammoModel[44].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 2592 */     this.ammoModel[44].setRotationPoint(8.1F, -5.1F, 4.5F);
/*      */     
/* 2594 */     this.ammoModel[45].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 2595 */     this.ammoModel[45].setRotationPoint(8.1F, -4.6F, 4.5F);
/*      */     
/* 2597 */     this.ammoModel[46].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 2598 */     this.ammoModel[46].setRotationPoint(9.15F, -5.1F, 4.5F);
/*      */     
/* 2600 */     this.ammoModel[47].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 2601 */     this.ammoModel[47].setRotationPoint(9.15F, -4.6F, 4.5F);
/*      */     
/* 2603 */     this.ammoModel[48].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2604 */     this.ammoModel[48].setRotationPoint(8.0F, -6.9F, 4.12F);
/*      */     
/* 2606 */     this.ammoModel[49].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 2607 */     this.ammoModel[49].setRotationPoint(8.0F, -7.15F, 3.87F);
/*      */     
/* 2609 */     this.ammoModel[50].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2610 */     this.ammoModel[50].setRotationPoint(8.0F, -6.65F, 3.87F);
/*      */     
/* 2612 */     this.ammoModel[51].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 2613 */     this.ammoModel[51].setRotationPoint(8.0F, -6.9F, 3.87F);
/*      */     
/* 2615 */     this.ammoModel[52].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2616 */     this.ammoModel[52].setRotationPoint(8.0F, -6.9F, 3.62F);
/*      */     
/* 2618 */     this.ammoModel[53].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 2619 */     this.ammoModel[53].setRotationPoint(8.0F, -6.9F, 3.62F);
/*      */     
/* 2621 */     this.ammoModel[54].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 2622 */     this.ammoModel[54].setRotationPoint(8.0F, -7.15F, 3.87F);
/*      */     
/* 2624 */     this.ammoModel[55].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 2625 */     this.ammoModel[55].setRotationPoint(8.0F, -6.65F, 3.87F);
/*      */     
/* 2627 */     this.ammoModel[56].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 2628 */     this.ammoModel[56].setRotationPoint(8.1F, -6.9F, 4.12F);
/*      */     
/* 2630 */     this.ammoModel[57].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 2631 */     this.ammoModel[57].setRotationPoint(8.1F, -6.65F, 3.87F);
/*      */     
/* 2633 */     this.ammoModel[58].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 2634 */     this.ammoModel[58].setRotationPoint(8.1F, -7.15F, 3.87F);
/*      */     
/* 2636 */     this.ammoModel[59].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 2637 */     this.ammoModel[59].setRotationPoint(9.35F, -7.15F, 3.87F);
/*      */     
/* 2639 */     this.ammoModel[60].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 2640 */     this.ammoModel[60].setRotationPoint(9.35F, -6.9F, 4.12F);
/*      */     
/* 2642 */     this.ammoModel[61].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 2643 */     this.ammoModel[61].setRotationPoint(9.35F, -6.65F, 3.87F);
/*      */     
/* 2645 */     this.ammoModel[62].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 2646 */     this.ammoModel[62].setRotationPoint(9.7F, -6.65F, 3.87F);
/*      */     
/* 2648 */     this.ammoModel[63].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 2649 */     this.ammoModel[63].setRotationPoint(9.7F, -6.9F, 4.12F);
/*      */     
/* 2651 */     this.ammoModel[64].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 2652 */     this.ammoModel[64].setRotationPoint(9.7F, -7.15F, 3.87F);
/*      */     
/* 2654 */     this.ammoModel[65].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 2655 */     this.ammoModel[65].setRotationPoint(9.95F, -7.15F, 3.87F);
/*      */     
/* 2657 */     this.ammoModel[66].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 2658 */     this.ammoModel[66].setRotationPoint(9.95F, -6.9F, 3.62F);
/*      */     
/* 2660 */     this.ammoModel[67].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 2661 */     this.ammoModel[67].setRotationPoint(9.95F, -6.65F, 3.87F);
/*      */     
/* 2663 */     this.ammoModel[68].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 2664 */     this.ammoModel[68].setRotationPoint(8.5F, -6.9F, 4.12F);
/*      */     
/* 2666 */     this.ammoModel[69].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 2667 */     this.ammoModel[69].setRotationPoint(8.5F, -7.15F, 3.87F);
/*      */     
/* 2669 */     this.ammoModel[70].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 2670 */     this.ammoModel[70].setRotationPoint(8.5F, -6.65F, 3.87F);
/*      */     
/* 2672 */     this.ammoModel[71].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 2673 */     this.ammoModel[71].setRotationPoint(8.1F, -6.9F, 4.12F);
/*      */     
/* 2675 */     this.ammoModel[72].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 2676 */     this.ammoModel[72].setRotationPoint(8.1F, -7.15F, 3.87F);
/*      */     
/* 2678 */     this.ammoModel[73].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 2679 */     this.ammoModel[73].setRotationPoint(8.1F, -6.65F, 3.87F);
/*      */     
/* 2681 */     this.ammoModel[74].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 2682 */     this.ammoModel[74].setRotationPoint(9.15F, -6.9F, 4.12F);
/*      */     
/* 2684 */     this.ammoModel[75].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 2685 */     this.ammoModel[75].setRotationPoint(9.15F, -7.15F, 3.87F);
/*      */     
/* 2687 */     this.ammoModel[76].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 2688 */     this.ammoModel[76].setRotationPoint(9.15F, -6.65F, 3.87F);
/*      */     
/* 2690 */     this.ammoModel[77].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2691 */     this.ammoModel[77].setRotationPoint(8.0F, -5.9F, 4.5F);
/*      */     
/* 2693 */     this.ammoModel[78].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 2694 */     this.ammoModel[78].setRotationPoint(8.0F, -6.15F, 4.25F);
/*      */     
/* 2696 */     this.ammoModel[79].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2697 */     this.ammoModel[79].setRotationPoint(8.0F, -5.65F, 4.25F);
/*      */     
/* 2699 */     this.ammoModel[80].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 2700 */     this.ammoModel[80].setRotationPoint(8.0F, -5.9F, 4.25F);
/*      */     
/* 2702 */     this.ammoModel[81].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2703 */     this.ammoModel[81].setRotationPoint(8.0F, -5.9F, 4.0F);
/*      */     
/* 2705 */     this.ammoModel[82].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 2706 */     this.ammoModel[82].setRotationPoint(8.0F, -5.9F, 4.0F);
/*      */     
/* 2708 */     this.ammoModel[83].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 2709 */     this.ammoModel[83].setRotationPoint(8.0F, -6.15F, 4.25F);
/*      */     
/* 2711 */     this.ammoModel[84].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 2712 */     this.ammoModel[84].setRotationPoint(8.0F, -5.65F, 4.25F);
/*      */     
/* 2714 */     this.ammoModel[85].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 2715 */     this.ammoModel[85].setRotationPoint(8.1F, -5.9F, 4.5F);
/*      */     
/* 2717 */     this.ammoModel[86].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 2718 */     this.ammoModel[86].setRotationPoint(8.1F, -5.65F, 4.25F);
/*      */     
/* 2720 */     this.ammoModel[87].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 2721 */     this.ammoModel[87].setRotationPoint(8.1F, -6.15F, 4.25F);
/*      */     
/* 2723 */     this.ammoModel[88].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 2724 */     this.ammoModel[88].setRotationPoint(9.35F, -6.15F, 4.25F);
/*      */     
/* 2726 */     this.ammoModel[89].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 2727 */     this.ammoModel[89].setRotationPoint(9.35F, -5.9F, 4.5F);
/*      */     
/* 2729 */     this.ammoModel[90].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 2730 */     this.ammoModel[90].setRotationPoint(9.35F, -5.65F, 4.25F);
/*      */     
/* 2732 */     this.ammoModel[91].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 2733 */     this.ammoModel[91].setRotationPoint(9.7F, -5.65F, 4.25F);
/*      */     
/* 2735 */     this.ammoModel[92].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 2736 */     this.ammoModel[92].setRotationPoint(9.7F, -5.9F, 4.5F);
/*      */     
/* 2738 */     this.ammoModel[93].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 2739 */     this.ammoModel[93].setRotationPoint(9.7F, -6.15F, 4.25F);
/*      */     
/* 2741 */     this.ammoModel[94].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 2742 */     this.ammoModel[94].setRotationPoint(9.95F, -6.15F, 4.25F);
/*      */     
/* 2744 */     this.ammoModel[95].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 2745 */     this.ammoModel[95].setRotationPoint(9.95F, -5.9F, 4.0F);
/*      */     
/* 2747 */     this.ammoModel[96].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 2748 */     this.ammoModel[96].setRotationPoint(9.95F, -5.65F, 4.25F);
/*      */     
/* 2750 */     this.ammoModel[97].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 2751 */     this.ammoModel[97].setRotationPoint(8.5F, -6.15F, 4.25F);
/*      */     
/* 2753 */     this.ammoModel[98].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 2754 */     this.ammoModel[98].setRotationPoint(8.5F, -5.65F, 4.25F);
/*      */     
/* 2756 */     this.ammoModel[99].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 2757 */     this.ammoModel[99].setRotationPoint(8.1F, -6.15F, 4.25F);
/*      */     
/* 2759 */     this.ammoModel[100].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 2760 */     this.ammoModel[100].setRotationPoint(8.1F, -5.65F, 4.25F);
/*      */     
/* 2762 */     this.ammoModel[101].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 2763 */     this.ammoModel[101].setRotationPoint(9.15F, -6.15F, 4.25F);
/*      */     
/* 2765 */     this.ammoModel[102].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 2766 */     this.ammoModel[102].setRotationPoint(9.15F, -5.65F, 4.25F);
/*      */     
/* 2768 */     this.ammoModel[103].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 2769 */     this.ammoModel[103].setRotationPoint(8.5F, -5.9F, 4.5F);
/*      */     
/* 2771 */     this.ammoModel[104].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 2772 */     this.ammoModel[104].setRotationPoint(8.1F, -5.9F, 4.5F);
/*      */     
/* 2774 */     this.ammoModel[105].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 2775 */     this.ammoModel[105].setRotationPoint(9.15F, -5.9F, 4.5F);
/*      */     
/* 2777 */     this.ammoModel[106].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 2778 */     this.ammoModel[106].setRotationPoint(8.5F, -4.85F, 4.75F);
/*      */     
/* 2780 */     this.ammoModel[107].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 2781 */     this.ammoModel[107].setRotationPoint(8.1F, -4.85F, 4.75F);
/*      */     
/* 2783 */     this.ammoModel[108].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 2784 */     this.ammoModel[108].setRotationPoint(9.15F, -4.85F, 4.75F);
/*      */     
/* 2786 */     this.ammoModel[109].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2787 */     this.ammoModel[109].setRotationPoint(8.0F, -7.5F, 3.25F);
/*      */     
/* 2789 */     this.ammoModel[110].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 2790 */     this.ammoModel[110].setRotationPoint(8.0F, -7.75F, 3.0F);
/*      */     
/* 2792 */     this.ammoModel[111].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2793 */     this.ammoModel[111].setRotationPoint(8.0F, -7.25F, 3.0F);
/*      */     
/* 2795 */     this.ammoModel[112].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 2796 */     this.ammoModel[112].setRotationPoint(8.0F, -7.5F, 3.0F);
/*      */     
/* 2798 */     this.ammoModel[113].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2799 */     this.ammoModel[113].setRotationPoint(8.0F, -7.5F, 2.75F);
/*      */     
/* 2801 */     this.ammoModel[114].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 2802 */     this.ammoModel[114].setRotationPoint(8.0F, -7.5F, 2.75F);
/*      */     
/* 2804 */     this.ammoModel[115].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 2805 */     this.ammoModel[115].setRotationPoint(8.0F, -7.75F, 3.0F);
/*      */     
/* 2807 */     this.ammoModel[116].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 2808 */     this.ammoModel[116].setRotationPoint(8.0F, -7.25F, 3.0F);
/*      */     
/* 2810 */     this.ammoModel[117].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 2811 */     this.ammoModel[117].setRotationPoint(8.1F, -7.5F, 3.25F);
/*      */     
/* 2813 */     this.ammoModel[118].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 2814 */     this.ammoModel[118].setRotationPoint(8.1F, -7.25F, 3.0F);
/*      */     
/* 2816 */     this.ammoModel[119].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 2817 */     this.ammoModel[119].setRotationPoint(8.1F, -7.75F, 3.0F);
/*      */     
/* 2819 */     this.ammoModel[120].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 2820 */     this.ammoModel[120].setRotationPoint(9.35F, -7.75F, 3.0F);
/*      */     
/* 2822 */     this.ammoModel[121].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 2823 */     this.ammoModel[121].setRotationPoint(9.35F, -7.5F, 3.25F);
/*      */     
/* 2825 */     this.ammoModel[122].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 2826 */     this.ammoModel[122].setRotationPoint(9.35F, -7.25F, 3.0F);
/*      */     
/* 2828 */     this.ammoModel[123].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 2829 */     this.ammoModel[123].setRotationPoint(9.7F, -7.25F, 3.0F);
/*      */     
/* 2831 */     this.ammoModel[124].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 2832 */     this.ammoModel[124].setRotationPoint(9.7F, -7.5F, 3.25F);
/*      */     
/* 2834 */     this.ammoModel[125].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 2835 */     this.ammoModel[125].setRotationPoint(9.7F, -7.75F, 3.0F);
/*      */     
/* 2837 */     this.ammoModel[126].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 2838 */     this.ammoModel[126].setRotationPoint(9.95F, -7.75F, 3.0F);
/*      */     
/* 2840 */     this.ammoModel[127].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 2841 */     this.ammoModel[127].setRotationPoint(9.95F, -7.5F, 2.75F);
/*      */     
/* 2843 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 2844 */     this.ammoModel[''].setRotationPoint(9.95F, -7.25F, 3.0F);
/*      */     
/* 2846 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 2847 */     this.ammoModel[''].setRotationPoint(8.5F, -7.5F, 3.25F);
/*      */     
/* 2849 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 2850 */     this.ammoModel[''].setRotationPoint(8.5F, -7.75F, 3.0F);
/*      */     
/* 2852 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 2853 */     this.ammoModel[''].setRotationPoint(8.5F, -7.25F, 3.0F);
/*      */     
/* 2855 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 2856 */     this.ammoModel[''].setRotationPoint(8.1F, -7.5F, 3.25F);
/*      */     
/* 2858 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 2859 */     this.ammoModel[''].setRotationPoint(8.1F, -7.75F, 3.0F);
/*      */     
/* 2861 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 2862 */     this.ammoModel[''].setRotationPoint(8.1F, -7.25F, 3.0F);
/*      */     
/* 2864 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 2865 */     this.ammoModel[''].setRotationPoint(9.15F, -7.5F, 3.25F);
/*      */     
/* 2867 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 2868 */     this.ammoModel[''].setRotationPoint(9.15F, -7.75F, 3.0F);
/*      */     
/* 2870 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 2871 */     this.ammoModel[''].setRotationPoint(9.15F, -7.25F, 3.0F);
/*      */     
/* 2873 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2874 */     this.ammoModel[''].setRotationPoint(8.0F, -7.5F, 2.25F);
/*      */     
/* 2876 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 2877 */     this.ammoModel[''].setRotationPoint(8.0F, -7.75F, 2.0F);
/*      */     
/* 2879 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2880 */     this.ammoModel[''].setRotationPoint(8.0F, -7.25F, 2.0F);
/*      */     
/* 2882 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 2883 */     this.ammoModel[''].setRotationPoint(8.0F, -7.5F, 2.0F);
/*      */     
/* 2885 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2886 */     this.ammoModel[''].setRotationPoint(8.0F, -7.5F, 1.75F);
/*      */     
/* 2888 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 2889 */     this.ammoModel[''].setRotationPoint(8.0F, -7.5F, 1.75F);
/*      */     
/* 2891 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 2892 */     this.ammoModel[''].setRotationPoint(8.0F, -7.75F, 2.0F);
/*      */     
/* 2894 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 2895 */     this.ammoModel[''].setRotationPoint(8.0F, -7.25F, 2.0F);
/*      */     
/* 2897 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 2898 */     this.ammoModel[''].setRotationPoint(8.1F, -7.5F, 2.25F);
/*      */     
/* 2900 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 2901 */     this.ammoModel[''].setRotationPoint(8.1F, -7.25F, 2.0F);
/*      */     
/* 2903 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 2904 */     this.ammoModel[''].setRotationPoint(8.1F, -7.75F, 2.0F);
/*      */     
/* 2906 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 2907 */     this.ammoModel[''].setRotationPoint(9.35F, -7.75F, 2.0F);
/*      */     
/* 2909 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 2910 */     this.ammoModel[''].setRotationPoint(9.35F, -7.5F, 2.25F);
/*      */     
/* 2912 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 2913 */     this.ammoModel[''].setRotationPoint(9.35F, -7.25F, 2.0F);
/*      */     
/* 2915 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 2916 */     this.ammoModel[''].setRotationPoint(9.7F, -7.25F, 2.0F);
/*      */     
/* 2918 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 2919 */     this.ammoModel[''].setRotationPoint(9.7F, -7.5F, 2.25F);
/*      */     
/* 2921 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 2922 */     this.ammoModel[''].setRotationPoint(9.7F, -7.75F, 2.0F);
/*      */     
/* 2924 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 2925 */     this.ammoModel[''].setRotationPoint(9.95F, -7.75F, 2.0F);
/*      */     
/* 2927 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 2928 */     this.ammoModel[''].setRotationPoint(9.95F, -7.5F, 1.75F);
/*      */     
/* 2930 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 2931 */     this.ammoModel[''].setRotationPoint(9.95F, -7.25F, 2.0F);
/*      */     
/* 2933 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 2934 */     this.ammoModel[''].setRotationPoint(8.5F, -7.5F, 2.25F);
/*      */     
/* 2936 */     this.ammoModel[''].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 2937 */     this.ammoModel[''].setRotationPoint(8.5F, -7.75F, 2.0F);
/*      */     
/* 2939 */     this.ammoModel[' '].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 2940 */     this.ammoModel[' '].setRotationPoint(8.5F, -7.25F, 2.0F);
/*      */     
/* 2942 */     this.ammoModel['¡'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 2943 */     this.ammoModel['¡'].setRotationPoint(8.1F, -7.5F, 2.25F);
/*      */     
/* 2945 */     this.ammoModel['¢'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 2946 */     this.ammoModel['¢'].setRotationPoint(8.1F, -7.75F, 2.0F);
/*      */     
/* 2948 */     this.ammoModel['£'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 2949 */     this.ammoModel['£'].setRotationPoint(8.1F, -7.25F, 2.0F);
/*      */     
/* 2951 */     this.ammoModel['¤'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 2952 */     this.ammoModel['¤'].setRotationPoint(9.15F, -7.5F, 2.25F);
/*      */     
/* 2954 */     this.ammoModel['¥'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 2955 */     this.ammoModel['¥'].setRotationPoint(9.15F, -7.75F, 2.0F);
/*      */     
/* 2957 */     this.ammoModel['¦'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 2958 */     this.ammoModel['¦'].setRotationPoint(9.15F, -7.25F, 2.0F);
/*      */     
/* 2960 */     this.ammoModel['§'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2961 */     this.ammoModel['§'].setRotationPoint(8.0F, -7.5F, 1.25F);
/*      */     
/* 2963 */     this.ammoModel['¨'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 2964 */     this.ammoModel['¨'].setRotationPoint(8.0F, -7.75F, 1.0F);
/*      */     
/* 2966 */     this.ammoModel['©'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2967 */     this.ammoModel['©'].setRotationPoint(8.0F, -7.25F, 1.0F);
/*      */     
/* 2969 */     this.ammoModel['ª'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 2970 */     this.ammoModel['ª'].setRotationPoint(8.0F, -7.5F, 1.0F);
/*      */     
/* 2972 */     this.ammoModel['«'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 2973 */     this.ammoModel['«'].setRotationPoint(8.0F, -7.5F, 0.75F);
/*      */     
/* 2975 */     this.ammoModel['¬'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 2976 */     this.ammoModel['¬'].setRotationPoint(8.0F, -7.5F, 0.75F);
/*      */     
/* 2978 */     this.ammoModel['­'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 2979 */     this.ammoModel['­'].setRotationPoint(8.0F, -7.75F, 1.0F);
/*      */     
/* 2981 */     this.ammoModel['®'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 2982 */     this.ammoModel['®'].setRotationPoint(8.0F, -7.25F, 1.0F);
/*      */     
/* 2984 */     this.ammoModel['¯'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 2985 */     this.ammoModel['¯'].setRotationPoint(8.1F, -7.5F, 1.25F);
/*      */     
/* 2987 */     this.ammoModel['°'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 2988 */     this.ammoModel['°'].setRotationPoint(8.1F, -7.25F, 1.0F);
/*      */     
/* 2990 */     this.ammoModel['±'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 2991 */     this.ammoModel['±'].setRotationPoint(8.1F, -7.75F, 1.0F);
/*      */     
/* 2993 */     this.ammoModel['²'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 2994 */     this.ammoModel['²'].setRotationPoint(9.35F, -7.75F, 1.0F);
/*      */     
/* 2996 */     this.ammoModel['³'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 2997 */     this.ammoModel['³'].setRotationPoint(9.35F, -7.5F, 1.25F);
/*      */     
/* 2999 */     this.ammoModel['´'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 3000 */     this.ammoModel['´'].setRotationPoint(9.35F, -7.25F, 1.0F);
/*      */     
/* 3002 */     this.ammoModel['µ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 3003 */     this.ammoModel['µ'].setRotationPoint(9.7F, -7.25F, 1.0F);
/*      */     
/* 3005 */     this.ammoModel['¶'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 3006 */     this.ammoModel['¶'].setRotationPoint(9.7F, -7.5F, 1.25F);
/*      */     
/* 3008 */     this.ammoModel['·'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 3009 */     this.ammoModel['·'].setRotationPoint(9.7F, -7.75F, 1.0F);
/*      */     
/* 3011 */     this.ammoModel['¸'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 3012 */     this.ammoModel['¸'].setRotationPoint(9.95F, -7.75F, 1.0F);
/*      */     
/* 3014 */     this.ammoModel['¹'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 3015 */     this.ammoModel['¹'].setRotationPoint(9.95F, -7.5F, 0.75F);
/*      */     
/* 3017 */     this.ammoModel['º'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 3018 */     this.ammoModel['º'].setRotationPoint(9.95F, -7.25F, 1.0F);
/*      */     
/* 3020 */     this.ammoModel['»'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3021 */     this.ammoModel['»'].setRotationPoint(8.5F, -7.5F, 1.25F);
/*      */     
/* 3023 */     this.ammoModel['¼'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3024 */     this.ammoModel['¼'].setRotationPoint(8.5F, -7.75F, 1.0F);
/*      */     
/* 3026 */     this.ammoModel['½'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3027 */     this.ammoModel['½'].setRotationPoint(8.5F, -7.25F, 1.0F);
/*      */     
/* 3029 */     this.ammoModel['¾'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 3030 */     this.ammoModel['¾'].setRotationPoint(8.1F, -7.5F, 1.25F);
/*      */     
/* 3032 */     this.ammoModel['¿'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 3033 */     this.ammoModel['¿'].setRotationPoint(8.1F, -7.75F, 1.0F);
/*      */     
/* 3035 */     this.ammoModel['À'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 3036 */     this.ammoModel['À'].setRotationPoint(8.1F, -7.25F, 1.0F);
/*      */     
/* 3038 */     this.ammoModel['Á'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3039 */     this.ammoModel['Á'].setRotationPoint(9.15F, -7.5F, 1.25F);
/*      */     
/* 3041 */     this.ammoModel['Â'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3042 */     this.ammoModel['Â'].setRotationPoint(9.15F, -7.75F, 1.0F);
/*      */     
/* 3044 */     this.ammoModel['Ã'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3045 */     this.ammoModel['Ã'].setRotationPoint(9.15F, -7.25F, 1.0F);
/*      */     
/* 3047 */     this.ammoModel['Ä'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.7F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F, -0.7F, -0.375F, -0.425F, -0.2F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, -0.9F, -0.375F, -0.425F);
/* 3048 */     this.ammoModel['Ä'].setRotationPoint(7.8F, -7.5F, 2.5F);
/*      */     
/* 3050 */     this.ammoModel['Å'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3051 */     this.ammoModel['Å'].setRotationPoint(8.0F, -3.85F, 5.0F);
/*      */     
/* 3053 */     this.ammoModel['Æ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 3054 */     this.ammoModel['Æ'].setRotationPoint(8.0F, -4.1F, 4.75F);
/*      */     
/* 3056 */     this.ammoModel['Ç'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3057 */     this.ammoModel['Ç'].setRotationPoint(8.0F, -3.6F, 4.75F);
/*      */     
/* 3059 */     this.ammoModel['È'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 3060 */     this.ammoModel['È'].setRotationPoint(8.0F, -3.85F, 4.75F);
/*      */     
/* 3062 */     this.ammoModel['É'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3063 */     this.ammoModel['É'].setRotationPoint(8.0F, -3.85F, 4.5F);
/*      */     
/* 3065 */     this.ammoModel['Ê'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 3066 */     this.ammoModel['Ê'].setRotationPoint(8.0F, -3.85F, 4.5F);
/*      */     
/* 3068 */     this.ammoModel['Ë'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 3069 */     this.ammoModel['Ë'].setRotationPoint(8.0F, -4.1F, 4.75F);
/*      */     
/* 3071 */     this.ammoModel['Ì'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 3072 */     this.ammoModel['Ì'].setRotationPoint(8.0F, -3.6F, 4.75F);
/*      */     
/* 3074 */     this.ammoModel['Í'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 3075 */     this.ammoModel['Í'].setRotationPoint(8.1F, -3.85F, 5.0F);
/*      */     
/* 3077 */     this.ammoModel['Î'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 3078 */     this.ammoModel['Î'].setRotationPoint(8.1F, -3.6F, 4.75F);
/*      */     
/* 3080 */     this.ammoModel['Ï'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 3081 */     this.ammoModel['Ï'].setRotationPoint(8.1F, -4.1F, 4.75F);
/*      */     
/* 3083 */     this.ammoModel['Ð'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 3084 */     this.ammoModel['Ð'].setRotationPoint(9.35F, -4.1F, 4.75F);
/*      */     
/* 3086 */     this.ammoModel['Ñ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 3087 */     this.ammoModel['Ñ'].setRotationPoint(9.35F, -3.85F, 5.0F);
/*      */     
/* 3089 */     this.ammoModel['Ò'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 3090 */     this.ammoModel['Ò'].setRotationPoint(9.35F, -3.6F, 4.75F);
/*      */     
/* 3092 */     this.ammoModel['Ó'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 3093 */     this.ammoModel['Ó'].setRotationPoint(9.7F, -3.6F, 4.75F);
/*      */     
/* 3095 */     this.ammoModel['Ô'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 3096 */     this.ammoModel['Ô'].setRotationPoint(9.7F, -3.85F, 5.0F);
/*      */     
/* 3098 */     this.ammoModel['Õ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 3099 */     this.ammoModel['Õ'].setRotationPoint(9.7F, -4.1F, 4.75F);
/*      */     
/* 3101 */     this.ammoModel['Ö'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 3102 */     this.ammoModel['Ö'].setRotationPoint(9.95F, -4.1F, 4.75F);
/*      */     
/* 3104 */     this.ammoModel['×'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 3105 */     this.ammoModel['×'].setRotationPoint(9.95F, -3.85F, 4.5F);
/*      */     
/* 3107 */     this.ammoModel['Ø'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 3108 */     this.ammoModel['Ø'].setRotationPoint(9.95F, -3.6F, 4.75F);
/*      */     
/* 3110 */     this.ammoModel['Ù'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3111 */     this.ammoModel['Ù'].setRotationPoint(8.5F, -4.1F, 4.75F);
/*      */     
/* 3113 */     this.ammoModel['Ú'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3114 */     this.ammoModel['Ú'].setRotationPoint(8.5F, -3.6F, 4.75F);
/*      */     
/* 3116 */     this.ammoModel['Û'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 3117 */     this.ammoModel['Û'].setRotationPoint(8.1F, -4.1F, 4.75F);
/*      */     
/* 3119 */     this.ammoModel['Ü'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 3120 */     this.ammoModel['Ü'].setRotationPoint(8.1F, -3.6F, 4.75F);
/*      */     
/* 3122 */     this.ammoModel['Ý'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3123 */     this.ammoModel['Ý'].setRotationPoint(9.15F, -4.1F, 4.75F);
/*      */     
/* 3125 */     this.ammoModel['Þ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3126 */     this.ammoModel['Þ'].setRotationPoint(9.15F, -3.6F, 4.75F);
/*      */     
/* 3128 */     this.ammoModel['ß'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3129 */     this.ammoModel['ß'].setRotationPoint(8.5F, -3.85F, 5.0F);
/*      */     
/* 3131 */     this.ammoModel['à'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 3132 */     this.ammoModel['à'].setRotationPoint(8.1F, -3.85F, 5.0F);
/*      */     
/* 3134 */     this.ammoModel['á'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3135 */     this.ammoModel['á'].setRotationPoint(9.15F, -3.85F, 5.0F);
/*      */     
/* 3137 */     this.ammoModel['â'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3138 */     this.ammoModel['â'].setRotationPoint(8.0F, -2.85F, 5.25F);
/*      */     
/* 3140 */     this.ammoModel['ã'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 3141 */     this.ammoModel['ã'].setRotationPoint(8.0F, -3.1F, 5.0F);
/*      */     
/* 3143 */     this.ammoModel['ä'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3144 */     this.ammoModel['ä'].setRotationPoint(8.0F, -2.6F, 5.0F);
/*      */     
/* 3146 */     this.ammoModel['å'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 3147 */     this.ammoModel['å'].setRotationPoint(8.0F, -2.85F, 5.0F);
/*      */     
/* 3149 */     this.ammoModel['æ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3150 */     this.ammoModel['æ'].setRotationPoint(8.0F, -2.85F, 4.75F);
/*      */     
/* 3152 */     this.ammoModel['ç'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 3153 */     this.ammoModel['ç'].setRotationPoint(8.0F, -2.85F, 4.75F);
/*      */     
/* 3155 */     this.ammoModel['è'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 3156 */     this.ammoModel['è'].setRotationPoint(8.0F, -3.1F, 5.0F);
/*      */     
/* 3158 */     this.ammoModel['é'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 3159 */     this.ammoModel['é'].setRotationPoint(8.0F, -2.6F, 5.0F);
/*      */     
/* 3161 */     this.ammoModel['ê'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 3162 */     this.ammoModel['ê'].setRotationPoint(8.1F, -2.85F, 5.25F);
/*      */     
/* 3164 */     this.ammoModel['ë'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 3165 */     this.ammoModel['ë'].setRotationPoint(8.1F, -2.6F, 5.0F);
/*      */     
/* 3167 */     this.ammoModel['ì'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 3168 */     this.ammoModel['ì'].setRotationPoint(8.1F, -3.1F, 5.0F);
/*      */     
/* 3170 */     this.ammoModel['í'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 3171 */     this.ammoModel['í'].setRotationPoint(9.35F, -3.1F, 5.0F);
/*      */     
/* 3173 */     this.ammoModel['î'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 3174 */     this.ammoModel['î'].setRotationPoint(9.35F, -2.85F, 5.25F);
/*      */     
/* 3176 */     this.ammoModel['ï'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 3177 */     this.ammoModel['ï'].setRotationPoint(9.35F, -2.6F, 5.0F);
/*      */     
/* 3179 */     this.ammoModel['ð'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 3180 */     this.ammoModel['ð'].setRotationPoint(9.7F, -2.6F, 5.0F);
/*      */     
/* 3182 */     this.ammoModel['ñ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 3183 */     this.ammoModel['ñ'].setRotationPoint(9.7F, -2.85F, 5.25F);
/*      */     
/* 3185 */     this.ammoModel['ò'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 3186 */     this.ammoModel['ò'].setRotationPoint(9.7F, -3.1F, 5.0F);
/*      */     
/* 3188 */     this.ammoModel['ó'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 3189 */     this.ammoModel['ó'].setRotationPoint(9.95F, -3.1F, 5.0F);
/*      */     
/* 3191 */     this.ammoModel['ô'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 3192 */     this.ammoModel['ô'].setRotationPoint(9.95F, -2.85F, 4.75F);
/*      */     
/* 3194 */     this.ammoModel['õ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 3195 */     this.ammoModel['õ'].setRotationPoint(9.95F, -2.6F, 5.0F);
/*      */     
/* 3197 */     this.ammoModel['ö'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3198 */     this.ammoModel['ö'].setRotationPoint(8.5F, -3.1F, 5.0F);
/*      */     
/* 3200 */     this.ammoModel['÷'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3201 */     this.ammoModel['÷'].setRotationPoint(8.5F, -2.6F, 5.0F);
/*      */     
/* 3203 */     this.ammoModel['ø'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 3204 */     this.ammoModel['ø'].setRotationPoint(8.1F, -3.1F, 5.0F);
/*      */     
/* 3206 */     this.ammoModel['ù'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 3207 */     this.ammoModel['ù'].setRotationPoint(8.1F, -2.6F, 5.0F);
/*      */     
/* 3209 */     this.ammoModel['ú'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3210 */     this.ammoModel['ú'].setRotationPoint(9.15F, -3.1F, 5.0F);
/*      */     
/* 3212 */     this.ammoModel['û'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3213 */     this.ammoModel['û'].setRotationPoint(9.15F, -2.6F, 5.0F);
/*      */     
/* 3215 */     this.ammoModel['ü'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3216 */     this.ammoModel['ü'].setRotationPoint(8.5F, -2.85F, 5.25F);
/*      */     
/* 3218 */     this.ammoModel['ý'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 3219 */     this.ammoModel['ý'].setRotationPoint(8.1F, -2.85F, 5.25F);
/*      */     
/* 3221 */     this.ammoModel['þ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3222 */     this.ammoModel['þ'].setRotationPoint(9.15F, -2.85F, 5.25F);
/*      */     
/* 3224 */     this.ammoModel['ÿ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3225 */     this.ammoModel['ÿ'].setRotationPoint(8.0F, -1.85F, 5.25F);
/*      */     
/* 3227 */     this.ammoModel['Ā'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F);
/* 3228 */     this.ammoModel['Ā'].setRotationPoint(8.0F, -2.1F, 5.0F);
/*      */     
/* 3230 */     this.ammoModel['ā'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, -0.9F, -0.375F, -0.125F, 0.0F, -0.375F, -0.125F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3231 */     this.ammoModel['ā'].setRotationPoint(8.0F, -1.6F, 5.0F);
/*      */     
/* 3233 */     this.ammoModel['Ă'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, -0.9F, -0.395F, -0.395F, 0.0F, -0.395F, -0.395F);
/* 3234 */     this.ammoModel['Ă'].setRotationPoint(8.0F, -1.85F, 5.0F);
/*      */     
/* 3236 */     this.ammoModel['ă'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, -0.9F, -0.375F, -0.375F, 0.0F, -0.375F, -0.375F);
/* 3237 */     this.ammoModel['ă'].setRotationPoint(8.0F, -1.85F, 4.75F);
/*      */     
/* 3239 */     this.ammoModel['Ą'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, 0.125F, -0.2F, -0.375F, 0.125F);
/* 3240 */     this.ammoModel['Ą'].setRotationPoint(8.0F, -1.85F, 4.75F);
/*      */     
/* 3242 */     this.ammoModel['ą'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F);
/* 3243 */     this.ammoModel['ą'].setRotationPoint(8.0F, -2.1F, 5.0F);
/*      */     
/* 3245 */     this.ammoModel['Ć'].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.2F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, 0.1F, -0.375F, -0.125F, -0.2F, -0.375F, -0.125F, -0.2F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, 0.1F, -0.375F, -0.375F, -0.2F, -0.375F, -0.375F);
/* 3246 */     this.ammoModel['Ć'].setRotationPoint(8.0F, -1.6F, 5.0F);
/*      */     
/* 3248 */     this.ammoModel['ć'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F, 0.0F, -0.375F, 0.075F, -0.9F, -0.375F, 0.075F, -0.9F, -0.375F, -0.425F, 0.0F, -0.375F, -0.425F);
/* 3249 */     this.ammoModel['ć'].setRotationPoint(8.1F, -1.85F, 5.25F);
/*      */     
/* 3251 */     this.ammoModel['Ĉ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F);
/* 3252 */     this.ammoModel['Ĉ'].setRotationPoint(8.1F, -1.6F, 5.0F);
/*      */     
/* 3254 */     this.ammoModel['ĉ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, -0.9F, -0.425F, -0.375F, 0.0F, -0.425F, -0.375F, 0.0F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, -0.9F, -0.375F, -0.175F, 0.0F, -0.375F, -0.175F);
/* 3255 */     this.ammoModel['ĉ'].setRotationPoint(8.1F, -2.1F, 5.0F);
/*      */     
/* 3257 */     this.ammoModel['Ċ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F);
/* 3258 */     this.ammoModel['Ċ'].setRotationPoint(9.35F, -2.1F, 5.0F);
/*      */     
/* 3260 */     this.ammoModel['ċ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F, -0.75F, -0.375F, 0.125F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.75F, -0.375F, -0.375F);
/* 3261 */     this.ammoModel['ċ'].setRotationPoint(9.35F, -1.85F, 5.25F);
/*      */     
/* 3263 */     this.ammoModel['Č'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.125F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.75F, -0.375F, -0.125F, -0.75F, -0.375F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.75F, -0.375F, -0.375F);
/* 3264 */     this.ammoModel['Č'].setRotationPoint(9.35F, -1.6F, 5.0F);
/*      */     
/* 3266 */     this.ammoModel['č'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F);
/* 3267 */     this.ammoModel['č'].setRotationPoint(9.7F, -1.6F, 5.0F);
/*      */     
/* 3269 */     this.ammoModel['Ď'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F, -0.65F, -0.375F, 0.0F, 0.0F, -0.375F, 0.0F, 0.0F, -0.375F, -0.5F, -0.65F, -0.375F, -0.5F);
/* 3270 */     this.ammoModel['Ď'].setRotationPoint(9.7F, -1.85F, 5.25F);
/*      */     
/* 3272 */     this.ammoModel['ď'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.65F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, 0.0F, -0.5F, -0.375F, -0.65F, -0.5F, -0.375F, -0.65F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, 0.0F, -0.375F, -0.25F, -0.65F, -0.375F, -0.25F);
/* 3273 */     this.ammoModel['ď'].setRotationPoint(9.7F, -2.1F, 5.0F);
/*      */     
/* 3275 */     this.ammoModel['Đ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F);
/* 3276 */     this.ammoModel['Đ'].setRotationPoint(9.95F, -2.1F, 5.0F);
/*      */     
/* 3278 */     this.ammoModel['đ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F, -0.75F, -0.375F, -0.5F, 0.5F, -0.5F, -0.75F, 0.5F, -0.5F, -0.25F, -0.75F, -0.375F, 0.0F);
/* 3279 */     this.ammoModel['đ'].setRotationPoint(9.95F, -1.85F, 4.75F);
/*      */     
/* 3281 */     this.ammoModel['Ē'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.75F, -0.375F, -0.25F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, -0.75F, -0.375F, -0.25F, -0.75F, -0.5F, -0.375F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F);
/* 3282 */     this.ammoModel['Ē'].setRotationPoint(9.95F, -1.6F, 5.0F);
/*      */     
/* 3284 */     this.ammoModel['ē'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3285 */     this.ammoModel['ē'].setRotationPoint(8.5F, -2.1F, 5.0F);
/*      */     
/* 3287 */     this.ammoModel['Ĕ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3288 */     this.ammoModel['Ĕ'].setRotationPoint(8.5F, -1.6F, 5.0F);
/*      */     
/* 3290 */     this.ammoModel['ĕ'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F);
/* 3291 */     this.ammoModel['ĕ'].setRotationPoint(8.1F, -2.1F, 5.0F);
/*      */     
/* 3293 */     this.ammoModel['Ė'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.5F, -0.375F, -0.075F, -0.25F, -0.375F, -0.075F, -0.25F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.5F, -0.325F, -0.375F, -0.25F, -0.325F, -0.375F);
/* 3294 */     this.ammoModel['Ė'].setRotationPoint(8.1F, -1.6F, 5.0F);
/*      */     
/* 3296 */     this.ammoModel['ė'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F);
/* 3297 */     this.ammoModel['ė'].setRotationPoint(9.15F, -2.1F, 5.0F);
/*      */     
/* 3299 */     this.ammoModel['Ę'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.55F, -0.375F, -0.075F, -0.2F, -0.375F, -0.075F, -0.2F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.55F, -0.325F, -0.375F, -0.2F, -0.325F, -0.375F);
/* 3300 */     this.ammoModel['Ę'].setRotationPoint(9.15F, -1.6F, 5.0F);
/*      */     
/* 3302 */     this.ammoModel['ę'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.25F, -0.375F, 0.175F, -0.25F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3303 */     this.ammoModel['ę'].setRotationPoint(8.5F, -1.85F, 5.25F);
/*      */     
/* 3305 */     this.ammoModel['Ě'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F, -0.25F, -0.375F, 0.175F, -0.5F, -0.375F, 0.175F, -0.5F, -0.375F, -0.325F, -0.25F, -0.375F, -0.325F);
/* 3306 */     this.ammoModel['Ě'].setRotationPoint(8.1F, -1.85F, 5.25F);
/*      */     
/* 3308 */     this.ammoModel['ě'].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F, -0.2F, -0.375F, 0.175F, -0.55F, -0.375F, 0.175F, -0.55F, -0.375F, -0.325F, -0.2F, -0.375F, -0.325F);
/* 3309 */     this.ammoModel['ě'].setRotationPoint(9.15F, -1.85F, 5.25F);
/*      */     
/* 3311 */     this.ammoModel['Ĝ'].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, 0.5F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3312 */     this.ammoModel['Ĝ'].setRotationPoint(8.0F, -1.75F, -1.5F);
/*      */     
/* 3314 */     this.ammoModel['ĝ'].addShapeBox(0.0F, 0.0F, 0.0F, 4, 5, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3315 */     this.ammoModel['ĝ'].setRotationPoint(8.0F, -0.75F, -1.5F);
/*      */     
/* 3317 */     this.ammoModel['Ğ'].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, 0.5F, -1.0F, -0.75F, 0.0F, -1.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3318 */     this.ammoModel['Ğ'].setRotationPoint(8.0F, -1.75F, -2.25F);
/*      */     
/* 3320 */     this.ammoModel['ğ'].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.5F, 0.0F, -0.25F);
/* 3321 */     this.ammoModel['ğ'].setRotationPoint(8.0F, -1.75F, 6.0F);
/*      */     
/* 3323 */     this.ammoModel['Ġ'].addShapeBox(0.0F, 0.0F, 0.0F, 4, 5, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
/* 3324 */     this.ammoModel['Ġ'].setRotationPoint(8.0F, -0.75F, 6.0F);
/*      */     
/* 3326 */     this.ammoModel['ġ'].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.75F, 0.5F, -1.0F, -0.75F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F);
/* 3327 */     this.ammoModel['ġ'].setRotationPoint(8.0F, -1.75F, 6.75F);
/*      */   }
/*      */ }


/* Location:              C:\Users\home\Desktop\.CraftingLifeV3 [DEV]\Flan\Machetemen-Arms-Pack-Mid-.45-Part-II-deobf.jar!\com\flansmod\client\model\mpack\Modelmk46.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */