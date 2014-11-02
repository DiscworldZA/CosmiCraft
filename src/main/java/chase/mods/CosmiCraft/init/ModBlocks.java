package chase.mods.CosmiCraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import chase.mods.CosmiCraft.block.BaseBlock;

public class ModBlocks
{
	public static BaseBlock baseBlock = new BaseBlock();
	
	public static void init()
	{
		GameRegistry.registerBlock(baseBlock, "baseBlock");
	}
	
}
