package fr.mrlebest.craftingmod.block;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.mrlebest.craftingmod.common.CraftingMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks
{
    
    public static Block blockPomme, blockPeche, blockCaisse, blockFeux, blockTrash, blockGas, blockFuel, blockGarage, blockStand, blockCamera, blockPerceuse
    , blockAeration, blockFoot, blockSpawn, blockCafe, blockCompteur, blockBarrier, blockEssence, blockEtalage, blockCoca, blockPanderie, blockBureauD, blockPhone
    , blockBouton, blockFeu, blockFeuG2, blockCasier, blockGrapePress;

    
    public static void registerBlocks()
    {
        blockGrapePress = new BlockGrapePress(Material.rock).setBlockName("blockgrapepress").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockGrapePress, "block_grapepress");
        blockCasier = new BlockCasier(Material.rock).setBlockName("blockcasier").setBlockTextureName("craftingmod:block_caiser").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockCasier, "block_casier");
        blockFeu = new BlockFeu(Material.rock).setBlockName("blockfeu").setBlockTextureName("craftingmod:block_feu").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockFeu, "block_feu");
        blockFeuG2 = new BlockFeuG2(Material.rock).setBlockName("blockfeug2").setBlockTextureName("craftingmod:block_feug2").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockFeuG2, "block_feug2");
        blockBouton = new BlockBouton().setBlockName("blockbouton").setBlockTextureName("craftingmod:block_bouton").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockBouton, "block_bouton");
        blockPhone = new BlockPhone(Material.leaves).setBlockName("blockphone").setBlockTextureName("craftingmod:block_phone").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockPhone, "block_phone");
        blockBureauD = new BlockBureauD(Material.leaves).setBlockName("blockbureaud").setBlockTextureName("craftingmod:block_bureaud").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockBureauD, "block_bureaud");
        blockPanderie = new BlockPanderie(Material.leaves).setBlockName("blockpanderie").setBlockTextureName("craftingmod:block_panderie").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockPanderie, "block_panderie");
        blockEtalage = new BlockEtalage(Material.leaves).setBlockName("blocketalage").setBlockTextureName("craftingmod:block_etalage").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockEtalage, "block_etalage");
        blockCoca = new BlockCoca(Material.leaves).setBlockName("blockcoca").setBlockTextureName("craftingmod:block_coca").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockCoca, "block_coca");
        blockEssence = new BlockEssence(Material.leaves).setBlockName("blockessence").setBlockTextureName("craftingmod:block_essence").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockEssence, "block_essence");
        blockCompteur = new BlockCompteur(Material.leaves).setBlockName("blockcompteur").setBlockTextureName("craftingmod:block_compteur").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockCompteur, "block_compteur");
        blockBarrier = new BlockBarrier(Material.leaves).setBlockName("blockbarrier").setBlockTextureName("craftingmod:block_barrier").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockBarrier, "block_barrier");
        blockCafe = new BlockCafe(Material.leaves).setBlockName("blockcafe").setBlockTextureName("craftingmod:block_cafe").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockCafe, "block_cafe");
        blockSpawn = new BlockSpawn(Material.leaves).setBlockName("blockspawn").setBlockTextureName("craftingmod:block_spawn").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockSpawn, "block_spawn");
        blockFoot = new BlockFoot(Material.leaves).setBlockName("blockfoot").setBlockTextureName("craftingmod:block_foot").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockFoot, "block_foot");
        blockAeration = new BlockAeration(Material.leaves).setBlockName("blockaeration").setBlockTextureName("craftingmod:block_aeration").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockAeration, "block_aeration");
        blockPerceuse = new BlockPerceuse(Material.leaves).setBlockName("blockperceuse").setBlockTextureName("craftingmod:block_perceuse").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockPerceuse, "block_perceuse");
        blockCamera = new BlockCamera(Material.leaves).setBlockName("blockcamera").setBlockTextureName("craftingmod:block_camera").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockCamera, "block_camera");
        blockStand = new BlockStand(Material.leaves).setBlockName("blockstand").setBlockTextureName("craftingmod:block_stand").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockStand, "block_stand");
        blockGarage = new BlockGarage(Material.leaves).setBlockName("blockgarage").setBlockTextureName("craftingmod:block_garage").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockGarage, "block_garage");
        blockPomme = new BlockPomme(Material.leaves).setBlockName("blockpomme").setBlockTextureName("craftingmod:block_pomme").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockPomme, "block_pomme");
        blockPeche = new BlockPeche(Material.leaves).setBlockName("blockpeche").setBlockTextureName("craftingmod:block_peche").setHardness(0.2F).setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockPeche, "block_peche");
        blockCaisse = new BlockCaisse(Material.rock).setBlockName("blockcaisse").setBlockName("craftingmod:block_caisse").setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockCaisse, "block_caisse");
        blockFeux = new BlockFeux(Material.rock).setBlockName("blockfeux").setBlockName("craftingmod:block_feux").setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockFeux, "block_feux");
        blockTrash = new BlockTrash(Material.rock).setBlockName("blocktrash").setBlockName("craftingmod:block_trash").setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockTrash, "block_trash");
        blockGas = new BlockGas(Material.rock).setBlockName("blockgas").setBlockName("craftingmod:block_gas").setCreativeTab(CraftingMod.craftingmodCreativeTabs);
        GameRegistry.registerBlock(blockGas, "block_gas");
    }

}
