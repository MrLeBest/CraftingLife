package fr.mrlebest.craftingmod.client.gui;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiTextField;

public class TextFieldCustom extends GuiTextField {

	public TextFieldCustom(FontRenderer p_i1032_1_, int p_i1032_2_, int p_i1032_3_, int p_i1032_4_, int p_i1032_5_) {
		super(p_i1032_1_, p_i1032_2_, p_i1032_3_, p_i1032_4_, p_i1032_5_);
		// TODO Auto-generated constructor stub
	}

	public void writeText(String text)
	    {
		if(!text.matches("([0-9]+)")) 
				return;
				else
				super.writeText(text);
	    }

}
