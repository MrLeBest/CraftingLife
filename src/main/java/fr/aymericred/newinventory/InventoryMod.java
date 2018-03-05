package fr.aymericred.newinventory;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import fr.aymericred.newinventory.client.ClientEventHandler;
import fr.aymericred.newinventory.common.CommonEventHandler;
import net.minecraftforge.common.MinecraftForge;

//@Mod(modid = InventoryMod.ID, version = InventoryMod.VERSION, name=InventoryMod.NAME)
public class InventoryMod
{
    /*public static class BagTest extends Item implements IBagpack
    {
    	private final int i, j;
		public BagTest(int i, int j) {
			this.i = i; this.j = j;
		}
		@Override
		public int getSize() {
			return j;
		}
		@Override
		public int getId() {
			return i;
		}
	}*/
	public static final String ID = "new-inventory";
    //public static final String NAME = "New Inventory";
    //public static final String VERSION = "1.0.0";
    public static final String AUTHOR = "Copyright AymericRed for CraftingLife";
    
    /*@Instance(value=ID)
	public static InventoryMod instance;*/

    /*@EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	GameRegistry.registerItem(new BagTest(0, 2).setUnlocalizedName("bag1").setCreativeTab(CreativeTabs.tabTools), "bag1");
    	GameRegistry.registerItem(new BagTest(1, 4).setUnlocalizedName("bag2").setCreativeTab(CreativeTabs.tabTools), "bag2");
    	GameRegistry.registerItem(new BagTest(2, 6).setUnlocalizedName("bag3").setCreativeTab(CreativeTabs.tabTools), "bag3");
    	GameRegistry.registerItem(new BagTest(3, 8).setUnlocalizedName("bag4").setCreativeTab(CreativeTabs.tabTools), "bag4");
    }*/
    //@EventHandler
    public static void init(FMLInitializationEvent event)
    {
    	FMLCommonHandler.instance().bus().register(new ClientEventHandler());
    	MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
    	FMLCommonHandler.instance().bus().register(new CommonEventHandler());
    	MinecraftForge.EVENT_BUS.register(new CommonEventHandler());
    	
    	/*NetworkRegistry.INSTANCE.registerGuiHandler(CraftingMod.instance, new IGuiHandler()
    			{
					@Override
					public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
						return ID == 1 && ((InventoryPlayerAdv)player.inventory).currentBag != null ? new ContainerBagpack(player.inventory, player, ((InventoryPlayerAdv)player.inventory).currentBag) : null;
					}
					@Override
					public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
						return ID == 1 ? new GuiBagpack(player, ((InventoryPlayerAdv)player.inventory).currentBag) : null;
					}:
    			}); Moved in the CommonProxy of CraftingMod*/
    	
    	/**FMLEventChannel ch = NetworkRegistry.INSTANCE.newEventDrivenChannel(ID+".channel");
    	ch.register(new InventoryMod());*/
    }
   /** @SubscribeEvent
    public void onClientPacket(ServerCustomPacketEvent event)
    {
    	ByteBuf buf = event.packet.payload();
    	if(buf.readInt() == 400) {
    		System.out.println(((NetHandlerPlayServer)event.handler).playerEntity.inventoryContainer + " T " + ((NetHandlerPlayServer)event.handler).playerEntity.inventory.getItemStack());
    		((NetHandlerPlayServer)event.handler).playerEntity.openGui(CraftingMod.instance, 1, null, 0, 0, 0);
    	}
    }*/
}
