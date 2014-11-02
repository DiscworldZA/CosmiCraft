package chase.mods.CosmiCraft.block.fire;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import chase.mods.CosmiCraft.block.BaseBlock;
import chase.mods.CosmiCraft.reference.Names;
import chase.mods.CosmiCraft.reference.Textures;

public class FireStone extends BaseBlock
{
	public FireStone()
	{
		this.setName(Names.Blocks.Fire.FireStone);
		this.setTexture("stone");
	}
	
	@SideOnly(Side.CLIENT)
	public int getRenderColor(int p_149741_1_)
	{
		return 255255255;
	}
	
}
