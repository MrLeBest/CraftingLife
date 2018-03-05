package fr.mrlebest.craftingmod.item;

import fr.aymericred.newinventory.utils.BagpackUtils.IBagpack;
import net.minecraft.item.Item;

public class ItemSacoche extends Item implements IBagpack
{
    
    public ItemSacoche()
    {
        maxStackSize = 1;
    }

    @Override
    public int getSize()
    {
        return 2;
    }

    @Override
    public int getId()
    {
        return 0;
    }

}
