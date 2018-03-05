//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Tempest
// Model Creator: Manus
// Created on: 31.12.2015 - 15:07:58
// Last changed on: 31.12.2015 - 15:07:58

package com.flansmod.client.model.CraftingLifePackVehicule; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelflogholly_Vehicle_Tempest_2 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelflogholly_Vehicle_Tempest_2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[181];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Import Achse
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import AchseV
		bodyModel[2] = new ModelRendererTurbo(this, 235, 45, textureX, textureY); // Import B052
		bodyModel[3] = new ModelRendererTurbo(this, 212, 44, textureX, textureY); // Import B053
		bodyModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import B054
		bodyModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import B055
		bodyModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import B056
		bodyModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import B057
		bodyModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import B058
		bodyModel[9] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import B059
		bodyModel[10] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import B060
		bodyModel[11] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import B061
		bodyModel[12] = new ModelRendererTurbo(this, 10, 56, textureX, textureY); // Import B062
		bodyModel[13] = new ModelRendererTurbo(this, 234, 34, textureX, textureY); // Import B063
		bodyModel[14] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Import B064
		bodyModel[15] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import B065
		bodyModel[16] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Import B066
		bodyModel[17] = new ModelRendererTurbo(this, 54, 39, textureX, textureY); // Import B066
		bodyModel[18] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import B082
		bodyModel[19] = new ModelRendererTurbo(this, 240, 38, textureX, textureY); // Import B083
		bodyModel[20] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import B085
		bodyModel[21] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import B086
		bodyModel[22] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import B087
		bodyModel[23] = new ModelRendererTurbo(this, 218, 26, textureX, textureY); // Import B107
		bodyModel[24] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import B108
		bodyModel[25] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Import I5
		bodyModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import FensterL1
		bodyModel[27] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import FensterL2
		bodyModel[28] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import FensterR
		bodyModel[29] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import FensterV
		bodyModel[30] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import FensterH
		bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		bodyModel[34] = new ModelRendererTurbo(this, 417, 256, textureX, textureY); // Box 23
		bodyModel[35] = new ModelRendererTurbo(this, 292, 73, textureX, textureY); // Box 29
		bodyModel[36] = new ModelRendererTurbo(this, 344, 180, textureX, textureY); // Box 62
		bodyModel[37] = new ModelRendererTurbo(this, 333, 180, textureX, textureY); // Box 63
		bodyModel[38] = new ModelRendererTurbo(this, 61, 289, textureX, textureY); // Box 88
		bodyModel[39] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 90
		bodyModel[40] = new ModelRendererTurbo(this, 181, 84, textureX, textureY); // Box 158
		bodyModel[41] = new ModelRendererTurbo(this, 93, 241, textureX, textureY); // Box 165
		bodyModel[42] = new ModelRendererTurbo(this, 93, 241, textureX, textureY); // Box 166
		bodyModel[43] = new ModelRendererTurbo(this, 246, 18, textureX, textureY); // Box 170
		bodyModel[44] = new ModelRendererTurbo(this, 252, 32, textureX, textureY); // Box 171
		bodyModel[45] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 172
		bodyModel[46] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 174
		bodyModel[47] = new ModelRendererTurbo(this, 238, 34, textureX, textureY); // Box 175
		bodyModel[48] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 177
		bodyModel[49] = new ModelRendererTurbo(this, 246, 18, textureX, textureY); // Box 178
		bodyModel[50] = new ModelRendererTurbo(this, 246, 18, textureX, textureY); // Box 179
		bodyModel[51] = new ModelRendererTurbo(this, 210, 25, textureX, textureY); // Box 180
		bodyModel[52] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 181
		bodyModel[53] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 183
		bodyModel[54] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 184
		bodyModel[55] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 185
		bodyModel[56] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 186
		bodyModel[57] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 187
		bodyModel[58] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 188
		bodyModel[59] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 189
		bodyModel[60] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 190
		bodyModel[61] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 191
		bodyModel[62] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 192
		bodyModel[63] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 193
		bodyModel[64] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 194
		bodyModel[65] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 195
		bodyModel[66] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 196
		bodyModel[67] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 197
		bodyModel[68] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 198
		bodyModel[69] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 199
		bodyModel[70] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 200
		bodyModel[71] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 201
		bodyModel[72] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 202
		bodyModel[73] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 203
		bodyModel[74] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 204
		bodyModel[75] = new ModelRendererTurbo(this, 246, 18, textureX, textureY); // Box 205
		bodyModel[76] = new ModelRendererTurbo(this, 246, 18, textureX, textureY); // Box 206
		bodyModel[77] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 207
		bodyModel[78] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 208
		bodyModel[79] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 209
		bodyModel[80] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 210
		bodyModel[81] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 211
		bodyModel[82] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 212
		bodyModel[83] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 213
		bodyModel[84] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 214
		bodyModel[85] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 215
		bodyModel[86] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 216
		bodyModel[87] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 217
		bodyModel[88] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 218
		bodyModel[89] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 219
		bodyModel[90] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 220
		bodyModel[91] = new ModelRendererTurbo(this, 335, 47, textureX, textureY); // Box 221
		bodyModel[92] = new ModelRendererTurbo(this, 335, 47, textureX, textureY); // Box 222
		bodyModel[93] = new ModelRendererTurbo(this, 335, 47, textureX, textureY); // Box 223
		bodyModel[94] = new ModelRendererTurbo(this, 256, 13, textureX, textureY); // Box 226
		bodyModel[95] = new ModelRendererTurbo(this, 344, 180, textureX, textureY); // Box 227
		bodyModel[96] = new ModelRendererTurbo(this, 333, 180, textureX, textureY); // Box 228
		bodyModel[97] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Box 43
		bodyModel[98] = new ModelRendererTurbo(this, 301, 80, textureX, textureY); // Box 43
		bodyModel[99] = new ModelRendererTurbo(this, 335, 47, textureX, textureY); // Box 253
		bodyModel[100] = new ModelRendererTurbo(this, 335, 47, textureX, textureY); // Box 254
		bodyModel[101] = new ModelRendererTurbo(this, 246, 18, textureX, textureY); // Box 255
		bodyModel[102] = new ModelRendererTurbo(this, 220, 18, textureX, textureY); // Box 163
		bodyModel[103] = new ModelRendererTurbo(this, 37, 12, textureX, textureY); // Box 164
		bodyModel[104] = new ModelRendererTurbo(this, 37, 12, textureX, textureY); // Box 165
		bodyModel[105] = new ModelRendererTurbo(this, 36, 12, textureX, textureY); // Box 166
		bodyModel[106] = new ModelRendererTurbo(this, 2, -7, textureX, textureY); // Box 167
		bodyModel[107] = new ModelRendererTurbo(this, 11, 7, textureX, textureY); // Box 168
		bodyModel[108] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 169
		bodyModel[109] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 170
		bodyModel[110] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 171
		bodyModel[111] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 175
		bodyModel[112] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 176
		bodyModel[113] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 177
		bodyModel[114] = new ModelRendererTurbo(this, 338, 73, textureX, textureY); // Box 178
		bodyModel[115] = new ModelRendererTurbo(this, 4, 52, textureX, textureY); // Box 179
		bodyModel[116] = new ModelRendererTurbo(this, 77, 26, textureX, textureY); // Box 179
		bodyModel[117] = new ModelRendererTurbo(this, 346, 30, textureX, textureY); // Box 182
		bodyModel[118] = new ModelRendererTurbo(this, 346, 30, textureX, textureY); // Box 183
		bodyModel[119] = new ModelRendererTurbo(this, 356, 75, textureX, textureY); // Box 184
		bodyModel[120] = new ModelRendererTurbo(this, 356, 75, textureX, textureY); // Box 186
		bodyModel[121] = new ModelRendererTurbo(this, 356, 75, textureX, textureY); // Box 187
		bodyModel[122] = new ModelRendererTurbo(this, 339, 81, textureX, textureY); // Box 188
		bodyModel[123] = new ModelRendererTurbo(this, 339, 81, textureX, textureY); // Box 189
		bodyModel[124] = new ModelRendererTurbo(this, 346, 30, textureX, textureY); // Box 190
		bodyModel[125] = new ModelRendererTurbo(this, 346, 30, textureX, textureY); // Box 191
		bodyModel[126] = new ModelRendererTurbo(this, 346, 30, textureX, textureY); // Box 192
		bodyModel[127] = new ModelRendererTurbo(this, 66, 213, textureX, textureY); // Box 193
		bodyModel[128] = new ModelRendererTurbo(this, 243, 268, textureX, textureY); // Box 194
		bodyModel[129] = new ModelRendererTurbo(this, 243, 268, textureX, textureY); // Box 195
		bodyModel[130] = new ModelRendererTurbo(this, 243, 268, textureX, textureY); // Box 196
		bodyModel[131] = new ModelRendererTurbo(this, 243, 268, textureX, textureY); // Box 197
		bodyModel[132] = new ModelRendererTurbo(this, 243, 268, textureX, textureY); // Box 198
		bodyModel[133] = new ModelRendererTurbo(this, 231, 29, textureX, textureY); // Box 199
		bodyModel[134] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 200
		bodyModel[135] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 201
		bodyModel[136] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 202
		bodyModel[137] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 203
		bodyModel[138] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 204
		bodyModel[139] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 205
		bodyModel[140] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 206
		bodyModel[141] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 207
		bodyModel[142] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 208
		bodyModel[143] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 209
		bodyModel[144] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 210
		bodyModel[145] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 211
		bodyModel[146] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 212
		bodyModel[147] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 213
		bodyModel[148] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 214
		bodyModel[149] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 215
		bodyModel[150] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 216
		bodyModel[151] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 217
		bodyModel[152] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 218
		bodyModel[153] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 219
		bodyModel[154] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 220
		bodyModel[155] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 221
		bodyModel[156] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 222
		bodyModel[157] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 223
		bodyModel[158] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 224
		bodyModel[159] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 225
		bodyModel[160] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 226
		bodyModel[161] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 227
		bodyModel[162] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 228
		bodyModel[163] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 229
		bodyModel[164] = new ModelRendererTurbo(this, 299, 86, textureX, textureY); // Box 230
		bodyModel[165] = new ModelRendererTurbo(this, 299, 86, textureX, textureY); // Box 231
		bodyModel[166] = new ModelRendererTurbo(this, 243, 268, textureX, textureY); // Box 233
		bodyModel[167] = new ModelRendererTurbo(this, 346, 30, textureX, textureY); // Box 234
		bodyModel[168] = new ModelRendererTurbo(this, 346, 30, textureX, textureY); // Box 235
		bodyModel[169] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 246
		bodyModel[170] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 247
		bodyModel[171] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 248
		bodyModel[172] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 249
		bodyModel[173] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 250
		bodyModel[174] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 251
		bodyModel[175] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 252
		bodyModel[176] = new ModelRendererTurbo(this, 335, 208, textureX, textureY); // Box 253
		bodyModel[177] = new ModelRendererTurbo(this, 27, 37, textureX, textureY); // Box 255
		bodyModel[178] = new ModelRendererTurbo(this, 86, 20, textureX, textureY); // Box 256
		bodyModel[179] = new ModelRendererTurbo(this, 119, 359, textureX, textureY); // Box 209
		bodyModel[180] = new ModelRendererTurbo(this, 119, 359, textureX, textureY); // Box 210

		bodyModel[0].addBox(0F, 0F, 0F, 3, 3, 36, 0F); // Import Achse
		bodyModel[0].setRotationPoint(-66F, -2F, -18F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 3, 36, 0F); // Import AchseV
		bodyModel[1].setRotationPoint(-1F, -2F, -18F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 7, 10, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import B052
		bodyModel[2].setRotationPoint(11F, -13F, -22F);

		bodyModel[3].addBox(0F, 0F, 0F, 23, 1, 10, 0F); // Import B053
		bodyModel[3].setRotationPoint(-11F, -13F, -22F);

		bodyModel[4].addBox(0F, 0F, 0F, 23, 4, 1, 0F); // Import B054
		bodyModel[4].setRotationPoint(-11F, -12F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 7, 10, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import B055
		bodyModel[5].setRotationPoint(-13F, -13F, -22F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 7, 11, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import B056
		bodyModel[6].setRotationPoint(11F, -13F, 12F);

		bodyModel[7].addBox(0F, 0F, 0F, 23, 1, 11, 0F); // Import B057
		bodyModel[7].setRotationPoint(-11F, -13F, 12F);

		bodyModel[8].addBox(0F, 0F, 0F, 23, 4, 1, 0F); // Import B058
		bodyModel[8].setRotationPoint(-11F, -12F, 12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 7, 11, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import B059
		bodyModel[9].setRotationPoint(-13F, -13F, 12F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 7, 15, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import B060
		bodyModel[10].setRotationPoint(-47F, -13F, -22F);

		bodyModel[11].addBox(0F, 0F, 0F, 23, 1, 15, 0F); // Import B061
		bodyModel[11].setRotationPoint(-70F, -13F, -22F);

		bodyModel[12].addBox(0F, 0F, 0F, 23, 4, 1, 0F); // Import B062
		bodyModel[12].setRotationPoint(-70F, -12F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 7, 15, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import B063
		bodyModel[13].setRotationPoint(-72F, -13F, -22F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 7, 15, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import B064
		bodyModel[14].setRotationPoint(-47F, -13F, 7F);

		bodyModel[15].addBox(0F, 0F, 0F, 23, 1, 15, 0F); // Import B065
		bodyModel[15].setRotationPoint(-70F, -13F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 2, 7, 15, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import B066
		bodyModel[16].setRotationPoint(-72F, -13F, 7F);

		bodyModel[17].addBox(0F, 0F, 0F, 23, 4, 1, 0F); // Import B066
		bodyModel[17].setRotationPoint(-70F, -12F, 7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F); // Import B082
		bodyModel[18].setRotationPoint(-53F, -12F, -22F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F); // Import B083
		bodyModel[19].setRotationPoint(-70F, -12F, -22F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F); // Import B085
		bodyModel[20].setRotationPoint(-11F, -12F, 22F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F); // Import B086
		bodyModel[21].setRotationPoint(-53F, -12F, 21F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F); // Import B087
		bodyModel[22].setRotationPoint(-70F, -12F, 21F);

		bodyModel[23].addBox(0F, 0F, 0F, 23, 13, 28, 0F); // Import B107
		bodyModel[23].setRotationPoint(-11F, -8F, -14F);

		bodyModel[24].addBox(0F, 0F, 0F, 23, 13, 16, 0F); // Import B108
		bodyModel[24].setRotationPoint(-70F, -8F, -8F);

		bodyModel[25].addBox(0F, 0F, 0F, 13, 5, 8, 0F); // Import I5
		bodyModel[25].setRotationPoint(-6F, -13F, -12F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import FensterL1
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import FensterL2
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import FensterR
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import FensterV
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import FensterH
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 2
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 16
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 22
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[34].setRotationPoint(-11F, -12F, -22F);

		bodyModel[35].addBox(0F, 0F, 0F, 13, 8, 5, 0F); // Box 29
		bodyModel[35].setRotationPoint(-27F, -12F, 15F);

		bodyModel[36].addBox(0F, 0F, 0F, 10, 1, 18, 0F); // Box 62
		bodyModel[36].setRotationPoint(17F, -24F, -18F);

		bodyModel[37].addBox(0F, 0F, 0F, 12, 1, 18, 0F); // Box 63
		bodyModel[37].setRotationPoint(17F, -23F, -18F);
		bodyModel[37].rotateAngleZ = 1.710423F;

		bodyModel[38].addBox(0F, 1F, 0F, 1, 11, 2, 0F); // Box 88
		bodyModel[38].setRotationPoint(-71F, -7F, -1F);

		bodyModel[39].addBox(0F, 0F, 0F, 22, 8, 26, 0F); // Box 90
		bodyModel[39].setRotationPoint(-33F, -13F, -14F);

		bodyModel[40].addBox(0F, 1F, 0F, 1, 4, 16, 0F); // Box 158
		bodyModel[40].setRotationPoint(-83.5F, -12F, -9F);
		bodyModel[40].rotateAngleZ = 0.38397244F;

		bodyModel[41].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 165
		bodyModel[41].setRotationPoint(-82.8F, -11.6F, -19F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 166
		bodyModel[42].setRotationPoint(-82.8F, -11.6F, 16F);

		bodyModel[43].addBox(0F, 0F, 0F, 23, 13, 28, 0F); // Box 170
		bodyModel[43].setRotationPoint(12F, -8F, -14F);

		bodyModel[44].addBox(0F, 0F, 0F, 23, 1, 11, 0F); // Box 171
		bodyModel[44].setRotationPoint(19F, -13F, 12F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 7, 11, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[45].setRotationPoint(17F, -13F, 12F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[46].setRotationPoint(19F, -12F, 22F);

		bodyModel[47].addBox(0F, 0F, 0F, 23, 1, 10, 0F); // Box 175
		bodyModel[47].setRotationPoint(19F, -13F, -22F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 7, 10, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[48].setRotationPoint(17F, -13F, -22F);

		bodyModel[49].addBox(0F, 0F, 0F, 16, 8, 15, 0F); // Box 178
		bodyModel[49].setRotationPoint(29F, -2F, -7F);
		bodyModel[49].rotateAngleZ = 0.71558499F;

		bodyModel[50].addBox(0F, 0F, 0F, 23, 13, 28, 0F); // Box 179
		bodyModel[50].setRotationPoint(16F, -13F, -14F);

		bodyModel[51].addBox(0F, 0F, 0F, 30, 13, 28, 0F); // Box 180
		bodyModel[51].setRotationPoint(-11F, -13F, -14F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 11, 45, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[52].setRotationPoint(44F, -16F, -22F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[53].setRotationPoint(40F, -16F, -22F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[54].setRotationPoint(40F, -16F, -22F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[55].setRotationPoint(40F, -16F, -22F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[56].setRotationPoint(40F, -16F, -22F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[57].setRotationPoint(40F, -16F, -22F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[58].setRotationPoint(40F, -16F, -22F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[59].setRotationPoint(40F, -16F, -22.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[60].setRotationPoint(40F, -16F, -22.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[61].setRotationPoint(40F, -16F, -22.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[62].setRotationPoint(40F, -16F, -22.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[63].setRotationPoint(40F, -16F, -22.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[64].setRotationPoint(40F, -16F, -22.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[65].setRotationPoint(40F, -16F, -22.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[66].setRotationPoint(40F, -16F, 21.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[67].setRotationPoint(40F, -16F, 21.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[68].setRotationPoint(40F, -16F, 21.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[69].setRotationPoint(40F, -16F, 21.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[70].setRotationPoint(40F, -16F, 21.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[71].setRotationPoint(40F, -16F, 21.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[72].setRotationPoint(40F, -16F, 21.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[73].setRotationPoint(40F, -16F, 21.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 7, 45, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[74].setRotationPoint(44F, -24F, -22F);

		bodyModel[75].addBox(0F, 0F, 0F, 7, 13, 28, 0F); // Box 205
		bodyModel[75].setRotationPoint(38F, -19F, -14F);

		bodyModel[76].addBox(0F, 0F, 0F, 23, 7, 43, 0F); // Box 206
		bodyModel[76].setRotationPoint(19F, -19F, -21F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 3, 7, 45, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 5F, -21F, 0F, 5F, -21F, 0F, -4F, -1F, -2F, -4F, -1F, -2F, 0F, -21F, 0F, 0F, -21F); // Box 207
		bodyModel[77].setRotationPoint(47F, -27F, -23F);
		bodyModel[77].rotateAngleZ = 0.2268928F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 7, 45, 0F, 0F, 5F, -21F, 0F, 5F, -21F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, -21F, -2F, 0F, -21F, -2F, -4F, -1F, 0F, -4F, -1F); // Box 208
		bodyModel[78].setRotationPoint(47F, -27F, -21F);
		bodyModel[78].rotateAngleZ = 0.2268928F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 14, 2, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 209
		bodyModel[79].setRotationPoint(42F, -32F, -22F);
		bodyModel[79].rotateAngleZ = -0.08726646F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 14, 2, 0F, 13F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 13F, 3F, 0F, 11F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 1F, 0F); // Box 210
		bodyModel[80].setRotationPoint(36F, -32F, 22F);
		bodyModel[80].rotateAngleZ = -0.08726646F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 14, 2, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 211
		bodyModel[81].setRotationPoint(42F, -32F, 21F);
		bodyModel[81].rotateAngleZ = -0.08726646F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 14, 2, 0F, 1F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F); // Box 212
		bodyModel[82].setRotationPoint(42F, -46F, -22F);
		bodyModel[82].rotateAngleZ = -0.08726646F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 14, 2, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F); // Box 213
		bodyModel[83].setRotationPoint(42F, -46F, 21F);
		bodyModel[83].rotateAngleZ = -0.08726646F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 14, 2, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -4F, 0F, 0F); // Box 214
		bodyModel[84].setRotationPoint(42F, -46F, 0F);
		bodyModel[84].rotateAngleZ = -0.08726646F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 14, 2, 0F, 13F, 3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 13F, 4F, 0F, 11F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 1F, 0F); // Box 215
		bodyModel[85].setRotationPoint(36F, -32F, -23F);
		bodyModel[85].rotateAngleZ = -0.08726646F;

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 14, 2, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F); // Box 216
		bodyModel[86].setRotationPoint(42F, -46F, 21F);
		bodyModel[86].rotateAngleZ = -0.08726646F;

		bodyModel[87].addBox(0F, 0F, 0F, 3, 14, 2, 0F); // Box 217
		bodyModel[87].setRotationPoint(39F, -46F, 22F);

		bodyModel[88].addBox(0F, 0F, 0F, 3, 14, 2, 0F); // Box 218
		bodyModel[88].setRotationPoint(39F, -46F, -23F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 14, 2, 0F); // Box 219
		bodyModel[89].setRotationPoint(23.5F, -46F, -23F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 14, 2, 0F); // Box 220
		bodyModel[90].setRotationPoint(23.5F, -46F, 22F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 10, 13, 43, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[91].setRotationPoint(34F, -31F, -21F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 13, 4, 0F, 0F, -3F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[92].setRotationPoint(33F, -32F, -1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 5, 13, 4, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[93].setRotationPoint(31F, -29F, -1F);

		bodyModel[94].addBox(0F, 0F, 0F, 2, 10, 41, 0F); // Box 226
		bodyModel[94].setRotationPoint(44F, -32F, -20F);

		bodyModel[95].addBox(0F, 0F, 0F, 10, 1, 18, 0F); // Box 227
		bodyModel[95].setRotationPoint(17F, -24F, 2F);

		bodyModel[96].addBox(0F, 0F, 0F, 12, 1, 18, 0F); // Box 228
		bodyModel[96].setRotationPoint(17F, -23F, 2F);
		bodyModel[96].rotateAngleZ = 1.710423F;

		bodyModel[97].addShapeBox(-2.5F, -1F, -1F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 43
		bodyModel[97].setRotationPoint(35.5F, -30F, 12.25F);
		bodyModel[97].rotateAngleZ = -0.31415927F;

		bodyModel[98].addBox(-2.5F, -0.5F, -0.5F, 8, 1, 1, 0F); // Box 43
		bodyModel[98].setRotationPoint(35.5F, -30F, 12.25F);
		bodyModel[98].rotateAngleZ = -0.31415927F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 11, 7, 11, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[99].setRotationPoint(33F, -32F, 7F);

		bodyModel[100].addBox(0F, 0F, 0F, 7, 3, 7, 0F); // Box 254
		bodyModel[100].setRotationPoint(36F, -32F, 9F);
		bodyModel[100].rotateAngleZ = -0.31415927F;

		bodyModel[101].addBox(0F, 0F, 0F, 9, 7, 43, 0F); // Box 255
		bodyModel[101].setRotationPoint(19F, -23F, -21F);

		bodyModel[102].addBox(0F, 0F, 0F, 31, 10, 43, 0F); // Box 163
		bodyModel[102].setRotationPoint(-11F, -23F, -21F);

		bodyModel[103].addBox(0F, 0F, 0F, 10, 28, 2, 0F); // Box 164
		bodyModel[103].setRotationPoint(14.5F, -46F, -22F);

		bodyModel[104].addBox(0F, 0F, 0F, 10, 28, 2, 0F); // Box 165
		bodyModel[104].setRotationPoint(14.5F, -46F, 21F);

		bodyModel[105].addBox(0F, 0F, 0F, 10, 28, 2, 0F); // Box 166
		bodyModel[105].setRotationPoint(14.5F, -46F, 21F);

		bodyModel[106].addBox(0F, 0F, 0F, 16, 28, 45, 0F); // Box 167
		bodyModel[106].setRotationPoint(-1.5F, -46F, -22F);

		bodyModel[107].addBox(0F, 0F, 0F, 16, 28, 45, 0F); // Box 168
		bodyModel[107].setRotationPoint(-1.5F, -46F, -22F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 5F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 5F, 1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 169
		bodyModel[108].setRotationPoint(14F, -16F, 21.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 5F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 5F, 1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F); // Box 170
		bodyModel[109].setRotationPoint(14F, -16F, -22.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.9999F, 0F, 0F, -5.9999F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[110].setRotationPoint(19F, -12F, -22F);

		bodyModel[111].addBox(0F, 0F, 0F, 3, 14, 2, 0F); // Box 175
		bodyModel[111].setRotationPoint(25.5F, -43F, -23F);
		bodyModel[111].rotateAngleZ = 1.57079633F;

		bodyModel[112].addBox(0F, 0F, 0F, 3, 14, 2, 0F); // Box 176
		bodyModel[112].setRotationPoint(25.5F, -43F, 22F);
		bodyModel[112].rotateAngleZ = 1.57079633F;

		bodyModel[113].addShapeBox(0F, 0F, 0F, 46, 4, 45, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[113].setRotationPoint(-1.5F, -49F, -22F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[114].setRotationPoint(33F, -51F, 14F);
		bodyModel[114].rotateAngleZ = 0.12217305F;

		bodyModel[115].addShapeBox(0F, 0F, 0F, 18, 1, 18, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[115].setRotationPoint(16.5F, -50F, -18F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 15, 1, 15, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[116].setRotationPoint(0.5F, -50F, 2F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 182
		bodyModel[117].setRotationPoint(47F, -15F, 15F);
		bodyModel[117].rotateAngleZ = -0.2268928F;

		bodyModel[118].addBox(0F, 0F, 0F, 2, 3, 6, 0F); // Box 183
		bodyModel[118].setRotationPoint(47F, -15F, -20F);
		bodyModel[118].rotateAngleZ = -0.2268928F;

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[119].setRotationPoint(45F, -14.5F, 15.5F);
		bodyModel[119].rotateAngleZ = -0.12217305F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[120].setRotationPoint(45F, -14.5F, -16.5F);
		bodyModel[120].rotateAngleZ = -0.12217305F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[121].setRotationPoint(45F, -14.5F, -16.5F);
		bodyModel[121].rotateAngleZ = -0.12217305F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[122].setRotationPoint(45F, -15F, 18.5F);
		bodyModel[122].rotateAngleZ = -0.12217305F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[123].setRotationPoint(45F, -15F, -20.5F);
		bodyModel[123].rotateAngleZ = -0.12217305F;

		bodyModel[124].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 190
		bodyModel[124].setRotationPoint(46F, -12F, 11F);
		bodyModel[124].rotateAngleZ = -0.2268928F;

		bodyModel[125].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 191
		bodyModel[125].setRotationPoint(46F, -12F, -11F);
		bodyModel[125].rotateAngleZ = -0.2268928F;

		bodyModel[126].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 192
		bodyModel[126].setRotationPoint(27F, -31F, 23.5F);

		bodyModel[127].addBox(0F, 0F, 0F, 83, 10, 43, 0F); // Box 193
		bodyModel[127].setRotationPoint(-83F, -23F, -21F);

		bodyModel[128].addBox(0F, 0F, 0F, 84, 21, 3, 0F); // Box 194
		bodyModel[128].setRotationPoint(-85.5F, -39F, -22F);

		bodyModel[129].addBox(0F, 0F, 0F, 84, 21, 3, 0F); // Box 195
		bodyModel[129].setRotationPoint(-85.5F, -39F, 20F);

		bodyModel[130].addBox(0F, 0F, 0F, 84, 20, 3, 0F); // Box 196
		bodyModel[130].setRotationPoint(-85.5F, -39F, 20F);

		bodyModel[131].addBox(0F, 0F, 0F, 84, 20, 3, 0F); // Box 197
		bodyModel[131].setRotationPoint(-85.5F, -39F, 20F);

		bodyModel[132].addBox(0F, 0F, 0F, 84, 20, 3, 0F); // Box 198
		bodyModel[132].setRotationPoint(-85.5F, -39F, 20F);

		bodyModel[133].addBox(0F, 0F, 0F, 22, 8, 26, 0F); // Box 199
		bodyModel[133].setRotationPoint(-55F, -13F, -14F);

		bodyModel[134].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 200
		bodyModel[134].setRotationPoint(-84.5F, -38F, 22.5F);

		bodyModel[135].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 201
		bodyModel[135].setRotationPoint(-84.5F, -34F, 22.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 202
		bodyModel[136].setRotationPoint(-84.5F, -34F, 22.5F);

		bodyModel[137].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 203
		bodyModel[137].setRotationPoint(-84.5F, -34F, 22.5F);

		bodyModel[138].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 204
		bodyModel[138].setRotationPoint(-84.5F, -34F, 22.5F);

		bodyModel[139].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 205
		bodyModel[139].setRotationPoint(-84.5F, -34F, 22.5F);

		bodyModel[140].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 206
		bodyModel[140].setRotationPoint(-84.5F, -30F, 22.5F);

		bodyModel[141].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 207
		bodyModel[141].setRotationPoint(-84.5F, -30F, 22.5F);

		bodyModel[142].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 208
		bodyModel[142].setRotationPoint(-84.5F, -30F, 22.5F);

		bodyModel[143].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 209
		bodyModel[143].setRotationPoint(-84.5F, -30F, 22.5F);

		bodyModel[144].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 210
		bodyModel[144].setRotationPoint(-84.5F, -30F, 22.5F);

		bodyModel[145].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 211
		bodyModel[145].setRotationPoint(-84.5F, -26F, 22.5F);

		bodyModel[146].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 212
		bodyModel[146].setRotationPoint(-84.5F, -26F, 22.5F);

		bodyModel[147].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 213
		bodyModel[147].setRotationPoint(-84.5F, -26F, 22.5F);

		bodyModel[148].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 214
		bodyModel[148].setRotationPoint(-84.5F, -26F, 22.5F);

		bodyModel[149].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 215
		bodyModel[149].setRotationPoint(-84.5F, -26F, 22.5F);

		bodyModel[150].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 216
		bodyModel[150].setRotationPoint(-84.5F, -22F, 22.5F);

		bodyModel[151].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 217
		bodyModel[151].setRotationPoint(-84.5F, -22F, 22.5F);

		bodyModel[152].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 218
		bodyModel[152].setRotationPoint(-84.5F, -22F, 22.5F);

		bodyModel[153].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 219
		bodyModel[153].setRotationPoint(-84.5F, -22F, 22.5F);

		bodyModel[154].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 220
		bodyModel[154].setRotationPoint(-84.5F, -22F, 22.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 31F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 31F, 1F, 0F, 26F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 26F, -1F, 0F); // Box 221
		bodyModel[155].setRotationPoint(-18F, -16F, 21.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 31F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 31F, 1F, 0F, 26F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 26F, -1F, 0F); // Box 222
		bodyModel[156].setRotationPoint(-18F, -16F, -22.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 11F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 11F, 1F, 0F, 5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 5F, -1F, 0F); // Box 223
		bodyModel[157].setRotationPoint(-75F, -16F, 21.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 11, 2, 0F, 11F, 1F, 0F, 2F, 1F, 0F, 0F, 1F, 43F, 11F, 1F, 43F, 5F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 43F, 5F, -1F, 43F); // Box 224
		bodyModel[158].setRotationPoint(-75F, -16F, -22.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 225
		bodyModel[159].setRotationPoint(-84.5F, -38F, -22.5F);

		bodyModel[160].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 226
		bodyModel[160].setRotationPoint(-84.5F, -34F, -22.5F);

		bodyModel[161].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 227
		bodyModel[161].setRotationPoint(-84.5F, -30F, -22.5F);

		bodyModel[162].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 228
		bodyModel[162].setRotationPoint(-84.5F, -26F, -22.5F);

		bodyModel[163].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 229
		bodyModel[163].setRotationPoint(-84.5F, -22F, -22.5F);

		bodyModel[164].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 230
		bodyModel[164].setRotationPoint(-34F, -7F, 16F);

		bodyModel[165].addBox(0F, 0F, 0F, 10, 2, 2, 0F); // Box 231
		bodyModel[165].setRotationPoint(-42F, -8F, 16F);
		bodyModel[165].rotateAngleZ = -0.10471976F;

		bodyModel[166].addBox(0F, 0F, 0F, 39, 21, 3, 0F); // Box 233
		bodyModel[166].setRotationPoint(-87.5F, -39F, 20F);
		bodyModel[166].rotateAngleY = -1.57079633F;

		bodyModel[167].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 234
		bodyModel[167].setRotationPoint(27F, -31F, -23.5F);

		bodyModel[168].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 235
		bodyModel[168].setRotationPoint(-88F, -35F, 1.5F);
		bodyModel[168].rotateAngleY = -1.57079633F;

		bodyModel[169].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 246
		bodyModel[169].setRotationPoint(-83.5F, -44F, 20.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 247
		bodyModel[170].setRotationPoint(-80.5F, -38F, 20.5F);
		bodyModel[170].rotateAngleZ = 1.57079633F;

		bodyModel[171].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 248
		bodyModel[171].setRotationPoint(-50.5F, -38F, 20.5F);
		bodyModel[171].rotateAngleZ = 1.57079633F;

		bodyModel[172].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 249
		bodyModel[172].setRotationPoint(-30.5F, -38F, 20.5F);
		bodyModel[172].rotateAngleZ = 1.57079633F;

		bodyModel[173].addBox(0F, 0F, 0F, 82, 2, 1, 0F); // Box 250
		bodyModel[173].setRotationPoint(-83.5F, -44F, -20.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 251
		bodyModel[174].setRotationPoint(-80.5F, -38F, -20.5F);
		bodyModel[174].rotateAngleZ = 1.57079633F;

		bodyModel[175].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 252
		bodyModel[175].setRotationPoint(-50.5F, -38F, -20.5F);
		bodyModel[175].rotateAngleZ = 1.57079633F;

		bodyModel[176].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 253
		bodyModel[176].setRotationPoint(-30.5F, -38F, -20.5F);
		bodyModel[176].rotateAngleZ = 1.57079633F;

		bodyModel[177].addBox(0F, 0F, 0F, 15, 1, 18, 0F); // Box 255
		bodyModel[177].setRotationPoint(4.5F, -25F, 23F);
		bodyModel[177].rotateAngleX = 1.57079633F;

		bodyModel[178].addBox(0F, 0F, 0F, 15, 1, 18, 0F); // Box 256
		bodyModel[178].setRotationPoint(4.5F, -25F, -23F);
		bodyModel[178].rotateAngleX = 1.57079633F;

		bodyModel[179].addBox(0F, 0F, 0F, 35, 26, 30, 0F); // Box 209
		bodyModel[179].setRotationPoint(-66.5F, -49F, 18F);
		bodyModel[179].rotateAngleY = -1.57079633F;

		bodyModel[180].addBox(0F, 0F, 0F, 35, 26, 30, 0F); // Box 210
		bodyModel[180].setRotationPoint(-34.5F, -49F, 18F);
		bodyModel[180].rotateAngleY = -1.57079633F;


		leftFrontWheelModel = new ModelRendererTurbo[2];
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import WFL
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Shape 167

		leftFrontWheelModel[0].addShape3D(10.5F, -10.5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(8, 21, 8, 21), new Coord2D(4, 19, 4, 19), new Coord2D(2, 17, 2, 17), new Coord2D(0, 13, 0, 13), new Coord2D(0, 8, 0, 8), new Coord2D(2, 4, 2, 4), new Coord2D(4, 2, 4, 2), new Coord2D(8, 0, 8, 0), new Coord2D(13, 0, 13, 0), new Coord2D(17, 2, 17, 2), new Coord2D(19, 4, 19, 4), new Coord2D(21, 8, 21, 8), new Coord2D(21, 13, 21, 13), new Coord2D(19, 17, 19, 17), new Coord2D(17, 19, 17, 19), new Coord2D(13, 21, 13, 21) }), 6, 21, 21, 72, 6, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5}); // Import WFL
		leftFrontWheelModel[0].setRotationPoint(0.5F, -0.5F, 18F);

		leftFrontWheelModel[1].addShape3D(10.5F, -10.5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(8, 21, 8, 21), new Coord2D(4, 19, 4, 19), new Coord2D(2, 17, 2, 17), new Coord2D(0, 13, 0, 13), new Coord2D(0, 8, 0, 8), new Coord2D(2, 4, 2, 4), new Coord2D(4, 2, 4, 2), new Coord2D(8, 0, 8, 0), new Coord2D(13, 0, 13, 0), new Coord2D(17, 2, 17, 2), new Coord2D(19, 4, 19, 4), new Coord2D(21, 8, 21, 8), new Coord2D(21, 13, 21, 13), new Coord2D(19, 17, 19, 17), new Coord2D(17, 19, 17, 19), new Coord2D(13, 21, 13, 21) }), 6, 21, 21, 72, 6, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5}); // Shape 167
		leftFrontWheelModel[1].setRotationPoint(30.5F, -0.5F, 18F);


		rightFrontWheelModel = new ModelRendererTurbo[2];
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import WFR
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Shape 168

		rightFrontWheelModel[0].addShape3D(10.5F, -10.5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(8, 21, 8, 21), new Coord2D(4, 19, 4, 19), new Coord2D(2, 17, 2, 17), new Coord2D(0, 13, 0, 13), new Coord2D(0, 8, 0, 8), new Coord2D(2, 4, 2, 4), new Coord2D(4, 2, 4, 2), new Coord2D(8, 0, 8, 0), new Coord2D(13, 0, 13, 0), new Coord2D(17, 2, 17, 2), new Coord2D(19, 4, 19, 4), new Coord2D(21, 8, 21, 8), new Coord2D(21, 13, 21, 13), new Coord2D(19, 17, 19, 17), new Coord2D(17, 19, 17, 19), new Coord2D(13, 21, 13, 21) }), 6, 21, 21, 72, 6, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5}); // Import WFR
		rightFrontWheelModel[0].setRotationPoint(0.5F, -0.5F, -18F);

		rightFrontWheelModel[1].addShape3D(10.5F, -10.5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(8, 21, 8, 21), new Coord2D(4, 19, 4, 19), new Coord2D(2, 17, 2, 17), new Coord2D(0, 13, 0, 13), new Coord2D(0, 8, 0, 8), new Coord2D(2, 4, 2, 4), new Coord2D(4, 2, 4, 2), new Coord2D(8, 0, 8, 0), new Coord2D(13, 0, 13, 0), new Coord2D(17, 2, 17, 2), new Coord2D(19, 4, 19, 4), new Coord2D(21, 8, 21, 8), new Coord2D(21, 13, 21, 13), new Coord2D(19, 17, 19, 17), new Coord2D(17, 19, 17, 19), new Coord2D(13, 21, 13, 21) }), 6, 21, 21, 72, 6, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5}); // Shape 168
		rightFrontWheelModel[1].setRotationPoint(29.5F, -0.5F, -18F);


		leftBackWheelModel = new ModelRendererTurbo[2];
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import WBL1
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import WBL2

		leftBackWheelModel[0].addShape3D(10.5F, -10.5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(8, 21, 8, 21), new Coord2D(4, 19, 4, 19), new Coord2D(2, 17, 2, 17), new Coord2D(0, 13, 0, 13), new Coord2D(0, 8, 0, 8), new Coord2D(2, 4, 2, 4), new Coord2D(4, 2, 4, 2), new Coord2D(8, 0, 8, 0), new Coord2D(13, 0, 13, 0), new Coord2D(17, 2, 17, 2), new Coord2D(19, 4, 19, 4), new Coord2D(21, 8, 21, 8), new Coord2D(21, 13, 21, 13), new Coord2D(19, 17, 19, 17), new Coord2D(17, 19, 17, 19), new Coord2D(13, 21, 13, 21) }), 6, 21, 21, 72, 6, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5}); // Import WBL1
		leftBackWheelModel[0].setRotationPoint(-58.5F, -0.5F, 18F);

		leftBackWheelModel[1].addShape3D(10.5F, -10.5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(8, 21, 8, 21), new Coord2D(4, 19, 4, 19), new Coord2D(2, 17, 2, 17), new Coord2D(0, 13, 0, 13), new Coord2D(0, 8, 0, 8), new Coord2D(2, 4, 2, 4), new Coord2D(4, 2, 4, 2), new Coord2D(8, 0, 8, 0), new Coord2D(13, 0, 13, 0), new Coord2D(17, 2, 17, 2), new Coord2D(19, 4, 19, 4), new Coord2D(21, 8, 21, 8), new Coord2D(21, 13, 21, 13), new Coord2D(19, 17, 19, 17), new Coord2D(17, 19, 17, 19), new Coord2D(13, 21, 13, 21) }), 6, 21, 21, 72, 6, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5}); // Import WBL2
		leftBackWheelModel[1].setRotationPoint(-58.5F, -0.5F, 11.5F);


		rightBackWheelModel = new ModelRendererTurbo[2];
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import WBR1
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 0, 485, textureX, textureY); // Import WBR2

		rightBackWheelModel[0].addShape3D(10.5F, -10.5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(8, 21, 8, 21), new Coord2D(4, 19, 4, 19), new Coord2D(2, 17, 2, 17), new Coord2D(0, 13, 0, 13), new Coord2D(0, 8, 0, 8), new Coord2D(2, 4, 2, 4), new Coord2D(4, 2, 4, 2), new Coord2D(8, 0, 8, 0), new Coord2D(13, 0, 13, 0), new Coord2D(17, 2, 17, 2), new Coord2D(19, 4, 19, 4), new Coord2D(21, 8, 21, 8), new Coord2D(21, 13, 21, 13), new Coord2D(19, 17, 19, 17), new Coord2D(17, 19, 17, 19), new Coord2D(13, 21, 13, 21) }), 6, 21, 21, 72, 6, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5}); // Import WBR1
		rightBackWheelModel[0].setRotationPoint(-58.5F, -0.5F, -18F);

		rightBackWheelModel[1].addShape3D(10.5F, -10.5F, -3F, new Shape2D(new Coord2D[] { new Coord2D(8, 21, 8, 21), new Coord2D(4, 19, 4, 19), new Coord2D(2, 17, 2, 17), new Coord2D(0, 13, 0, 13), new Coord2D(0, 8, 0, 8), new Coord2D(2, 4, 2, 4), new Coord2D(4, 2, 4, 2), new Coord2D(8, 0, 8, 0), new Coord2D(13, 0, 13, 0), new Coord2D(17, 2, 17, 2), new Coord2D(19, 4, 19, 4), new Coord2D(21, 8, 21, 8), new Coord2D(21, 13, 21, 13), new Coord2D(19, 17, 19, 17), new Coord2D(17, 19, 17, 19), new Coord2D(13, 21, 13, 21) }), 6, 21, 21, 72, 6, ModelRendererTurbo.MR_FRONT, new float[] {5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5 ,5 ,5 ,3 ,5}); // Import WBR2
		rightBackWheelModel[1].setRotationPoint(-58.5F, -0.5F, -11.5F);


		steeringWheelModel = new ModelRendererTurbo[20];
		steeringWheelModel[0] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 43
		steeringWheelModel[1] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 43
		steeringWheelModel[2] = new ModelRendererTurbo(this, 231, 59, textureX, textureY); // Box 43
		steeringWheelModel[3] = new ModelRendererTurbo(this, 210, 58, textureX, textureY); // Box 43
		steeringWheelModel[4] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 43
		steeringWheelModel[5] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 43
		steeringWheelModel[6] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 43
		steeringWheelModel[7] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 43
		steeringWheelModel[8] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 43
		steeringWheelModel[9] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 43
		steeringWheelModel[10] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 43
		steeringWheelModel[11] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 43
		steeringWheelModel[12] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 43
		steeringWheelModel[13] = new ModelRendererTurbo(this, 211, 60, textureX, textureY); // Box 43
		steeringWheelModel[14] = new ModelRendererTurbo(this, 219, 62, textureX, textureY); // Box 43
		steeringWheelModel[15] = new ModelRendererTurbo(this, 225, 61, textureX, textureY); // Box 43
		steeringWheelModel[16] = new ModelRendererTurbo(this, 229, 65, textureX, textureY); // Box 43
		steeringWheelModel[17] = new ModelRendererTurbo(this, 287, 98, textureX, textureY); // Box 43
		steeringWheelModel[18] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 43
		steeringWheelModel[19] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 43

		steeringWheelModel[0].addBox(-3.5F, -1F, -1F, 1, 2, 2, 0F); // Box 43
		steeringWheelModel[0].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[0].rotateAngleZ = -0.31415927F;

		steeringWheelModel[1].addBox(-4F, -1.5F, 3.5F, 1, 3, 1, 0F); // Box 43
		steeringWheelModel[1].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[1].rotateAngleZ = -0.31415927F;

		steeringWheelModel[2].addBox(-4F, -1.5F, -4.5F, 1, 3, 1, 0F); // Box 43
		steeringWheelModel[2].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[2].rotateAngleZ = -0.31415927F;

		steeringWheelModel[3].addBox(-4F, 3.5F, -1.5F, 1, 1, 3, 0F); // Box 43
		steeringWheelModel[3].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[3].rotateAngleZ = -0.31415927F;

		steeringWheelModel[4].addBox(-4F, -4.5F, -1.5F, 1, 1, 3, 0F); // Box 43
		steeringWheelModel[4].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[4].rotateAngleZ = -0.31415927F;

		steeringWheelModel[5].addShapeBox(-4F, -3.5F, 2.5F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 43
		steeringWheelModel[5].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[5].rotateAngleZ = -0.31415927F;

		steeringWheelModel[6].addShapeBox(-4F, -3.5F, -3.5F, 1, 2, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 43
		steeringWheelModel[6].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[6].rotateAngleZ = -0.31415927F;

		steeringWheelModel[7].addShapeBox(-4F, -3.5F, 2.5F, 1, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 43
		steeringWheelModel[7].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[7].rotateAngleZ = -0.31415927F;

		steeringWheelModel[8].addShapeBox(-4F, -3.5F, -3.5F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 43
		steeringWheelModel[8].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[8].rotateAngleZ = -0.31415927F;

		steeringWheelModel[9].addShapeBox(-4F, 2.5F, 2.5F, 1, 1, 1, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 43
		steeringWheelModel[9].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[9].rotateAngleZ = -0.31415927F;

		steeringWheelModel[10].addShapeBox(-4F, 2.5F, -3.5F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 43
		steeringWheelModel[10].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[10].rotateAngleZ = -0.31415927F;

		steeringWheelModel[11].addShapeBox(-3.5F, -0.25F, 1F, 1, 1, 3, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 43
		steeringWheelModel[11].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[11].rotateAngleZ = -0.31415927F;

		steeringWheelModel[12].addShapeBox(-3.5F, -0.25F, -4F, 1, 1, 3, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		steeringWheelModel[12].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[12].rotateAngleZ = -0.31415927F;

		steeringWheelModel[13].addShapeBox(-4F, 3.5F, 1.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 43
		steeringWheelModel[13].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[13].rotateAngleZ = -0.31415927F;

		steeringWheelModel[14].addShapeBox(-4F, -4.5F, 1.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F); // Box 43
		steeringWheelModel[14].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[14].rotateAngleZ = -0.31415927F;

		steeringWheelModel[15].addShapeBox(-4F, -4.5F, -3.5F, 1, 1, 2, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		steeringWheelModel[15].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[15].rotateAngleZ = -0.31415927F;

		steeringWheelModel[16].addShapeBox(-4F, 3.5F, -3.5F, 1, 1, 2, 0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		steeringWheelModel[16].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[16].rotateAngleZ = -0.31415927F;

		steeringWheelModel[17].addShapeBox(-3.5F, 1F, -0.5F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 43
		steeringWheelModel[17].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[17].rotateAngleZ = -0.31415927F;

		steeringWheelModel[18].addShapeBox(-4F, 1.5F, -3.5F, 1, 2, 1, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 43
		steeringWheelModel[18].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[18].rotateAngleZ = -0.31415927F;

		steeringWheelModel[19].addShapeBox(-4F, 1.5F, 2.5F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 43
		steeringWheelModel[19].setRotationPoint(35.5F, -30F, 12.25F);
		steeringWheelModel[19].rotateAngleZ = -0.31415927F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}