package chase.mods.CosmiCraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import chase.mods.CosmiCraft.creativetab.CreativeTab;
import chase.mods.CosmiCraft.reference.Textures;

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
