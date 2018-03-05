package fr.mrlebest.craftingmod.common.creativetabs;

import fr.mrlebest.craftingmod.block.Blocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CraftingModCreativeTabs extends CreativeTabs
{
    
    public CraftingModCreativeTabs(String label)
    {
         super(label);
    }

    @Override
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(Blocks.blockPomme);
    }
    
}
