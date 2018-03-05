package fr.mrlebest.craftingmod.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import fr.mrlebest.craftingmod.common.network.PacketThirst;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class EventHandlerEEP
{
    @SubscribeEvent
    public void onEntityConstructing(EntityConstructing event)
    {
        if(event.entity instanceof EntityPlayer && ExtPropCraftingLife.get((EntityPlayer)event.entity) == null)
            ExtPropCraftingLife.register((EntityPlayer)event.entity);
    }

    @SubscribeEvent
    public void onClone(PlayerEvent.Clone event)
    {
        if(event.wasDeath)
        {
            ExtPropCraftingLife old = ExtPropCraftingLife.get(event.original);
            ExtPropCraftingLife newPlayer = ExtPropCraftingLife.get(event.entityPlayer);
            newPlayer.vehiculeList = old.vehiculeList;
            newPlayer.vehiculeGendarme = old.vehiculeGendarme;
            newPlayer.thirstSystem = old.thirstSystem;
        }
    }

    @SubscribeEvent
    public void onUpdateEEP(PlayerTickEvent event)
    {
        if(event.phase == Phase.START)
        {
            if(!event.player.worldObj.isRemote)
            {
                ExtPropCraftingLife.get(event.player).thirstSystem.onTick(event.player);
                if(ExtPropCraftingLife.get(event.player).thirstSystem.getCurrentThirstLevel() != ExtPropCraftingLife.get(event.player).lastThirstLevel)
                {
                    CraftingMod.network.sendTo(new PacketThirst((short)ExtPropCraftingLife.get(event.player).thirstSystem.getCurrentThirstLevel()), (EntityPlayerMP)event.player);
                    ExtPropCraftingLife.get(event.player).lastThirstLevel = (short)ExtPropCraftingLife.get(event.player).thirstSystem.getCurrentThirstLevel();
                }
            }
        }
    }

}
