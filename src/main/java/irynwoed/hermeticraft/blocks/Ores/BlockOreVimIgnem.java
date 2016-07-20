package irynwoed.hermeticraft.blocks.ores;

import irynwoed.hermeticraft.Hermeticraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOreVimIgnem extends Block{

	public BlockOreVimIgnem(){		
		super(Material.ROCK);
		setResistance(15.0F);
		setHardness(5.0F);
		setUnlocalizedName("ignem_ore");
		setRegistryName("ignem_ore");
		setCreativeTab(Hermeticraft.tabHermeticraft);
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		OreDictionary.registerOre("oreIgnem", this);
	}
	@SideOnly(Side.CLIENT)
	public void initModel(){
		   ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
		
	}
	
}
