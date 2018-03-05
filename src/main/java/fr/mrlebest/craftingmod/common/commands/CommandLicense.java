package fr.mrlebest.craftingmod.common.commands;

import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class CommandLicense extends CommandBase {

	public static boolean licensetest;

	@Override
	public String getCommandName() {
		return "license";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "Vous devez faire /license <joueur> <nom de la license>";
	}


	@Override
	public void processCommand(ICommandSender sender, String[] arguments) {
	    World world = sender.getEntityWorld();
	    List<EntityPlayerMP> allPlayers = MinecraftServer.getServer().getConfigurationManager().playerEntityList;
	    for (EntityPlayerMP player : allPlayers)
	    {
			if(arguments.length <= 0)
				throw new WrongUsageException(this.getCommandUsage(sender));
			if(arguments[0].matches(player.getDisplayName()))
			{
				if(arguments.length == 1)
				{
					throw new WrongUsageException(this.getCommandUsage(sender));
					
				}else if(arguments[1].matches("test"))
				{
					sender.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN + "Vous avez bien acheter la license de" + EnumChatFormatting.GREEN + arguments[1]));
					this.licensetest = true;
				}
				
			}
	            	
	            }
	        }
	public List addTabCompletionOptions(ICommandSender sender, String[] arguments)
	{
		return arguments.length == 0 ? getListOfStringsMatchingLastWord(arguments, this.getPlayers()) : null;
	}
	
	protected String[] getPlayers()
    {
            return MinecraftServer.getServer().getAllUsernames();
    }
		
	    	

	}

