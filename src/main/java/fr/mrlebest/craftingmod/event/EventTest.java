package fr.mrlebest.craftingmod.event;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.common.entity.EntityItem;
import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import fr.mrlebest.craftingmod.common.network.PacketConcessVehicList;
import fr.mrlebest.craftingmod.renderer.RenderItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

public class EventTest
{

    public static int timer = 0;
    private ExtPropCraftingLife anim;
    RenderManager renderManager = RenderManager.instance;
    /*
     * @SubscribeEvent public void onTickServer(LivingUpdateEvent event) {
     * //System.out.println(timer); timer++; if((EventHandlerThirst.thirstCurrent <=
     * 0) && (timer == 200)) { System.out.println("Soif");
     * Minecraft.getMinecraft().thePlayer.attackEntityFrom(DamageSource.generic,
     * 1F); timer = 0; } if (timer == 400){ timer = 0; } }
     */

    @SubscribeEvent
    public void onRenderLabel(RenderLivingEvent.Specials.Pre event)
    {
        if(event.entity instanceof EntityPlayer)
        {
            anim = ExtPropCraftingLife.get((EntityPlayer)event.entity);
            String name = anim.name;
            double d3 = event.entity.getDistanceSqToEntity(renderManager.livingPlayer);

            if(d3 <= (double)(2 * 2))
            {
                if(anim.animation && anim.name != null)
                {
                    FontRenderer fontrenderer = event.renderer.getFontRendererFromRenderManager();
                    float f = 1.6F;
                    float f1 = 0.016666668F * f;
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float)event.x + 0.0F, (float)event.y + event.entity.height + 0.5F, (float)event.z);
                    GL11.glNormal3f(0.0F, 1.0F, 0.0F);
                    GL11.glRotatef(-renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
                    GL11.glRotatef(renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
                    GL11.glScalef(-f1, -f1, f1);
                    GL11.glDisable(GL11.GL_LIGHTING);
                    GL11.glDepthMask(false);
                    GL11.glDisable(GL11.GL_DEPTH_TEST);
                    GL11.glEnable(GL11.GL_BLEND);
                    OpenGlHelper.glBlendFunc(770, 771, 1, 0);
                    Tessellator tessellator = Tessellator.instance;
                    byte b0 = 0;

                    if(name.equals("deadmau5"))
                    {
                        b0 = -10;
                    }

                    GL11.glDisable(GL11.GL_TEXTURE_2D);
                    tessellator.startDrawingQuads();
                    int j = fontrenderer.getStringWidth(name) / 2;
                    tessellator.setColorRGBA_F(0.0F, 0.0F, 0.0F, 0.25F);
                    tessellator.addVertex((double)(-j - 1), (double)(-1 + b0), 0.0D);
                    tessellator.addVertex((double)(-j - 1), (double)(8 + b0), 0.0D);
                    tessellator.addVertex((double)(j + 1), (double)(8 + b0), 0.0D);
                    tessellator.addVertex((double)(j + 1), (double)(-1 + b0), 0.0D);
                    tessellator.draw();
                    GL11.glEnable(GL11.GL_TEXTURE_2D);
                    fontrenderer.drawString(name, -fontrenderer.getStringWidth(name) / 2, b0, 553648127);
                    GL11.glEnable(GL11.GL_DEPTH_TEST);
                    GL11.glDepthMask(true);
                    fontrenderer.drawString(name, -fontrenderer.getStringWidth(name) / 2, b0, -1);
                    GL11.glEnable(GL11.GL_LIGHTING);
                    GL11.glDisable(GL11.GL_BLEND);
                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                    GL11.glPopMatrix();
                }
            }

        }
    }

    /*
     * @SubscribeEvent
     * @SideOnly(Side.CLIENT) public void onGuiOpen(GuiOpenEvent event) {
     * if(event.gui != null) { if(event.gui.getClass().equals(GuiInventory.class) &&
     * anim.animation == true) { event.setCanceled(true); } } }
     */

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onInteract(PlayerInteractEvent event)
    {
        anim = ExtPropCraftingLife.get(event.entityPlayer);
        if(anim.animation)
        {
            event.setCanceled(true);
        }

    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onHurt(LivingAttackEvent event)
    {
        if(event.source.getEntity() != null)
        {
            // System.out.println("Test");
            if(event.source.getEntity() instanceof EntityPlayer)
            {
                anim = ExtPropCraftingLife.get((EntityPlayer)event.source.getEntity());
                if(anim.animation)
                {
                    System.out.println("Test");
                    event.setCanceled(true);
                }
            }
        }
    }

    @SubscribeEvent
    public void onItemPickup(EntityItemPickupEvent event)
    {
        if(event.entity instanceof EntityPlayer)
        {
            event.setCanceled(true);
            System.out.println("Tu vien de recupéré " + event.item);
        }
    }

    @SubscribeEvent
    public void onEntitySpawn(EntityJoinWorldEvent event)
    {
        if(!event.world.isRemote && event.entity instanceof net.minecraft.entity.item.EntityItem)
        {
             event.setCanceled(true); //SPONGE COMPATIBLITY should disable this and use setDead() : CALL THIS CANCELS ALL DROP AND RESTORES PLAYER INV
             
             Entity entity = new EntityItem(event.world, ((net.minecraft.entity.item.EntityItem)event.entity).getEntityItem());
             entity.setPositionAndRotation(event.entity.posX, event.entity.posY, event.entity.posZ, event.entity.rotationYaw, 0);
             entity.motionX = event.entity.motionX;
             entity.motionY = event.entity.motionY;
             entity.motionZ = event.entity.motionZ;
             event.world.spawnEntityInWorld(entity);
         }
        else if(!event.world.isRemote && event.entity instanceof EntityPlayerMP)
        {
        	NBTTagCompound data = new NBTTagCompound();
        	WorldSaveData.instance().writeToNBT(data);
        	data.setInteger("Action", 2);
        	CraftingMod.network.sendTo(new PacketConcessVehicList(data), (EntityPlayerMP) event.entity);
        }
    }

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onRender(RenderGameOverlayEvent.Post event)
    {
        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
        int X = sr.getScaledWidth() / 2;
        int Y = sr.getScaledHeight();
        if(event.type == ElementType.ALL)
        {
            if(Minecraft.getMinecraft().objectMouseOver != null && Minecraft.getMinecraft().objectMouseOver.typeOfHit == MovingObjectType.ENTITY && Minecraft.getMinecraft().objectMouseOver.entityHit instanceof EntityItem)
            {
                RenderItem.hoveredEntity = (EntityItem)Minecraft.getMinecraft().objectMouseOver.entityHit;
                String text = "§f[§6Clique droit§f] pour ramasser §6" + RenderItem.hoveredEntity.getEntityItem().getDisplayName() + "[x" + RenderItem.hoveredEntity.getEntityItem().stackSize + "]";
                FMLClientHandler.instance().getClient().fontRenderer.drawString(text, X - FMLClientHandler.instance().getClient().fontRenderer.getStringWidth(text) / 2, Y - 24, 0);
            }
            else
                RenderItem.hoveredEntity = null;
        }
    }
}
