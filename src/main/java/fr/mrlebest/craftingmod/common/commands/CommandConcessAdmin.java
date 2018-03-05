package fr.mrlebest.craftingmod.common.commands;

import java.util.List;

import com.flansmod.common.FlansMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mrlebest.craftingmod.client.gui.GuiScreenConcessAdmin;
import fr.mrlebest.craftingmod.client.gui.GuiScreenConcessionnaire;
import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.common.network.PacketGuiAdminConcess;
import fr.mrlebest.craftingmod.common.network.PacketLock;
import fr.mrlebest.craftingmod.common.network.PacketOpenGui;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class CommandConcessAdmin extends CommandBase {

	@Override
	public String getCommandName() {
		return "concess";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "Vous devez faire /concess";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) {
		if (sender instanceof EntityPlayer) {
			EntityPlayerMP playermp = (EntityPlayerMP) sender;
			CraftingMod.network.sendTo(new PacketGuiAdminConcess(), playermp);

		}
	}
}
