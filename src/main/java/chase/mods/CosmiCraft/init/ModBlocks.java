package chase.mods.CosmiCraft.init;

import chase.mods.CosmiCraft.block.BaseBlock;
import chase.mods.CosmiCraft.block.fire.FireStone;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
	public static BaseBlock fireStone = new FireStone();
	
	public static void init()
	{
		registerBlock(fireStone);
	}
	
	public static void registerBlock(BaseBlock block)
	{
		GameRegistry.registerBlock(block, block.getName());
	}
}
