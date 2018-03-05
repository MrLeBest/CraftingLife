package fr.mrlebest.craftingmod.item;

import fr.aymericred.newinventory.utils.BagpackUtils.IBagpack;
import net.minecraft.item.Item;

public class ItemPoliceBackPack extends Item implements IBagpack
{

    @Override
    public int getSize()
    {

        return 10;
    }

    @Override
    public int getId()
    {

        return 1;

    }

}
