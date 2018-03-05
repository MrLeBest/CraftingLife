package fr.mrlebest.craftingmod.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockSpawn extends Block
{
    public BlockSpawn(Material material)
    {
        super(material);
    }
    
    protected BlockSpawn()
    {
      super(Material.leaves);
    }
    
    public boolean isOpaqueCube()
    {
      return false;
    }
    

}
