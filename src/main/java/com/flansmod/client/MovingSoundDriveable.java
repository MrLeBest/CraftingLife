package com.flansmod.client;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityVehicle;

import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.ResourceLocation;

//TODO : Implement this!
public class MovingSoundDriveable extends MovingSound 
{
	private final EntityVehicle driveable;
	private float field_147669_l = 0.0F;
	
	public MovingSoundDriveable(ResourceLocation sound, EntityVehicle driveable)
	{
	    super(sound);
	    this.driveable = driveable;
	    repeat = true;
	    //Repeat delay?
	    field_147665_h = 0;
	    System.out.println("Ca marchelol");
	}
	
	/**
	 * Updates the JList with a new model.
	 */
	public void update()
	{
	    System.out.println(driveable.isDead+"fff"+driveable.isSirenActive());
	    if(driveable.isDead || !this.driveable.isSirenActive())
	    {
	        donePlaying = true;
	    }
	    else
	    {
	        xPosF = (float)driveable.posX;
	        yPosF = (float)driveable.posY;
	        zPosF = (float)driveable.posZ;
	        
	    }
	}
	}
