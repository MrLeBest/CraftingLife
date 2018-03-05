package fr.mrlebest.craftingmod.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import fr.mrlebest.craftingmod.common.network.PacketAnim;


public class EventHandlerAnimation
{
    private ExtPropCraftingLife anim;
    private int currentIndex = -1;
    public static int ticks;
    public static int couleur = 0;

    @SubscribeEvent
    //@SideOnly(Side.CLIENT)
    public void TickEvent(PlayerTickEvent event)
    {

        if (event.player.worldObj.isRemote){
        // anim.tickHand = 0;
       anim = ExtPropCraftingLife.get(event.player); 
        //System.out.println(anim.tickHand);
       //anim.sync();
        switch(anim.getAnimId())
        {
            case 1:
                anim.tick++;
                if(anim.tick <= 35)
                {
                    if(anim.tickHand >= -1.5)
                    {
                        anim.tickHand -= 0.1;
                    }
                    if(anim.tick == 10)
                    {
                        anim.tick = 0;
                        anim.tickRightHand = 0;
                        anim.tickLeftHand = 0;
                        anim.verify = 0;
                        CraftingMod.network.sendToServer(new PacketAnim(4));
                    }

                }
                break;
            case 2:
                anim.tick++;
                // System.out.println(tci);
                if(anim.tick <= 35)
                {
                    if(anim.tickHand >= -3.1)
                    {
                        anim.tickHand -= 0.1;
                    }
                    if (anim.tickHand >= -3.1){
                        anim.handUp = false;
                    }
                }
                break;
            case 3:
                anim.tick++;
                // System.out.println(tickbas);
                if(anim.tick <= 35)
                {
                    if(anim.tickHand < 0)
                    {
                        anim.tickHand += 0.1;
                    }
                    if(anim.tick >= 35)
                    {
                        anim.animation = false;
                        anim.name = null;
                        CraftingMod.network.sendToServer(new PacketAnim(0));
                    }
                }
                break;

            case 4:
                // System.out.println("Tffff");
                anim.tick++;
                if(anim.tick <= 35)
                {
                    if(anim.tickRightHand >= -0.5)
                    {
                        // System.out.println("Test");
                        anim.tickRightHand -= 0.15;
                    }
                    if(anim.tickLeftHand <= 0.5)
                    {
                        anim.tickLeftHand += 0.15;
                    }
//                    if(anim.tick == 10 && anim.verify <= 4)
//                    {
//                        anim.tick = 0;
//                        anim.verify += 1;
//                        CraftingMod.network.sendToServer(new PacketAnim(5));
//                    }
                    if(anim.verify == 5)
                    {
                        if(anim.tickHand <= -1.5)
                        {
                            anim.tickHand += 0.1;
                        }
                        if(anim.tick == 10)
                        {
                            anim.animation = false;
                            anim.name = null;
                            CraftingMod.network.sendToServer(new PacketAnim(0));
                        }
                    }

                }
                break;

            case 5:
                anim.tick++;
                if(anim.tickRightHand < -0)
                {
                    // System.out.println("Test");
                    anim.tickRightHand += 0.15;
                }
                if(anim.tickLeftHand > 0)
                {
                    anim.tickLeftHand -= 0.15;
                }
                if(anim.tick == 10 && anim.verify <= 4)
                {
                    anim.tick = 0;
                    //System.out.println("testff");
                    CraftingMod.network.sendToServer(new PacketAnim(4));
                }
                if(anim.verify == 5)
                {
                    if(anim.tickHand >= -1.5)
                    {
                        anim.tickHand += 0.1;
                    }
                    if(anim.tick == 10)
                    {
                        anim.animation = false;
                        anim.name = null;
                        CraftingMod.network.sendToServer(new PacketAnim(0));
                    }
                }
                break;
                

        } 
        //System.out.println(event.player.getDisplayName() + " " + anim.getAnimId()+ " " +anim.tick + " " + anim.tickHand);
        // System.out.println(Minecraft.getMinecraft().thePlayer.getHealth());
        /*
         * if (Minecraft.getMinecraft().thePlayer.getHealth() == 1.0F){
         * anim.coma = !anim.coma;
         * CraftingMod.network.sendToServer(new PacketAnim(10));
         * System.out.println("Test");
         * Minecraft.getMinecraft().displayGuiScreen(new GuiComa(event.player));
         * }*/

                if (event.player.inventory.currentItem != currentIndex){
                    if (anim.animation){
                    event.player.inventory.currentItem = currentIndex;
                    }
                }
        }
        
        ticks++;
        if (ticks == 500){
            ticks = 0;
        }
        //ticks = 0;
    }
        

}
