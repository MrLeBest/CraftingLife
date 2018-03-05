package fr.mrlebest.craftingmod.tileentity;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.Constants;

public class TileEntityGarage extends TileEntity
{
    
    public final static List<String> lastsVehicle = new ArrayList(0);
    public final static List<String> lastsVehicleGendarme = new ArrayList(0);
    public boolean garageAll = false;
    public boolean garageGendarmerie = false;
    
    private byte direction;
    

    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        this.direction = compound.getByte("Direction");
        this.garageAll = compound.getBoolean("GarageAll");
        this.garageGendarmerie = compound.getBoolean("GarageGendarmerie");
    }

    @Override
    public void writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);
        compound.setByte("Direction", this.direction);
        compound.setBoolean("GarageAll", this.garageAll);
        compound.setBoolean("GarageGendarmerie", this.garageAll);
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
    
    public boolean isGarage(String garageType)
    {
        if (garageType.equalsIgnoreCase("gendarmerie")){
            return garageGendarmerie;
        }else if (garageType.equalsIgnoreCase("all")){
            return garageAll;
        }
        return garageAll;
    }
    

    public void setGarage(String garageType, boolean value)
    {
        if (garageType.equalsIgnoreCase("gendarmerie")){
            this.garageGendarmerie = value;
            this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
        }else if (garageType.equalsIgnoreCase("all")){
            this.garageGendarmerie = value;
            this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
        }
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
