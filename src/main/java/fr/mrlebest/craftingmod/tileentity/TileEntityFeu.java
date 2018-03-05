package fr.mrlebest.craftingmod.tileentity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileEntityFeu extends TileEntity
{

    private byte direction;
    private byte lightState;
    private short timer;

    public byte getLightState()
    {
        return lightState;
    }

    @Override
    public void updateEntity()
    {
        if(this.worldObj.getTotalWorldTime()%40 == 0) {
            if (this.getLightState() == 0)
            this.setLightState((byte)1);
            else
            this.setLightState((byte)0);
        }
    }

    public short getTimer()
    {
        return timer;
    }

    public void setTimer(short timer)
    {
        this.timer = timer;
        this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);

    }

    public void setLightState(byte lightState)
    {
        this.lightState = lightState;
        this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
    }
    
    

    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        this.direction = compound.getByte("Direction");
        this.lightState = compound.getByte("LightState");
    }

    @Override
    public void writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);
        compound.setByte("Direction", this.direction);
        compound.setByte("LightState", this.lightState);
    }

    public byte getDirection()
    {
        return direction;
    }

    public void setDirection(byte direction)
    {
        this.direction = direction;
        this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
    }
    public Packet getDescriptionPacket()
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        this.writeToNBT(nbttagcompound);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 0, nbttagcompound);
    }

    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt)
    {
        this.readFromNBT(pkt.func_148857_g());
        this.worldObj.markBlockRangeForRenderUpdate(this.xCoord, this.yCoord, this.zCoord, this.xCoord, this.yCoord, this.zCoord);
    }


}
