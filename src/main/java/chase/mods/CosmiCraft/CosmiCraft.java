package chase.mods.CosmiCraft;

import chase.mods.CosmiCraft.init.ModBlocks;
import chase.mods.CosmiCraft.proxy.IProxy;
import chase.mods.CosmiCraft.reference.Names;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Names.Mod.ID, name = Names.Mod.Name, version = Names.Mod.Version)
public class CosmiCraft
{
	@Instance(Names.Mod.ID)
	public static CosmiCraft instance;
	
	@SidedProxy(clientSide = Names.Proxy.CLIENT_CLASS, serverSide = Names.Proxy.SERVER_CLASS)
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
