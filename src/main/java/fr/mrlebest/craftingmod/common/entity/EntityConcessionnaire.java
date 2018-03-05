package fr.mrlebest.craftingmod.common.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mrlebest.craftingmod.client.gui.GuiScreenConcessionnaire;
import fr.mrlebest.craftingmod.client.gui.GuiScreenPng;
import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.item.Items;
import io.netty.util.internal.StringUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StringUtils;
import net.minecraft.world.World;

public class EntityConcessionnaire extends EntityLiving
{

    public boolean concessGendarmerie = false, concessCivil = false, concessLuxe = false, concessCamion = false, concessPompier = false;

    public EntityConcessionnaire(World world)
    {
        super(world);
        setCustomNameTag("Vendeur de vehicule");
        setAlwaysRenderNameTag(true);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        dataWatcher.addObject(2, Byte.valueOf((byte)0));
        dataWatcher.addObject(3, Byte.valueOf((byte)0));
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("Entity", getTameSkin());
        compound.setInteger("Concessionnaire", getConcessionnaire());
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
        setTameSkin(compound.getInteger("Entity"));
        setConcessionnaire(compound.getInteger("Concessionnaire"));
    }

    public boolean isMovementCeased()
    {
        return true;
    }

    public boolean isEntityInvulnerable()
    {
        return true;
    }

    public void onLivingUpdate()
    {

    }

    @Override
    protected boolean interact(EntityPlayer entityplayer)
    {
        // 1 = Civil , 2 = Gendarmerie , 3 Pompier , 4 Camion , 5 Luxe
        if(worldObj.isRemote)
        {
            if(entityplayer.isSneaking() && entityplayer.getHeldItem() != null && entityplayer.getHeldItem().getItem() == Items.itemMolette)
            {
                guiDisplay(entityplayer);
                // System.out.println("gggg");
            }
            else
            {
                switch(getConcessionnaire())
                {
                    case 1:
                        guiDisplayConcessionnaire("Concessionnaire Civil", "Civil", entityplayer);
                        break;
                    case 2:
                        guiDisplayConcessionnaire("Concessionnaire Gendarmerie", "Gendarmerie", entityplayer);
                        break;
                    case 3:
                        guiDisplayConcessionnaire("Concessionnaire Pompier", "Pompier", entityplayer);
                        break;
                    case 4:
                        guiDisplayConcessionnaire("Concessionnaire Camion", "Camion", entityplayer);
                        break;
                    case 5:
                        guiDisplayConcessionnaire("Concessionnaire Luxe", "Luxe", entityplayer);
                        break;
                    case 0:
                        entityplayer.addChatComponentMessage(new ChatComponentText((EnumChatFormatting.GOLD + "[" + EnumChatFormatting.BLUE + "CraftingLife" + EnumChatFormatting.GOLD + "]" + "Veuillez selectionné un concessionnaire a ouvrir")));
                        break;
                }
            }
        }
        return false;
    }

    @SideOnly(Side.CLIENT)
    public void guiDisplay(EntityPlayer entityplayer)
    {
        Minecraft.getMinecraft().displayGuiScreen(new GuiScreenPng(entityplayer, this));
    }

    @SideOnly(Side.CLIENT)
    public void guiDisplayConcessionnaire(String concessName, String vehicleList, EntityPlayer entityplayer)
    {
        Minecraft.getMinecraft().displayGuiScreen(new GuiScreenConcessionnaire(concessName, vehicleList, entityplayer));
    }

    public int getTameSkin()
    {
        return dataWatcher.getWatchableObjectByte(2);
    }

    public void setTameSkin(int i)
    {
        dataWatcher.updateObject(2, Byte.valueOf((byte)i));

    }

    public int getConcessionnaire()
    {
        return dataWatcher.getWatchableObjectByte(3);
    }

    public void setConcessionnaire(int i)
    {
        dataWatcher.updateObject(3, Byte.valueOf((byte)i));

    }

}
