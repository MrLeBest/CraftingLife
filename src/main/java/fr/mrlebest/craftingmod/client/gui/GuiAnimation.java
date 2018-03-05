package fr.mrlebest.craftingmod.client.gui;

import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.common.extprop.ExtPropCraftingLife;
import fr.mrlebest.craftingmod.common.network.PacketAnim;
import fr.mrlebest.craftingmod.common.network.PacketAnimHand;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiAnimation extends GuiScreen
{
    EntityPlayer playerEntity = Minecraft.getMinecraft().thePlayer;
    public Minecraft mc;
    public boolean hb;
    private ResourceLocation texture = new ResourceLocation("craftingmod", "textures/gui/anim.png");
    public ExtPropCraftingLife anim = ExtPropCraftingLife.get(Minecraft.getMinecraft().thePlayer);

    public GuiAnimation() {}

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    @Override
    public void initGui()
    {

        this.buttonList.add(new BoutonAcheter(1, width / 2 - -170, height / 2 - 130, 60, 20, "Applaudire"));
        this.buttonList.add(new BoutonAcheter(2, width / 2 - -170, height / 2 - 110, 60, 20, "Main en l'aire"));
        this.buttonList.add(new BoutonAcheter(3, width / 2 - -170, height / 2 - 90, 60, 20, "Pointé du doigt"));
        super.initGui();
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode)
    {
        super.keyTyped(typedChar, keyCode);
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {
        switch(button.id)
        {
            case 1:
                if(!anim.animation)
                {
                    anim.animation = true;
                    //anim.name = "Applaudit";
                    anim.tick = 0;
                    anim.tickHand = 0;
                    System.out.println(anim.tick + " " + anim.tickHand);
                    //CraftingMod.network.sendToServer(new PacketAnimHand());
                    CraftingMod.network.sendToServer(new PacketAnim(1));
                    CraftingMod.network.sendToServer(new PacketAnimHand(playerEntity.getEntityId(), anim.tick, anim.tickHand, anim.tickRightHand, anim.tickLeftHand));
                }
                break;
            case 2:
                System.out.println(anim.tick + " " + anim.tickHand);
                anim.animation = true;
                anim.tick = 0;
                hb = !hb;
                System.out.println(hb);
                if(hb)
                {
                    if(anim.handUp)
                    {
                        System.out.println("Test");
                        anim.tickHand = 0;
                        anim.handUp = true;
                        anim.name = "Leve les mains";
                        //CraftingMod.network.sendToServer(new PacketAnimHand());
                        CraftingMod.network.sendToServer(new PacketAnim(2));
                        CraftingMod.network.sendToServer(new PacketAnimHand(playerEntity.getEntityId(), anim.tick, anim.tickHand, anim.tickRightHand, anim.tickLeftHand));
                    }

                }
                else
                {
                    if(!anim.handUp)
                    {
                        System.out.println("Test2");
                        anim.handUp = true;
                        CraftingMod.network.sendToServer(new PacketAnim(3));
                    }
                }
                CraftingMod.network.sendToServer(new PacketAnimHand(playerEntity.getEntityId(), anim.tick, anim.tickHand, anim.tickRightHand, anim.tickLeftHand));
                break;
            case 3:
                System.out.println("Test");
                break;
        }

    }

    @Override
    public void updateScreen()
    {
        super.updateScreen();

    }

    protected void mouseClicked(int x, int y, int btn)
    {
        super.mouseClicked(x, y, btn);
    }

    public void drawScreen(int x, int y, float f)
    {
        // drawDefaultBackground();

        // GL11.glPushMatrix();
        // mc.getTextureManager().bindTexture(texture);
        // GL11.glScalef(1.5F, 1.5F, 1.5F);
        // this.drawTexturedModalRect(this.width / 2 - 260, this.height / 2 - 170, 0, 0, 256, 250);
        // GL11.glPopMatrix();
        super.drawScreen(x, y, f);
    }
}
