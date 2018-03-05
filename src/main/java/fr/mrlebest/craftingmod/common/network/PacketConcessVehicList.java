package fr.mrlebest.craftingmod.common.network;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.event.WorldSaveData;
import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;

public class PacketConcessVehicList implements IMessage 
{
	public static class HandlerServer implements IMessageHandler<PacketConcessVehicList, IMessage> 
	{
		@Override
		public IMessage onMessage(PacketConcessVehicList message, MessageContext ctx) {
			int action = message.data.getInteger("Action");
			if(action == 1) { //Add and sync with clients
				int list = message.data.getInteger("List");
				switch(list) {
				case 0:
					WorldSaveData.vehicivil.put(message.data.getString("vehic"), message.data.getInteger("price"));
					break;
				case 1:
					WorldSaveData.vehigendarmerie.put(message.data.getString("vehic"), message.data.getInteger("price"));
					break;
				case 2:
					WorldSaveData.vehiluxe.put(message.data.getString("vehic"), message.data.getInteger("price"));
					break;
				case 3:
					WorldSaveData.vehicamion.put(message.data.getString("vehic"), message.data.getInteger("price"));
					break;
				case 4:
					WorldSaveData.vehipompier.put(message.data.getString("vehic"), message.data.getInteger("price"));
					break;
				}
				WorldSaveData.instance().markDirty();
				CraftingMod.network.sendToAll(new PacketConcessVehicList(message.data));
			}
			return null;
		}
	}
	public static class HandlerClient implements IMessageHandler<PacketConcessVehicList, IMessage>
	{
		@Override
		@SideOnly(Side.CLIENT)
		public IMessage onMessage(PacketConcessVehicList message, MessageContext ctx) {
			int action = message.data.getInteger("Action");
			if(action == 1) { //Add
				int list = message.data.getInteger("List");
				switch(list) {
				case 0:
					WorldSaveData.vehicivil.put(message.data.getString("vehic"), message.data.getInteger("price"));
					break;
				case 1:
					WorldSaveData.vehigendarmerie.put(message.data.getString("vehic"), message.data.getInteger("price"));
					break;
				case 2:
					WorldSaveData.vehiluxe.put(message.data.getString("vehic"), message.data.getInteger("price"));
					break;
				case 3:
					WorldSaveData.vehicamion.put(message.data.getString("vehic"), message.data.getInteger("price"));
					break;
				case 4:
					WorldSaveData.vehipompier.put(message.data.getString("vehic"), message.data.getInteger("price"));
					break;
				}
			}
			else if(action == 2) { //Set all
				WorldSaveData.vehicivil.clear(); WorldSaveData.vehigendarmerie.clear(); WorldSaveData.vehiluxe.clear(); WorldSaveData.vehicamion.clear(); WorldSaveData.vehipompier.clear();
		    	
		        NBTTagList tagList = message.data.getTagList("VehiculeCivilList", Constants.NBT.TAG_COMPOUND);
		        for(int i = 0; i < tagList.tagCount(); i++)
		        {
		        	NBTTagCompound tag = tagList.getCompoundTagAt(i);
		        	WorldSaveData.vehicivil.put(tag.getString("name"), tag.getInteger("price"));
		        }
		        
		        tagList = message.data.getTagList("VehiculeGendarmerie", Constants.NBT.TAG_COMPOUND);
		        for(int i = 0; i < tagList.tagCount(); i++)
		        {
		        	NBTTagCompound tag = tagList.getCompoundTagAt(i);
		        	WorldSaveData.vehigendarmerie.put(tag.getString("name"), tag.getInteger("price"));
		        }
		        
		        tagList = message.data.getTagList("VehiculeLuxe", Constants.NBT.TAG_COMPOUND);
		        for(int i = 0; i < tagList.tagCount(); i++)
		        {
		        	NBTTagCompound tag = tagList.getCompoundTagAt(i);
		        	WorldSaveData.vehiluxe.put(tag.getString("name"), tag.getInteger("price"));
		        }
		        
		        tagList = message.data.getTagList("VehiculeCamion", Constants.NBT.TAG_COMPOUND);
		        for(int i = 0; i < tagList.tagCount(); i++)
		        {
		        	NBTTagCompound tag = tagList.getCompoundTagAt(i);
		        	WorldSaveData.vehicamion.put(tag.getString("name"), tag.getInteger("price"));
		        }
		        
		        tagList = message.data.getTagList("VehiculePompier", Constants.NBT.TAG_COMPOUND);
		        for(int i = 0; i < tagList.tagCount(); i++)
		        {
		        	NBTTagCompound tag = tagList.getCompoundTagAt(i);
		        	WorldSaveData.vehipompier.put(tag.getString("name"), tag.getInteger("price"));
		        }
			}
			return null;
		}
	}

	private NBTTagCompound data;
	
	public PacketConcessVehicList() {}
	public PacketConcessVehicList(NBTTagCompound data) {
		this.data = data;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		data = ByteBufUtils.readTag(buf);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeTag(buf, data);
	}
}
