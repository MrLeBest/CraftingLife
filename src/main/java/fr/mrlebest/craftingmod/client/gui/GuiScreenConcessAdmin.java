package fr.mrlebest.craftingmod.client.gui;

import org.lwjgl.input.Keyboard;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.ItemVehicle;

import cpw.mods.fml.client.config.GuiCheckBox;
import fr.mrlebest.craftingmod.common.CraftingMod;
import fr.mrlebest.craftingmod.common.network.PacketConcessVehicList;
import fr.mrlebest.craftingmod.event.WorldSaveData;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;

@Deprecated
/**
 * Replaced by NewGuiConcessAdmin, better version of that gui
 */
public class GuiScreenConcessAdmin extends GuiScreen
{
    EntityPlayer playerEntity;

    public int Jeep, Valider, Vehicule, test;
    private ResourceLocation texture = new ResourceLocation("craftingmod", "textures/gui/concess.png");
    private GuiTextField text, prix, concesslist;
    private GuiCheckBox vehicle;
    public static String listConcess[] = {"Gendarmerie", "Civil", "Pompier", "Camion", "Luxe"};
    public Minecraft mc;
    public static String vehiculeName;
    public static String nomveh = I18n.format("item." + vehiculeName + ".name", (Object[])new Object[0]);

    public GuiScreenConcessAdmin(EntityPlayer ep)
    {
        this.playerEntity = ep;
        this.mc = Minecraft.getMinecraft();

    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    @Override
    public void initGui()
    {
        Keyboard.enableRepeatEvents(true);
        super.initGui();
        int X = (width - 256) / 2;
        int Y = (height - 256) / 2;
        this.prix = new TextFieldCustom(this.fontRendererObj, X + 130, Y + 150, 100, 20);
        this.text = new GuiTextField(this.fontRendererObj, X + 130, Y + 120, 100, 20);
        this.concesslist = new GuiTextField(this.fontRendererObj, X + 130, Y + 90, 100, 20);
        for(int o = 0; o<FlansMod.vehicleItems.size(); o++) {
            String nomveh = I18n.format("item." + FlansMod.vehicleItems.get(o).type.shortName + ".name", (Object[])new Object[0]);
            this.buttonList.add(vehicle = new GuiCheckBox(o+30, X, Y+10, nomveh, false));
        
        }
        prix.setMaxStringLength(10);
        prix.setText("Prix");
        concesslist.setMaxStringLength(300);
        concesslist.setText("Concessionnaire");
        text.setMaxStringLength(300);
        text.setText("Nom du vehicule");
        this.concesslist.setFocused(true);
        this.buttonList.add(new GuiButton(20, X + 25, Y + 150, 60, 20, "Ajouté"));
        this.buttonList.add(new GuiButton(22, X + 13, Y + 120, 90, 20, "Liste de vehicule"));
        this.buttonList.add(new GuiButton(23, X + 7, Y + 90, 105, 20, "Liste des Concess..."));

    }

    @Override
    protected void keyTyped(char typedChar, int keyCode)
    {
        super.keyTyped(typedChar, keyCode);
        this.text.textboxKeyTyped(typedChar, keyCode);
        this.prix.textboxKeyTyped(typedChar, keyCode);
        this.concesslist.textboxKeyTyped(typedChar, keyCode);
    }

    @Override
    protected void actionPerformed(GuiButton button)
    {

        switch(button.id)
        {
            case 20:
                ItemVehicle v = getVehicleItem(text.getText());
                if(v != null)
                {
                    int price;
                    try
                    {
                        price = Integer.valueOf(prix.getText());
                        if(concesslist.getText().equalsIgnoreCase("Civil"))
                        {

                            price = Integer.valueOf(prix.getText());

                            WorldSaveData.vehicivil.put(text.getText(), price);

                            NBTTagCompound tag = new NBTTagCompound();
                            tag.setInteger("Action", 1); // Add to map
                            tag.setInteger("List", 0); // Civil
                            tag.setString("vehic", text.getText());
                            tag.setInteger("price", price);
                            CraftingMod.network.sendToServer(new PacketConcessVehicList(tag));
                            playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.AQUA + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + "Vous avez bien ajouter le " + text.getText() + " au §aconcessionnaire de Civil"));
                        }
                        else if(concesslist.getText().equalsIgnoreCase("Gendarmerie"))
                        {

                            price = Integer.valueOf(prix.getText());

                            WorldSaveData.vehigendarmerie.put(text.getText(), price);

                            NBTTagCompound tag = new NBTTagCompound();
                            tag.setInteger("Action", 1); // Add to map
                            tag.setInteger("List", 1); // Gendarmerie
                            tag.setString("vehic", text.getText());
                            tag.setInteger("price", price);
                            CraftingMod.network.sendToServer(new PacketConcessVehicList(tag));

                            playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.AQUA + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + "Vous avez bien ajouter le " + text.getText() + " au §aconcessionnaire de Gendarmerie"));
                        }
                        else if(concesslist.getText().equalsIgnoreCase("Pompier"))
                        {

                            price = Integer.valueOf(prix.getText());

                            WorldSaveData.vehipompier.put(text.getText(), price);

                            NBTTagCompound tag = new NBTTagCompound();
                            tag.setInteger("Action", 1); // Add to map
                            tag.setInteger("List", 4); // Pompier
                            tag.setString("vehic", text.getText());
                            tag.setInteger("price", price);
                            CraftingMod.network.sendToServer(new PacketConcessVehicList(tag));

                            playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.AQUA + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + "Vous avez bien ajouter le " + text.getText() + " au §aconcessionnaire de Pompier"));
                        }
                        else if(concesslist.getText().equalsIgnoreCase("Camion"))
                        {

                            price = Integer.valueOf(prix.getText());

                            WorldSaveData.vehicamion.put(text.getText(), price);

                            NBTTagCompound tag = new NBTTagCompound();
                            tag.setInteger("Action", 1); // Add to map
                            tag.setInteger("List", 3); // Camion
                            tag.setString("vehic", text.getText());
                            tag.setInteger("price", price);
                            CraftingMod.network.sendToServer(new PacketConcessVehicList(tag));

                            playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.AQUA + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + "Vous avez bien ajouter le " + text.getText() + " au §aconcessionnaire de Camion"));
                        }
                        else if(concesslist.getText().equalsIgnoreCase("Luxe"))
                        {

                            price = Integer.valueOf(prix.getText());

                            WorldSaveData.vehiluxe.put(text.getText(), price);

                            NBTTagCompound tag = new NBTTagCompound();
                            tag.setInteger("Action", 1); // Add to map
                            tag.setInteger("List", 2); // Luxe
                            tag.setString("vehic", text.getText());
                            tag.setInteger("price", price);
                            CraftingMod.network.sendToServer(new PacketConcessVehicList(tag));

                            playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.AQUA + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + "Vous avez bien ajouter le " + text.getText() + " au §aconcessionnaire de Luxe"));
                        }
                    }
                    catch(NumberFormatException ex)
                    {
                        playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.AQUA + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + "Le prix est invalide"));
                    }

                }
                else
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.AQUA + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.RED + "Il n'y a pas de vehicule " + text.getText() + " dans la §cliste des §cvehicules"));
                }
                break;

            case 21:

                break;

            case 22:
                for(ItemVehicle itemV : FlansMod.vehicleItems)
                {
                    String nomveh = I18n.format("item." + itemV.type.shortName + ".name", (Object[])new Object[0]);
                    //System.out.println(nomveh);
                    playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.RED + "CraftingLife" + EnumChatFormatting.GOLD + "]" + EnumChatFormatting.GREEN + nomveh));

                }
                break;

            case 23:
                for(int i = 0; i < listConcess.length; i++)
                {
                    playerEntity.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "[" + EnumChatFormatting.BLUE + "CraftingLife" + EnumChatFormatting.GOLD + "]" + GuiScreenConcessAdmin.listConcess[i]));
                }
                break;
            default:
                break;
        }
        super.actionPerformed(button);
    }

    @Override
    public void updateScreen()
    {
        super.updateScreen();

    }

    protected void mouseClicked(int x, int y, int btn)
    {
        super.mouseClicked(x, y, btn);
        this.text.mouseClicked(x, y, btn);
        this.prix.mouseClicked(x, y, btn);
        this.concesslist.mouseClicked(x, y, btn);
    }
    
    public String getVehicleItemName()
    {
        for(ItemVehicle itemV : FlansMod.vehicleItems)
        {
            String nomveh = I18n.format("item." + itemV.type.shortName + ".name", (Object[])new Object[0]);
            return nomveh;
        }
        return null;
    }
   
    public ItemVehicle getVehicleItemList()
    {
        for(ItemVehicle itemV : FlansMod.vehicleItems)
        {
            return itemV;
        }
        return null;
    }

    public ItemVehicle getVehicleItem(String name)
    {
        for(ItemVehicle itemV : FlansMod.vehicleItems)
        {
            String nomveh = I18n.format("item." + itemV.type.shortName + ".name", (Object[])new Object[0]);
            if(nomveh.equalsIgnoreCase(name))
            {
                return itemV;
            }
        }
        return null;
    }

    public void drawScreen(int x, int y, float f)
    {
        drawDefaultBackground();

        mc.getTextureManager().bindTexture(texture);

        ScaledResolution sr = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
        int Width = sr.getScaledWidth();
        int Height = sr.getScaledHeight();

        double X = (width - 256) / 2;
        double Y = (height - 256) / 2;
        this.drawTexturedModalRect((int)X, (int)Y + 50, 0, 0, 256, 256);
        // this.func_146110_a(X, Y, 0, 0, 400, 300, 400, 400);

        drawString(mc.fontRenderer, "Gestion des Conces...", (int)X, (int)Y + 51, 0xFFFFFF);
        //System.out.println(vehicle.isChecked() ? "C'est check" : "C'est pas check");

        this.text.drawTextBox();
        this.prix.drawTextBox();
        this.concesslist.drawTextBox();
        super.drawScreen(x, y, f);
    }

    @Override
    public void onGuiClosed()
    {
        Keyboard.enableRepeatEvents(false);
        super.onGuiClosed();
    }
}
