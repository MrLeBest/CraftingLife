package fr.mrlebest.craftingmod.common.commands;

import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.event.EventHandlerFeu;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public class CommandTest extends CommandBase
{

    @Override
    public String getCommandName()
    {
        return "test";
    }

    @Override
    public String getCommandUsage(ICommandSender p_71518_1_)
    {
        // TODO Auto-generated method stub
        return "Usage: /test";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args)
    {
        if(sender instanceof EntityPlayer)
        {
            EntityPlayerMP playermp = (EntityPlayerMP)sender;
            //playermp.inventory.addItemStackToInventory(new ItemStack(CraftingMod.itemPhone, 1));
            EventHandlerFeu.enabled = !EventHandlerFeu.enabled;
        }
        

    }
    
}

