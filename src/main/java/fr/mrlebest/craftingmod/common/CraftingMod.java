package fr.mrlebest.craftingmod.common;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.opengl.Display;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.aymericred.newinventory.InventoryMod;
import fr.mrlebest.craftingmod.block.Blocks;
import fr.mrlebest.craftingmod.client.gui.GuiOverlay;
import fr.mrlebest.craftingmod.client.gui.VehicleOverlay;
import fr.mrlebest.craftingmod.common.commands.CommandConcessAdmin;
import fr.mrlebest.craftingmod.common.commands.CommandLicense;
import fr.mrlebest.craftingmod.common.commands.CommandTest;
import fr.mrlebest.craftingmod.common.creativetabs.CraftingModCreativeTabs;
import fr.mrlebest.craftingmod.common.creativetabs.CraftingModFoodCreativeTabs;
import fr.mrlebest.craftingmod.common.entity.EntityConcessionnaire;
import fr.mrlebest.craftingmod.common.entity.EntityItem;
import fr.mrlebest.craftingmod.common.entity.EntityTest;
import fr.mrlebest.craftingmod.common.network.PacketAnim;
import fr.mrlebest.craftingmod.common.network.PacketAnimHand;
import fr.mrlebest.craftingmod.common.network.PacketConcessVehicList;
import fr.mrlebest.craftingmod.common.network.PacketConcessionnaire;
import fr.mrlebest.craftingmod.common.network.PacketDead;
import fr.mrlebest.craftingmod.common.network.PacketGarage;
import fr.mrlebest.craftingmod.common.network.PacketGarageGendarme;
import fr.mrlebest.craftingmod.common.network.PacketGuiAdminConcess;
import fr.mrlebest.craftingmod.common.network.PacketOpenGui;
import fr.mrlebest.craftingmod.common.network.PacketThirst;
import fr.mrlebest.craftingmod.event.CmEventHandler;
import fr.mrlebest.craftingmod.event.EventHandlerAnimation;
import fr.mrlebest.craftingmod.event.EventHandlerEEP;
import fr.mrlebest.craftingmod.event.EventHandlerFeu;
import fr.mrlebest.craftingmod.event.EventTest;
import fr.mrlebest.craftingmod.item.Items;
import fr.mrlebest.craftingmod.proxy.CommonProxy;
import fr.mrlebest.craftingmod.tileentity.TileEntityAeration;
import fr.mrlebest.craftingmod.tileentity.TileEntityBarrier;
import fr.mrlebest.craftingmod.tileentity.TileEntityBouton;
import fr.mrlebest.craftingmod.tileentity.TileEntityBureauD;
import fr.mrlebest.craftingmod.tileentity.TileEntityCafe;
import fr.mrlebest.craftingmod.tileentity.TileEntityCaisse;
import fr.mrlebest.craftingmod.tileentity.TileEntityCamera;
import fr.mrlebest.craftingmod.tileentity.TileEntityCasier;
import fr.mrlebest.craftingmod.tileentity.TileEntityCoca;
import fr.mrlebest.craftingmod.tileentity.TileEntityCompteur;
import fr.mrlebest.craftingmod.tileentity.TileEntityEssence;
import fr.mrlebest.craftingmod.tileentity.TileEntityEtalage;
import fr.mrlebest.craftingmod.tileentity.TileEntityFeu;
import fr.mrlebest.craftingmod.tileentity.TileEntityFeuG2;
import fr.mrlebest.craftingmod.tileentity.TileEntityFeux;
import fr.mrlebest.craftingmod.tileentity.TileEntityFoot;
import fr.mrlebest.craftingmod.tileentity.TileEntityGarage;
import fr.mrlebest.craftingmod.tileentity.TileEntityGas;
import fr.mrlebest.craftingmod.tileentity.TileEntityGrapePress;
import fr.mrlebest.craftingmod.tileentity.TileEntityPanderie;
import fr.mrlebest.craftingmod.tileentity.TileEntityPerceuse;
import fr.mrlebest.craftingmod.tileentity.TileEntityPhone;
import fr.mrlebest.craftingmod.tileentity.TileEntityStand;
import fr.mrlebest.craftingmod.tileentity.TileEntityTrash;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = "craftingmod", name = "CraftingMod", version = "1.0.0")// , dependencies = "required-after:new-inventory@[1.0.0]")

public class CraftingMod
{
    public CraftingMod()
    {
        if(FMLCommonHandler.instance().getSide().isClient())
        {
            Display.setTitle("CraftingLife V3 | Minecraft 1.7.10");
        }
    }

    @Instance("craftingmod")
    public static CraftingMod instance;

