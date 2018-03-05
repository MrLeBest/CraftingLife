package fr.mrlebest.craftingmod.common.network;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.EnumType;

import cpw.mods.fml.common.network.ByteBufUtils;
import fr.mrlebest.craftingmod.block.Blocks;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class PacketSpawn extends PacketBase{
	
	public String vehicleshortname;
	
    public PacketSpawn(String str)
    {
    	vehicleshortname = str;
    }
    
    public PacketSpawn()
    {

    }
	
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		ByteBufUtils.writeUTF8String(data, vehicleshortname);
		
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
		vehicleshortname = ByteBufUtils.readUTF8String(data);
		
	}

	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) {
		for (int x = (int) (playerEntity.posX - 30); x < playerEntity.posX + 30; x++) {
			for (int y = (int) (playerEntity.posY - 30); y < playerEntity.posY + 30; y++) {
				for (int z = (int) (playerEntity.posZ - 30); z < playerEntity.posZ + 30; z++) {
					if(playerEntity.getEntityWorld().getBlock(x, y, z) == Blocks.blockSpawn){
					EntityVehicle vehicle;
					NBTTagCompound tag = new NBTTagCompound();
					tag.setString("Type", vehicleshortname);
					tag.setString("Engine", ((PartType) PartType.defaultEngines.get(EnumType.vehicle)).shortName);
					VehicleType typevehi = (VehicleType) VehicleType.getDriveable(vehicleshortname);
					FlansMod.packetHandler.sendTo(new PacketVerfication(true), playerEntity);
					if (typevehi != null) {
						vehicle = new EntityVehicle(playerEntity.getEntityWorld(), x, y + 2, z, typevehi, new DriveableData(tag));
						vehicle.setOwner(playerEntity.getGameProfile());
						playerEntity.getEntityWorld().spawnEntityInWorld(vehicle);
						playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.GREEN + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + "Un voiturier a garé votre véhicule sur le §aparking avant de le vérrouillé."));
					}
					return;
				}
			}
		}
	}
		 playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.AQUA + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + " Il n'y a pas de block Spawn dans les environ."));
	}

	@Override
	public void handleClientSide(EntityPlayer clientPlayer) {
		// TODO Auto-generated method stub
		
	}

}
