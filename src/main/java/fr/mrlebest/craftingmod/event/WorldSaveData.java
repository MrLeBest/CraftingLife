package fr.mrlebest.craftingmod.event;

import java.util.HashMap;
import java.util.Map;

import fr.mrlebest.craftingmod.client.gui.GuiScreenConcessAdmin;
import java.util.Map.Entry;


import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldSavedData;
import net.minecraft.world.storage.MapStorage;
import net.minecraftforge.common.util.Constants;

public class WorldSaveData extends WorldSavedData
{
    public static Map<String, Integer> vehicivil = new HashMap();
    public static Map<String, Integer> vehigendarmerie = new HashMap();
    public static Map<String, Integer> vehiluxe = new HashMap();
    public static Map<String, Integer> vehicamion = new HashMap();
    public static Map<String, Integer> vehipompier = new HashMap();
    
    private static WorldSaveData instance;


    public WorldSaveData(String key)
    {
        super(key);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
    	vehicivil.clear(); vehigendarmerie.clear(); vehiluxe.clear(); vehicamion.clear(); vehipompier.clear();
    	
        NBTTagList tagList = compound.getTagList("VehiculeCivilList", Constants.NBT.TAG_COMPOUND);
        for(int i = 0; i < tagList.tagCount(); i++)
        {
            NBTTagCompound tag = tagList.getCompoundTagAt(i);
        	vehicivil.put(tag.getString("name"), tag.getInteger("price"));
        }
        
        tagList = compound.getTagList("VehiculeGendarmerie", Constants.NBT.TAG_COMPOUND);
        for(int i = 0; i < tagList.tagCount(); i++)
        {
        	NBTTagCompound tag = tagList.getCompoundTagAt(i);
        	vehigendarmerie.put(tag.getString("name"), tag.getInteger("price"));
        }
        
        tagList = compound.getTagList("VehiculeLuxe", Constants.NBT.TAG_COMPOUND);
        for(int i = 0; i < tagList.tagCount(); i++)
        {
        	NBTTagCompound tag = tagList.getCompoundTagAt(i);
        	vehiluxe.put(tag.getString("name"), tag.getInteger("price"));
        }
        
        tagList = compound.getTagList("VehiculeCamion", Constants.NBT.TAG_COMPOUND);
        for(int i = 0; i < tagList.tagCount(); i++)
        {
        	NBTTagCompound tag = tagList.getCompoundTagAt(i);
        	vehicamion.put(tag.getString("name"), tag.getInteger("price"));
        }
        
        tagList = compound.getTagList("VehiculePompier", Constants.NBT.TAG_COMPOUND);
        for(int i = 0; i < tagList.tagCount(); i++)
        {
        	NBTTagCompound tag = tagList.getCompoundTagAt(i);
        	vehipompier.put(tag.getString("name"), tag.getInteger("price"));

        }
    }

    @Override
    public void writeToNBT(NBTTagCompound compound)
    {
        NBTTagList tagList = new NBTTagList();
        for(Entry<String, Integer> ent : vehicivil.entrySet())
        {
            NBTTagCompound tag = new NBTTagCompound();
            tag.setString("name", ent.getKey());
            tag.setInteger("price", ent.getValue());
            tagList.appendTag(tag);
        }
        compound.setTag("VehiculeCivilList", tagList);
        tagList = new NBTTagList();
        for(Entry<String, Integer> ent : vehigendarmerie.entrySet())
        {
            NBTTagCompound tag = new NBTTagCompound();
            tag.setString("name", ent.getKey());
            tag.setInteger("price", ent.getValue());
            tagList.appendTag(tag);
        }
        compound.setTag("VehiculeGendarmerie", tagList);
        
        tagList = new NBTTagList();
        for(Entry<String, Integer> ent : vehiluxe.entrySet())
        {
            NBTTagCompound tag = new NBTTagCompound();
            tag.setString("name", ent.getKey());
            tag.setInteger("price", ent.getValue());
            tagList.appendTag(tag);
        }
        compound.setTag("VehiculeLuxe", tagList);
        
        tagList = new NBTTagList();
        for(Entry<String, Integer> ent : vehicamion.entrySet())
        {
            NBTTagCompound tag = new NBTTagCompound();
            tag.setString("name", ent.getKey());
            tag.setInteger("price", ent.getValue());
            tagList.appendTag(tag);
        }
        compound.setTag("VehiculeCamion", tagList);
        
        tagList = new NBTTagList();
        for(Entry<String, Integer> ent : vehipompier.entrySet())
        {
            NBTTagCompound tag = new NBTTagCompound();
            tag.setString("name", ent.getKey());
            tag.setInteger("price", ent.getValue());
            tagList.appendTag(tag);
        }
        compound.setTag("VehiculePompier", tagList);

    }

    public static WorldSaveData instance()
    {
        check();
        return instance;

    }

    public static void check()
    {
        if(instance == null)
        {
            MapStorage storage = MinecraftServer.getServer().getEntityWorld().perWorldStorage;
            final String KEY = getDataStorageKey();
            WorldSaveData result = (WorldSaveData)storage.loadData(WorldSaveData.class, KEY);
            if(result == null)
            {
                result = new WorldSaveData(KEY);
                storage.setData(KEY, result);
            }
            instance = result;
        }

    }

    private static String getDataStorageKey()
    {
        return "craftingmodkey";
    }
}
