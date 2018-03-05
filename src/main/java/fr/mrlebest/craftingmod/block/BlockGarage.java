package fr.mrlebest.craftingmod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mrlebest.craftingmod.client.gui.GarageGendarme;
import fr.mrlebest.craftingmod.client.gui.GuiBlockGarage;
import fr.mrlebest.craftingmod.client.gui.GuiGarage;
import fr.mrlebest.craftingmod.client.gui.GuiScreenLicense;
import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.proxy.ClientProxy;
import fr.mrlebest.craftingmod.tileentity.TileEntityCaisse;
import fr.mrlebest.craftingmod.tileentity.TileEntityGarage;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockGarage extends Block
{

    public BlockGarage(Material material)
    {
        super(material);
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
        return new TileEntityGarage();
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
    {
        if(world.isRemote)
        {
            TileEntity tile = world.getTileEntity(x, y, z);
            if(tile instanceof TileEntityGarage)
            {
                TileEntityGarage tileGarage = (TileEntityGarage)tile;
                if(entityplayer.isSneaking())
                {
                    System.out.println("ff");
                    this.guiBlockGarage(entityplayer);
                }
                else if(tileGarage.isGarage("all"))
                {
                    this.guiGarage(entityplayer);
                }
                else if(tileGarage.isGarage("gendarmerie"))
                {
                    this.guiGarageGendarmerie(entityplayer);
                }
            }
        }
        return true;

    }

    @SideOnly(Side.CLIENT)
    public void guiGarage(EntityPlayer entityplayer)
    {
        Minecraft.getMinecraft().displayGuiScreen(new GuiGarage(entityplayer));
    }

    @SideOnly(Side.CLIENT)
    public void guiBlockGarage(EntityPlayer entityplayer)
    {
        Minecraft.getMinecraft().displayGuiScreen(new GuiBlockGarage(entityplayer, this));
    }

    @SideOnly(Side.CLIENT)
    public void guiGarageGendarmerie(EntityPlayer entityplayer)
    {
        Minecraft.getMinecraft().displayGuiScreen(new GarageGendarme(entityplayer));
    }

    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }

    public TileEntityGarage getTileEntity(World world, int x, int y, int z)
    {
        TileEntity tile = world.getTileEntity(x, y, z);
        if(tile instanceof TileEntityGarage)
        {
            TileEntityGarage tileGarage = (TileEntityGarage)tile;
            return tileGarage;
        }
        return null;
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
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    @Override
    public boolean rotateBlock(World world, int x, int y, int z, ForgeDirection axis)
    {
        if((axis == ForgeDirection.UP || axis == ForgeDirection.DOWN) && !world.isRemote && world.getBlockMetadata(x, y, z) == 0)
        {
            TileEntity tile = world.getTileEntity(x, y, z);
            if(tile instanceof TileEntityGarage)
            {
                TileEntityGarage tileDirectional = (TileEntityGarage)tile;
                byte direction = tileDirectional.getDirection();
                direction++;
                if(direction > 36)
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
