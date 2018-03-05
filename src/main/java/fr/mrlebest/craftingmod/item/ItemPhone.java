package fr.mrlebest.craftingmod.item;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mrlebest.craftingmod.client.gui.GuiPhone;
import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemPhone extends Item {

	private int number = 0;

	public ItemPhone() {
		// TODO baiser nico
	}

	public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_,
			boolean p_77663_5_) {
		if (p_77663_3_ instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) p_77663_3_;
			if (number == 0) {
				ExtPropCraftingLife props = ExtPropCraftingLife.get(player);
				setPhoneNumber(p_77663_1_, props.setNumero((byte) 6, 9));
			}
		}

	}

	public void setPhoneNumber(ItemStack stack, int number) {
		this.number = number;
		NBTTagCompound nbt;
		if (stack.hasTagCompound()) {
			nbt = stack.getTagCompound();
		} else {
			nbt = new NBTTagCompound();
		}

		nbt.setInteger("number", number);
		nbt.setInteger("called", 0);
		nbt.setInteger("gpsEnabled", 0);
		stack.setTagCompound(nbt);
		List<String> lores = new ArrayList<String>();

		addInformation(stack, null, lores, true);

	}

	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side,
			float hitX, float hitY, float hitZ) {
		guiPhone(player);
		return false;

	}

	@SideOnly(Side.CLIENT)
	public void guiPhone(EntityPlayer entityplayer) {
		Minecraft.getMinecraft().displayGuiScreen(new GuiPhone());
	}

}
