package chase.mods.CosmiCraft.helpers;

import chase.mods.CosmiCraft.reference.Names;
import net.minecraft.util.ResourceLocation;

public class ResourceLocationHelper
{
	public static ResourceLocation getResourceLocation(String ModID, String Path)
	{
		return new ResourceLocation(ModID, Path);
	}
	
	public static ResourceLocation getResourceLocation(String path)
	{
		return getResourceLocation(Names.Mod.ID, path);
	}
	
	public static ResourceLocation getBlockLocation(String name)
	{
		String blockLocation = "";
		return getBlockLocation(name);
	}
}
