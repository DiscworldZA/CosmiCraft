package chase.mods.CosmiCraft.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import chase.mods.CosmiCraft.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTab
{
	public static final CreativeTabs CosmiCraftCreativeTab = new CreativeTabs(Names.Mod.ID.toLowerCase())
	{
		@Override
	    @SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			return Items.blaze_powder;
		}
	};
	
}
