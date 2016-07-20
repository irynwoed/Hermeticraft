package irynwoed.hermeticraft.blocks;

import irynwoed.hermeticraft.blocks.ores.BlockOreVimAero;
import irynwoed.hermeticraft.blocks.ores.BlockOreVimAquam;
import irynwoed.hermeticraft.blocks.ores.BlockOreVimIgnem;
import irynwoed.hermeticraft.blocks.ores.BlockOreVimTerram;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class HermeticraftBlocks {

	public static BlockOreVimAero oreVimAero;
	public static BlockOreVimAquam oreVimAquam;
	public static BlockOreVimIgnem oreVimIgnem;
	public static BlockOreVimTerram oreVimTerram;
	
	public static void init(){
		oreVimAero = new BlockOreVimAero();
		oreVimAquam = new BlockOreVimAquam();
		oreVimIgnem = new BlockOreVimIgnem();
		oreVimTerram = new BlockOreVimTerram();
	}
	
	@SideOnly(Side.CLIENT)
	public static void initModels(){
		oreVimAero.initModel();
		oreVimAquam.initModel();
		oreVimIgnem.initModel();
		oreVimTerram.initModel();
	}
	
}
