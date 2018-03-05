package fr.mrlebest.craftingmod.common.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityTest extends EntityLiving
{
    
    public int startAnimID;

    public EntityTest(World world)
    {
        super(world);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        dataWatcher.addObject(2, Byte.valueOf((byte)0));
        dataWatcher.addObject((byte)3, (int)0);//frameIndex de l'anim
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("AnimID", getAnimID());
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
        setAnimID(compound.getInteger("AnimID"));
    }
    
    public int getAnimID()
    {
        return dataWatcher.getWatchableObjectByte(2);
    }

    public void setAnimID(int i)
    {
        dataWatcher.updateObject(2, Byte.valueOf((byte)i));

    }
    
    public int getFrameAnimIndex()
    {
        return this.dataWatcher.getWatchableObjectInt((byte)3);
    }

    public void setFrameAnimIndex(int newIndex)
    {
     this.dataWatcher.updateObject((byte)3, (int)newIndex);
    }

}