    @SidedProxy(clientSide = "fr.mrlebest.craftingmod.proxy.ClientProxy", serverSide = "fr.mrlebest.craftingmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs craftingmodCreativeTabs = new CraftingModCreativeTabs("craftingmod_creative_tabs");
    public static CreativeTabs craftingmodFoodCreativeTabs = new CraftingModFoodCreativeTabs("craftingmodfood_creative_tabs");

    public static int fuele = 50;

    public static String[] protectedVehicles = {"flogholly_Vehicle_Tempest"};

    public static SimpleNetworkWrapper network;

    public float interp;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Blocks.registerBlocks();
        Items.registerItems();

        network = NetworkRegistry.INSTANCE.newSimpleChannel("craftingmod");
        network.registerMessage(PacketOpenGui.Handler.class, PacketOpenGui.class, 3, Side.CLIENT);
        network.registerMessage(PacketAnim.CommonHandler.class, PacketAnim.class, 4, Side.SERVER);
        network.registerMessage(PacketGuiAdminConcess.Handler.class, PacketGuiAdminConcess.class, 0, Side.CLIENT);
        network.registerMessage(PacketGarage.ClientHandler.class, PacketGarage.class, 1, Side.CLIENT);
        network.registerMessage(PacketGarage.CommonHandler.class, PacketGarage.class, 1, Side.SERVER);
        network.registerMessage(PacketGarageGendarme.ClientHandler.class, PacketGarageGendarme.class, 2, Side.CLIENT);
        network.registerMessage(PacketGarageGendarme.CommonHandler.class, PacketGarageGendarme.class, 2, Side.SERVER);
        network.registerMessage(PacketConcessionnaire.CommonHandler.class, PacketConcessionnaire.class, 5, Side.SERVER);
        network.registerMessage(PacketDead.CommonHandler.class, PacketDead.class, 6, Side.SERVER);
        network.registerMessage(PacketAnimHand.CommonHandler.class, PacketAnimHand.class, 7, Side.SERVER);
        network.registerMessage(PacketAnimHand.ClientHandler.class, PacketAnimHand.class, 8, Side.CLIENT);
        network.registerMessage(PacketThirst.ClientHandler.class, PacketThirst.class, 9, Side.CLIENT);
        network.registerMessage(PacketConcessVehicList.HandlerClient.class, PacketConcessVehicList.class, 10, Side.CLIENT);
        network.registerMessage(PacketConcessVehicList.HandlerServer.class, PacketConcessVehicList.class, 11, Side.SERVER);

        // Configuration
        Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
        try
        {
            cfg.load();
            fuele = cfg.get("1 - Flan's Mod", "Diviseur d'essence", fuele).getInt();
        }
        catch(Exception ex)
        {
            System.out.println("Impossible de chargé la configuration");
        }
        finally
        {
            if(cfg.hasChanged())
            {
                cfg.save();
            }
        }

    }

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event)
    {
        event.registerServerCommand(new CommandTest());
        event.registerServerCommand(new CommandLicense());
        event.registerServerCommand(new CommandConcessAdmin());
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        EntityRegistry.registerGlobalEntityID(EntityConcessionnaire.class, "entityConcessionnaire", EntityRegistry.findGlobalUniqueEntityId(), new Color(0, 255, 0).getRGB(), new Color(255, 0, 0).getRGB());
        EntityRegistry.registerModEntity(EntityConcessionnaire.class, "entityConcessionnaire", 420, this.instance, 40, 1, true);
        EntityRegistry.registerGlobalEntityID(EntityConcessionnaire.class, "entityTest", EntityRegistry.findGlobalUniqueEntityId(), new Color(0, 255, 0).getRGB(), new Color(255, 0, 0).getRGB());
        EntityRegistry.registerModEntity(EntityConcessionnaire.class, "entityTest", 421, this.instance, 40, 1, true);
        EntityRegistry.registerModEntity(EntityItem.class, "itementity", 2, this.instance, 30, 100, true);
        GameRegistry.registerTileEntity(TileEntityCaisse.class, "craftingmod:caisse");
        GameRegistry.registerTileEntity(TileEntityGarage.class, "craftingmod:garage");
        GameRegistry.registerTileEntity(TileEntityAeration.class, "tileaeration");
        GameRegistry.registerTileEntity(TileEntityPerceuse.class, "tileperceuse");
        GameRegistry.registerTileEntity(TileEntityCamera.class, "tilecamera");
        GameRegistry.registerTileEntity(TileEntityStand.class, "tilestand");
        GameRegistry.registerTileEntity(TileEntityGas.class, "tilegas");
        GameRegistry.registerTileEntity(TileEntityTrash.class, "tiletrash");
        GameRegistry.registerTileEntity(TileEntityFeux.class, "tilefeux");
        GameRegistry.registerTileEntity(TileEntityFoot.class, "tilefoot");
        GameRegistry.registerTileEntity(TileEntityCompteur.class, "tilecompteur");
        GameRegistry.registerTileEntity(TileEntityEssence.class, "tileessence");
        GameRegistry.registerTileEntity(TileEntityCafe.class, "tilecafe");
        GameRegistry.registerTileEntity(TileEntityBarrier.class, "tilebarrier");
        GameRegistry.registerTileEntity(TileEntityCoca.class, "tilecoca");
        GameRegistry.registerTileEntity(TileEntityEtalage.class, "tileetalage");
        GameRegistry.registerTileEntity(TileEntityPanderie.class, "tilepanderie");
        GameRegistry.registerTileEntity(TileEntityBureauD.class, "tilebureaud");
        GameRegistry.registerTileEntity(TileEntityPhone.class, "tilephone");
        GameRegistry.registerTileEntity(TileEntityBouton.class, "tilebouton");
        GameRegistry.registerTileEntity(TileEntityFeu.class, "tilefeu");
        GameRegistry.registerTileEntity(TileEntityGrapePress.class, "tilegrapepress");
        GameRegistry.registerTileEntity(TileEntityCasier.class, "tilecasier");
        GameRegistry.registerTileEntity(TileEntityFeuG2.class, "tilefeug2");
        FMLCommonHandler.instance().bus().register(new CmEventHandler());
        FMLCommonHandler.instance().bus().register(new EventHandlerAnimation());
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
        proxy.registerRender();
        if(event.getSide().isClient())
        {
            MinecraftForge.EVENT_BUS.register(new VehicleOverlay(Minecraft.getMinecraft()));
            MinecraftForge.EVENT_BUS.register(new GuiOverlay());
            MinecraftForge.EVENT_BUS.register(new EventTest());
            FMLCommonHandler.instance().bus().register(this);
            FMLCommonHandler.instance().bus().register(new EventHandlerFeu());
            // GuiManager.registerGui(this, "Test", 0);
        }

        MinecraftForge.EVENT_BUS.register(new EventHandlerEEP());
        FMLCommonHandler.instance().bus().register(new EventHandlerEEP());
        InventoryMod.init(event);
    }

    @SubscribeEvent
    public void onTick(TickEvent.ServerTickEvent event)
    {
        if(event.phase.equals(event.phase.END))
        {
            if(FMLCommonHandler.instance().getMinecraftServerInstance().worldServers[0] != null)
            {
                World world = FMLCommonHandler.instance().getMinecraftServerInstance().worldServers[0];
                List<EntityTest> entityTestList = new ArrayList<EntityTest>();
                for(int i = 0; i < world.loadedEntityList.size(); i++)
                {
                    if(world.loadedEntityList.get(i) instanceof EntityTest)
                    {
                        entityTestList.add((EntityTest)world.loadedEntityList.get(i));
                    }

                }
                EntityTest[] entities = new EntityTest[entityTestList.size()];
                entityTestList.toArray(entities);
                this.interp += 20 * (60.0D / 1000.0D);
                this.animate(1, entities);
            }
        }

    }

    public void animate(int start, EntityTest[] entitiesAtUserScreen)
    {
        for(int i = 0; i < entitiesAtUserScreen.length; i++)
        {
            // int end = ClientProxy.importer.reader.models[entity.getAnimID()].header.numFrames - 1;

            EntityTest entity = entitiesAtUserScreen[i];

            int end = 0;
            switch(entity.getAnimID())
            {
                case 0:
                    // end = 144;//-1 à chaque fois
                    end = 31;
                    break;
                case 1:
                    end = 48;
                    break;
                case 2:
                    end = 76;
                    break;
                // case 3:
                // end = 36;
                // break;
                // case 4:
                // end = 84;
                // break;
                // case 5:
                // end = 52;
                // break;
                // case 6:
                // end = 160;
                // break;
                // case 7:
                // end = 350;
                // break;
                // case 8:
                // end = 60;
                // break;
                // case 9:
                // end = 140;
                // case 10:
                // end = 72;
                // break;
            }

            int frame = entity.getFrameAnimIndex();

            if(frame < start || frame > end)
                entity.setFrameAnimIndex(start);

            if(this.interp >= 1.0F)
            {
                if(i == entitiesAtUserScreen.length - 1)
                    this.interp = 0.0F;

                if(entity.getFrameAnimIndex() >= end)
                    entity.setFrameAnimIndex(start);

                entity.setFrameAnimIndex(entity.getFrameAnimIndex() + 1);

                // Pour booster à certains endroits de l'anim
                // if(importer.reader.models[ClientProxy.indexModels].frameIndex >= 20 && importer.reader.models[ClientProxy.indexModels].frameIndex <= 50)
                // importer.reader.models[ClientProxy.indexModels].frameIndex+=2;
            }
        }
    }

}
