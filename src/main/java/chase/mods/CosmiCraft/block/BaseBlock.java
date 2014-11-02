package chase.mods.CosmiCraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import chase.mods.CosmiCraft.creativetab.CreativeTab;

public class BaseBlock extends Block
{
	public BaseBlock()
	{
		this(Material.ground);
	}
	
	public BaseBlock(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTab.CosmiCraftCreativeTab);
	}
}
