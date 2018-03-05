package fr.mrlebest.craftingmod.block;

import java.util.Random;

import fr.mrlebest.craftingmod.item.Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockPomme extends Block
{
    public BlockPomme(Material material)
    {
        super(material);
    }
    
    protected BlockPomme()
    {
      super(Material.leaves);
    }
    
    public boolean isOpaqueCube()
    {
      return false;
    }
    
    public Item getItemDropped(int metadata, Random rand, int fortune)
    {
        return Items.itemBaieRouge;
    }
    
    @Override
    public int quantityDropped(Random rand){
        return 1 + rand.nextInt(2);
    }

}
