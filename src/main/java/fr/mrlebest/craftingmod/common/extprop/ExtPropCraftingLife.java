package fr.mrlebest.craftingmod.common.extprop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.common.handlers.gamelogic.ThirstStats;
import fr.mrlebest.craftingmod.common.network.PacketGarage;
import fr.mrlebest.craftingmod.common.network.PacketGarageGendarme;
import fr.mrlebest.craftingmod.event.WorldSaveData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class ExtPropCraftingLife implements IExtendedEntityProperties
{
    public final static String EXT_PROP_NAME = "ExtPropCraftingLife";
	
    public double tickHand = 0, tickRightHand = 0, tickLeftHand = 0;
    public int tick = 0, verify = 0, ticks = 0;
    public String name, numero;
    public boolean coma = false, animation, handUp = false;
    private EntityPlayer player;
    public List<String> vehiculeList = new ArrayList<String>();
    public List<String> vehiculeGendarme = new ArrayList<String>();

    public ThirstStats thirstSystem;
    public short lastThirstLevel;
    
    public ExtPropCraftingLife(EntityPlayer player)
    {
        this.player = player;
        this.thirstSystem = new ThirstStats();
        
        this.player.getDataWatcher().addObject(10, Byte.valueOf((byte)0));
    }

    public static final void register(EntityPlayer player)
    {
        player.registerExtendedProperties(ExtPropCraftingLife.EXT_PROP_NAME, new ExtPropCraftingLife(player));
    }

    public static final ExtPropCraftingLife get(EntityPlayer player)
    {
        return (ExtPropCraftingLife)player.getExtendedProperties(EXT_PROP_NAME);
    }

    public final void sync()
    {
        PacketGarage garage = new PacketGarage(vehiculeList);
        PacketGarageGendarme garageGendarme = new PacketGarageGendarme(vehiculeGendarme);
        if(!player.worldObj.isRemote)
        {
            EntityPlayerMP playerMP = (EntityPlayerMP)player;
            CraftingMod.network.sendTo(garage, playerMP);
            CraftingMod.network.sendTo(garageGendarme, playerMP);
        }
        else
        {

            CraftingMod.network.sendToServer(garage);
            CraftingMod.network.sendToServer(garageGendarme);
        }
    }

    public final void syncAnimation()
    {
       /* PacketAnimHand animHand = new PacketAnimHand(player.getDisplayName(), tickHand, tickRightHand, tickLeftHand);
        if(!player.worldObj.isRemote)
        {
            EntityPlayerMP playerMP = (EntityPlayerMP)player;
            CraftingMod.network.sendToAll(animHand);
        }
        else
        {
            CraftingMod.network.sendToServer(animHand);
        }*/
    }

    private static String getSaveKey(EntityPlayer player)
    {
        return player.getDisplayName() + ":" + EXT_PROP_NAME;
    }

    @Override
    public void saveNBTData(NBTTagCompound compound)
    {
        NBTTagCompound properties = new NBTTagCompound();
        compound.setTag(EXT_PROP_NAME, properties);

        properties.setInteger("AnimId", this.getAnimId());
        properties.setInteger("TickCl", this.ticks);
        properties.setDouble("TickHand", this.tickHand);
        properties.setDouble("TickHandRight", this.tickRightHand);
        properties.setDouble("TickHandLeft", this.tickLeftHand);
        
        //properties.setString("Numero", this.numero);

        NBTTagList tagList = new NBTTagList();
        for(int i = 0; i < vehiculeList.size(); i++)
        {
            String s = vehiculeList.get(i);
            if(s != null)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setString("MyString" + i, s);
                tagList.appendTag(tag);
            }
        }
        compound.setTag("MyStringList", tagList);

        for(int i = 0; i < vehiculeGendarme.size(); i++)
        {
            String s = vehiculeGendarme.get(i);
            if(s != null)
            {
                NBTTagCompound tag = new NBTTagCompound();
                tag.setString("MyStringGendrmerie" + i, s);
                tagList.appendTag(tag);
            }
        }
        compound.setTag("MyStringListGendrmerie", tagList);
        
        this.thirstSystem.writeNBT(properties);
    }

    @Override
    public void loadNBTData(NBTTagCompound compound)
    {
        NBTTagCompound properties = (NBTTagCompound)compound.getTag(EXT_PROP_NAME);

        this.setAnimId(properties.getInteger("AnimId"));
        
        this.ticks = properties.getInteger("TickCl");
        this.tickHand = properties.getDouble("TickHand");
        this.tickRightHand = properties.getDouble("TickHandRight");
        this.tickLeftHand = properties.getDouble("TickHandLeft");
        
       // this.numero = properties.getString("Numero");

        NBTTagList tagList = compound.getTagList("MyStringList", Constants.NBT.TAG_COMPOUND);
        for(int i = 0; i < tagList.tagCount(); i++)
        {
            NBTTagCompound tag = tagList.getCompoundTagAt(i);
            String s = tag.getString("MyString" + i);
            vehiculeList.add(i, s);
        }
        NBTTagList tagLists = compound.getTagList("MyStringListGendrmerie", Constants.NBT.TAG_COMPOUND);
        for(int i = 0; i < tagList.tagCount(); i++)
        {
            NBTTagCompound tag = tagList.getCompoundTagAt(i);
            String s = tag.getString("MyStringGendrmerie" + i);
            vehiculeGendarme.add(i, s);
        }
        
        this.thirstSystem.readNBT(properties);
    }

    public int getAnimId()
    {
        return this.player.getDataWatcher().getWatchableObjectByte(10);
    }

    public void setAnimId(int id)
    {
        this.player.getDataWatcher().updateObject(10, Byte.valueOf((byte)id));
    }

    public byte setNumero(byte operateur, int randomNumero)
    {
        System.out.println("test phone");
        Random r = new Random();
        long x = 0L;
        long y = 999999999L;            
        long number = x+((long)(r.nextDouble()*(y-x)));
        String c = "0"+ operateur + String.valueOf(number);
        return Byte.valueOf(c);
    }

    public String getNumero()
    {
        return numero;
    }

    @Override
    public void init(Entity entity, World world)
    {
        // TODO Auto-generated method stub

    }
    

}
