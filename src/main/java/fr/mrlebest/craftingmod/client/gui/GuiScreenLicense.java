package fr.mrlebest.craftingmod.client.gui;

import fr.mrlebest.craftingmod.common.commands.CommandLicense;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;

public class GuiScreenLicense extends GuiScreen {
	
	EntityPlayer playerEntity;
	
	private CommandLicense cmdl;
	
	public Minecraft mc;
	
    public GuiScreenLicense(EntityPlayer ep)
    {
       	this.playerEntity = ep;
    	this.mc = Minecraft.getMinecraft();
    }
	
	  public void drawScreen(int x, int y, float f) {
	        drawDefaultBackground();
	        
	        
	        drawString(mc.fontRenderer, "License poss§dé:", this.width / 2 - 130,this.height / 2 - 115, 0xFFFFFF);
	        if (cmdl.licensetest == true){
	        	drawString(mc.fontRenderer,  EnumChatFormatting.GREEN + "License de test", this.width / 2 - 130,this.height / 2 - 100, 0xFFFFFF);
	        }else{
	        	
	        drawString(mc.fontRenderer,  EnumChatFormatting.RED + "License de test", this.width / 2 - 130,this.height / 2 - 100, 0xFFFFFF);
	        }
	        
	        super.drawScreen(x, y, f);
	  }
	  
		@Override
		public boolean doesGuiPauseGame() {
			return false;
		}
		
	    @Override
	    public void initGui()
	    {
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
	        super.actionPerformed(button);
	    }
	    
	    @Override
	    public void updateScreen()
	    {
	        super.updateScreen();
	    }

}
