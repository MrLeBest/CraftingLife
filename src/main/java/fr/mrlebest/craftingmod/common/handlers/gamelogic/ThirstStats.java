package fr.mrlebest.craftingmod.common.handlers.gamelogic;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mrlebest.craftingmod.item.ItemDrink;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import net.minecraftforge.common.util.Constants.NBT;

/**
	BSD License
	Copyright (c) 2017 www.team-grahou.fr/
	All rights reserved.
	
	Redistribution and use in source and binary forms, with or without
	modification, are permitted provided that the following conditions are met:
	
	- Redistributions of source code must retain the above copyright notice, this list of
	conditions and the following disclaimer.
	
	- Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in
	the documentation and/or other materials provided with the distribution
	
	- Neither the name of CraftingLife nor the names of its contributors may be used to endorse
	or promote products derived from this software without specific prior written
	permission.
	
	THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
	EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
	OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
	SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
	INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
	TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
	BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
	CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
	WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
	DAMAGE.
 * 
 * Date: 11/11/2017
 * @author plaigon
 * Main class of Thirst player system, who saves vars to an NBT object, finally going into ExtProp.
 * This class also handles tick logic function (to decrease regarding player exhaustion (from FoodStats class), or to increase).
 */
public class ThirstStats
{
	public static final short THIRST_DEFAULT_MAX_VALUE = 100;

    private short currentThirstLevel = 0;
    private int thirstTimer;
    private float thirstSaturation = 5;
    
    /**
     * @param float healedThirstAmount : amount we are going to use for reducing the thirst level
     * @param float addedSaturation : amount we are going to use for increasing the saturation level
     */
    private final void addStats(short healedThirstAmount, float addedSaturation)
    {
        this.currentThirstLevel = (short) Math.min(this.currentThirstLevel + healedThirstAmount, THIRST_DEFAULT_MAX_VALUE);
        this.thirstSaturation = (int)Math.min(this.thirstSaturation + addedSaturation, 5);
    }

    /**
     * @param ItemDrink drunkItem : item drunk by the player
     * Get and add stats from drunk item to player thirst vars
     */
    public final void addStatsFromDrinkStats(ItemDrink drunkItem)
    {
        this.addStats(drunkItem.healedThirstAmount, drunkItem.addedSaturation);
    }

    /**
     * @param EntityPlayer player : player instance for who we are updating thirst system logic
     * Handles the food game logic.
     */
    public final void onTick(EntityPlayer player)
    {
        EnumDifficulty enumdifficulty = player.worldObj.difficultySetting;
        if(player.getFoodStats().foodExhaustionLevel > 4.0F)
        {
            if(this.thirstSaturation > 0.0F)
                this.thirstSaturation = Math.max(this.thirstSaturation - 1.0F, 0.0F);
            if(this.thirstSaturation == 0.0F && enumdifficulty != EnumDifficulty.PEACEFUL)
                this.currentThirstLevel = (short) Math.min(this.currentThirstLevel + 1, THIRST_DEFAULT_MAX_VALUE);
            System.out.println(this.currentThirstLevel);
        }
        
        if(this.currentThirstLevel >= THIRST_DEFAULT_MAX_VALUE)
        {
            ++this.thirstTimer;
            if(this.thirstTimer >= 80)
            {
                if(player.getHealth() > 10.0F || enumdifficulty == EnumDifficulty.HARD || player.getHealth() > 1.0F && enumdifficulty == EnumDifficulty.NORMAL)
                    player.attackEntityFrom(DamageSource.starve, 1.0F);

                this.thirstTimer = 0;
            }
        }
        else
            this.thirstTimer = 0;
    }

    
    /**
     * @param NBTTagCompound compound : nbttag object, from which we are going to read stored variables
     * Read thirst system vars from player's nbttag object
     */
    public final void readNBT(NBTTagCompound compound)
    {
        if(compound.hasKey("thirstLevel", NBT.TAG_SHORT))
        {
            this.currentThirstLevel = compound.getShort("thirstLevel");
            this.thirstTimer = compound.getInteger("thirstTimer");
            this.thirstSaturation = compound.getFloat("thirstSaturation");
        }
    }

    /**
     * @param NBTTagCompound cmopound : clean nbt tag in which we are going to write thirst variables
     * Write thirst system vars in a new player's nbttag object
     */
    public final void writeNBT(NBTTagCompound compound)
    {
        compound.setShort("thirstLevel", this.currentThirstLevel);
        compound.setInteger("thirstTimer", this.thirstTimer);
        compound.setFloat("thirstSaturation", this.thirstSaturation);
    }

    /**
     * Get the player's thirst level.
     */
    public final int getCurrentThirstLevel()
    {
        return this.currentThirstLevel;
    }

    /**
     * If water level is not max.
     */
    public final boolean needToDrink()
    {
        return this.currentThirstLevel < THIRST_DEFAULT_MAX_VALUE;
    }

    /**
     * Get the player's thirst saturation level.
     */
    public final float getSaturationLevel()
    {
        return this.thirstSaturation;
    }

    /**
     * @param short newLevelValue: new thirst level value
     * Set the thirst level to a new value
     */
    @SideOnly(Side.CLIENT)
    public final void setThirstLevel(short newLevelValue)
    {
        this.currentThirstLevel = newLevelValue;
    }

    /**
     * @param float newSaturationValue : new thirst level value
     * Set the saturation level to a new value
     */
    @SideOnly(Side.CLIENT)
    public final void setThirstSaturation(float newSaturationValue)
    {
        this.thirstSaturation = newSaturationValue;
    }
}