package fr.mrlebest.craftingmod.proxy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URISyntaxException;

import api.player.model.ModelPlayerAPI;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import fr.mrlebest.craftingmod.common.entity.EntityConcessionnaire;
import fr.mrlebest.craftingmod.common.entity.EntityItem;
import fr.mrlebest.craftingmod.common.entity.EntityTest;
import fr.mrlebest.craftingmod.item.Items;
import fr.mrlebest.craftingmod.renderer.CLModelPlayer;
import fr.mrlebest.craftingmod.renderer.RenderConcessionnaireEntity;
import fr.mrlebest.craftingmod.renderer.RenderItem;
import fr.mrlebest.craftingmod.renderer.TESRCasier;
import fr.mrlebest.craftingmod.renderer.TESRFeu;
import fr.mrlebest.craftingmod.renderer.TESRFeuG2;
import fr.mrlebest.craftingmod.renderer.TESRGrapePress;
import fr.mrlebest.craftingmod.renderer.TESRInventoryRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityAerationSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityBarrierSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityBoutonSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityBureauDSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityCafeSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityCaisseSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityCameraSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityCocaSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityCompteurSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityEssenceSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityEtalageSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityFeuxSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityFootSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityGarageSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityGasSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityPanderieSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityPerceuseSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityPhoneFixSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityPhoneSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityStandSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityTestSpecialRenderer;
import fr.mrlebest.craftingmod.renderer.TileEntityTrashSpecialRenderer;
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
import fr.plaigon.mdlloader.MDLReader;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{

    public static MDLReader reader;
    
    public ClientProxy()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static int tesrRenderId;

    @Override
    public void registerRender()
    {
        
        /*FileInputStream[] file = null;
        
        try
        {
            file = new FileInputStream[] {
            new FileInputStream(new File(ClientProxy.class.getResource("/assets/obj/jeankevin.mdl").toURI()))
            };
        }
        catch(FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch(URISyntaxException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        load(file);
        //System.out.println(reader.models[0].header);*/
        
        ModelPlayerAPI.register("craftingmod", CLModelPlayer.class);

        RenderingRegistry.registerEntityRenderingHandler(EntityConcessionnaire.class, new RenderConcessionnaireEntity(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTest.class, new RenderConcessionnaireEntity(new ModelBiped(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityItem.class, new RenderItem());
        // RenderingRegistry.registerEntityRenderingHandler(EntityTest.class, new RenderEntityTest(new ModelCustomPlayer(), 0.5F));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityConcessionnaire.class, new RenderConcessionnaireEntity(new ModelBiped(), 0.5F));
        //RenderingRegistry.registerEntityRenderingHandler(EntityTest.class, new RenderEntityTest(new ModelCustomPlayer(), 0.5F));

        tesrRenderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new TESRInventoryRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFeu.class, new TESRFeu());
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrapePress.class, new TESRGrapePress());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCasier.class, new TESRCasier());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBouton.class, new TileEntityBoutonSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFeuG2.class, new TESRFeuG2());
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBouton.class, new TileEntityBoutonSpecialRenderer());
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCaisse.class, new TileEntityCaisseSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFeux.class, new TileEntityFeuxSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTrash.class, new TileEntityTrashSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGas.class, new TileEntityGasSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGarage.class, new TileEntityGarageSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStand.class, new TileEntityStandSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCamera.class, new TileEntityCameraSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPerceuse.class, new TileEntityPerceuseSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAeration.class, new TileEntityAerationSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFoot.class, new TileEntityFootSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCompteur.class, new TileEntityCompteurSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBarrier.class, new TileEntityBarrierSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCafe.class, new TileEntityCafeSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEssence.class, new TileEntityEssenceSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCoca.class, new TileEntityCocaSpecialRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEtalage.class, new TileEntityEtalageSpecialRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPanderie.class, new TileEntityPanderieSpecialRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBureauD.class, new TileEntityBureauDSpecialRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPhone.class, new TileEntityPhoneFixSpecialRenderer());

        MinecraftForgeClient.registerItemRenderer(Items.itemTest, (IItemRenderer)new TileEntityTestSpecialRenderer());
        MinecraftForgeClient.registerItemRenderer(Items.itemTphone, (IItemRenderer)new TileEntityPhoneSpecialRenderer());

    }
    
    private void load(InputStream[] file) {
        
        reader = new MDLReader(file);
        
    }

    /*
     * @SubscribeEvent
     * public void InitGuiEvent(InitGuiEvent.Post e) {
     * if(e.gui instanceof GuiIngameMenu){
     * for(Object b : e.buttonList){
     * if(((GuiButton) b).id == 1){
     * ((GuiButton) b).visible = false;
     * }
     * if(((GuiButton) b).id == 12){
     * ((GuiButton) b).visible = false;
     * }
     * if(((GuiButton) b).id == 7){
     * ((GuiButton) b).visible = false;
     * }
     * if(((GuiButton) b).id == 5){
     * ((GuiButton) b).visible = false;
     * }
     * if(((GuiButton) b).id == 6){
     * ((GuiButton) b).visible = false;
     * }
     * if(((GuiButton) b).id == 4){
     * ((GuiButton) b).visible = false;
     * }
     * if(((GuiButton) b).id == 0){
     * ((GuiButton) b).visible = false;
     * }
     * }
     * byte b0 = -16;
     * e.buttonList.add(new GuiButton(4, e.gui.width / 2 - 100, e.gui.height / 4 + 24 + b0, 200, 20, "§4Retour au jeu") {
     * @Override
     * public void mouseReleased(int x, int y) { // Lorsque l'on clique
     * }
     * });
     * e.buttonList.add(new GuiButton(0, e.gui.width / 2 - 100, e.gui.height / 4 + 48 + b0, 200, 20, "Options") {
     * @Override
     * public void mouseReleased(int x, int y) { // Lorsque l'on clique
     * }
     * });
     * e.buttonList.add(new GuiButton(40, e.gui.width / 2 - 100, e.gui.height / 4 + 72 + b0, 200, 20, "TeamSpeak 3"){
     * @Override
     * public void mouseReleased(int x, int y) { // Lorsque l'on clique
     * if (Desktop.isDesktopSupported()) {
     * try {
     * Desktop.getDesktop().browse(new URI("ts3server://http://62.210.144.248?port=9987")); // On essaye de lancer TeamSpeak
     * } catch (Exception e) {
     * e.printStackTrace();
     * }
     * }
     * }
     * });
     * e.buttonList.add(new GuiButton(41, e.gui.width / 2 - 100, e.gui.height / 4 + 72 + b0, 200, 20, "Site"){
     * @Override
     * public void mouseReleased(int x, int y) { // Lorsque l'on clique
     * if (Desktop.isDesktopSupported()) {
     * try {
     * Desktop.getDesktop().browse(new URI("http://http://62.210.144.248/")); // On essaye de lancer TeamSpeak
     * } catch (Exception e) {
     * e.printStackTrace();
     * }
     * }
     * }
     * });
     * }
     * }
     */

}
