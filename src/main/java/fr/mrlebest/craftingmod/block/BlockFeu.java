package fr.mrlebest.craftingmod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mrlebest.craftingmod.proxy.ClientProxy;
import fr.mrlebest.craftingmod.tileentity.TileEntityFeu;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockFeu extends Block
{

    public BlockFeu(Material material)
    {
        super(material);
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
        return new TileEntityFeu();
    }

    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderType()
    {
        return ClientProxy.tesrRenderId;
    }

    public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 1.0F);
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack stack)
    {

        if(stack.getItemDamage() == 0)
        {
            TileEntity tile = world.getTileEntity(x, y, z);
            if(tile instanceof TileEntityFeu)
            {
                int direction = MathHelper.floor_double((double)(living.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
                ((TileEntityFeu)tile).setDirection((byte)direction);
            }
        }
    }

    @Override
    public boolean rotateBlock(World world, int x, int y, int z, ForgeDirection axis)
    {
        if((axis == ForgeDirection.UP || axis == ForgeDirection.DOWN) && !world.isRemote && world.getBlockMetadata(x, y, z) == 0)
        {
            TileEntity tile = world.getTileEntity(x, y, z);
            if(tile instanceof TileEntityFeu)
            {
                TileEntityFeu tileDirectional = (TileEntityFeu)tile;
                byte direction = tileDirectional.getDirection();
                direction++;
                if(direction > 3)
                {
                    direction = 0;
                }
                tileDirectional.setDirection(direction);
                return true;
            }
        }
        return false;
    }

    public ForgeDirection[] getValidRotations(World world, int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z) == 0 ? new ForgeDirection[] {ForgeDirection.UP, ForgeDirection.DOWN} : ForgeDirection.VALID_DIRECTIONS; // si le metadata est 0, les deux directions sur
                                                                                                                                                       // lesquels on peut faire tourner le bloc, sinon
                                                                                                                                                       // toutes les directions ce qui est la valeur par
                                                                                                                                                       // défaut pour les blocs non directionnels.
    }

}
