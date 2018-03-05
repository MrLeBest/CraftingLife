package fr.aymericred.newinventory.core;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.MCVersion("1.7.10")
public class InventoryCorePlugin implements IFMLLoadingPlugin 
{
	public static final Logger LOG = LogManager.getLogger("InventoryCorePlugin");
	@Override
	public String[] getASMTransformerClass() {
		return new String[] {InventoryTranformer.class.getName()};
	}
	@Override
	public String getModContainerClass() {return null;}
	@Override
	public String getSetupClass() {return null;}
	@Override
	public void injectData(Map<String, Object> data) 
	{
		InventoryTranformer.runtimeDeobfuscationEnabled = (Boolean) data.get("runtimeDeobfuscationEnabled");
	}
	@Override
	public String getAccessTransformerClass() {return null;}
}
