package fr.mrlebest.craftingmod.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import fr.mrlebest.craftingmod.glutils.TessellatorModel;
import fr.mrlebest.craftingmod.renderer.TESRFeu;
import fr.mrlebest.craftingmod.renderer.TESRFeuG2;

public class EventHandlerFeu
{
    private int ticks = 0;
    public static int couleur = 0;
    public static boolean enabled = true;

    @SubscribeEvent
    public void onTick(ClientTickEvent event)
    {
        if(enabled)
        {
            ticks++;
//            if(ticks == 80 && couleur == 0)
//            {
//                TESRFeu.model = new TessellatorModel("/assets/obj/model_feu_vert.obj");
//                TESRFeuG2.model = new TessellatorModel("/assets/obj/model_feu_rouge.obj");
//                couleur = 1;
//            }
//            else if(ticks == 400 && couleur == 1)
//            {
//                TESRFeu.model = new TessellatorModel("/assets/obj/model_feu_orange.obj");
//                TESRFeuG2.model = new TessellatorModel("/assets/obj/model_feu_rouge.obj");
//                couleur = 2;
//                ticks = 0;
//            }
//            else if(ticks == 80 && couleur == 2)
//            {
//                TESRFeu.model = new TessellatorModel("/assets/obj/model_feu_rouge.obj");
//                TESRFeuG2.model = new TessellatorModel("/assets/obj/model_feu_vert.obj");
//                couleur = 3;
//
//            }
//            else if(ticks == 400 && couleur == 3)
//            {
//                TESRFeu.model = new TessellatorModel("/assets/obj/model_feu_rouge.obj");
//                TESRFeuG2.model = new TessellatorModel("/assets/obj/model_feu_orange.obj");
//                couleur = 0;
//                ticks = 0;
//            }
        }
    }

}
