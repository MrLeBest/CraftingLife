package fr.mrlebest.craftingmod.proxy;

import java.util.HashMap;
import java.util.Map;

import cpw.mods.fml.common.network.IGuiHandler;
import fr.mrlebest.craftingmod.client.gui.ContainerBackPack;
import fr.mrlebest.craftingmod.client.gui.GuiBackPack;
import fr.mrlebest.craftingmod.client.gui.InventoryBackPack;
import fr.mrlebest.craftingmod.item.ItemPorteFeuille;
import fr.aymericred.newinventory.client.gui.GuiBagpack;
import fr.aymericred.newinventory.container.ContainerBagpack;
import fr.aymericred.newinventory.container.InventoryPlayerAdv;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class CommonProxy implements IGuiHandler
{

	private static final Map<String, NBTTagCompound> extendedEntityData = new HashMap<String, NBTTagCompound>();
    
    public void registerRender() {}
    
    public static void storeEntityData(String name, NBTTagCompound compound) {
		extendedEntityData.put(name, compound);
	}

	public static NBTTagCompound getEntityData(String name) {
		return extendedEntityData.remove(name);
	}

    @Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return ID == 1 && ((InventoryPlayerAdv)player.inventory).currentBag != null ? new ContainerBagpack(player.inventory, player, ((InventoryPlayerAdv)player.inventory).currentBag) : null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return ID == 1 ? new GuiBagpack(player, ((InventoryPlayerAdv)player.inventory).currentBag) : null;
	}

}
